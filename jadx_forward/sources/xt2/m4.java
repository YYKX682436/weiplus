package xt2;

/* loaded from: classes3.dex */
public final class m4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f538425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(xt2.b5 b5Var) {
        super(0);
        this.f538425d = b5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xt2.b5 b5Var = this.f538425d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95 c14973x93b87f95 = b5Var.C;
        if (c14973x93b87f95 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addToTopOptionBtn");
            throw null;
        }
        c14973x93b87f95.a(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95 c14973x93b87f952 = b5Var.D;
        if (c14973x93b87f952 != null) {
            c14973x93b87f952.a(false);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addToBottomOptionBtn");
        throw null;
    }
}
