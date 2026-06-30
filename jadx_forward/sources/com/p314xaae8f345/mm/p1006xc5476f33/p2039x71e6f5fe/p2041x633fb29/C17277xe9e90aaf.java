package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/scanner/model/OfflineScanContext;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/scanner/model/i0", "scan-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.scanner.model.OfflineScanContext */
/* loaded from: classes9.dex */
public final class C17277xe9e90aaf implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i0 f37916x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i0(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f240293d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f240294e;

    /* renamed from: f, reason: collision with root package name */
    public final int f240295f;

    /* renamed from: g, reason: collision with root package name */
    public final int f240296g;

    /* renamed from: h, reason: collision with root package name */
    public final int f240297h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Bundle f240298i;

    /* renamed from: m, reason: collision with root package name */
    public final long f240299m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f240300n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f240301o;

    /* renamed from: p, reason: collision with root package name */
    public final int f240302p;

    /* renamed from: q, reason: collision with root package name */
    public final long f240303q;

    public C17277xe9e90aaf(java.lang.String str, android.app.Activity activity, int i17, java.lang.String qBarString, int i18, int i19, int i27, java.lang.String typeName, boolean z17, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qBarString, "qBarString");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeName, "typeName");
        this.f240294e = "";
        this.f240301o = "";
        this.f240303q = str != null ? java.lang.Long.parseLong(str) : 0L;
        this.f240302p = i17;
        this.f240294e = qBarString;
        this.f240295f = i18;
        this.f240296g = i19;
        this.f240297h = i27;
        this.f240301o = typeName;
        this.f240298i = bundle;
        this.f240299m = java.lang.System.currentTimeMillis();
        this.f240300n = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m68561x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("codeString: ");
        sb6.append(this.f240294e);
        sb6.append(", source: ");
        sb6.append(this.f240295f);
        sb6.append(", codeType: ");
        sb6.append(this.f240296g);
        sb6.append(", codeVersion");
        sb6.append(this.f240297h);
        sb6.append(", statObj: ");
        android.os.Bundle bundle = this.f240298i;
        sb6.append(bundle != null ? bundle.toString() : null);
        sb6.append(", time: ");
        sb6.append(this.f240299m);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f240293d);
        parcel.writeString(this.f240294e);
        parcel.writeInt(this.f240295f);
        parcel.writeInt(this.f240296g);
        parcel.writeInt(this.f240297h);
        parcel.writeString(this.f240301o);
        parcel.writeBundle(this.f240298i);
        parcel.writeLong(this.f240299m);
        parcel.writeByte(this.f240300n ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f240302p);
        parcel.writeLong(this.f240303q);
    }

    public C17277xe9e90aaf(java.lang.String str, android.app.Activity activity, int i17, java.lang.String qBarString, int i18, int i19, java.lang.String typeName, boolean z17, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qBarString, "qBarString");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeName, "typeName");
        this.f240294e = "";
        this.f240301o = "";
        this.f240303q = str != null ? java.lang.Long.parseLong(str) : 0L;
        this.f240302p = i17;
        this.f240294e = qBarString;
        this.f240296g = i18;
        this.f240297h = i19;
        this.f240301o = typeName;
        this.f240298i = bundle;
        this.f240299m = java.lang.System.currentTimeMillis();
        this.f240300n = z17;
    }

    public C17277xe9e90aaf(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f240294e = "";
        this.f240301o = "";
        this.f240293d = parcel.readInt();
        java.lang.String readString = parcel.readString();
        this.f240294e = readString == null ? "" : readString;
        this.f240295f = parcel.readInt();
        this.f240296g = parcel.readInt();
        this.f240297h = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        this.f240301o = readString2 != null ? readString2 : "";
        this.f240298i = parcel.readBundle(android.os.Bundle.class.getClassLoader());
        this.f240299m = parcel.readLong();
        this.f240300n = parcel.readByte() != 0;
        this.f240302p = parcel.readInt();
        this.f240303q = parcel.readLong();
    }
}
