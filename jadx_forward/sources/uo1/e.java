package uo1;

/* loaded from: classes5.dex */
public final class e extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f511085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f511086f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f511087g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f511088h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f511089i;

    public e(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, long j17, yz5.a aVar) {
        this.f511085e = y1Var;
        this.f511086f = f0Var;
        this.f511087g = g0Var;
        this.f511088h = j17;
        this.f511089i = aVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dpz, (android.view.ViewGroup) null);
        inflate.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, this.f511085e.B.getHeight()));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12858x7cd09d75) inflate.findViewById(com.p314xaae8f345.mm.R.id.r4w)).m53989x8ceee083(new uo1.c(this));
        ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.r4x)).setOnClickListener(new uo1.d(this.f511086f, this.f511087g, this.f511088h, this.f511085e));
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public void f() {
        this.f511089i.mo152xb9724478();
    }
}
