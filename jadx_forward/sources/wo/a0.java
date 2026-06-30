package wo;

/* loaded from: classes12.dex */
public class a0 extends wo.u0 {
    @Override // wo.q0
    public java.lang.String a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            java.lang.String a17 = super.a(str);
            java.lang.String k96 = fo3.s.INSTANCE.k9();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (k96 == null) {
                k96 = "";
            }
            if (!k96.equals(a17)) {
                synchronized (this.f529322c) {
                    this.f529320a = false;
                    this.f529321b = null;
                    c(null);
                }
            }
        }
        return super.a(str);
    }
}
