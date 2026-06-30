package b92;

@j95.b
/* loaded from: classes5.dex */
public final class x2 extends i95.w implements ts5.o {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f100097d;

    public x2() {
        ae2.b2 b2Var = ae2.b2.f84994a;
        this.f100097d = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f85021v).mo141623x754a37bb()).r()).intValue() == 1;
    }

    /* renamed from: isEnable */
    public boolean m10052xdac2174d() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean z17 = z65.c.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTrendTraceService", "#isEnable isSpecialVersion=" + z17 + " isTestVersion=" + o45.wf.f424565j + " customRuleEnable=false");
        if (z17) {
            return true;
        }
        return this.f100097d;
    }
}
