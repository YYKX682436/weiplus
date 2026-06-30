package ap1;

/* loaded from: classes5.dex */
public final class c1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f12621d;

    /* renamed from: e, reason: collision with root package name */
    public em.c4 f12622e;

    /* renamed from: f, reason: collision with root package name */
    public j75.f f12623f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f12621d = -1L;
    }

    public static final void T6(ap1.c1 c1Var, ap1.c2 c2Var) {
        c1Var.getClass();
        if (!c2Var.f12630n.isEmpty()) {
            java.lang.String string = c1Var.getString(com.tencent.mm.R.string.mvr);
            em.c4 c4Var = c1Var.f12622e;
            if (c4Var == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            c4Var.b().setText(string + '(' + c2Var.f12630n.size() + ')');
            em.c4 c4Var2 = c1Var.f12622e;
            if (c4Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            c4Var2.b().setEnabled(true);
        } else {
            em.c4 c4Var3 = c1Var.f12622e;
            if (c4Var3 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            c4Var3.b().setText(com.tencent.mm.R.string.mvr);
            em.c4 c4Var4 = c1Var.f12622e;
            if (c4Var4 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            c4Var4.b().setEnabled(false);
        }
        if (c2Var.f12631o <= 0) {
            em.c4 c4Var5 = c1Var.f12622e;
            if (c4Var5 != null) {
                c4Var5.a().setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
        }
        em.c4 c4Var6 = c1Var.f12622e;
        if (c4Var6 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        c4Var6.a().setVisibility(0);
        em.c4 c4Var7 = c1Var.f12622e;
        if (c4Var7 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.widget.TextView a17 = c4Var7.a();
        em.c4 c4Var8 = c1Var.f12622e;
        if (c4Var8 != null) {
            a17.setText(c4Var8.a().getContext().getString(com.tencent.mm.R.string.mvi, com.tencent.mm.sdk.platformtools.t8.S1(c2Var.f12631o)));
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final j75.f U6() {
        j75.f fVar = this.f12623f;
        if (fVar != null) {
            return fVar;
        }
        j75.f Q6 = Q6();
        this.f12623f = Q6;
        return Q6;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        long longExtra = getIntent().getLongExtra("packageId", -1L);
        this.f12621d = longExtra;
        if (longExtra < 0) {
            com.tencent.mars.xlog.Log.e(pf5.o.TAG, "Invalid package id = " + this.f12621d);
            j75.f U6 = U6();
            if (U6 != null) {
                U6.B3(new ap1.c(null, 1, null));
                return;
            }
            return;
        }
        android.view.View rootView = getRootView();
        em.c4 c4Var = new em.c4(rootView);
        this.f12622e = c4Var;
        if (c4Var.f254186k == null) {
            c4Var.f254186k = (android.widget.RelativeLayout) rootView.findViewById(com.tencent.mm.R.id.skw);
        }
        c4Var.f254186k.setVisibility(0);
        em.c4 c4Var2 = this.f12622e;
        if (c4Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        c4Var2.c().setVisibility(8);
        em.c4 c4Var3 = this.f12622e;
        if (c4Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        c4Var3.b().setVisibility(0);
        em.c4 c4Var4 = this.f12622e;
        if (c4Var4 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        c4Var4.b().setOnClickListener(new ap1.y0(this));
        j75.f U62 = U6();
        if (U62 != null) {
            U62.L2(getActivity(), new ap1.z0(this));
        }
    }
}
