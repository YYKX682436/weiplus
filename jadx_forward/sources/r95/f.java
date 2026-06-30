package r95;

/* loaded from: classes10.dex */
public final class f extends r95.c {

    /* renamed from: b, reason: collision with root package name */
    public s95.n f474990b = s95.o.f486687g.mo20599xaaa148a0();

    public f() {
        this.f474985a = s95.n0.f486667z.mo20599xaaa148a0();
    }

    public final java.lang.String c() {
        java.lang.String str;
        s95.m0 m0Var = (s95.m0) a();
        java.lang.Object obj = m0Var.f486648e;
        if (obj instanceof java.lang.String) {
            str = (java.lang.String) obj;
        } else {
            str = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
            m0Var.f486648e = str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.c(str, "innerBuilder.path");
        return str;
    }

    public void d(byte[] data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(data, "data");
        this.f474985a = ((s95.n0) s95.n0.A.mo20642x92b714fd(data)).mo20599xaaa148a0();
        s95.o oVar = ((s95.m0) a()).f486661u;
        if (oVar == null) {
            oVar = s95.o.f486687g;
        }
        this.f474990b = oVar.mo20599xaaa148a0();
    }

    public final void e(int i17) {
        s95.m0 m0Var = (s95.m0) a();
        s95.v vVar = i17 != 0 ? i17 != 1 ? i17 != 2 ? s95.v.UNRECOGNIZED : s95.v.CenterInside : s95.v.CenterCrop : s95.v.Custom;
        m0Var.getClass();
        m0Var.f486663w = vVar.mo20656x276ffe3f();
        m0Var.m20881x7bb163d5();
    }

    public final void f(r95.e value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(value, "value");
        s95.m0 m0Var = (s95.m0) a();
        m0Var.f486650g = value.f474988a;
        m0Var.m20881x7bb163d5();
        s95.m0 m0Var2 = (s95.m0) a();
        m0Var2.f486651h = value.f474989b;
        m0Var2.m20881x7bb163d5();
    }

    public final void g(r95.e value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(value, "value");
        s95.m0 m0Var = (s95.m0) a();
        m0Var.f486652i = value.f474988a;
        m0Var.m20881x7bb163d5();
        s95.m0 m0Var2 = (s95.m0) a();
        m0Var2.f486653m = value.f474989b;
        m0Var2.m20881x7bb163d5();
    }

    /* renamed from: toString */
    public java.lang.String m162081x9616526c() {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Track(trackId:");
        sb6.append(((s95.m0) a()).f486647d);
        sb6.append(" path:");
        sb6.append(c());
        sb6.append(" trackType:");
        s95.u a17 = s95.u.a(((s95.m0) a()).f486649f);
        if (a17 == null) {
            a17 = s95.u.UNRECOGNIZED;
        }
        int ordinal = a17.ordinal();
        if (ordinal != 1) {
            i17 = 3;
            if (ordinal != 2) {
                i17 = ordinal != 3 ? 0 : 1;
            }
        } else {
            i17 = 2;
        }
        sb6.append(i17);
        sb6.append(" source:");
        sb6.append(new r95.e(((s95.m0) a()).f486650g, ((s95.m0) a()).f486651h));
        sb6.append("  track:");
        sb6.append(new r95.e(((s95.m0) a()).f486652i, ((s95.m0) a()).f486653m));
        sb6.append(" playRate:");
        sb6.append(((s95.m0) a()).f486660t);
        sb6.append(" volume:");
        sb6.append(((s95.m0) a()).f486658r);
        sb6.append(" rotate:");
        sb6.append(((s95.m0) a()).f486659s);
        sb6.append(" resolution:");
        sb6.append(new r95.d(((s95.m0) a()).f486655o, ((s95.m0) a()).f486656p));
        sb6.append(" contentCrop:");
        s95.v a18 = s95.v.a(((s95.m0) a()).f486663w);
        if (a18 == null) {
            a18 = s95.v.UNRECOGNIZED;
        }
        int ordinal2 = a18.ordinal();
        sb6.append(ordinal2 != 0 ? ordinal2 != 1 ? ordinal2 != 2 ? 4 : 2 : 1 : 0);
        sb6.append(" displayRect:");
        s95.o oVar = ((s95.m0) a()).f486661u;
        if (oVar == null) {
            oVar = s95.o.f486687g;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.c(oVar, "innerBuilder.cropInfo");
        s95.y h17 = oVar.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.c(h17, "innerBuilder.cropInfo.displayRect");
        sb6.append(r95.a.b(h17));
        sb6.append(')');
        return sb6.toString();
    }
}
