package hr3;

/* loaded from: classes11.dex */
public class ab implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.eb f364928d;

    public ab(hr3.eb ebVar) {
        this.f364928d = ebVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr3.eb ebVar = this.f364928d;
        if (ebVar.f365053f.K1.getIntent() != null) {
            java.lang.String stringExtra = ebVar.f365053f.K1.getIntent().getStringExtra("key_ww_add_session_id");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9 c6802x562a2fb9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9();
                c6802x562a2fb9.p(stringExtra);
                c6802x562a2fb9.f141325e = 0L;
                c6802x562a2fb9.f141327g = 1L;
                c6802x562a2fb9.k();
            }
        }
        ebVar.m();
        int i17 = ebVar.f365053f.J1;
        if (i17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11263, java.lang.Integer.valueOf(i17), ebVar.f365053f.L.d1());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
