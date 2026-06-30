package xc2;

/* loaded from: classes2.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f534798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f534799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f534800f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f534801g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xc2.o0 f534802h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, boolean z17, int i17, android.view.View view, xc2.o0 o0Var) {
        super(0);
        this.f534798d = c22699x3dcdb352;
        this.f534799e = z17;
        this.f534800f = i17;
        this.f534801g = view;
        this.f534802h = o0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f534798d;
        c22699x3dcdb352.clearColorFilter();
        c22699x3dcdb352.setLayerPaint(null);
        c22699x3dcdb352.m82040x7541828(0);
        if (this.f534799e) {
            int i17 = this.f534800f;
            if (i17 != 0) {
                c22699x3dcdb352.m82040x7541828(i17);
            }
            android.view.View view = this.f534801g;
            if (view != null) {
                view.setBackground(null);
            }
        } else {
            xc2.y2.f534876a.s0(c22699x3dcdb352, this.f534802h);
        }
        return jz5.f0.f384359a;
    }
}
