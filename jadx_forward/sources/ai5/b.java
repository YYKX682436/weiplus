package ai5;

/* loaded from: classes12.dex */
public final class b extends ai5.c {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f86739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r45.gp0 favData, long j17, java.lang.String str, hu.f fVar) {
        super(favData, j17, str, fVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favData, "favData");
        this.f86739e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20037x617a9113()) == 1;
    }

    @Override // mf3.k
    public gg3.c a() {
        return null;
    }

    @Override // mf3.k
    public eg3.i c() {
        java.lang.String g17 = g();
        r45.gp0 gp0Var = this.f86740a;
        java.lang.String str = gp0Var.f456967s;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = gp0Var.f456971u;
        return new eg3.i(g17, str, str2 != null ? str2 : "");
    }

    @Override // ai5.c
    public tt.h d() {
        return b(zu.b.f557168e, g());
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String mediaId = mo2110x5db1b11();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f488937f;
        linkedHashMap.put(mVar, g());
        linkedHashMap.put(sf3.m.f488939h, h());
        sf3.g a17 = new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
        if (this.f86739e) {
            a17.f488925f = new sf3.a();
        } else {
            a17.f488925f = new sf3.b();
        }
        return a17;
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        return mf3.u.f407656e;
    }

    @Override // ai5.c
    public tt.h i() {
        return null;
    }
}
