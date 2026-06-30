package ju2;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f383352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 f383353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1) {
        super(0);
        this.f383352d = context;
        this.f383353e = c15003x1d0c0ec1;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int m60862x97cbed21;
        int m60862x97cbed212;
        android.widget.FrameLayout m60867x93b11d57;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(this.f383352d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1 = this.f383353e;
        m60862x97cbed21 = c15003x1d0c0ec1.m60862x97cbed21();
        m60862x97cbed212 = c15003x1d0c0ec1.m60862x97cbed21();
        c22789xd23e9a9b.setLayoutParams(new android.widget.FrameLayout.LayoutParams(m60862x97cbed21, m60862x97cbed212));
        c22789xd23e9a9b.o(((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Z0().r()).booleanValue());
        m60867x93b11d57 = c15003x1d0c0ec1.m60867x93b11d57();
        m60867x93b11d57.addView(c22789xd23e9a9b);
        return c22789xd23e9a9b;
    }
}
