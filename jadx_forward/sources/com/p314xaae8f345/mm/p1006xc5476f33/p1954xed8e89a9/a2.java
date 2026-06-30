package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes.dex */
public final class a2 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f234918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f234919e;

    public a2(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f234918d = abstractActivityC21394xb3d2c0cf;
        this.f234919e = z3Var;
        mo63036x52d2f021(i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5), i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.ahd));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ProfileUtilsKt$getDescImageSpan$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f234918d;
        android.content.Intent intent = abstractActivityC21394xb3d2c0cf.getIntent();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f234919e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(intent, 37, 1, z3Var.d1());
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.f235073a.c(z3Var, new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("MicroMsg.ProfileUtilsKt", this.f234918d, 0, 4, null), new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.y1(h0Var, abstractActivityC21394xb3d2c0cf), new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.z1(h0Var, abstractActivityC21394xb3d2c0cf, z3Var));
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ProfileUtilsKt$getDescImageSpan$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
