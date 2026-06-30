package r2;

/* loaded from: classes14.dex */
public final class h0 extends r2.o {
    public yz5.l A;
    public yz5.l B;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f450250z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.content.Context context, n0.g1 g1Var, o1.e dispatcher) {
        super(context, g1Var, dispatcher);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        int i17 = r2.f0.f450244a;
        this.B = r2.e0.f450241d;
    }

    /* renamed from: getFactory */
    public final yz5.l m161322xfcb86cd4() {
        return this.A;
    }

    /* renamed from: getSubCompositionView */
    public p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.AbstractC1058x6d8e7db5 m161323x9bc7e705() {
        return null;
    }

    /* renamed from: getTypedView$ui_release */
    public final android.view.View m161324x7cca4367() {
        return this.f450250z;
    }

    /* renamed from: getUpdateBlock */
    public final yz5.l m161325xb60bf80e() {
        return this.B;
    }

    /* renamed from: getViewRoot */
    public android.view.View m161326xc320929d() {
        return this;
    }

    /* renamed from: setFactory */
    public final void m161327x7029ba48(yz5.l lVar) {
        this.A = lVar;
        if (lVar != null) {
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "context");
            android.view.View view = (android.view.View) lVar.mo146xb9724478(context);
            this.f450250z = view;
            m161349xaf4b3f9(view);
        }
    }

    /* renamed from: setTypedView$ui_release */
    public final void m161328xf71d7273(android.view.View view) {
        this.f450250z = view;
    }

    /* renamed from: setUpdateBlock */
    public final void m161329x4c716b82(yz5.l value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.B = value;
        m161348x264c8fcb(new r2.g0(this));
    }
}
