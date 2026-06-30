package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class g0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f163344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t0 f163345b;

    public g0(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t0 t0Var) {
        this.f163344a = c0Var;
        this.f163345b = t0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str = android.os.Build.VERSION.SDK_INT >= 29 ? "android.permission.READ_EXTERNAL_STORAGE" : "android.permission.WRITE_EXTERNAL_STORAGE";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t0 t0Var = this.f163345b;
        boolean b17 = nf.t.b(t0Var.f163593a.mo50352x76847179(), t0Var.f163593a, str);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f163344a;
        c0Var.f391645d = b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ChooseMediaWorkFlow", "has external storage permission: " + c0Var.f391645d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("android.permission.RECORD_AUDIO");
        arrayList.add("android.permission.CAMERA");
        pq5.g h17 = pq5.h.a().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c0(arrayList, t0Var));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "$ui(...)");
        km5.u.a(h17);
        return java.lang.Boolean.FALSE;
    }
}
