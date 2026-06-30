package ic3;

/* loaded from: classes12.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371948d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7) {
        this.f371948d = activityC16419x510d00b7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371948d;
        java.lang.String str = activityC16419x510d00b7.f229383d;
        xj.m Ui = ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Ui(activityC16419x510d00b7.f229384e);
        if (Ui != null) {
            java.lang.String str2 = activityC16419x510d00b7.f229383d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "getAdInfo");
            java.lang.String str3 = Ui.f536286a;
            activityC16419x510d00b7.f229385f = str3;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16419x510d00b7.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            activityC16419x510d00b7.f229386g = new ic3.f0(mo55332x76847179, Ui.f536287b, str3);
            ((android.widget.FrameLayout) activityC16419x510d00b7.findViewById(com.p314xaae8f345.mm.R.id.cg7)).addView(activityC16419x510d00b7.f229386g);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC16419x510d00b7.f229383d, "adInfo is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "adInfo is empty");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
