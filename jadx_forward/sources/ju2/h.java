package ju2;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f383349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 f383350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1) {
        super(0);
        this.f383349d = context;
        this.f383350e = c15003x1d0c0ec1;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f383349d;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context);
        android.content.res.Resources resources = context.getResources();
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams((int) resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo), (int) resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1));
        layoutParams.f92426h = 0;
        layoutParams.f92432k = 0;
        layoutParams.f92418d = 0;
        c22789xd23e9a9b.setLayoutParams(layoutParams);
        c22789xd23e9a9b.setTranslationX(-i65.a.a(context, 0.5f));
        c22789xd23e9a9b.setTranslationY(-i65.a.a(context, 0.5f));
        c22789xd23e9a9b.setVisibility(8);
        c22789xd23e9a9b.o(((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Z0().r()).booleanValue());
        c22789xd23e9a9b.m82584xebcf33cb(3);
        this.f383350e.addView(c22789xd23e9a9b);
        return c22789xd23e9a9b;
    }
}
