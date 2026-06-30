package ja2;

/* loaded from: classes8.dex */
public final class a implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f380137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f380138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f380139c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.f96 f380140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f380141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f380142f;

    public a(yz5.l lVar, yz5.a aVar, java.lang.String str, r45.f96 f96Var, int i17, int i18) {
        this.f380137a = lVar;
        this.f380138b = aVar;
        this.f380139c = str;
        this.f380140d = f96Var;
        this.f380141e = i17;
        this.f380142f = i18;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.qo2 qo2Var = (r45.qo2) fVar.f152151d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.v90 v90Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.v90();
            java.lang.String str = this.f380139c;
            v90Var.f68734x29a73180 = str;
            r45.f96 f96Var = this.f380140d;
            v90Var.f68728x2593847b = f96Var.m75945x2fec8307(17);
            v90Var.f68727xe40cf8e9 = f96Var.m75945x2fec8307(18);
            v90Var.f68733x24a41292 = f96Var.m75945x2fec8307(19);
            v90Var.f68735x1be9d71c = java.lang.String.valueOf(f96Var.m75938x746dc8a6(20));
            v90Var.f68729xd3933fa9 = java.lang.String.valueOf(f96Var.m75939xb282bd08(10));
            v90Var.f68730xc7eeb611 = f96Var.m75938x746dc8a6(1);
            v90Var.f68731xa2ce34aa = f96Var.m75938x746dc8a6(0);
            java.lang.String m75945x2fec8307 = qo2Var.m75945x2fec8307(3);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                m75945x2fec8307 = f96Var.m75945x2fec8307(4);
            }
            v90Var.f68725x302a49af = m75945x2fec8307;
            v90Var.f68726x7daa258 = qo2Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.w90 w90Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.w90) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).f120672z).mo141623x754a37bb();
            w90Var.getClass();
            java.lang.String field_poiId = v90Var.f68734x29a73180;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_poiId, "field_poiId");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.v90 y07 = w90Var.y0(field_poiId);
            l75.k0 k0Var = w90Var.f209771d;
            if (y07 != null) {
                o75.c cVar = new o75.c(o75.b.f425116d, java.lang.String.valueOf(v90Var.f68734x29a73180), "MicroMsg.SDK.BaseFinderMapPoiInfo");
                cVar.f425123d = v90Var;
                new m75.e(v90Var, cVar, dm.v4.H, "MicroMsg.SDK.BaseFinderMapPoiInfo").a(k0Var);
            } else {
                o75.c cVar2 = new o75.c(o75.b.f425115c, java.lang.String.valueOf(v90Var.f68734x29a73180), "MicroMsg.SDK.BaseFinderMapPoiInfo");
                cVar2.f425123d = v90Var;
                new m75.c(v90Var, true, cVar2, dm.v4.H, "MicroMsg.SDK.BaseFinderMapPoiInfo").a(k0Var);
            }
            r45.c35 c35Var = new r45.c35();
            c35Var.set(0, str);
            java.lang.String m75945x2fec83072 = qo2Var.m75945x2fec8307(1);
            if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
                m75945x2fec83072 = f96Var.m75945x2fec8307(3);
            }
            c35Var.set(4, m75945x2fec83072);
            java.lang.String m75945x2fec83073 = qo2Var.m75945x2fec8307(3);
            if (m75945x2fec83073 == null || m75945x2fec83073.length() == 0) {
                m75945x2fec83073 = f96Var.m75945x2fec8307(4);
            }
            c35Var.set(6, m75945x2fec83073);
            c35Var.set(5, qo2Var.m75941xfb821914(2));
            c35Var.set(2, java.lang.Long.valueOf(this.f380141e));
            c35Var.set(3, java.lang.Long.valueOf(this.f380142f));
            c35Var.set(11, java.lang.Float.valueOf(f96Var.m75938x746dc8a6(1)));
            c35Var.set(12, java.lang.Float.valueOf(f96Var.m75938x746dc8a6(0)));
            this.f380137a.mo146xb9724478(c35Var);
        } else {
            this.f380138b.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
