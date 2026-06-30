package a55;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a55.g f1606f;

    public d(a55.g gVar, int i17, int i18) {
        this.f1606f = gVar;
        this.f1604d = i17;
        this.f1605e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).reportCGIServerError(this.f1604d, this.f1605e);
    }
}
