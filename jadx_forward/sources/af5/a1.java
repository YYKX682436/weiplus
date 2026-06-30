package af5;

/* loaded from: classes5.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ af5.d1 f86083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(af5.d1 d1Var) {
        super(1);
        this.f86083d = d1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        v11.t markdownVM = (v11.t) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(markdownVM, "markdownVM");
        af5.d1 d1Var = this.f86083d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b = d1Var.f86097g;
        if (c22094xdaed490b == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thinkingMarkdownView");
            throw null;
        }
        c22094xdaed490b.m48330xfcfee142(markdownVM);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b2 = d1Var.f86097g;
        if (c22094xdaed490b2 != null) {
            c22094xdaed490b2.setVisibility(0);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thinkingMarkdownView");
        throw null;
    }
}
