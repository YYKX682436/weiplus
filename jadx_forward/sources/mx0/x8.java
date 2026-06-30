package mx0;

/* loaded from: classes.dex */
public final class x8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 f413970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413971f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 w1Var, java.lang.String str) {
        super(0);
        this.f413969d = c10977x8e40eced;
        this.f413970e = w1Var;
        this.f413971f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413969d;
        java.lang.String string = c10977x8e40eced.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 w1Var = this.f413970e;
        if (w1Var == null) {
            w1Var = mx0.w8.f413957a;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(c10977x8e40eced.getContext());
        u1Var.g(this.f413971f);
        u1Var.n(string);
        u1Var.l(w1Var);
        u1Var.q(false);
        return jz5.f0.f384359a;
    }
}
