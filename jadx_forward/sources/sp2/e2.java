package sp2;

/* loaded from: classes2.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f492554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492555e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(boolean z17, sp2.o2 o2Var) {
        super(0);
        this.f492554d = z17;
        this.f492555e = o2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f492554d;
        sp2.o2 o2Var = this.f492555e;
        if (z17) {
            android.view.ViewGroup viewGroup = o2Var.f492690s;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fakeLoadingLayout");
                throw null;
            }
            viewGroup.setVisibility(0);
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = o2Var.f492688r;
            if (c22851x22587864 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
                throw null;
            }
            c22851x22587864.setVisibility(8);
        } else {
            android.view.ViewGroup viewGroup2 = o2Var.f492690s;
            if (viewGroup2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fakeLoadingLayout");
                throw null;
            }
            viewGroup2.setVisibility(8);
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x225878642 = o2Var.f492688r;
            if (c22851x225878642 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
                throw null;
            }
            c22851x225878642.setVisibility(0);
        }
        return jz5.f0.f384359a;
    }
}
