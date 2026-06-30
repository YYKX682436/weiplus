package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class JsApiLogin$LoginTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.auth.k2();
    public int A;
    public int B;
    public int C;
    public java.lang.String D;
    public com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable E;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.auth.n0 f79356f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f79357g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.auth.o f79358h;

    /* renamed from: i, reason: collision with root package name */
    public int f79359i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f79360m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f79361n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f79362o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f79363p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f79364q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f79365r;

    /* renamed from: s, reason: collision with root package name */
    public int f79366s;

    /* renamed from: t, reason: collision with root package name */
    public int f79367t;

    /* renamed from: u, reason: collision with root package name */
    public int f79368u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f79369v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f79370w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f79371x;

    /* renamed from: y, reason: collision with root package name */
    public int f79372y;

    /* renamed from: z, reason: collision with root package name */
    public android.os.Bundle f79373z;

    public JsApiLogin$LoginTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f79360m = parcel.readString();
        this.f79359i = parcel.readInt();
        this.f79362o = parcel.readString();
        this.f79363p = parcel.readString();
        this.f79364q = parcel.readString();
        this.f79365r = parcel.readString();
        this.f79369v = parcel.readString();
        this.f79366s = parcel.readInt();
        this.f79370w = parcel.readString();
        this.f79371x = parcel.readString();
        this.f79372y = parcel.readInt();
        this.f79373z = parcel.readBundle(com.tencent.mm.plugin.appbrand.jsapi.auth.o2.class.getClassLoader());
        this.f79361n = parcel.createStringArrayList();
        this.f79367t = parcel.readInt();
        this.f79368u = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readString();
        this.E = (com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable) parcel.readParcelable(com.tencent.mm.plugin.appbrand.jsapi.auth.o2.class.getClassLoader());
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f79360m);
        parcel.writeInt(this.f79359i);
        parcel.writeString(this.f79362o);
        parcel.writeString(this.f79363p);
        parcel.writeString(this.f79364q);
        parcel.writeString(this.f79365r);
        parcel.writeString(this.f79369v);
        parcel.writeInt(this.f79366s);
        parcel.writeString(this.f79370w);
        parcel.writeString(this.f79371x);
        parcel.writeInt(this.f79372y);
        parcel.writeBundle(this.f79373z);
        parcel.writeStringList(this.f79361n);
        parcel.writeInt(this.f79367t);
        parcel.writeInt(this.f79368u);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeString(this.D);
        parcel.writeParcelable(this.E, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        if (!this.f79357g.isRunning()) {
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.g2) this.f79358h).a();
            return;
        }
        if (this.f79365r.equals("ok")) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("code", this.f79364q);
            com.tencent.mm.plugin.appbrand.jsapi.auth.n0 n0Var = this.f79356f;
            n0Var.getClass();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            this.f79357g.a(this.f79359i, n0Var.t("ok", hashMap));
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.g2) this.f79358h).a();
            return;
        }
        if (this.f79365r.equals("fail")) {
            java.lang.String format = com.tencent.mm.sdk.platformtools.t8.K0(this.D) ? java.lang.String.format("fail:login error %s", java.lang.Integer.valueOf(this.C)) : !this.D.startsWith("fail:") ? java.lang.String.format("fail:%s", this.D) : this.D;
            com.tencent.mm.plugin.appbrand.jsapi.auth.n0 n0Var2 = this.f79356f;
            com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79357g;
            int i17 = this.f79359i;
            com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable appBrandErrorInfoParcelable = this.E;
            n0Var2.D(lVar, i17, format, new jc1.d(appBrandErrorInfoParcelable.f80866d, appBrandErrorInfoParcelable.f80867e));
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.g2) this.f79358h).a();
            return;
        }
        if (this.f79365r.equals("needConfirm")) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i18 = 0; i18 < this.f79372y; i18++) {
                byte[] byteArray = this.f79373z.getByteArray(i18 + "");
                r45.jv5 jv5Var = new r45.jv5();
                try {
                    jv5Var.parseFrom(byteArray);
                    linkedList.add(jv5Var);
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogin", "parse scope info error %s", e17.getMessage());
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiLogin", e17, "", new java.lang.Object[0]);
                    this.f79356f.D(this.f79357g, this.f79359i, "fail:internal error scope error", jc1.b.f298875a);
                    ((com.tencent.mm.plugin.appbrand.jsapi.auth.g2) this.f79358h).a();
                    return;
                }
            }
            if (linkedList.size() > 0) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.auth.j2(this, linkedList));
            } else {
                this.f79356f.D(this.f79357g, this.f79359i, "fail:internal error scope empty", jc1.f.f298926o);
                ((com.tencent.mm.plugin.appbrand.jsapi.auth.g2) this.f79358h).a();
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.appbrand.jsapi.auth.h2 h2Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.h2(this);
        if (this.f79362o.equals("login")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "start login");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            this.f79366s = 1;
            this.f79369v = "";
            java.lang.String str = this.f79363p;
            int i17 = this.f79367t;
            k80.e eVar = (k80.e) i95.n0.c(k80.e.class);
            int i18 = this.A;
            com.tencent.mm.plugin.appbrand.jsapi.auth.l2 l2Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.l2(this, h2Var);
            ((j80.e) eVar).getClass();
            bl0.c cVar = new bl0.c(str, linkedList2, 1, "", "", i17, i18, l2Var);
            com.tencent.mm.modelbase.o oVar = cVar.f21682d;
            if ((oVar == null ? null : (r45.k24) oVar.f70710a.f70684a).f378331m == null) {
                (oVar == null ? null : (r45.k24) oVar.f70710a.f70684a).f378331m = new r45.nd7();
            }
            (oVar != null ? (r45.k24) oVar.f70710a.f70684a : null).f378331m.f381297f = this.B;
            gm0.j1.d().g(cVar);
            return;
        }
        if (this.f79362o.equals("loginConfirm")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "start loginConfirm");
            java.lang.String str2 = this.f79363p;
            java.util.ArrayList arrayList = this.f79361n;
            int i19 = this.f79366s;
            java.lang.String str3 = this.f79369v;
            int i27 = this.f79367t;
            int i28 = this.f79368u;
            k80.e eVar2 = (k80.e) i95.n0.c(k80.e.class);
            if (arrayList == null) {
                linkedList = null;
            } else {
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                linkedList3.addAll(arrayList);
                linkedList = linkedList3;
            }
            int i29 = this.A;
            com.tencent.mm.plugin.appbrand.jsapi.auth.m2 m2Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.m2(this, h2Var, i28);
            ((j80.e) eVar2).getClass();
            bl0.d dVar = new bl0.d(str2, linkedList, i19, str3, i27, i28, i29, m2Var);
            com.tencent.mm.modelbase.o oVar2 = dVar.f21685d;
            if ((oVar2 == null ? null : (r45.i24) oVar2.f70710a.f70684a).f376686m == null) {
                (oVar2 == null ? null : (r45.i24) oVar2.f70710a.f70684a).f376686m = new r45.nd7();
            }
            (oVar2 != null ? (r45.i24) oVar2.f70710a.f70684a : null).f376686m.f381297f = this.B;
            gm0.j1.d().g(dVar);
        }
    }

    public JsApiLogin$LoginTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
