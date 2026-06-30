package mx0;

/* loaded from: classes5.dex */
public final class s6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f413848e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, boolean z17) {
        super(0);
        this.f413847d = c10977x8e40eced;
        this.f413848e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mx0.l m47302x7ff74ce5;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var;
        m47302x7ff74ce5 = this.f413847d.m47302x7ff74ce5();
        m47302x7ff74ce5.f413645o = !m47302x7ff74ce5.f413645o;
        m47302x7ff74ce5.f();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var2 = m47302x7ff74ce5.f413647q;
        if ((f4Var2 != null && f4Var2.isShowing()) && (f4Var = m47302x7ff74ce5.f413647q) != null) {
            f4Var.hide();
        }
        int i17 = this.f413848e ? com.p314xaae8f345.mm.R.C30867xcad56011.n1y : com.p314xaae8f345.mm.R.C30867xcad56011.n29;
        android.view.View view = m47302x7ff74ce5.f413347d;
        android.content.Context context = view.getContext();
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = j65.q.a(view.getContext()).getText(i17);
        m47302x7ff74ce5.f413647q = e4Var.c();
        return jz5.f0.f384359a;
    }
}
