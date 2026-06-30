package ov4;

/* loaded from: classes.dex */
public final class b implements nv4.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f430721a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f430722b;

    /* renamed from: c, reason: collision with root package name */
    public final int f430723c;

    public b(java.lang.String sessionId, java.lang.String exposeInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposeInfo, "exposeInfo");
        this.f430721a = sessionId;
        this.f430722b = exposeInfo;
        this.f430723c = i17;
    }

    @Override // nv4.h
    public java.lang.String A() {
        return "22369-" + this.f430721a + '-' + this.f430722b;
    }

    @Override // nv4.h
    public nv4.h B(nv4.h item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ov4.b bVar = item instanceof ov4.b ? (ov4.b) item : null;
        if (bVar == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("22369 merge ");
        java.lang.String str = this.f430722b;
        sb6.append(str);
        sb6.append(" with ");
        java.lang.String str2 = bVar.f430722b;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSReportItem22369", sb6.toString());
        java.lang.String exposeInfo = str + ';' + str2;
        java.lang.String sessionId = this.f430721a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposeInfo, "exposeInfo");
        return new ov4.b(sessionId, exposeInfo, this.f430723c);
    }

    /* renamed from: equals */
    public boolean m157213xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov4.b)) {
            return false;
        }
        ov4.b bVar = (ov4.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430721a, bVar.f430721a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430722b, bVar.f430722b) && this.f430723c == bVar.f430723c;
    }

    /* renamed from: hashCode */
    public int m157214x8cdac1b() {
        return (((this.f430721a.hashCode() * 31) + this.f430722b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f430723c);
    }

    /* renamed from: toString */
    public java.lang.String m157215x9616526c() {
        return "FTSReportItem22369(sessionId=" + this.f430721a + ", exposeInfo=" + this.f430722b + ", h5Version=" + this.f430723c + ')';
    }

    @Override // nv4.h
    public void z() {
        jx3.f.INSTANCE.mo68478xbd3cda5f(22369, this.f430721a + ',' + fp.s0.b(this.f430722b, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + ',' + this.f430723c);
    }
}
