package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes11.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.j f232297d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.j jVar) {
        this.f232297d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        jm4.u2 a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/MusicBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicBanner", "clickBannerClose");
        this.f232297d.getClass();
        qk.g9 bj6 = ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj();
        if (bj6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicBanner", "onClickBannerClose tingService is null");
        } else {
            rk4.z8 z8Var = (rk4.z8) bj6;
            if (z8Var.fj()) {
                z8Var.zj();
            } else {
                com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055 = (((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj() == null || (a17 = jm4.w2.f381968d.a()) == null) ? null : (jm4.g3) p3380x6a61f93.p3381xf512d0a5.C30458x21b3ff21.m169109x21ba2d75(((jm4.w2) a17).m105978x2737f10());
                if (interfaceC26826xca759055 != null) {
                    ((b66.q) interfaceC26826xca759055).m9898x360802();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/music/ui/MusicBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
