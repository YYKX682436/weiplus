package c50;

/* loaded from: classes4.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f120153a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f120154b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f120155c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f120156d;

    public v0(int i17, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, java.lang.String finderContextId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderContextId, "finderContextId");
        this.f120153a = i17;
        this.f120154b = view;
        this.f120155c = jbVar;
        this.f120156d = finderContextId;
    }

    /* renamed from: equals */
    public boolean m14180xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c50.v0)) {
            return false;
        }
        c50.v0 v0Var = (c50.v0) obj;
        return this.f120153a == v0Var.f120153a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120154b, v0Var.f120154b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120155c, v0Var.f120155c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120156d, v0Var.f120156d);
    }

    /* renamed from: hashCode */
    public int m14181x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f120153a) * 31;
        android.view.View view = this.f120154b;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f120155c;
        return ((hashCode2 + (jbVar != null ? jbVar.hashCode() : 0)) * 31) + this.f120156d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m14182x9616526c() {
        return "Ret(errCode=" + this.f120153a + ", view=" + this.f120154b + ", ctrlInfo=" + this.f120155c + ", finderContextId=" + this.f120156d + ')';
    }

    public /* synthetic */ v0(int i17, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, java.lang.String str, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, view, (i18 & 4) != 0 ? null : jbVar, (i18 & 8) != 0 ? "" : str);
    }
}
