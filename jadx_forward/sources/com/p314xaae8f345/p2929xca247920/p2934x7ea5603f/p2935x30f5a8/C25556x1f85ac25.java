package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.PpsStatus */
/* loaded from: classes13.dex */
public final class C25556x1f85ac25 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25> f46753x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25>() { // from class: com.tencent.shadow.dynamic.host.PpsStatus.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25[] newArray(int i17) {
            return new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25[i17];
        }
    };

    /* renamed from: loaderLoaded */
    public final boolean f46754x5b01b1f8;
    public final int pid;

    /* renamed from: ppsId */
    public final java.lang.String f46755x65eeaee;

    /* renamed from: runtimeLoaded */
    public final boolean f46756xd7d6a9fd;

    /* renamed from: uuid */
    public final java.lang.String f46757x36f3bb;

    /* renamed from: uuidManagerSet */
    public final boolean f46758x98fc1b90;

    public C25556x1f85ac25(java.lang.String str, boolean z17, boolean z18, boolean z19, java.lang.String str2) {
        this.f46757x36f3bb = str;
        this.f46756xd7d6a9fd = z17;
        this.f46754x5b01b1f8 = z18;
        this.f46758x98fc1b90 = z19;
        this.pid = android.os.Process.myPid();
        this.f46755x65eeaee = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f46757x36f3bb);
        parcel.writeByte(this.f46756xd7d6a9fd ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f46754x5b01b1f8 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f46758x98fc1b90 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.pid);
        parcel.writeString(this.f46755x65eeaee);
    }

    public C25556x1f85ac25(java.lang.String str, boolean z17, boolean z18, boolean z19) {
        this.f46757x36f3bb = str;
        this.f46756xd7d6a9fd = z17;
        this.f46754x5b01b1f8 = z18;
        this.f46758x98fc1b90 = z19;
        this.pid = android.os.Process.myPid();
        this.f46755x65eeaee = "";
    }

    public C25556x1f85ac25(android.os.Parcel parcel) {
        this.f46757x36f3bb = parcel.readString();
        this.f46756xd7d6a9fd = parcel.readByte() != 0;
        this.f46754x5b01b1f8 = parcel.readByte() != 0;
        this.f46758x98fc1b90 = parcel.readByte() != 0;
        this.pid = parcel.readInt();
        this.f46755x65eeaee = parcel.readString();
    }
}
