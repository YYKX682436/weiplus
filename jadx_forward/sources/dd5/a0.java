package dd5;

/* loaded from: classes9.dex */
public final class a0 extends uc5.z {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.a0 f310615p = new dd5.a0();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0() {
        super(dd5.d0.f310644c);
        dd5.d0.f310643b.getClass();
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.e2 binding = (em.e2) obj;
        dd5.c0 c0Var = (dd5.c0) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (c0Var == null) {
            return;
        }
        if (binding.a().getChildCount() == 0) {
            binding.a().a();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 a17 = binding.a();
            a17.getClass();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            a17.addView(a17.f272359m, layoutParams);
        }
        binding.a().c(c0Var.f310632c, c0Var.f310631b, true, true);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.e2 binding = (em.e2) obj;
        dd5.c0 c0Var = (dd5.c0) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (c0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = c0Var.f310632c;
        if (interfaceC4987x84e327cb.k()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHistoryGalleryTypeEmoji", "onItemBodyClick: game emoji click disabled, skip");
            return;
        }
        java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb.mo42933xb5885648();
        if (mo42933xb5885648 == null) {
            mo42933xb5885648 = "";
        }
        qk.u uVar = new qk.u(mo42933xb5885648, interfaceC4987x84e327cb);
        java.lang.String S = interfaceC4987x84e327cb.S();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        uVar.f445538g = S != null ? S : "";
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class))).wi(context, uVar);
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Di;
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            return null;
        }
        java.util.List f07 = r26.n0.f0(j17, new java.lang.String[]{":"}, false, 0, 6, null);
        if (f07.size() > 3 && (Di = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Di((str = (java.lang.String) f07.get(3)))) != null) {
            return new dd5.c0(str, f9Var.m124847x74d37ac6(), Di);
        }
        return null;
    }
}
