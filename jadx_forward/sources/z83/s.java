package z83;

/* loaded from: classes5.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321 f552285d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321 activityC16161xd3ca9321) {
        this.f552285d = activityC16161xd3ca9321;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "click finish button, code:24");
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321 activityC16161xd3ca9321 = this.f552285d;
        activityC16161xd3ca9321.mo48674x36654fab();
        activityC16161xd3ca9321.f224692i = db5.e1.Q(activityC16161xd3ca9321, activityC16161xd3ca9321.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16161xd3ca9321.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, null);
        java.lang.String obj = activityC16161xd3ca9321.T6().f525545h.getText().toString();
        gm0.j1.d().a(145, activityC16161xd3ca9321);
        hv.e eVar = (hv.e) i95.n0.c(hv.e.class);
        java.lang.String str = activityC16161xd3ca9321.f224688e;
        ((gv.a) eVar).getClass();
        h11.e eVar2 = new h11.e(str, 24, obj, 0, "");
        eVar2.S(activityC16161xd3ca9321.f224691h);
        java.lang.String str2 = activityC16161xd3ca9321.f224687d;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
            throw null;
        }
        ((o45.eh) eVar2.f359604d.mo47979x2d63726f()).f424455a.C = str2;
        gm0.j1.d().g(eVar2);
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
