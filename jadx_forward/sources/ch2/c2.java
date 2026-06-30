package ch2;

/* loaded from: classes10.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f122835d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(r45.yx1 yx1Var) {
        super(1);
        this.f122835d = yx1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6517xa6e83e44 it = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6517xa6e83e44) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play_info isEmpty: ");
        r45.yx1 yx1Var = this.f122835d;
        sb6.append(yx1Var.f472999o == null);
        sb6.append(" resource_info isEmpty: ");
        r45.by1 by1Var = yx1Var.f472999o;
        sb6.append((by1Var != null ? by1Var.f452677e : null) == null);
        it.p(sb6.toString());
        gh2.a[] aVarArr = gh2.a.f353387d;
        it.q("ResourceEmpty");
        return jz5.f0.f384359a;
    }
}
