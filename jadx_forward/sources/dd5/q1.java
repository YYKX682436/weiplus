package dd5;

/* loaded from: classes9.dex */
public final class q1 extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.q1 f310790p = new dd5.q1();

    public q1() {
        super(dd5.t1.f310823b.f508072a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.s1 s1Var = (dd5.s1) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (s1Var == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getTitleTv(...)");
        z(d17, context, s1Var.f310816a);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 a17 = binding.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(a17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeKefuContact$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeKefuContact$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeKefuContact$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeKefuContact$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView b17 = binding.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getDescTv(...)");
        z(b17, context, s1Var.f310818c);
        binding.c().setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.T(binding.c(), s1Var.f310817b, null);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.s1 s1Var = (dd5.s1) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (s1Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = s1Var.f310819d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wg.a(context, f9Var.Q0(), f9Var.j(), com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()), f9Var.A0() == 0, f9Var);
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        k41.k0 a17;
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null || (a17 = k41.k0.f385549h.a(U1)) == null) {
            return null;
        }
        if (a17.f385550a.length() == 0) {
            return null;
        }
        java.lang.String str = a17.f385551b;
        if (str.length() == 0) {
            str = a17.f385550a;
        }
        java.lang.String str2 = a17.f385550a;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return new dd5.s1(str, str2, string, f9Var);
    }

    @Override // uc5.b0, uc5.n
    /* renamed from: y */
    public void n(android.content.Context context, em.a2 binding, java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        android.content.res.Resources resources = context.getResources();
        uc5.e eVar = uc5.n.f508060n;
        eVar.a();
        int color = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m, null);
        android.widget.TextView d17 = binding.d();
        java.lang.CharSequence text = binding.d().getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        d17.setText(eVar.b(text, query, color));
        android.widget.TextView b17 = binding.b();
        java.lang.CharSequence text2 = binding.b().getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text2, "getText(...)");
        b17.setText(eVar.b(text2, query, color));
    }
}
