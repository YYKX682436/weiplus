package kc2;

/* loaded from: classes12.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f388082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f388083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f388084f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kc2.a2 f388085g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(int i17, long j17, boolean z17, kc2.a2 a2Var) {
        super(1);
        this.f388082d = i17;
        this.f388083e = j17;
        this.f388084f = z17;
        this.f388085g = a2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        int i17 = this.f388082d - intValue;
        long j17 = i17;
        long j18 = this.f388083e;
        boolean z17 = j17 >= j18;
        if (z17) {
            boolean z18 = this.f388084f;
            kc2.a2 a2Var = this.f388085g;
            if (z18) {
                c66.q qVar = c66.q.f121026a;
                int i18 = a2Var.f387848b.f388072d;
                if (i18 > 0) {
                    try {
                        ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) c66.q.f121037l).mo141623x754a37bb()).m107088x90df30e9(ni0.f.f418754d.eq(i18).and(ni0.f.f418755e.eq(intValue)));
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.WCFinderWCDB", "deleteTimeItem actionType=" + i18 + " time=" + intValue + " fail, " + e17.getMessage());
                    }
                }
            }
            if (((java.lang.Boolean) ((jz5.n) a2Var.f387850d).mo141623x754a37bb()).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a2Var.f387849c, "(debug) drop out of date item " + a2Var.f387848b + ",time pass=" + i17 + ",dropDuration=" + j18);
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
