package ci5;

/* loaded from: classes10.dex */
public final class j extends ci5.e {

    /* renamed from: d, reason: collision with root package name */
    public final dn.o f123265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646 r10, t40.b r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ci5.j.<init>(com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams, t40.b, boolean):void");
    }

    @Override // mf3.k
    public gg3.c a() {
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646 c10598x47b4a646 = this.f123258a;
        java.lang.String str = c10598x47b4a646.f148137e;
        java.lang.String d17 = d();
        java.lang.String h17 = h();
        java.lang.String filename = this.f123265d.E1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filename, "filename");
        return new ci5.g(str, d17, h17, filename, c10598x47b4a646.f148140h * 1000, false, this.f123265d, 32, null);
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String mediaId = this.f123258a.f148137e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f488937f;
        java.lang.String path = d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        linkedHashMap.put(mVar, path);
        return new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        return mf3.u.f407657f;
    }
}
