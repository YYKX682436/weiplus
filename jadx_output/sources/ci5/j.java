package ci5;

/* loaded from: classes10.dex */
public final class j extends ci5.e {

    /* renamed from: d, reason: collision with root package name */
    public final dn.o f41732d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams r10, t40.b r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ci5.j.<init>(com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams, t40.b, boolean):void");
    }

    @Override // mf3.k
    public gg3.c a() {
        com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams finderLiveGalleryParams = this.f41725a;
        java.lang.String str = finderLiveGalleryParams.f66604e;
        java.lang.String d17 = d();
        java.lang.String h17 = h();
        java.lang.String filename = this.f41732d.E1;
        kotlin.jvm.internal.o.f(filename, "filename");
        return new ci5.g(str, d17, h17, filename, finderLiveGalleryParams.f66607h * 1000, false, this.f41732d, 32, null);
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String mediaId = this.f41725a.f66604e;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407404f;
        java.lang.String path = d();
        kotlin.jvm.internal.o.g(path, "path");
        linkedHashMap.put(mVar, path);
        return new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326124f;
    }
}
