package id3;

/* loaded from: classes.dex */
public final class b implements vz.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f372443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ id3.c f372444b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f372445c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f372446d;

    public b(java.util.HashMap hashMap, id3.c cVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f372443a = hashMap;
        this.f372444b = cVar;
        this.f372445c = f0Var;
        this.f372446d = h0Var;
    }

    @Override // vz.n1
    public void a(float f17, long j17, long j18) {
        cl0.g gVar = new cl0.g();
        gVar.h("progress", java.lang.Float.valueOf(f17));
        gVar.p("totalBytesWritten", j17);
        gVar.p("totalBytesExpectedToWrite", j18);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1840x42297a0d.C16438xfd95669a c16438xfd95669a = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1840x42297a0d.C16438xfd95669a();
        c16438xfd95669a.f229415e = gVar2;
        this.f372444b.b(c16438xfd95669a);
    }

    @Override // vz.n1
    public void b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1840x42297a0d.C16439xc0c464dd c16439xc0c464dd = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1840x42297a0d.C16439xc0c464dd();
        c16439xc0c464dd.f229415e = java.lang.String.valueOf(jSONObject);
        this.f372444b.b(c16439xc0c464dd);
    }

    @Override // vz.n1
    public void c(org.json.JSONObject jSONObject) {
    }

    @Override // vz.o1
    public void d(int i17, java.lang.String str) {
        id3.c cVar = this.f372444b;
        if (i17 != 0) {
            this.f372445c.f391649d = i17;
            if (str == null) {
                str = "";
            }
            this.f372446d.f391656d = str;
            cVar.a(cVar.d(i17, str));
            return;
        }
        java.lang.Long valueOf = str != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(str)) : null;
        java.util.HashMap map = this.f372443a;
        map.put("downloadId", valueOf);
        cVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        lc3.c0 c0Var = cVar.f229583g;
        if (c0Var != null) {
            cVar.a(c0Var.l(map));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFakeJsApi");
            throw null;
        }
    }
}
