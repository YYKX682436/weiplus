package as3;

/* loaded from: classes8.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 f95045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xl3 f95047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f95048g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 c16911xd5774141, boolean z17, r45.xl3 xl3Var, java.lang.Integer num) {
        super(0);
        this.f95045d = c16911xd5774141;
        this.f95046e = z17;
        this.f95047f = xl3Var;
        this.f95048g = num;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 c16911xd5774141 = this.f95045d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = c16911xd5774141.f236167h;
        if (c22627xa933f8e4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loading");
            throw null;
        }
        c22627xa933f8e4.setVisibility(8);
        android.widget.TextView textView = c16911xd5774141.f236164e;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("othersLikeTv");
            throw null;
        }
        boolean z17 = this.f95046e;
        textView.setVisibility(z17 ? 0 : 8);
        android.widget.TextView textView2 = c16911xd5774141.f236165f;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreTv");
            throw null;
        }
        textView2.setVisibility(z17 ? 0 : 8);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c16911xd5774141.f236163d;
        if (c22849x81a93d25 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c22849x81a93d25.setVisibility(z17 ? 0 : 8);
        android.widget.TextView textView3 = c16911xd5774141.f236168i;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noDataTips");
            throw null;
        }
        textView3.setVisibility(z17 ? 8 : 0);
        r45.xl3 xl3Var = this.f95047f;
        c16911xd5774141.m67685xfb255f18(xl3Var != null ? xl3Var.f471745e : null);
        c16911xd5774141.m67684x441dc80(this.f95048g);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = c16911xd5774141.f236169m;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8146xced61ae5();
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
        throw null;
    }
}
