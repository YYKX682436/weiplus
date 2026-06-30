package or1;

/* loaded from: classes9.dex */
public class f0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12979xbcc07f40 f429022a;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12979xbcc07f40 activityC12979xbcc07f40) {
        this.f429022a = activityC12979xbcc07f40;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12979xbcc07f40 activityC12979xbcc07f40;
        if (message == null || message.what != 1 || (activityC12979xbcc07f40 = this.f429022a) == null || activityC12979xbcc07f40.isFinishing()) {
            return;
        }
        r01.q3.Ai().c(activityC12979xbcc07f40.f175540e, null);
        java.util.List i17 = r01.q3.cj().i1(activityC12979xbcc07f40.f175540e);
        int i18 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) i17;
            if (i18 >= arrayList.size()) {
                return;
            }
            java.lang.String str = (java.lang.String) arrayList.get(i18);
            if (c01.e2.J(str)) {
                r01.q3.Ai().c(str, null);
                com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                r0Var.f152062a = str;
                r0Var.f152069h = 1;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.d1.wi().j(str, r0Var);
            }
            i18++;
        }
    }
}
