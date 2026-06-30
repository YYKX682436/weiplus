package ap1;

/* loaded from: classes5.dex */
public final class x1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public em.c4 f12763d;

    /* renamed from: e, reason: collision with root package name */
    public j75.f f12764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static final void T6(ap1.x1 x1Var, ap1.c2 c2Var) {
        x1Var.getClass();
        if (!c2Var.f12630n.isEmpty()) {
            java.lang.String string = x1Var.getString(com.tencent.mm.R.string.ig8);
            em.c4 c4Var = x1Var.f12763d;
            if (c4Var == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            c4Var.c().setText(string + '(' + c2Var.f12630n.size() + ')');
            em.c4 c4Var2 = x1Var.f12763d;
            if (c4Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            c4Var2.c().setEnabled(true);
        } else {
            em.c4 c4Var3 = x1Var.f12763d;
            if (c4Var3 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            c4Var3.c().setText(com.tencent.mm.R.string.ig8);
            em.c4 c4Var4 = x1Var.f12763d;
            if (c4Var4 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            c4Var4.c().setEnabled(false);
        }
        if (c2Var.f12631o <= 0) {
            em.c4 c4Var5 = x1Var.f12763d;
            if (c4Var5 != null) {
                c4Var5.a().setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
        }
        em.c4 c4Var6 = x1Var.f12763d;
        if (c4Var6 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        c4Var6.a().setVisibility(0);
        em.c4 c4Var7 = x1Var.f12763d;
        if (c4Var7 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.widget.TextView a17 = c4Var7.a();
        em.c4 c4Var8 = x1Var.f12763d;
        if (c4Var8 != null) {
            a17.setText(c4Var8.a().getContext().getString(com.tencent.mm.R.string.mwm, com.tencent.mm.sdk.platformtools.t8.S1(c2Var.f12631o)));
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View rootView = getRootView();
        em.c4 c4Var = new em.c4(rootView);
        this.f12763d = c4Var;
        if (c4Var.f254186k == null) {
            c4Var.f254186k = (android.widget.RelativeLayout) rootView.findViewById(com.tencent.mm.R.id.skw);
        }
        c4Var.f254186k.setVisibility(0);
        em.c4 c4Var2 = this.f12763d;
        if (c4Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        c4Var2.b().setVisibility(8);
        em.c4 c4Var3 = this.f12763d;
        if (c4Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        c4Var3.c().setOnClickListener(new ap1.v1(this));
        j75.f fVar = this.f12764e;
        if (fVar == null) {
            fVar = Q6();
            this.f12764e = fVar;
        }
        if (fVar != null) {
            fVar.L2(getActivity(), new ap1.w1(this));
        }
    }
}
