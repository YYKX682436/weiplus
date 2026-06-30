package ae2;

/* loaded from: classes3.dex */
public final class q5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.q5 f85648d = new ae2.q5();

    public q5() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae;
        qo2.e Zj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Zj();
        Zj.getClass();
        try {
            c26924x4cd4bae = Zj.f447115d;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(Zj.f447113b, "[clearTable] e:" + e17.getMessage());
        }
        if (c26924x4cd4bae == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("msgTable");
            throw null;
        }
        c26924x4cd4bae.m107087x90df30e9();
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae2 = Zj.f447114c;
        if (c26924x4cd4bae2 != null) {
            c26924x4cd4bae2.m107087x90df30e9();
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sessionTable");
        throw null;
    }
}
