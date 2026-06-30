package xe2;

/* loaded from: classes3.dex */
public final class z0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535467c;

    /* renamed from: d, reason: collision with root package name */
    public int f535468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535467c = "LiveNoticeTriggerProgressInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        android.content.Context context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.sq1 sq1Var = new r45.sq1();
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(msgList);
        if (ch1Var != null) {
            if (!(ch1Var.m75934xbce7f2f(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
                byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                if (g17 != null) {
                    try {
                        sq1Var.mo11468x92b714fd(g17);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535467c, "pb = " + pm0.b0.g(sq1Var) + ", lastSeq = " + this.f535468d);
        if (sq1Var.m75939xb282bd08(0) != 1 || sq1Var.m75939xb282bd08(3) <= this.f535468d) {
            return;
        }
        this.f535468d = sq1Var.m75939xb282bd08(3);
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var == null || (context = k0Var.getContext()) == null) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = sq1Var.m75945x2fec8307(1);
        e4Var.c();
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20106};
    }
}
