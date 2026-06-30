package ci5;

/* loaded from: classes12.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f123266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ci5.q f123267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f123268f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf3.g f123269g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123270h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z17, ci5.q qVar, mf3.k kVar, sf3.g gVar, java.lang.String str) {
        super(0);
        this.f123266d = z17;
        this.f123267e = qVar;
        this.f123268f = kVar;
        this.f123269g = gVar;
        this.f123270h = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f123266d;
        sf3.g gVar = this.f123269g;
        mf3.k kVar = this.f123268f;
        ci5.q qVar = this.f123267e;
        if (z17) {
            qVar.W6(kVar, sf3.k.f488930e, gVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.FinderLiveImageStateManager", "moveFileWithCheck failed for mediaId: " + this.f123270h);
            qVar.W6(kVar, sf3.k.f488931f, gVar);
        }
        return jz5.f0.f384359a;
    }
}
