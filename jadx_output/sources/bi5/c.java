package bi5;

/* loaded from: classes12.dex */
public final class c implements mf3.k {

    /* renamed from: a, reason: collision with root package name */
    public final r45.gp0 f21099a;

    public c(r45.gp0 favData) {
        kotlin.jvm.internal.o.g(favData, "favData");
        this.f21099a = favData;
    }

    @Override // mf3.k
    public gg3.c a() {
        return new gg3.c(getId(), b(), g(), null, 0L, false, 56, null);
    }

    public final java.lang.String b() {
        java.lang.String X;
        mf3.u type = getType();
        mf3.u uVar = mf3.u.f326124f;
        r45.gp0 gp0Var = this.f21099a;
        if (type != uVar) {
            return (getType() != mf3.u.f326123e || gp0Var == null || (X = o72.x1.X(gp0Var)) == null) ? "" : X;
        }
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 2;
        z9Var.f8533f = gp0Var;
        favoriteOperationEvent.e();
        java.lang.String thumbPath = favoriteOperationEvent.f54244h.f6137d;
        kotlin.jvm.internal.o.f(thumbPath, "thumbPath");
        return thumbPath;
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    @Override // mf3.k
    public sf3.g e() {
        if (getType() == mf3.u.f326124f) {
            java.lang.String mediaId = getId();
            kotlin.jvm.internal.o.g(mediaId, "mediaId");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            sf3.m mVar = sf3.m.f407404f;
            linkedHashMap.put(mVar, b());
            linkedHashMap.put(sf3.m.f407406h, b());
            return new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
        }
        if (getType() != mf3.u.f326123e) {
            return null;
        }
        java.lang.String mediaId2 = getId();
        kotlin.jvm.internal.o.g(mediaId2, "mediaId");
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        sf3.m mVar2 = sf3.m.f407404f;
        linkedHashMap2.put(mVar2, g());
        linkedHashMap2.put(sf3.m.f407406h, b());
        return new sf3.g(linkedHashMap2, mediaId2, null, null, null, null, 60, null).a(mVar2);
    }

    @Override // mf3.k
    public java.lang.String g() {
        java.lang.String x17;
        mf3.u type = getType();
        mf3.u uVar = mf3.u.f326124f;
        r45.gp0 gp0Var = this.f21099a;
        if (type != uVar) {
            return (getType() != mf3.u.f326123e || (x17 = o72.x1.x(gp0Var)) == null) ? "" : x17;
        }
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 2;
        z9Var.f8533f = gp0Var;
        favoriteOperationEvent.e();
        java.lang.String path = favoriteOperationEvent.f54244h.f6136c;
        kotlin.jvm.internal.o.f(path, "path");
        return path;
    }

    @Override // mf3.k
    public java.lang.String getId() {
        r45.gp0 gp0Var = this.f21099a;
        if (gp0Var.f375431q2 != null) {
            return "fav_uuid@" + gp0Var.f375431q2;
        }
        if (gp0Var.T == null) {
            return com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        return "fav_data_id@" + gp0Var.T;
    }

    @Override // mf3.k
    public mf3.u getType() {
        int i17 = this.f21099a.I;
        return i17 == 4 ? mf3.u.f326124f : i17 == 2 ? mf3.u.f326123e : mf3.u.f326122d;
    }
}
