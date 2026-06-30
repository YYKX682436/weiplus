package id2;

/* loaded from: classes2.dex */
public final class k5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.p5 f372182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(id2.p5 p5Var) {
        super(1);
        this.f372182d = p5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f372182d.f372280h;
        if (c22627xa933f8e4 != null) {
            c22627xa933f8e4.setVisibility(8);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingBar");
        throw null;
    }
}
