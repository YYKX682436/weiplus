package id3;

/* loaded from: classes.dex */
public final class l implements vz.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id3.m f372457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f372458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f372459c;

    public l(id3.m mVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f372457a = mVar;
        this.f372458b = f0Var;
        this.f372459c = h0Var;
    }

    @Override // vz.n1
    public void a(float f17, long j17, long j18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("progress", java.lang.Float.valueOf(f17));
        jSONObject.put("totalBytesWritten", j17);
        jSONObject.put("totalBytesExpectedToWrite", j18);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1840x42297a0d.C16438xfd95669a c16438xfd95669a = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1840x42297a0d.C16438xfd95669a();
        c16438xfd95669a.f229415e = jSONObject2;
        this.f372457a.b(c16438xfd95669a);
    }

    @Override // vz.n1
    public void b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1840x42297a0d.C16439xc0c464dd c16439xc0c464dd = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1840x42297a0d.C16439xc0c464dd();
        c16439xc0c464dd.f229415e = java.lang.String.valueOf(jSONObject);
        this.f372457a.b(c16439xc0c464dd);
    }

    @Override // vz.n1
    public void c(org.json.JSONObject jSONObject) {
    }

    @Override // vz.o1
    public void d(int i17, java.lang.String str) {
        id3.m mVar = this.f372457a;
        if (i17 == 0) {
            mVar.a(mVar.e());
            return;
        }
        this.f372458b.f391649d = i17;
        if (str == null) {
            str = "";
        }
        this.f372459c.f391656d = str;
        mVar.a(mVar.d(i17, str));
    }
}
