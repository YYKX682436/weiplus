package ox3;

/* loaded from: classes10.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.f0 f431272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f431273e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ox3.f0 f0Var, in5.s0 s0Var) {
        super(0);
        this.f431272d = f0Var;
        this.f431273e = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        c50.a1 a1Var = this.f431272d.f431280n;
        android.view.View p17 = this.f431273e.p(com.p314xaae8f345.mm.R.id.f568228m63);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        ((lt2.b) a1Var).getClass();
        android.view.View childAt = ((android.widget.FrameLayout) p17).getChildAt(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) childAt : null;
        if (c15188xd8bd4bd != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoPlayHelper", "stop mediaId:" + c15188xd8bd4bd.mo56696x9040359a());
            c15188xd8bd4bd.mo56716x4121a19(false);
            c15188xd8bd4bd.mo58801x360802();
        }
        return jz5.f0.f384359a;
    }
}
