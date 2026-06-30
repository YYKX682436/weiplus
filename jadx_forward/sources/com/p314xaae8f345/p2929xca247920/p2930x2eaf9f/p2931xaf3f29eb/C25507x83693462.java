package com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb;

/* renamed from: com.tencent.shadow.core.common.InstalledApk */
/* loaded from: classes13.dex */
public class C25507x83693462 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462> f46640x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462>() { // from class: com.tencent.shadow.core.common.InstalledApk.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462[] newArray(int i17) {
            return new com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462[i17];
        }
    };

    /* renamed from: apkFd */
    public final android.os.ParcelFileDescriptor f46641x58b6bfa;

    /* renamed from: apkFilePath */
    public final java.lang.String f46642x1b64b1fd;

    /* renamed from: libraryPath */
    public final java.lang.String f46643xdba72780;

    /* renamed from: oDexPath */
    public final java.lang.String f46644xcae4856d;

    /* renamed from: parcelExtras */
    public final byte[] f46645xb112efcc;

    public C25507x83693462(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(str, str2, str3, (byte[]) null);
    }

    /* renamed from: closeIfNeeded */
    public synchronized void m94643x848e814a() {
        android.os.ParcelFileDescriptor parcelFileDescriptor = this.f46641x58b6bfa;
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.close();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m94644x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("InstalledApk{apkFilePath='");
        sb6.append(this.f46642x1b64b1fd);
        sb6.append("',\n apkFd=");
        sb6.append(this.f46641x58b6bfa);
        sb6.append(",\n oDexPath='");
        sb6.append(this.f46644xcae4856d);
        sb6.append("',\n libraryPath='");
        sb6.append(this.f46643xdba72780);
        sb6.append("',\n parcelExtras=Array(bytes=");
        byte[] bArr = this.f46645xb112efcc;
        sb6.append(bArr == null ? "null" : java.lang.Integer.valueOf(bArr.length));
        sb6.append(")}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f46642x1b64b1fd);
        parcel.writeParcelable(this.f46641x58b6bfa, i17);
        parcel.writeString(this.f46644xcae4856d);
        parcel.writeString(this.f46643xdba72780);
        byte[] bArr = this.f46645xb112efcc;
        parcel.writeInt(bArr == null ? 0 : bArr.length);
        byte[] bArr2 = this.f46645xb112efcc;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
    }

    public C25507x83693462(android.os.ParcelFileDescriptor parcelFileDescriptor, java.lang.String str, java.lang.String str2) {
        this(parcelFileDescriptor, str, str2, (byte[]) null);
    }

    public C25507x83693462(android.os.ParcelFileDescriptor parcelFileDescriptor, java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.f46642x1b64b1fd = null;
        this.f46641x58b6bfa = parcelFileDescriptor;
        this.f46644xcae4856d = str;
        this.f46643xdba72780 = str2;
        this.f46645xb112efcc = bArr;
    }

    public C25507x83693462(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        this.f46642x1b64b1fd = str;
        this.f46641x58b6bfa = null;
        this.f46644xcae4856d = str2;
        this.f46643xdba72780 = str3;
        this.f46645xb112efcc = bArr;
    }

    public C25507x83693462(android.os.Parcel parcel) {
        this.f46642x1b64b1fd = parcel.readString();
        this.f46641x58b6bfa = (android.os.ParcelFileDescriptor) parcel.readParcelable(android.os.ParcelFileDescriptor.class.getClassLoader());
        this.f46644xcae4856d = parcel.readString();
        this.f46643xdba72780 = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f46645xb112efcc = new byte[readInt];
        } else {
            this.f46645xb112efcc = null;
        }
        byte[] bArr = this.f46645xb112efcc;
        if (bArr != null) {
            parcel.readByteArray(bArr);
        }
    }
}
