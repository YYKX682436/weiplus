package com.tencent.mm.msgsubscription;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/msgsubscription/SubscribeMsgTmpItem;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SubscribeMsgTmpItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> CREATOR = new d31.e();
    public boolean A;
    public boolean B;
    public boolean C;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f71801d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f71802e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f71803f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71804g;

    /* renamed from: h, reason: collision with root package name */
    public int f71805h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f71806i;

    /* renamed from: m, reason: collision with root package name */
    public int f71807m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f71808n;

    /* renamed from: o, reason: collision with root package name */
    public long f71809o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f71810p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f71811q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f71812r;

    /* renamed from: s, reason: collision with root package name */
    public final int f71813s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f71814t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f71815u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f71816v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f71817w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f71818x;

    /* renamed from: y, reason: collision with root package name */
    public int f71819y;

    /* renamed from: z, reason: collision with root package name */
    public final int f71820z;

    public SubscribeMsgTmpItem(java.lang.String str, java.lang.String str2, int i17, int i18, java.util.ArrayList arrayList, int i19, boolean z17, java.lang.String str3, java.lang.String str4, boolean z18, int i27, boolean z19, boolean z27, java.lang.String str5, boolean z28, boolean z29, int i28, int i29, boolean z37, boolean z38, boolean z39) {
        this.f71802e = str;
        this.f71803f = str2;
        this.f71804g = i17;
        this.f71805h = i18;
        this.f71806i = arrayList;
        this.f71807m = i19;
        this.f71808n = z17;
        this.f71809o = 0L;
        this.f71801d = str3;
        this.f71810p = false;
        this.f71811q = str4;
        this.f71813s = i27;
        this.f71812r = z18;
        this.f71814t = z19;
        this.f71815u = z27;
        this.f71816v = str5;
        this.f71817w = z28;
        this.f71818x = z29;
        this.f71819y = i28;
        this.f71820z = i29;
        this.A = z37;
        this.B = z38;
        this.C = z39;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "SubscribeMsgTmpItem(title='" + this.f71802e + "', templateId='" + this.f71803f + "', templateType=" + this.f71804g + ", chooseStatus=" + this.f71805h + ", settingStatus=" + this.f71807m + ", settingStatus=" + this.f71807m + ", CREATOR=" + CREATOR + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f71802e);
        dest.writeString(this.f71803f);
        dest.writeInt(this.f71804g);
        dest.writeInt(this.f71805h);
        java.util.ArrayList arrayList = this.f71806i;
        dest.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dest.writeSerializable((jz5.l) it.next());
        }
        dest.writeInt(this.f71807m);
        dest.writeByte(this.f71808n ? (byte) 1 : (byte) 0);
        dest.writeLong(this.f71809o);
        dest.writeString(this.f71801d);
        dest.writeByte(this.f71810p ? (byte) 1 : (byte) 0);
        dest.writeString(this.f71811q);
        dest.writeInt(this.f71813s);
        dest.writeInt(this.f71812r ? 1 : 0);
        dest.writeInt(this.f71814t ? 1 : 0);
        dest.writeInt(this.f71815u ? 1 : 0);
        dest.writeString(this.f71816v);
        dest.writeInt(this.f71817w ? 1 : 0);
        dest.writeInt(this.f71818x ? 1 : 0);
        dest.writeInt(this.f71819y);
        dest.writeInt(this.f71820z);
        dest.writeInt(this.A ? 1 : 0);
        dest.writeInt(this.B ? 1 : 0);
        dest.writeInt(this.C ? 1 : 0);
    }

    public SubscribeMsgTmpItem(java.lang.String templateId, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        this.f71802e = "";
        this.f71803f = templateId;
        this.f71804g = i17;
        this.f71805h = -1;
        this.f71807m = i18;
        this.f71806i = new java.util.ArrayList();
        this.f71808n = z17;
        this.f71809o = 0L;
        this.f71801d = "";
        this.f71810p = false;
        this.f71811q = "";
        this.f71813s = -1;
        this.f71812r = false;
        this.f71814t = false;
        this.f71815u = false;
        this.f71816v = "";
        this.f71817w = false;
        this.f71818x = false;
        this.A = false;
        this.B = false;
        this.C = false;
    }

    public SubscribeMsgTmpItem(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        this.f71802e = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f71803f = readString2 == null ? "" : readString2;
        this.f71804g = parcel.readInt();
        this.f71805h = parcel.readInt();
        int readInt = parcel.readInt();
        this.f71806i = new java.util.ArrayList(java.lang.Math.min(readInt, 1024));
        while (readInt != 0) {
            try {
                java.util.ArrayList arrayList = this.f71806i;
                java.io.Serializable readSerializable = parcel.readSerializable();
                kotlin.jvm.internal.o.e(readSerializable, "null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.String>");
                arrayList.add((jz5.l) readSerializable);
                readInt--;
            } catch (java.io.InvalidClassException unused) {
            }
        }
        this.f71807m = parcel.readInt();
        this.f71808n = parcel.readByte() != 0;
        this.f71809o = parcel.readLong();
        java.lang.String readString3 = parcel.readString();
        this.f71801d = readString3 == null ? "" : readString3;
        this.f71810p = parcel.readByte() != 0;
        java.lang.String readString4 = parcel.readString();
        this.f71811q = readString4 == null ? "" : readString4;
        this.f71813s = parcel.readInt();
        this.f71812r = parcel.readInt() == 1;
        this.f71814t = parcel.readInt() == 1;
        this.f71815u = parcel.readInt() == 1;
        java.lang.String readString5 = parcel.readString();
        this.f71816v = readString5 != null ? readString5 : "";
        this.f71817w = parcel.readInt() == 1;
        this.f71818x = parcel.readInt() == 1;
        this.f71819y = parcel.readInt();
        if (parcel.dataAvail() > 0) {
            this.f71820z = parcel.readInt();
        }
        if (parcel.dataAvail() > 0) {
            this.A = parcel.readInt() == 1;
        }
        if (parcel.dataAvail() > 0) {
            this.B = parcel.readInt() == 1;
        }
        if (parcel.dataAvail() > 0) {
            this.C = parcel.readInt() == 1;
        }
    }
}
