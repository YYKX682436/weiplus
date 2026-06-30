package gi;

/* loaded from: classes12.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f353607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(boolean z17) {
        super(1);
        this.f353607d = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wh.s0 it = (wh.s0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object mo141623x754a37bb = ((jz5.n) it.f527401f).mo141623x754a37bb();
        boolean z17 = this.f353607d;
        synchronized (mo141623x754a37bb) {
            if (it.k()) {
                it.m();
                if (z17) {
                    wh.f.a("Matrix.battery.ThreadWatch", "CallStack", "dump callstacks sampling from Thread WatchDog:\n".concat(wh.s0.e(it, null, 0.0f, false, 7, null)), 0, 8, null);
                }
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
