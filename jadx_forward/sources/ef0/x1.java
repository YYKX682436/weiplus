package ef0;

/* loaded from: classes11.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f333888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333889e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(bw5.ar0 ar0Var, java.lang.String str) {
        super(1);
        this.f333888d = ar0Var;
        this.f333889e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.zq0 it = (bw5.zq0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        bw5.zq0 zq0Var = new bw5.zq0();
        zq0Var.mo11468x92b714fd(it.m75960xfb7e5820());
        zq0Var.f117667d = this.f333888d.f106955d;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        android.util.ArrayMap arrayMap = zq0Var.f117674g2;
        arrayMap.put(1, bool);
        zq0Var.N1 = 1;
        arrayMap.put(808, bool);
        zq0Var.G1 = this.f333889e;
        arrayMap.put(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r0.f34827x366c91de), bool);
        return zq0Var;
    }
}
