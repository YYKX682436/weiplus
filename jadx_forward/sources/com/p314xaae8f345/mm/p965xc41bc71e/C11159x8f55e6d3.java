package com.p314xaae8f345.mm.p965xc41bc71e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/msgsubscription/SubscribeMsgTmpItem;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.msgsubscription.SubscribeMsgTmpItem */
/* loaded from: classes9.dex */
public final class C11159x8f55e6d3 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3> f32580x681a0c0c = new d31.e();
    public boolean A;
    public boolean B;
    public boolean C;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f153334d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f153335e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f153336f;

    /* renamed from: g, reason: collision with root package name */
    public final int f153337g;

    /* renamed from: h, reason: collision with root package name */
    public int f153338h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f153339i;

    /* renamed from: m, reason: collision with root package name */
    public int f153340m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f153341n;

    /* renamed from: o, reason: collision with root package name */
    public long f153342o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f153343p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f153344q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f153345r;

    /* renamed from: s, reason: collision with root package name */
    public final int f153346s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f153347t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f153348u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f153349v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f153350w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f153351x;

    /* renamed from: y, reason: collision with root package name */
    public int f153352y;

    /* renamed from: z, reason: collision with root package name */
    public final int f153353z;

    public C11159x8f55e6d3(java.lang.String str, java.lang.String str2, int i17, int i18, java.util.ArrayList arrayList, int i19, boolean z17, java.lang.String str3, java.lang.String str4, boolean z18, int i27, boolean z19, boolean z27, java.lang.String str5, boolean z28, boolean z29, int i28, int i29, boolean z37, boolean z38, boolean z39) {
        this.f153335e = str;
        this.f153336f = str2;
        this.f153337g = i17;
        this.f153338h = i18;
        this.f153339i = arrayList;
        this.f153340m = i19;
        this.f153341n = z17;
        this.f153342o = 0L;
        this.f153334d = str3;
        this.f153343p = false;
        this.f153344q = str4;
        this.f153346s = i27;
        this.f153345r = z18;
        this.f153347t = z19;
        this.f153348u = z27;
        this.f153349v = str5;
        this.f153350w = z28;
        this.f153351x = z29;
        this.f153352y = i28;
        this.f153353z = i29;
        this.A = z37;
        this.B = z38;
        this.C = z39;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48317x9616526c() {
        return "SubscribeMsgTmpItem(title='" + this.f153335e + "', templateId='" + this.f153336f + "', templateType=" + this.f153337g + ", chooseStatus=" + this.f153338h + ", settingStatus=" + this.f153340m + ", settingStatus=" + this.f153340m + ", CREATOR=" + f32580x681a0c0c + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.f153335e);
        dest.writeString(this.f153336f);
        dest.writeInt(this.f153337g);
        dest.writeInt(this.f153338h);
        java.util.ArrayList arrayList = this.f153339i;
        dest.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dest.writeSerializable((jz5.l) it.next());
        }
        dest.writeInt(this.f153340m);
        dest.writeByte(this.f153341n ? (byte) 1 : (byte) 0);
        dest.writeLong(this.f153342o);
        dest.writeString(this.f153334d);
        dest.writeByte(this.f153343p ? (byte) 1 : (byte) 0);
        dest.writeString(this.f153344q);
        dest.writeInt(this.f153346s);
        dest.writeInt(this.f153345r ? 1 : 0);
        dest.writeInt(this.f153347t ? 1 : 0);
        dest.writeInt(this.f153348u ? 1 : 0);
        dest.writeString(this.f153349v);
        dest.writeInt(this.f153350w ? 1 : 0);
        dest.writeInt(this.f153351x ? 1 : 0);
        dest.writeInt(this.f153352y);
        dest.writeInt(this.f153353z);
        dest.writeInt(this.A ? 1 : 0);
        dest.writeInt(this.B ? 1 : 0);
        dest.writeInt(this.C ? 1 : 0);
    }

    public C11159x8f55e6d3(java.lang.String templateId, int i17, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        this.f153335e = "";
        this.f153336f = templateId;
        this.f153337g = i17;
        this.f153338h = -1;
        this.f153340m = i18;
        this.f153339i = new java.util.ArrayList();
        this.f153341n = z17;
        this.f153342o = 0L;
        this.f153334d = "";
        this.f153343p = false;
        this.f153344q = "";
        this.f153346s = -1;
        this.f153345r = false;
        this.f153347t = false;
        this.f153348u = false;
        this.f153349v = "";
        this.f153350w = false;
        this.f153351x = false;
        this.A = false;
        this.B = false;
        this.C = false;
    }

    public C11159x8f55e6d3(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        this.f153335e = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f153336f = readString2 == null ? "" : readString2;
        this.f153337g = parcel.readInt();
        this.f153338h = parcel.readInt();
        int readInt = parcel.readInt();
        this.f153339i = new java.util.ArrayList(java.lang.Math.min(readInt, 1024));
        while (readInt != 0) {
            try {
                java.util.ArrayList arrayList = this.f153339i;
                java.io.Serializable readSerializable = parcel.readSerializable();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(readSerializable, "null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.String>");
                arrayList.add((jz5.l) readSerializable);
                readInt--;
            } catch (java.io.InvalidClassException unused) {
            }
        }
        this.f153340m = parcel.readInt();
        this.f153341n = parcel.readByte() != 0;
        this.f153342o = parcel.readLong();
        java.lang.String readString3 = parcel.readString();
        this.f153334d = readString3 == null ? "" : readString3;
        this.f153343p = parcel.readByte() != 0;
        java.lang.String readString4 = parcel.readString();
        this.f153344q = readString4 == null ? "" : readString4;
        this.f153346s = parcel.readInt();
        this.f153345r = parcel.readInt() == 1;
        this.f153347t = parcel.readInt() == 1;
        this.f153348u = parcel.readInt() == 1;
        java.lang.String readString5 = parcel.readString();
        this.f153349v = readString5 != null ? readString5 : "";
        this.f153350w = parcel.readInt() == 1;
        this.f153351x = parcel.readInt() == 1;
        this.f153352y = parcel.readInt();
        if (parcel.dataAvail() > 0) {
            this.f153353z = parcel.readInt();
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
