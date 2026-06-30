package lh3;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f400202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f400203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f400204f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lh3.k f400205g;

    public i(lh3.k kVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18) {
        this.f400205g = kVar;
        this.f400202d = m1Var;
        this.f400203e = i17;
        this.f400204f = i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String mo13823xb5887636;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f400202d;
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = m1Var.mo47948x7f0c4558();
        int i17 = (mo808xfb85f7b0 == 1616 || mo808xfb85f7b0 == 1518 || mo808xfb85f7b0 == 385 || !(mo47948x7f0c4558 == null || (mo13823xb5887636 = mo47948x7f0c4558.mo13823xb5887636()) == null || !mo13823xb5887636.startsWith("/cgi-bin/mmpay-bin/"))) ? 1 : 0;
        if (i17 == 1) {
            this.f400205g.getClass();
            try {
                if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40085xe877826c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && b3.l.m9698x3fed0563(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    int i18 = this.f400203e;
                    int i19 = this.f400204f;
                    boolean z17 = (i18 == 0 && i19 == 0) ? 1 : 0;
                    java.util.LinkedList linkedList = (java.util.LinkedList) lh3.k.wi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    if (linkedList.size() == 0) {
                        return;
                    }
                    lh3.j jVar = (lh3.j) linkedList.get(0);
                    java.util.Iterator it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        lh3.j jVar2 = (lh3.j) it.next();
                        if (jVar2.f400212g) {
                            jVar = jVar2;
                            break;
                        }
                    }
                    java.lang.String str = jVar.f400206a;
                    java.lang.String str2 = jVar.f400207b;
                    java.lang.String str3 = jVar.f400209d;
                    java.lang.String str4 = jVar.f400208c;
                    java.lang.String str5 = jVar.f400210e;
                    int i27 = jVar.f400211f;
                    int i28 = i17 == 1 ? 3 : z17 == 0 ? 2 : 1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkOptReport", "reportCellInfo mcc[%s] mnc[%s] lac[%s] cellid[%s] netType[%s] dbm[%d] type[%d] success[%s] errType[%d] errCode[%d] cmdid[%d] reportType[%d]", str, str2, str3, str4, str5, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(mo808xfb85f7b0), java.lang.Integer.valueOf(i28));
                    jx3.f fVar = jx3.f.INSTANCE;
                    fVar.n(15608, i28, fVar.s(str, str2, str3, str4, str5, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(1 ^ z17), 0, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(mo808xfb85f7b0), java.lang.Integer.valueOf(i28)), false, false);
                }
            } catch (java.lang.Exception e17) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetworkOptReport", "getNetType : %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
    }
}
