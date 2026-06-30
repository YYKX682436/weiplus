package rk3;

/* loaded from: classes8.dex */
public class i implements ak3.d {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f478054a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16606xc6010f80 f478055b;

    /* renamed from: c, reason: collision with root package name */
    public jk3.e f478056c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f478057d;

    /* renamed from: e, reason: collision with root package name */
    public int f478058e;

    public i(android.app.Activity activity) {
        this.f478054a = activity;
    }

    public void a(ak3.c cVar, jk3.e eVar) {
        r45.fr4 fr4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16605x56723de6 c16605x56723de6 = null;
        android.view.View mo2159xc2a54588 = cVar != null ? cVar.mo2159xc2a54588() : null;
        if (mo2159xc2a54588 == null || mo2159xc2a54588.getParent() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskWrapper", "addMultiTaskWrapper, contentView is null");
            return;
        }
        android.graphics.Bitmap b17 = eVar != null ? eVar.b() : null;
        if (b17 == null || b17.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskWrapper", "addMultiTaskWrapper, bitmap is null or recycle");
            return;
        }
        if (mo2159xc2a54588.getParent() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskWrapper", "addMultiTaskWrapper, contentView parent is null");
            return;
        }
        this.f478056c = eVar;
        android.view.ViewParent parent = mo2159xc2a54588.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        int indexOfChild = viewGroup.indexOfChild(mo2159xc2a54588);
        viewGroup.removeView(mo2159xc2a54588);
        android.view.ViewGroup.LayoutParams layoutParams = mo2159xc2a54588.getLayoutParams();
        android.view.View view = new android.view.View(mo2159xc2a54588.getContext());
        android.app.Activity activity = this.f478054a;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(com.p314xaae8f345.mm.ui.zk.a(activity, 15), -1);
        layoutParams2.gravity = 5;
        view.setLayoutParams(layoutParams2);
        rk3.g gVar = new rk3.g(this, view, mo2159xc2a54588.getContext());
        this.f478057d = gVar;
        gVar.addView(mo2159xc2a54588);
        gVar.addView(view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16606xc6010f80 c16606xc6010f80 = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16606xc6010f80(activity);
        c16606xc6010f80.m78873x6e5cce43(true);
        r45.w60 w60Var = ((jk3.b) eVar).f381611b;
        int m75939xb282bd08 = (w60Var == null || (fr4Var = (r45.fr4) w60Var.m75936x14adae67(0)) == null) ? 0 : fr4Var.m75939xb282bd08(9);
        boolean z17 = m75939xb282bd08 != 0 ? m75939xb282bd08 == 1 : !(((jk3.b) eVar) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.e);
        if (activity != null) {
            c16605x56723de6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16605x56723de6(activity);
            c16605x56723de6.m67171xec596ddd(z17);
        }
        if (c16605x56723de6 != null) {
            c16605x56723de6.setBackgroundColor(b3.l.m9702x7444d5ad(c16606xc6010f80.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c16605x56723de6, "null cannot be cast to non-null type com.tencent.mm.plugin.multitask.ui.base.IMultiTaskView");
        c16605x56723de6.mo67170x5854831(b17);
        c16606xc6010f80.mo79164x6cab2c8d(new rk3.f(this, gVar, c16605x56723de6.mo67169xfb86a31b()));
        c16606xc6010f80.addView(this.f478057d);
        al3.b bVar = al3.b.f87382a;
        c16606xc6010f80.m80855x5dd4731f(al3.b.f87383b);
        c16606xc6010f80.m80856xce91c8dd(com.p314xaae8f345.mm.R.C30859x5a72f63.f560977zh);
        c16606xc6010f80.m80845x940d026a(0, false);
        this.f478055b = c16606xc6010f80;
        java.lang.Boolean i17 = eVar.i();
        boolean booleanValue = i17 != null ? i17.booleanValue() : false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16606xc6010f80 c16606xc6010f802 = this.f478055b;
        if (c16606xc6010f802 != null) {
            c16606xc6010f802.m67174x45ab8225(!booleanValue);
        }
        viewGroup.addView(this.f478055b, indexOfChild, layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16606xc6010f80 c16606xc6010f803 = this.f478055b;
        if (c16606xc6010f803 != null) {
            c16606xc6010f803.mo79170x2d3430b4(new rk3.h(this));
        }
    }
}
