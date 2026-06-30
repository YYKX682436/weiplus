package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class h3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 f235879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xl3 f235880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var, r45.xl3 xl3Var) {
        super(0);
        this.f235879d = s4Var;
        this.f235880e = xl3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList<r45.el5> linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var = this.f235879d;
        s4Var.j().setAlpha(0.0f);
        s4Var.j().setVisibility(0);
        s4Var.j().animate().alpha(1.0f).setDuration(200L).start();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 j17 = s4Var.j();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = s4Var.f236088f;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        r45.xl3 xl3Var = this.f235880e;
        boolean z17 = xl3Var != null;
        int i17 = s4Var.f236084d.f236000v;
        java.lang.Object mo141623x754a37bb = ((jz5.n) s4Var.N).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((android.view.View) mo141623x754a37bb).getWidth());
        java.util.ArrayList arrayList = j17.f236170n;
        arrayList.clear();
        j17.f236171o = d17;
        j17.f236173q = new as3.b(xl3Var != null ? java.lang.Integer.valueOf(xl3Var.f471747g) : null, i17, xl3Var != null ? xl3Var.f471746f : null, null, 0, 24, null);
        if (xl3Var != null && (linkedList = xl3Var.f471744d) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.el5 el5Var : linkedList) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(el5Var);
                as3.b bVar = j17.f236173q;
                if (bVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("reportInfo");
                    throw null;
                }
                arrayList2.add(new vr3.a(el5Var, bVar));
            }
            arrayList.addAll(arrayList2);
        }
        d75.b.g(new as3.i(j17, z17, xl3Var, valueOf));
        return jz5.f0.f384359a;
    }
}
