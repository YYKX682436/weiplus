package ci5;

/* loaded from: classes10.dex */
public abstract class e implements mf3.k, zh5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams f41725a;

    /* renamed from: b, reason: collision with root package name */
    public final t40.b f41726b;

    /* renamed from: c, reason: collision with root package name */
    public dn.j f41727c;

    public e(com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams params, t40.b config) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(config, "config");
        this.f41725a = params;
        this.f41726b = config;
    }

    @Override // zh5.j0
    public java.lang.String b() {
        return null;
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    public final java.lang.String d() {
        return this.f41726b.f415473g + "/finder_live_gallery_image/downloaded/" + this.f41725a.f66604e + ".temp";
    }

    @Override // mf3.k
    public java.lang.String g() {
        return h();
    }

    @Override // mf3.k
    public java.lang.String getId() {
        return this.f41725a.f66604e;
    }

    public final java.lang.String h() {
        return this.f41726b.f415473g + "/finder_live_gallery_video/downloaded/" + this.f41725a.f66604e + ".mp4";
    }

    public final java.lang.String i() {
        return this.f41726b.f415473g + "/finder_live_gallery_video/downloading/" + this.f41725a.f66604e + ".mp4";
    }
}
