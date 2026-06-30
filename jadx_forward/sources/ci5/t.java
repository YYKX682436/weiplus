package ci5;

/* loaded from: classes12.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f123313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f123314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f123315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg3.c f123316g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123317h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z17, ci5.b0 b0Var, mf3.k kVar, gg3.c cVar, java.lang.String str) {
        super(0);
        this.f123313d = z17;
        this.f123314e = b0Var;
        this.f123315f = kVar;
        this.f123316g = cVar;
        this.f123317h = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f123313d) {
            jg3.b.X6(this.f123314e, this.f123315f, gg3.d.f353266e, this.f123316g, null, 4, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.CFinderLiveStorageVideoStateManager", "moveFileWithCheck failed for mediaId: " + this.f123317h);
            jg3.b.X6(this.f123314e, this.f123315f, gg3.d.f353267f, this.f123316g, null, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
