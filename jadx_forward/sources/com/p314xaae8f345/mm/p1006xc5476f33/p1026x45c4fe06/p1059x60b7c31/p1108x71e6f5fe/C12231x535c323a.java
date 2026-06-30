package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\u0013"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiScanItem$CheckScanItemTask", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "y", "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "in", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "Lcom/tencent/mm/plugin/appbrand/jsapi/scanner/s;", "api", "<init>", "(Lcom/tencent/mm/plugin/appbrand/jsapi/scanner/s;)V", "inParcel", "(Landroid/os/Parcel;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanItem$CheckScanItemTask */
/* loaded from: classes.dex */
final class C12231x535c323a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12231x535c323a> f34748x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.q();

    /* renamed from: f, reason: collision with root package name */
    public int f164475f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f164476g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.s f164477h;

    public C12231x535c323a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.s sVar) {
        this.f164476g = "";
        this.f164477h = sVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return super.describeContents();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel in6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(in6, "in");
        this.f164475f = in6.readInt();
        java.lang.String readString = in6.readString();
        if (readString == null) {
            readString = "";
        }
        this.f164476g = readString;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeInt(this.f164475f);
        dest.writeString(this.f164476g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        super.y();
        x();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.s sVar = this.f164477h;
        if (sVar != null) {
            int i17 = this.f164475f;
            java.lang.String str = this.f164476g;
            if (i17 != 0) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("errCode", java.lang.Integer.valueOf(i17));
                if (!(str.length() > 0)) {
                    str = "unknown error";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = sVar.f164508g;
                if (c0Var != null) {
                    c0Var.a(sVar.f164510i, sVar.p("fail: ".concat(str), hashMap));
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2 = sVar.f164508g;
            java.lang.String str2 = sVar.f164509h;
            int i18 = sVar.f164510i;
            android.app.Activity Z0 = c0Var2 != null ? c0Var2.Z0() : null;
            if (Z0 == null) {
                if (c0Var2 != null) {
                    c0Var2.a(i18, sVar.o("fail:internal error invalid android context"));
                    return;
                }
                return;
            }
            nf.g.a(Z0).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.r(sVar, c0Var2, i18));
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196 c17265xca2bb196 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196();
            c17265xca2bb196.f240202n = 2;
            c17265xca2bb196.f240203o = 1;
            c17265xca2bb196.f240195d = true;
            c17265xca2bb196.f240196e = false;
            c17265xca2bb196.f240197f = false;
            c17265xca2bb196.f240198g = false;
            c17265xca2bb196.f240199h = true;
            c17265xca2bb196.f240211w = str2;
            ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).getClass();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (iq.b.i(context, false, null) || iq.b.x(context) || iq.b.c(context, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiScanItem", "scanItem camera is using now, can not call scanItem");
            this.f164475f = 1001;
            this.f164476g = "camera is using";
        } else {
            this.f164475f = 0;
            this.f164476g = "ok";
        }
        c();
    }

    public C12231x535c323a(android.os.Parcel inParcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inParcel, "inParcel");
        this.f164476g = "";
        v(inParcel);
    }
}
