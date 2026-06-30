package sj3;

/* loaded from: classes14.dex */
public class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 f490164d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f490165e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f490166f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f490167g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f490168h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f490169i;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f490170m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f490171n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f490172o = false;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2) {
        this.f490164d = serviceConnectionC16581x3d1d6bd2;
        this.f490165e = serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.f566901hf2);
        android.view.View findViewById = serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.n0_);
        this.f490171n = findViewById;
        android.view.View findViewById2 = serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.hf7);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) findViewById2.getLayoutParams();
        layoutParams.topMargin = (int) ((i65.a.k(serviceConnectionC16581x3d1d6bd2) * 15.9d) / 100.0d);
        findViewById2.setLayoutParams(layoutParams);
        this.f490167g = (android.widget.TextView) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.hf8);
        this.f490169i = (android.widget.ImageView) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.hf6);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.n0a);
        this.f490170m = c1163xf1deaba4;
        this.f490166f = serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.jwj);
        i65.a.k(serviceConnectionC16581x3d1d6bd2);
        i65.a.b(serviceConnectionC16581x3d1d6bd2, 412);
        i65.a.k(serviceConnectionC16581x3d1d6bd2);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(serviceConnectionC16581x3d1d6bd2);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams2.bottomMargin = (int) ((i65.a.k(serviceConnectionC16581x3d1d6bd2) * 21.9d) / 100.0d);
        findViewById.setLayoutParams(layoutParams2);
        android.view.View findViewById3 = serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.hel);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) findViewById3.getLayoutParams();
        layoutParams3.bottomMargin = (int) ((i65.a.k(serviceConnectionC16581x3d1d6bd2) * 3.6d) / 100.0d);
        findViewById3.setLayoutParams(layoutParams3);
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        c1163xf1deaba4.mo7960x6cab2c8d(new sj3.s5(serviceConnectionC16581x3d1d6bd2));
        c1163xf1deaba4.post(new sj3.j1(this));
        c1163xf1deaba4.m7969x1a2696e2(new sj3.k1(this));
        this.f490168h = (android.widget.TextView) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.hef);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.hf9);
        android.widget.ImageButton imageButton2 = (android.widget.ImageButton) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.f566900hf1);
        imageButton.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
    }

    public void a() {
        android.view.View view = this.f490165e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "dismissInviteUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "dismissInviteUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup T6 = this.f490164d.T6();
        if (T6 != null) {
            T6.removeView(this.f490165e);
        }
    }

    public void b(com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a) {
        android.view.View view = this.f490165e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "inflateInvitingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "inflateInvitingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f490166f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "inflateInvitingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "inflateInvitingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o2.d(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f490164d;
        if (!K0) {
            for (int i17 = 0; i17 < c11142xe8e5c41a.f153144i.size(); i17++) {
                if (!((com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54) c11142xe8e5c41a.f153144i.get(i17)).f153145d.equals(d17)) {
                    arrayList3.add(((com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54) c11142xe8e5c41a.f153144i.get(i17)).f153145d);
                }
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(d17);
            ((ke0.e) xVar).getClass();
            this.f490167g.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(serviceConnectionC16581x3d1d6bd2, e17));
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e18 = c01.a2.e(d17);
            ((ke0.e) xVar2).getClass();
            android.text.SpannableString i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(serviceConnectionC16581x3d1d6bd2, e18);
            android.widget.ImageView imageView = this.f490169i;
            imageView.setContentDescription(i18);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.u.b(imageView, d17, 0.1f, true);
        }
        if (serviceConnectionC16581x3d1d6bd2.T6() != null && serviceConnectionC16581x3d1d6bd2.T6().findViewById(com.p314xaae8f345.mm.R.id.m7w) != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.bottomMargin = com.p314xaae8f345.mm.ui.bl.c(serviceConnectionC16581x3d1d6bd2);
            serviceConnectionC16581x3d1d6bd2.T6().findViewById(com.p314xaae8f345.mm.R.id.m7w).setLayoutParams(layoutParams);
        }
        int size = arrayList3.size();
        android.widget.TextView textView = this.f490168h;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f490170m;
        if (size <= 0) {
            textView.setVisibility(8);
            c1163xf1deaba4.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574121h22);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(serviceConnectionC16581x3d1d6bd2.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574122h23));
        for (int i19 = 0; i19 < arrayList3.size(); i19++) {
            if (!((sj3.s5) c1163xf1deaba4.mo7946xf939df19()).x((java.lang.String) arrayList3.get(i19))) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str = (java.lang.String) arrayList3.get(i19);
                ((sg3.a) v0Var).getClass();
                sb6.append(c01.a2.e(str));
                sb6.append(",");
                stringBuffer.append(sb6.toString());
            }
        }
        this.f490171n.setTag(com.p314xaae8f345.mm.R.id.nww, stringBuffer.toString());
        c1163xf1deaba4.setVisibility(0);
        c1163xf1deaba4.removeAllViews();
        for (int i27 = 0; i27 < arrayList3.size(); i27++) {
            if (!((sj3.s5) c1163xf1deaba4.mo7946xf939df19()).x((java.lang.String) arrayList3.get(i27))) {
                sj3.s5 s5Var = (sj3.s5) c1163xf1deaba4.mo7946xf939df19();
                java.lang.String userName = (java.lang.String) arrayList3.get(i27);
                s5Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                java.util.ArrayList arrayList4 = s5Var.f490275e;
                if (arrayList4.size() <= i27) {
                    arrayList4.add(userName);
                } else {
                    arrayList4.set(i27, userName);
                }
            }
        }
        c1163xf1deaba4.mo7946xf939df19().m8146xced61ae5();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.f566900hf1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f(true, false);
            android.content.Context context = view.getContext();
            if (context != null && !((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(context)) {
                ku5.u0 u0Var = ku5.t0.f394148d;
                sj3.l1 l1Var = new sj3.l1(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(l1Var, 2000L, false);
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.hf9) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
