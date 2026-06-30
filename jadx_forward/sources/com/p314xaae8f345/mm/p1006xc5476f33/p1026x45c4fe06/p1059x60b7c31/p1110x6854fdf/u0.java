package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class u0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f164814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 f164816c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t0 f164817d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 a1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t0 t0Var) {
        this.f164814a = yVar;
        this.f164815b = i17;
        this.f164816c = a1Var;
        this.f164817d = t0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q2
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, localPath: " + str);
        boolean z18 = str == null || str.length() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 a1Var = this.f164816c;
        int i17 = this.f164815b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f164814a;
        if (z18) {
            yVar.a(i17, a1Var.o("fail:get image data fail"));
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.f(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, %s is not image", str);
            com.p314xaae8f345.mm.vfs.w6.h(str);
            yVar.a(i17, a1Var.o("fail:get image data fail"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t0 t0Var = this.f164817d;
        t0Var.f164772g = str;
        android.content.Context f229340d = yVar.getF229340d();
        if (!(f229340d instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, activity is null");
            yVar.a(i17, a1Var.o("fail:activity is null"));
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = this.f164814a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t0 t0Var2 = this.f164817d;
            android.app.Activity activity = (android.app.Activity) f229340d;
            a1Var.getClass();
            yVar2.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.x0(activity, a1Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.y0(a1Var, yVar2, i17, activity), t0Var2, yVar2));
            return;
        }
        android.app.Activity activity2 = (android.app.Activity) f229340d;
        a1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, gif");
        java.lang.String str2 = t0Var.f164772g;
        if (str2 == null) {
            str2 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12238x6c12178c c12238x6c12178c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12238x6c12178c(str2, t0Var.f164769d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.v0 v0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.v0(activity2, yVar, i17, a1Var);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(activity2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12238x6c12178c, v0Var, null);
    }
}
