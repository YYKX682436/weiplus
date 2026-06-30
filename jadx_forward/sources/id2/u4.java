package id2;

/* loaded from: classes3.dex */
public final class u4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.f5 f372361d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(id2.f5 f5Var) {
        super(1);
        this.f372361d = f5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            id2.f5 f5Var = this.f372361d;
            id2.f5.O6(f5Var, false);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = f5Var.f372100d;
            if (viewOnClickListenerC22631x1cc07cc8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(false);
        }
        return jz5.f0.f384359a;
    }
}
