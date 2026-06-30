package rk4;

/* loaded from: classes11.dex */
public final class o1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f478404d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f478404d = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25185xbf891f35 c25185xbf891f35;
        bw5.y0 y0Var = (bw5.y0) obj;
        if (y0Var != null) {
            boolean[] zArr = y0Var.f116831h;
            c25185xbf891f35 = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25185xbf891f35(zArr[1] ? y0Var.f116827d : "", zArr[2] ? y0Var.f116828e : "", zArr[3] ? y0Var.f116829f : "", null, 8, null);
        } else {
            c25185xbf891f35 = null;
        }
        this.f478404d.f391656d = c25185xbf891f35;
        return jz5.f0.f384359a;
    }
}
