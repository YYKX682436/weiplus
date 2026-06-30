package d92;

/* loaded from: classes.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.k0 f309054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(d92.k0 k0Var) {
        super(1);
        this.f309054d = k0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90;
        android.view.View v17 = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        this.f309054d.getClass();
        android.view.ViewParent parent = v17.getParent();
        while (true) {
            if (parent == null) {
                c15178x4303ff90 = null;
                break;
            }
            if (parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9) {
                c15178x4303ff90 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9) parent).getFullSeekBarLayout();
                break;
            }
            parent = parent.getParent();
        }
        if (c15178x4303ff90 != null) {
            c15178x4303ff90.A(false);
        }
        return jz5.f0.f384359a;
    }
}
