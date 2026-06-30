package cj5;

/* loaded from: classes.dex */
public class d1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f42092d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f42093e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f42094f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f42095g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f42096h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f42097i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f42098m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.ObjectAnimator f42099n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f42100o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42092d = jz5.h.b(new cj5.a1(this));
        this.f42093e = jz5.h.b(new cj5.r0(activity, this));
        this.f42094f = jz5.h.b(new cj5.q0(activity));
        this.f42095g = jz5.h.b(new cj5.y0(activity));
        this.f42096h = jz5.h.b(new cj5.z0(activity));
        this.f42097i = jz5.h.b(new cj5.x0(this));
        this.f42100o = jz5.h.b(new cj5.u0(this));
    }

    public final em.l2 T6() {
        return (em.l2) ((jz5.n) this.f42092d).getValue();
    }

    public void U6(boolean z17) {
        T6().o().setVisibility(z17 ? 0 : 8);
        T6().o().post(new cj5.b1(this, z17));
        T6().n().setVisibility(8);
        if (z17) {
            T6().f().setOnClickListener(new cj5.c1(this));
        }
    }

    public final void V6(wi5.n0 state) {
        kotlin.jvm.internal.o.g(state, "state");
        java.util.LinkedList linkedList = state.f446319o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (true ^ com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) next)) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactBottomMenuUIC", "updateMenu: " + size);
        jz5.g gVar = this.f42093e;
        if (size > 0) {
            T6().f().setText(((java.lang.String) ((jz5.n) gVar).getValue()) + '(' + size + ')');
        } else {
            T6().f().setText((java.lang.String) ((jz5.n) gVar).getValue());
        }
        android.widget.Button f17 = T6().f();
        jz5.g gVar2 = this.f42094f;
        if (((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue() == 1) {
            f17.setTextColor(f17.getContext().getResources().getColorStateList(com.tencent.mm.R.drawable.cvh));
            f17.setBackgroundResource(com.tencent.mm.R.drawable.f481067jw);
        } else if (((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue() == 0) {
            f17.setTextColor(f17.getContext().getResources().getColorStateList(com.tencent.mm.R.color.f478838io));
            f17.setBackgroundResource(com.tencent.mm.R.drawable.f481060jo);
        }
        T6().f().setEnabled(size > state.f446317m);
        T6().e().setVisibility((!((java.lang.Boolean) ((jz5.n) this.f42095g).getValue()).booleanValue() || size <= 0) ? 8 : 0);
        T6().c().setVisibility(((java.lang.Boolean) ((jz5.n) this.f42096h).getValue()).booleanValue() ? 0 : 8);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        if (((java.lang.Boolean) ((jz5.n) this.f42096h).getValue()).booleanValue()) {
            T6().c().setOnContactDeselectListener((cj5.p0) ((jz5.n) this.f42097i).getValue());
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new cj5.w0(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        android.animation.ObjectAnimator objectAnimator = this.f42099n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f42098m;
        if (f5Var != null) {
            f5Var.d();
        }
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f42098m;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.ui.tools.f5 f5Var;
        super.onWindowFocusChanged(z17);
        if (!z17 || (f5Var = this.f42098m) == null) {
            return;
        }
        f5Var.f();
    }
}
