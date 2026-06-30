package c30;

@j95.b
/* loaded from: classes11.dex */
public final class f0 extends i95.w implements c00.g4 {

    /* renamed from: d, reason: collision with root package name */
    public c30.e f38113d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38114e;

    /* renamed from: f, reason: collision with root package name */
    public c30.s f38115f;

    /* renamed from: g, reason: collision with root package name */
    public c30.i f38116g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f38117h;

    /* renamed from: i, reason: collision with root package name */
    public c30.h0 f38118i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f38119m = new java.util.concurrent.atomic.AtomicInteger(0);

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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAccountInitialized(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.f0.onAccountInitialized(android.content.Context):void");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("EcsWeShopMgr", "onAccountReleased");
        c30.e eVar = this.f38113d;
        if (eVar != null) {
            com.tencent.wcdb.core.Database database = eVar.f38107a;
            if (database.isOpened()) {
                try {
                    database.close();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("EcsWeShopDB", e17, "close db failed, error: " + e17.getMessage(), new java.lang.Object[0]);
                }
            }
        }
        this.f38113d = null;
        c30.i iVar = this.f38116g;
        if (iVar != null) {
            iVar.f38133d.dead();
            com.tencent.mars.xlog.Log.i("EcsWeShopFetchDataTrigger", "stop");
        }
        this.f38116g = null;
        c30.s sVar = this.f38115f;
        if (sVar != null) {
            sVar.f38159b = null;
        }
        this.f38115f = null;
        com.tencent.mm.sdk.event.IListener iListener = this.f38117h;
        if (iListener != null) {
            iListener.dead();
        }
        this.f38117h = null;
        this.f38118i = null;
    }
}
