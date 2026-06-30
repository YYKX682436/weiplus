package ym5;

/* loaded from: classes15.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ym5.p0 f544992d = new ym5.p0();

    public p0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Iterator it = ym5.a1.f544723b.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            ym5.r0.a(ym5.r0.f545018a, ((ym5.b1) entry.getValue()).f544743a, (ym5.b1) entry.getValue());
            if (((ym5.b1) entry.getValue()).f544752j || ((ym5.b1) entry.getValue()).f544751i) {
                it.remove();
            }
        }
        ym5.r0 r0Var = ym5.r0.f545018a;
        ym5.r0.f545021d = ym5.a1.f544723b.size();
        ym5.r0.f545019b = java.lang.System.nanoTime();
        return jz5.f0.f384359a;
    }
}
