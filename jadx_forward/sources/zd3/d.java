package zd3;

/* loaded from: classes7.dex */
public final class d implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd3.f f553136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f553138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553139g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553140h;

    public d(zd3.f fVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        this.f553136d = fVar;
        this.f553137e = str;
        this.f553138f = i17;
        this.f553139g = str2;
        this.f553140h = str3;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b c16466x1a72912b = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b) obj;
        int i17 = c16466x1a72912b.f229692d;
        zd3.f fVar = this.f553136d;
        if (i17 != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareResourceForExternalTexture check environment failed: ");
            java.lang.String str = c16466x1a72912b.f229693e;
            sb6.append(str);
            rk0.c.b("MB_External_surface", sb6.toString(), new java.lang.Object[0]);
            fVar.s().mo146xb9724478(fVar.h(6, str));
            return;
        }
        int i18 = this.f553138f;
        java.lang.String type = this.f553139g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(type, "$type");
        java.lang.String str2 = this.f553140h;
        fVar.getClass();
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(this.f553137e, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478(ve3.u.f517638d, i18, type, str2, null, 16, null), xd3.e.class, new zd3.e(fVar));
    }
}
