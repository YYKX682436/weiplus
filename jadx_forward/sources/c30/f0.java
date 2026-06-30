package c30;

@j95.b
/* loaded from: classes11.dex */
public final class f0 extends i95.w implements c00.g4 {

    /* renamed from: d, reason: collision with root package name */
    public c30.e f119646d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f119647e;

    /* renamed from: f, reason: collision with root package name */
    public c30.s f119648f;

    /* renamed from: g, reason: collision with root package name */
    public c30.i f119649g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f119650h;

    /* renamed from: i, reason: collision with root package name */
    public c30.h0 f119651i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f119652m = new java.util.concurrent.atomic.AtomicInteger(0);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0046, code lost:
    
        if (r0 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void wi(c30.f0 r10, int r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.f0.wi(c30.f0, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00b0  */
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo204xfac946a6(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.f0.mo204xfac946a6(android.content.Context):void");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopMgr", "onAccountReleased");
        c30.e eVar = this.f119646d;
        if (eVar != null) {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b = eVar.f119640a;
            if (c26918x6e83759b.m106680xebf0ba33()) {
                try {
                    c26918x6e83759b.m106656x5a5ddf8();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EcsWeShopDB", e17, "close db failed, error: " + e17.getMessage(), new java.lang.Object[0]);
                }
            }
        }
        this.f119646d = null;
        c30.i iVar = this.f119649g;
        if (iVar != null) {
            iVar.f119666d.m43072x2efc64();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopFetchDataTrigger", "stop");
        }
        this.f119649g = null;
        c30.s sVar = this.f119648f;
        if (sVar != null) {
            sVar.f119692b = null;
        }
        this.f119648f = null;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f119650h;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        this.f119650h = null;
        this.f119651i = null;
    }
}
