package bi5;

/* loaded from: classes12.dex */
public final class c implements mf3.k {

    /* renamed from: a, reason: collision with root package name */
    public final r45.gp0 f102632a;

    public c(r45.gp0 favData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favData, "favData");
        this.f102632a = favData;
    }

    @Override // mf3.k
    public gg3.c a() {
        return new gg3.c(mo2110x5db1b11(), b(), g(), null, 0L, false, 56, null);
    }

    public final java.lang.String b() {
        java.lang.String X;
        mf3.u mo2109xfb85f7b0 = mo2109xfb85f7b0();
        mf3.u uVar = mf3.u.f407657f;
        r45.gp0 gp0Var = this.f102632a;
        if (mo2109xfb85f7b0 != uVar) {
            return (mo2109xfb85f7b0() != mf3.u.f407656e || gp0Var == null || (X = o72.x1.X(gp0Var)) == null) ? "" : X;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 2;
        z9Var.f90066f = gp0Var;
        c5432x35bb364f.e();
        java.lang.String thumbPath = c5432x35bb364f.f135777h.f87670d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thumbPath, "thumbPath");
        return thumbPath;
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    @Override // mf3.k
    public sf3.g e() {
        if (mo2109xfb85f7b0() == mf3.u.f407657f) {
            java.lang.String mediaId = mo2110x5db1b11();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            sf3.m mVar = sf3.m.f488937f;
            linkedHashMap.put(mVar, b());
            linkedHashMap.put(sf3.m.f488939h, b());
            return new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
        }
        if (mo2109xfb85f7b0() != mf3.u.f407656e) {
            return null;
        }
        java.lang.String mediaId2 = mo2110x5db1b11();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId2, "mediaId");
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        sf3.m mVar2 = sf3.m.f488937f;
        linkedHashMap2.put(mVar2, g());
        linkedHashMap2.put(sf3.m.f488939h, b());
        return new sf3.g(linkedHashMap2, mediaId2, null, null, null, null, 60, null).a(mVar2);
    }

    @Override // mf3.k
    public java.lang.String g() {
        java.lang.String x17;
        mf3.u mo2109xfb85f7b0 = mo2109xfb85f7b0();
        mf3.u uVar = mf3.u.f407657f;
        r45.gp0 gp0Var = this.f102632a;
        if (mo2109xfb85f7b0 != uVar) {
            return (mo2109xfb85f7b0() != mf3.u.f407656e || (x17 = o72.x1.x(gp0Var)) == null) ? "" : x17;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 2;
        z9Var.f90066f = gp0Var;
        c5432x35bb364f.e();
        java.lang.String path = c5432x35bb364f.f135777h.f87669c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "path");
        return path;
    }

    @Override // mf3.k
    /* renamed from: getId */
    public java.lang.String mo2110x5db1b11() {
        r45.gp0 gp0Var = this.f102632a;
        if (gp0Var.f456964q2 != null) {
            return "fav_uuid@" + gp0Var.f456964q2;
        }
        if (gp0Var.T == null) {
            return com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        return "fav_data_id@" + gp0Var.T;
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        int i17 = this.f102632a.I;
        return i17 == 4 ? mf3.u.f407657f : i17 == 2 ? mf3.u.f407656e : mf3.u.f407655d;
    }
}
