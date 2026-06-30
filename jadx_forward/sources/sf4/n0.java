package sf4;

/* loaded from: classes4.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f489065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f489066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502, android.content.Context context) {
        super(0);
        this.f489065d = c18497x85806502;
        this.f489066e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sf4.d dVar;
        sf4.d dVar2;
        sf4.d dVar3;
        sf4.d dVar4;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f489065d;
        if (c18497x85806502.D) {
            java.util.ArrayList arrayList = c18497x85806502.f253642z;
            int size = arrayList.size();
            int i17 = c18497x85806502.f253635u;
            if (i17 >= 0 && i17 < size) {
                int size2 = ((java.util.ArrayList) arrayList.get(i17)).size();
                int i18 = c18497x85806502.f253636v;
                if (i18 >= 0 && i18 < size2) {
                    java.lang.Object obj = ((java.util.ArrayList) arrayList.get(c18497x85806502.f253635u)).get(c18497x85806502.f253636v);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    if4.f fVar = (if4.f) obj;
                    sf4.d dVar5 = c18497x85806502.M;
                    if (dVar5 != null) {
                        dVar5.dismiss();
                    }
                    c18497x85806502.M = new sf4.d(this.f489066e);
                    nf4.j J0 = ef4.w.f334001t.i().J0(fVar.f372780e.f372786a);
                    if (J0 != null) {
                        if (((J0.f69406x52c1d072 & 4) != 0 ? J0 : null) != null && (dVar4 = c18497x85806502.M) != null) {
                            dVar4.A = true;
                        }
                    }
                    if (J0 != null) {
                        if (((J0.f69410x443468b > 0L ? 1 : (J0.f69410x443468b == 0L ? 0 : -1)) == 0 ? J0 : null) != null && (dVar3 = c18497x85806502.M) != null) {
                            dVar3.E = false;
                        }
                    }
                    if (J0 != null) {
                        if (((J0.f69410x443468b > 0L ? 1 : (J0.f69410x443468b == 0L ? 0 : -1)) == 0 || J0.z0() ? J0 : null) != null && (dVar2 = c18497x85806502.M) != null) {
                            dVar2.C = false;
                        }
                    }
                    if (c18497x85806502.getGalleryType() == ze4.k.FavSelfStoryGallery && (dVar = c18497x85806502.M) != null) {
                        dVar.f488978z = false;
                    }
                    sf4.d dVar6 = c18497x85806502.M;
                    if (dVar6 != null) {
                        dVar6.B = (J0 != null && pm0.v.z(J0.f69405x686589a9, 4)) && !J0.z0();
                    }
                    sf4.d dVar7 = c18497x85806502.M;
                    if (dVar7 != null) {
                        dVar7.D = J0 != null && J0.u0();
                    }
                    sf4.d dVar8 = c18497x85806502.M;
                    if ((dVar8 != null && dVar8.B) && dVar8 != null) {
                        dVar8.E = false;
                    }
                    if ((dVar8 != null && dVar8.D) && dVar8 != null) {
                        dVar8.C = false;
                    }
                    if (dVar8 != null) {
                        dVar8.f488975w = new sf4.k0(c18497x85806502);
                    }
                    if (dVar8 != null) {
                        dVar8.f488976x = new sf4.l0(c18497x85806502, fVar);
                    }
                    if (dVar8 != null) {
                        dVar8.f488977y = new sf4.m0(c18497x85806502);
                    }
                    if (dVar8 != null) {
                        new sf4.j0(c18497x85806502);
                        dVar8.getClass();
                    }
                    if (dVar8 != null) {
                        dVar8.show();
                    }
                    c18497x85806502.H = true;
                    mf4.d dVar9 = mf4.d.f407693a;
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6935x89ce03dd c6935x89ce03dd = mf4.d.f407694b;
                    c6935x89ce03dd.f142449d = 7L;
                    c6935x89ce03dd.f142450e = c6935x89ce03dd.b("StoryId", java.lang.String.valueOf(J0 != null ? java.lang.Long.valueOf(J0.f69410x443468b) : null), true);
                    dVar9.b();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
