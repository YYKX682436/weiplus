package ci5;

/* loaded from: classes12.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f41780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f41781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f41782f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg3.c f41783g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41784h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z17, ci5.b0 b0Var, mf3.k kVar, gg3.c cVar, java.lang.String str) {
        super(0);
        this.f41780d = z17;
        this.f41781e = b0Var;
        this.f41782f = kVar;
        this.f41783g = cVar;
        this.f41784h = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f41780d) {
            jg3.b.X6(this.f41781e, this.f41782f, gg3.d.f271733e, this.f41783g, null, 4, null);
        } else {
            com.tencent.mars.xlog.Log.e("MediaGallery.CFinderLiveStorageVideoStateManager", "moveFileWithCheck failed for mediaId: " + this.f41784h);
            jg3.b.X6(this.f41781e, this.f41782f, gg3.d.f271734f, this.f41783g, null, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
