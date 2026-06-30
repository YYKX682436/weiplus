package ai5;

/* loaded from: classes12.dex */
public final class d extends ai5.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r45.gp0 favData, long j17, java.lang.String str, hu.f fVar) {
        super(favData, j17, str, fVar);
        kotlin.jvm.internal.o.g(favData, "favData");
    }

    @Override // mf3.k
    public gg3.c a() {
        return new gg3.c(getId(), h(), g(), null, this.f5207a.f375448y * 1000, false, 40, null);
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    @Override // ai5.c
    public tt.h d() {
        return b(zu.b.f475634d, h());
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String mediaId = getId();
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407404f;
        linkedHashMap.put(mVar, h());
        return new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326124f;
    }

    @Override // ai5.c
    public tt.h i() {
        return b(zu.b.f475635e, g());
    }
}
