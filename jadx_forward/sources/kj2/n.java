package kj2;

/* loaded from: classes10.dex */
public final class n extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj2.o f389953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f389954b;

    public n(kj2.o oVar, java.util.ArrayList arrayList) {
        this.f389953a = oVar;
        this.f389954b = arrayList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        vi2.g gVar;
        vi2.g gVar2;
        vi2.h hVar = (vi2.h) kz5.n0.a0(this.f389953a.f389962h, i17);
        java.lang.Integer num = null;
        java.lang.Integer valueOf = (hVar == null || (gVar2 = hVar.f519083d) == null) ? null : java.lang.Integer.valueOf(gVar2.ordinal());
        vi2.h hVar2 = (vi2.h) kz5.n0.a0(this.f389954b, i18);
        if (hVar2 != null && (gVar = hVar2.f519083d) != null) {
            num = java.lang.Integer.valueOf(gVar.ordinal());
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, num);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        r45.xn1 xn1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.xn1 xn1Var2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        vi2.h hVar = (vi2.h) kz5.n0.a0(this.f389953a.f389962h, i17);
        java.lang.String str = null;
        java.lang.String m76197x6c03c64c = (hVar == null || (xn1Var2 = hVar.f519084e) == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c();
        vi2.h hVar2 = (vi2.h) kz5.n0.a0(this.f389954b, i18);
        if (hVar2 != null && (xn1Var = hVar2.f519084e) != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null) {
            str = c19782x23db1cfa.m76197x6c03c64c();
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m76197x6c03c64c, str);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f389954b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f389953a.f389962h.size();
    }
}
