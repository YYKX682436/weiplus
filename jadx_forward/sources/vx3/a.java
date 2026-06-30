package vx3;

/* loaded from: classes10.dex */
public final class a implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public vx3.i f522794d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f522795e;

    /* renamed from: f, reason: collision with root package name */
    public long f522796f;

    public a(vx3.i iVar, java.lang.String str, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar2) {
        iVar = (i17 & 1) != 0 ? null : iVar;
        str = (i17 & 2) != 0 ? null : str;
        j17 = (i17 & 4) != 0 ? 0L : j17;
        this.f522794d = iVar;
        this.f522795e = str;
        this.f522796f = j17;
    }

    public final vx3.a a(java.lang.String json) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        vx3.a aVar = new vx3.a(null, null, 0L, 7, null);
        cl0.g gVar = new cl0.g(json);
        try {
            vx3.k kVar = vx3.l.E;
            java.lang.String mo15074x2fec8307 = gVar.mo15074x2fec8307("info");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15074x2fec8307, "getString(...)");
            aVar.f522794d = kVar.f(mo15074x2fec8307);
            aVar.f522795e = gVar.mo15074x2fec8307(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            aVar.f522796f = gVar.mo15073xfb822ef2("order");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExclusiveInfo", "ExclusiveInfo fromJson fail:" + e17);
        }
        return aVar;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        vx3.a other = (vx3.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(this.f522796f, other.f522796f);
    }
}
