package mz2;

/* loaded from: classes7.dex */
public class x1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public x1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6143x73a8205 c6143x73a8205 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6143x73a8205) abstractC20979x809547d1;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SupportFingerPrintEventListener", "SupportFingerPrintEventListener account is not ready");
            return false;
        }
        if (!(c6143x73a8205 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6143x73a8205)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SupportFingerPrintEventListener", "handle SupportFingerPrintEvent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SupportFingerPrintEventListener", "isSupportFP is " + ((nz2.o) gm0.j1.s(nz2.o.class)).Lf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        c6143x73a8205.getClass();
        java.lang.Runnable runnable = c6143x73a8205.f273897d;
        if (runnable != null) {
            runnable.run();
        }
        return true;
    }
}
