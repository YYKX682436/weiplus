package d24;

/* loaded from: classes5.dex */
public final class n0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 f307483d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1) {
        this.f307483d = c17513xe6a0fae1;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1 = this.f307483d;
            g4Var.b(c17513xe6a0fae1.f243388n, com.p314xaae8f345.mm.R.C30867xcad56011.git, com.p314xaae8f345.mm.R.raw.f80601x5e8591bd);
            g4Var.b(c17513xe6a0fae1.f243389o, com.p314xaae8f345.mm.R.C30867xcad56011.gis, com.p314xaae8f345.mm.R.raw.f80600x6efdca2d);
            c17513xe6a0fae1.getClass();
            java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k())};
            java.util.HashMap hashMap = new java.util.HashMap(1);
            java.util.Map.Entry entry = entryArr[0];
            java.lang.Object key = entry.getKey();
            java.util.Objects.requireNonNull(key);
            java.lang.Object value = entry.getValue();
            java.util.Objects.requireNonNull(value);
            if (hashMap.put(key, value) == null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("log_out_float", "view_exp", java.util.Collections.unmodifiableMap(hashMap), 34575);
            } else {
                throw new java.lang.IllegalArgumentException("duplicate key: " + key);
            }
        }
    }
}
