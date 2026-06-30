package im2;

/* loaded from: classes3.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374161d;

    public z0(im2.z3 z3Var) {
        this.f374161d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View decorView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.z3 z3Var = this.f374161d;
        if (z3Var.C1 != null) {
            cf2.h hVar = new cf2.h(z3Var.m80379x76847179(), z3Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ntg), z3Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ntj), z3Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nth), z3Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nti));
            hVar.R = new im2.w0(z3Var, hVar);
            hVar.C();
        } else if (!z3Var.p7()) {
            r45.h32 Y6 = z3Var.Z1 ? z3Var.Y6() : z3Var.X6(z3Var.L1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(z3Var.f374168d, "#previewData introduction:" + Y6.m75945x2fec8307(3) + " introduction_extend:" + Y6.m75945x2fec8307(23));
            android.app.Activity m80379x76847179 = z3Var.m80379x76847179();
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = m80379x76847179 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) m80379x76847179 : null;
            if (activityC21401x6ce6f73f != null) {
                activityC21401x6ce6f73f.mo48674x36654fab();
            }
            android.app.Activity context = z3Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            te2.s8 s8Var = (te2.s8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(te2.s8.class);
            s8Var.getClass();
            if (s8Var.J1) {
                android.view.View mo144222x4ff8c0f0 = s8Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.umn);
                if (mo144222x4ff8c0f0 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(mo144222x4ff8c0f0, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeWithPreviewUIC", "loadPreviewData", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeWithPreviewUIC", "loadPreviewData", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.view.View inflate = s8Var.m158354x19263085().getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570479aw5, (android.view.ViewGroup) null);
                android.view.Window window = s8Var.m158354x19263085().getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    ym5.v6.b(decorView, inflate);
                }
                s8Var.J1 = true;
            }
            s8Var.A1.f499924b = Y6;
            s8Var.f499868z1 = ya2.h.f542017a.b(xy2.c.e(s8Var.m80379x76847179()));
            s8Var.l7();
            s8Var.k7();
            te2.sc scVar = te2.sc.f499945a;
            java.util.List list = te2.sc.f499947c;
            java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
            r45.s52 s52Var = arrayList3.size() <= 0 ? (r45.s52) kz5.n0.Z(list) : (r45.s52) arrayList3.get(0);
            if (s52Var == null) {
                s52Var = new r45.s52();
            }
            s8Var.v7(s52Var);
            s8Var.u7();
            int size = ((java.util.ArrayList) list).size();
            jz5.g gVar = s8Var.V;
            if (size > 0) {
                ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(0);
            }
            ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(new te2.q8(s8Var));
            s8Var.F1 = new te2.r8(s8Var);
            android.app.Activity context2 = z3Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((te2.s8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(te2.s8.class)).G1 = new im2.y0(z3Var);
        } else if (z3Var.Z1) {
            z3Var.V6("", -1);
        } else {
            z3Var.U6(z3Var.L1, "", -1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
