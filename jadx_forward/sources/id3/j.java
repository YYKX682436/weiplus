package id3;

/* loaded from: classes.dex */
public final class j implements vz.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id3.k f372454a;

    public j(id3.k kVar) {
        this.f372454a = kVar;
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
        this.f372454a.b(c16438xfd95669a);
    }

    @Override // vz.n1
    public void b(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("state", "") : null;
        if (optString == null || optString.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1840x42297a0d.C16439xc0c464dd c16439xc0c464dd = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1840x42297a0d.C16439xc0c464dd();
        c16439xc0c464dd.f229415e = java.lang.String.valueOf(jSONObject);
        this.f372454a.b(c16439xc0c464dd);
    }

    @Override // vz.n1
    public void c(org.json.JSONObject jSONObject) {
        java.util.Iterator<java.lang.String> keys;
        lc3.a0 a0Var = new lc3.a0();
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                a0Var.put(next, jSONObject.get(next));
            }
        }
        id3.k kVar = this.f372454a;
        kVar.getClass();
        lc3.c0 c0Var = kVar.f229583g;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFakeJsApi");
            throw null;
        }
        c0Var.m(a0Var);
        kVar.a(a0Var);
    }

    @Override // vz.o1
    public void d(int i17, java.lang.String str) {
        id3.k kVar = this.f372454a;
        kVar.f372455h = i17;
        if (str == null) {
            str = "";
        }
        kVar.getClass();
        kVar.f372456i = str;
        kVar.a(kVar.d(kVar.f372455h, kVar.f372456i));
    }
}
