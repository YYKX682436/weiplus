package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask */
/* loaded from: classes7.dex */
public class C12003x30f468c2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12003x30f468c2> f33846x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.k2();
    public int A;
    public int B;
    public int C;
    public java.lang.String D;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473 E;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 f160889f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160890g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o f160891h;

    /* renamed from: i, reason: collision with root package name */
    public int f160892i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160893m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f160894n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160895o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f160896p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f160897q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f160898r;

    /* renamed from: s, reason: collision with root package name */
    public int f160899s;

    /* renamed from: t, reason: collision with root package name */
    public int f160900t;

    /* renamed from: u, reason: collision with root package name */
    public int f160901u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f160902v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f160903w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f160904x;

    /* renamed from: y, reason: collision with root package name */
    public int f160905y;

    /* renamed from: z, reason: collision with root package name */
    public android.os.Bundle f160906z;

    public C12003x30f468c2() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160893m = parcel.readString();
        this.f160892i = parcel.readInt();
        this.f160895o = parcel.readString();
        this.f160896p = parcel.readString();
        this.f160897q = parcel.readString();
        this.f160898r = parcel.readString();
        this.f160902v = parcel.readString();
        this.f160899s = parcel.readInt();
        this.f160903w = parcel.readString();
        this.f160904x = parcel.readString();
        this.f160905y = parcel.readInt();
        this.f160906z = parcel.readBundle(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o2.class.getClassLoader());
        this.f160894n = parcel.createStringArrayList();
        this.f160900t = parcel.readInt();
        this.f160901u = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readString();
        this.E = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o2.class.getClassLoader());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160893m);
        parcel.writeInt(this.f160892i);
        parcel.writeString(this.f160895o);
        parcel.writeString(this.f160896p);
        parcel.writeString(this.f160897q);
        parcel.writeString(this.f160898r);
        parcel.writeString(this.f160902v);
        parcel.writeInt(this.f160899s);
        parcel.writeString(this.f160903w);
        parcel.writeString(this.f160904x);
        parcel.writeInt(this.f160905y);
        parcel.writeBundle(this.f160906z);
        parcel.writeStringList(this.f160894n);
        parcel.writeInt(this.f160900t);
        parcel.writeInt(this.f160901u);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeString(this.D);
        parcel.writeParcelable(this.E, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        if (!this.f160890g.mo50262x39e05d35()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g2) this.f160891h).a();
            return;
        }
        if (this.f160898r.equals("ok")) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("code", this.f160897q);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 n0Var = this.f160889f;
            n0Var.getClass();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            this.f160890g.a(this.f160892i, n0Var.t("ok", hashMap));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g2) this.f160891h).a();
            return;
        }
        if (this.f160898r.equals("fail")) {
            java.lang.String format = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.D) ? java.lang.String.format("fail:login error %s", java.lang.Integer.valueOf(this.C)) : !this.D.startsWith("fail:") ? java.lang.String.format("fail:%s", this.D) : this.D;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 n0Var2 = this.f160889f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160890g;
            int i17 = this.f160892i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473 c12092x3a87b473 = this.E;
            n0Var2.D(lVar, i17, format, new jc1.d(c12092x3a87b473.f162399d, c12092x3a87b473.f162400e));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g2) this.f160891h).a();
            return;
        }
        if (this.f160898r.equals("needConfirm")) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i18 = 0; i18 < this.f160905y; i18++) {
                byte[] byteArray = this.f160906z.getByteArray(i18 + "");
                r45.jv5 jv5Var = new r45.jv5();
                try {
                    jv5Var.mo11468x92b714fd(byteArray);
                    linkedList.add(jv5Var);
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLogin", "parse scope info error %s", e17.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiLogin", e17, "", new java.lang.Object[0]);
                    this.f160889f.D(this.f160890g, this.f160892i, "fail:internal error scope error", jc1.b.f380408a);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g2) this.f160891h).a();
                    return;
                }
            }
            if (linkedList.size() > 0) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j2(this, linkedList));
            } else {
                this.f160889f.D(this.f160890g, this.f160892i, "fail:internal error scope empty", jc1.f.f380459o);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g2) this.f160891h).a();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h2(this);
        if (this.f160895o.equals("login")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "start login");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            this.f160899s = 1;
            this.f160902v = "";
            java.lang.String str = this.f160896p;
            int i17 = this.f160900t;
            k80.e eVar = (k80.e) i95.n0.c(k80.e.class);
            int i18 = this.A;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l2(this, h2Var);
            ((j80.e) eVar).getClass();
            bl0.c cVar = new bl0.c(str, linkedList2, 1, "", "", i17, i18, l2Var);
            com.p314xaae8f345.mm.p944x882e457a.o oVar = cVar.f103215d;
            if ((oVar == null ? null : (r45.k24) oVar.f152243a.f152217a).f459864m == null) {
                (oVar == null ? null : (r45.k24) oVar.f152243a.f152217a).f459864m = new r45.nd7();
            }
            (oVar != null ? (r45.k24) oVar.f152243a.f152217a : null).f459864m.f462830f = this.B;
            gm0.j1.d().g(cVar);
            return;
        }
        if (this.f160895o.equals("loginConfirm")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "start loginConfirm");
            java.lang.String str2 = this.f160896p;
            java.util.ArrayList arrayList = this.f160894n;
            int i19 = this.f160899s;
            java.lang.String str3 = this.f160902v;
            int i27 = this.f160900t;
            int i28 = this.f160901u;
            k80.e eVar2 = (k80.e) i95.n0.c(k80.e.class);
            if (arrayList == null) {
                linkedList = null;
            } else {
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                linkedList3.addAll(arrayList);
                linkedList = linkedList3;
            }
            int i29 = this.A;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.m2 m2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.m2(this, h2Var, i28);
            ((j80.e) eVar2).getClass();
            bl0.d dVar = new bl0.d(str2, linkedList, i19, str3, i27, i28, i29, m2Var);
            com.p314xaae8f345.mm.p944x882e457a.o oVar2 = dVar.f103218d;
            if ((oVar2 == null ? null : (r45.i24) oVar2.f152243a.f152217a).f458219m == null) {
                (oVar2 == null ? null : (r45.i24) oVar2.f152243a.f152217a).f458219m = new r45.nd7();
            }
            (oVar2 != null ? (r45.i24) oVar2.f152243a.f152217a : null).f458219m.f462830f = this.B;
            gm0.j1.d().g(dVar);
        }
    }

    public C12003x30f468c2(android.os.Parcel parcel) {
        v(parcel);
    }
}
