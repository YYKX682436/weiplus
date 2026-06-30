package yg;

/* loaded from: classes7.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f543669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f543670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f543671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f543672g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 f543673h;

    public v(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83, android.view.Surface surface, int i17, int i18, int i19) {
        this.f543673h = abstractC4208x204d5c83;
        this.f543669d = surface;
        this.f543670e = i17;
        this.f543671f = i18;
        this.f543672g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f543669d == null) {
            ah.i.c("MicroMsg.MagicBrush.MBRuntime", new java.lang.RuntimeException("Stub here!"), "hy: text is null, do not notifyWindowChanged. maybe released by other module", new java.lang.Object[0]);
        } else {
            com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f543673h;
            abstractC4208x204d5c83.m34782xcb618d08(abstractC4208x204d5c83.f130110a, this.f543670e, this.f543669d, this.f543671f, this.f543672g);
        }
    }
}
