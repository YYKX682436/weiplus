package tb1;

/* loaded from: classes7.dex */
public class x implements bi3.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f498481a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0 f498482b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f498483c;

    /* renamed from: d, reason: collision with root package name */
    public int f498484d = Integer.MIN_VALUE;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f498481a = lVar;
        this.f498482b = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0) lVar.mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0.class);
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FrameDataCallbackHelper", "onUIResume mNeedCallback:%b", java.lang.Boolean.valueOf(this.f498483c));
        if (this.f498483c) {
            if (c16529x1336da53 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FrameDataCallbackHelper", "onUIResume recordView null");
                return;
            }
            int i17 = this.f498484d;
            if (i17 == Integer.MIN_VALUE) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FrameDataCallbackHelper", "onUIResume invalid mCurrentSharedBufferId");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0 h0Var = this.f498482b;
            if (h0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FrameDataCallbackHelper", "onUIResume mSharedBufferAddon null");
            } else {
                c16529x1336da53.c(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) h0Var).m0(i17), this);
            }
        }
    }
}
