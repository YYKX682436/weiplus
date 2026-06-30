package bt2;

/* loaded from: classes3.dex */
public final class c extends ws2.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f24180d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.ea0 f24181e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f24180d = "FinderLiveShoppingReplayDecorateUIC";
    }

    public void e(boolean z17, boolean z18) {
        ((mm2.c1) c(mm2.c1.class)).l9(2);
        ya2.g gVar = ya2.h.f460484a;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) c(mm2.c1.class)).f328846n;
        ya2.b2 b17 = gVar.b(finderObject != null ? finderObject.getUsername() : null);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f449093c;
        android.widget.TextView textView = k0Var != null ? (android.widget.TextView) k0Var.findViewById(com.tencent.mm.R.id.kbb) : null;
        if (b17 != null && textView != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String z07 = b17.z0();
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this.f449092b, z07, textSize));
        }
        so2.j5 j5Var = ((mm2.f6) c(mm2.f6.class)).f329049w;
        if (j5Var instanceof cm2.m0 ? true : j5Var instanceof cm2.k0) {
            com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f24181e;
            if (ea0Var != null) {
                ea0Var.K0(0);
            }
            so2.j5 j5Var2 = ((mm2.f6) c(mm2.f6.class)).f329049w;
            if (j5Var2 != null) {
                com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var2 = this.f24181e;
                if (ea0Var2 != null) {
                    so2.t2 t2Var = new so2.t2();
                    t2Var.f410606a = false;
                    ea0Var2.y1().setShoppingUIConfig(t2Var);
                }
                com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var3 = this.f24181e;
                if (ea0Var3 != null) {
                    ea0Var3.l(j5Var2);
                }
            }
        } else if (j5Var instanceof cm2.k0) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = this.f449093c;
            if (k0Var2 != null) {
                qo0.c.a(k0Var2, qo0.b.f365377l2, null, 2, null);
            }
            com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var4 = this.f24181e;
            if (ea0Var4 != null) {
                ea0Var4.K0(0);
            }
        } else {
            com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var5 = this.f24181e;
            if (ea0Var5 != null) {
                ea0Var5.K0(8);
            }
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var3 = this.f449093c;
        if (k0Var3 != null) {
            k0Var3.fillBlurBg(((mm2.c1) c(mm2.c1.class)).f328852o, true);
        }
    }

    public void f(com.tencent.mm.plugin.finder.live.view.k0 baseRouter) {
        kotlin.jvm.internal.o.g(baseRouter, "baseRouter");
        gk2.e buContext = baseRouter.getBuContext();
        kotlin.jvm.internal.o.g(buContext, "<set-?>");
        this.f19609a = buContext;
        this.f449093c = baseRouter;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) baseRouter.findViewById(com.tencent.mm.R.id.f487336oc0);
        if (viewGroup != null) {
            viewGroup.post(new bt2.a(viewGroup));
            viewGroup.setOnClickListener(new bt2.b(this, baseRouter));
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) baseRouter.findViewById(com.tencent.mm.R.id.b1o);
        if (viewGroup2 != null) {
            this.f24181e = new com.tencent.mm.plugin.finder.live.plugin.ea0(new android.widget.FrameLayout(this.f449092b), viewGroup2, baseRouter, null, null);
        }
    }
}
