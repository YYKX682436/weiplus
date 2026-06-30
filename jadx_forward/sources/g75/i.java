package g75;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f350908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f350908d = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f350908d;
        g75.r rVar = (g75.r) h0Var.f391656d;
        if (rVar != null) {
            rVar.f350928g = null;
        }
        if (rVar != null) {
            rVar.c();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("continuation is cancel ");
        g75.r rVar2 = (g75.r) h0Var.f391656d;
        sb6.append(rVar2 != null ? rVar2.f350927f : null);
        sb6.append(' ');
        g75.r rVar3 = (g75.r) h0Var.f391656d;
        sb6.append(rVar3 != null ? java.lang.Integer.valueOf(rVar3.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Pipeline.Pipeline", sb6.toString());
        return jz5.f0.f384359a;
    }
}
