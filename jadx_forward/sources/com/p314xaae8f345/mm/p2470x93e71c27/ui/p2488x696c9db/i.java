package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e f273222d;

    public i(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e) {
        this.f273222d = activityC19725xad6fc40e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e = this.f273222d;
        activityC19725xad6fc40e.f272877r = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activityC19725xad6fc40e);
        activityC19725xad6fc40e.f272871m = y1Var;
        y1Var.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.acv);
        android.view.View view2 = activityC19725xad6fc40e.f272871m.f293560f;
        com.p314xaae8f345.mm.ui.bk.s0(((android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.e1p)).getPaint());
        android.widget.Button button = (android.widget.Button) view2.findViewById(com.p314xaae8f345.mm.R.id.e1m);
        android.widget.Button button2 = (android.widget.Button) view2.findViewById(com.p314xaae8f345.mm.R.id.e1n);
        button.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j(activityC19725xad6fc40e));
        button2.setOnClickListener(activityC19725xad6fc40e.S);
        activityC19725xad6fc40e.f272872n = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view2.findViewById(com.p314xaae8f345.mm.R.id.e1o);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.17
            public AnonymousClass17() {
            }

            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int i17) {
                return i17 == 2 ? new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e.this) : new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.x(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e.this);
            }
        }, activityC19725xad6fc40e.D, true);
        activityC19725xad6fc40e.f272873o = c22848x6ddd90cf;
        c22848x6ddd90cf.Q(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k(activityC19725xad6fc40e), false);
        activityC19725xad6fc40e.f272872n.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(activityC19725xad6fc40e));
        activityC19725xad6fc40e.f272872n.mo7960x6cab2c8d(activityC19725xad6fc40e.f272873o);
        activityC19725xad6fc40e.f272873o.m8146xced61ae5();
        activityC19725xad6fc40e.f272871m.o(activityC19725xad6fc40e.X);
        activityC19725xad6fc40e.f272871m.s();
        ((sy.x) ((ty.m0) i95.n0.c(ty.m0.class))).Ai(3, activityC19725xad6fc40e.f272885z, "", activityC19725xad6fc40e.G);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
