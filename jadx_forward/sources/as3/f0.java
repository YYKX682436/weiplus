package as3;

/* loaded from: classes11.dex */
public final class f0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac f95037d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac c16917xf24b9dac) {
        this.f95037d = c16917xf24b9dac;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        yz5.l lVar;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        vr3.d0 d0Var = (vr3.d0) holder.f374658i;
        if (d0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac c16917xf24b9dac = this.f95037d;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = c16917xf24b9dac.adapter;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8146xced61ae5();
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = c16917xf24b9dac.foldAdapter;
            if (c22848x6ddd90cf2 != null) {
                c22848x6ddd90cf2.m8146xced61ae5();
            }
            as3.a0 presenter = c16917xf24b9dac.getPresenter();
            if (presenter == null || (lVar = presenter.f95020f) == null) {
                return;
            }
            lVar.mo146xb9724478(d0Var);
        }
    }
}
