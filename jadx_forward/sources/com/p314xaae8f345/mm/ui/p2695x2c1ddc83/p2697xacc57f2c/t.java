package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes11.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 f289108f;

    public t(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 a0Var, int i17, int i18) {
        this.f289108f = a0Var;
        this.f289106d = i17;
        this.f289107e = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.t9.e().b(this.f289106d, this.f289107e);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 a0Var = this.f289108f;
        android.content.Context context = (android.content.Context) a0Var.f484375g.get();
        a0Var.getClass();
        if (context != null) {
            if (c01.d9.b().E()) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("intent_set_avatar", true);
                intent.putExtra("KEnterFromBanner", true);
                j45.l.j(context, "setting", ".ui.setting.SettingsPersonalInfoUI", intent, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11002, 4, 1);
            } else {
                db5.t7.k(context, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
