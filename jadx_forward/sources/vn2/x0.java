package vn2;

/* loaded from: classes2.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f519943a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f519944b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f519945c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f519946d;

    public x0(java.util.List list, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.util.List list2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2) {
        this.f519943a = list;
        this.f519944b = gVar;
        this.f519945c = list2;
        this.f519946d = gVar2;
    }

    /* renamed from: equals */
    public boolean m172342xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn2.x0)) {
            return false;
        }
        vn2.x0 x0Var = (vn2.x0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f519943a, x0Var.f519943a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f519944b, x0Var.f519944b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f519945c, x0Var.f519945c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f519946d, x0Var.f519946d);
    }

    /* renamed from: hashCode */
    public int m172343x8cdac1b() {
        java.util.List list = this.f519943a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f519944b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        java.util.List list2 = this.f519945c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f519946d;
        return hashCode3 + (gVar2 != null ? gVar2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m172344x9616526c() {
        return "Cache(seeLaterDataList=" + this.f519943a + ", seeLaterLastBuffer=" + this.f519944b + ", megaVideoFlowList=" + this.f519945c + ", megaVideoLastBuffer=" + this.f519946d + ')';
    }
}
