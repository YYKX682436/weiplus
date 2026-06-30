package o24;

/* loaded from: classes5.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2076x229fdf4d.C17644x300e0f40 f423993d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2076x229fdf4d.C17644x300e0f40 c17644x300e0f40) {
        this.f423993d = c17644x300e0f40;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemQrcode$avatarOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2076x229fdf4d.C17644x300e0f40 c17644x300e0f40 = this.f423993d;
        c17644x300e0f40.t7(c17644x300e0f40.m158354x19263085().getIntent());
        kd0.i2 i2Var = (kd0.i2) i95.n0.c(kd0.i2.class);
        android.app.Activity context = c17644x300e0f40.m80379x76847179();
        c01.ka kaVar = new c01.ka(2);
        ((hs.d0) i2Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        e04.g2.a(context, kaVar);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemQrcode$avatarOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
