package gx0;

/* loaded from: classes5.dex */
public final class yg implements nv0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f358782d;

    public yg(gx0.bh bhVar) {
        this.f358782d = bhVar;
    }

    @Override // nv0.f
    public void v4(boolean z17, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q composingPanel, nv0.d stack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composingPanel, "composingPanel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stack, "stack");
        gx0.bh bhVar = this.f358782d;
        if (!z17) {
            bhVar.f7(composingPanel.b());
        } else {
            if (!stack.f421961b.isEmpty()) {
                return;
            }
            bhVar.f7(new ou0.x(false));
        }
    }
}
