package d40;

@j95.b
/* loaded from: classes12.dex */
public final class t extends jm0.o implements e40.c0 {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(f40.v.class);
    }

    public void Zi(java.util.Collection requests, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requests, "requests");
        if (!jm0.g.class.isAssignableFrom(f40.v.class)) {
            throw new java.lang.IllegalArgumentException(d40.t.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(f40.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        f40.v vVar = (f40.v) ((jm0.g) a17);
        java.lang.Integer valueOf = pVar != null ? java.lang.Integer.valueOf(pVar.hashCode()) : null;
        kz5.n0.g0(requests, ",", null, null, 0, null, f40.p.f340978d, 30, null);
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) vVar.f340997f).mo141623x754a37bb(), null, new f40.r(requests, valueOf, vVar, pVar, null), 1, null);
    }

    public void aj(java.util.Collection fileIdBatch) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileIdBatch, "fileIdBatch");
        if (!jm0.g.class.isAssignableFrom(f40.v.class)) {
            throw new java.lang.IllegalArgumentException(d40.t.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(f40.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        kz5.n0.g0(fileIdBatch, ",", null, null, 0, null, null, 62, null);
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) ((f40.v) ((jm0.g) a17)).f340997f).mo141623x754a37bb(), null, new f40.s(fileIdBatch, null), 1, null);
    }

    public java.util.Map bj(java.util.Collection fileIdBatch) {
        e40.b0 b0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileIdBatch, "fileIdBatch");
        if (!jm0.g.class.isAssignableFrom(f40.v.class)) {
            throw new java.lang.IllegalArgumentException(d40.t.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(f40.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        java.util.Collection collection = fileIdBatch;
        kz5.n0.g0(collection, ",", null, null, 0, null, null, 62, null);
        lm.o oVar = (lm.o) ((jz5.n) ((lm.r) ((w65.n) i95.n0.c(w65.n.class))).f400864o).mo141623x754a37bb();
        int d17 = kz5.b1.d(kz5.d0.q(collection, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : collection) {
            java.lang.Float f17 = (java.lang.Float) oVar.get((java.lang.String) obj);
            if (f17 != null) {
                float floatValue = f17.floatValue();
                b0Var = new e40.b0();
                b0Var.f329145a = e40.a0.f329137g;
                b0Var.f329146b = java.lang.Float.valueOf(floatValue);
            } else {
                b0Var = new e40.b0();
            }
            linkedHashMap.put(obj, b0Var);
        }
        return linkedHashMap;
    }
}
