package ky;

/* loaded from: classes3.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f394951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f394952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f394953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f394954g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(int i17, boolean z17, java.lang.Integer num, float f17) {
        super(1);
        this.f394951d = i17;
        this.f394952e = z17;
        this.f394953f = num;
        this.f394954g = f17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 view = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        view.setImageResource(this.f394951d);
        view.m82037xa10c26f6(this.f394952e);
        java.lang.Integer num = this.f394953f;
        if (num != null) {
            num.intValue();
            view.r(num.intValue(), this.f394954g);
        }
        return jz5.f0.f384359a;
    }
}
