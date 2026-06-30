package qw3;

/* loaded from: classes.dex */
public class d1 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 f448683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qw3.e1 f448684e;

    public d1(qw3.e1 e1Var, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359) {
        this.f448684e = e1Var;
        this.f448683d = c28001xdd2bb359;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        qw3.e1 e1Var = this.f448684e;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f448683d;
        return (c28001xdd2bb359 == null || c28001xdd2bb359.getText().length() == 0) ? e1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.aee) : java.lang.String.format(e1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.aec), c28001xdd2bb359.getText());
    }
}
