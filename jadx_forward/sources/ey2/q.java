package ey2;

/* loaded from: classes2.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.u f339003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ey2.u uVar) {
        super(1);
        this.f339003d = uVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.ey0 ey0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        r45.en2 en2Var = this.f339003d.f339059e;
        if (en2Var != null && (ey0Var = (r45.ey0) en2Var.m75936x14adae67(11)) != null) {
            item.m59354x5169fd93(ey0Var.m75939xb282bd08(0));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207297d.put(java.lang.Long.valueOf(item.m59251x5db1b11()), item);
        sc2.p2.f487676b.a().a(kz5.b0.c(item));
        return jz5.f0.f384359a;
    }
}
