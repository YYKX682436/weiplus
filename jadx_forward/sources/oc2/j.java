package oc2;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final oc2.i f425742a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f425743b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.f03 f425744c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f425745d;

    public j(oc2.i result, boolean z17, r45.f03 f03Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f425742a = result;
        this.f425743b = z17;
        this.f425744c = f03Var;
        this.f425745d = jbVar;
    }

    /* renamed from: equals */
    public boolean m151000xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.j)) {
            return false;
        }
        oc2.j jVar = (oc2.j) obj;
        return this.f425742a == jVar.f425742a && this.f425743b == jVar.f425743b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425744c, jVar.f425744c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425745d, jVar.f425745d);
    }

    /* renamed from: hashCode */
    public int m151001x8cdac1b() {
        int hashCode = ((this.f425742a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f425743b)) * 31;
        r45.f03 f03Var = this.f425744c;
        int hashCode2 = (hashCode + (f03Var == null ? 0 : f03Var.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f425745d;
        return hashCode2 + (jbVar != null ? jbVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m151002x9616526c() {
        return "RenderResultWrapper(result=" + this.f425742a + ", hasInit=" + this.f425743b + ", showInfo=" + this.f425744c + ", ctrInfo=" + this.f425745d + ')';
    }
}
