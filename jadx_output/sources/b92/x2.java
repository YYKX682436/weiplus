package b92;

@j95.b
/* loaded from: classes5.dex */
public final class x2 extends i95.w implements ts5.o {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18564d;

    public x2() {
        ae2.b2 b2Var = ae2.b2.f3461a;
        this.f18564d = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3488v).getValue()).r()).intValue() == 1;
    }

    public boolean isEnable() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean z17 = z65.c.a();
        com.tencent.mars.xlog.Log.i("FinderTrendTraceService", "#isEnable isSpecialVersion=" + z17 + " isTestVersion=" + o45.wf.f343032j + " customRuleEnable=false");
        if (z17) {
            return true;
        }
        return this.f18564d;
    }
}
