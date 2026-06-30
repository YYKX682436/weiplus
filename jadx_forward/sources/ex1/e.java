package ex1;

/* loaded from: classes12.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6227x9fa4a4fc c6227x9fa4a4fc = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6227x9fa4a4fc) abstractC20979x809547d1;
        if (c6227x9fa4a4fc instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6227x9fa4a4fc) {
            if (gm0.j1.h()) {
                am.u00 u00Var = c6227x9fa4a4fc.f136474g;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
                c6231x4f3054ba.f136478g.f89948b = 2;
                c6231x4f3054ba.e();
                u00Var.f89582a = c6231x4f3054ba.f136479h.f90034b || iq.b.H();
            } else {
                com.p314xaae8f345.mm.app.p5.c("MicroMsg.VoipCallingListener", "[-] MMKernel is not initialized, cannot check status of voip.", new java.lang.Object[0]);
                c6227x9fa4a4fc.f136474g.f89582a = false;
            }
        }
        return false;
    }
}
