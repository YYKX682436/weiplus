package wq2;

/* loaded from: classes2.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f530056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.uz2 f530057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wq2.h f530058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.yz2 f530059g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f530060h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r45.fa2 fa2Var, r45.uz2 uz2Var, wq2.h hVar, r45.yz2 yz2Var, boolean z17) {
        super(1);
        this.f530056d = fa2Var;
        this.f530057e = uz2Var;
        this.f530058f = hVar;
        this.f530059g = yz2Var;
        this.f530060h = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zq2.b bVar;
        zq2.c it = (zq2.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        r45.fa2 fa2Var = this.f530056d;
        int i17 = fa2Var.f455659e;
        r45.uz2 containerInfo = this.f530057e;
        if (i17 == 11) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(containerInfo, "$containerInfo");
            bVar = new zq2.d(containerInfo, fa2Var);
        } else if (i17 == 10) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(containerInfo, "$containerInfo");
            bVar = new zq2.a(containerInfo, fa2Var);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(containerInfo, "$containerInfo");
            bVar = new zq2.b(containerInfo, fa2Var);
        }
        java.util.LinkedList<r45.ea2> linkedList = fa2Var.f455662h;
        java.util.ArrayList arrayList = bVar.f556560e;
        wq2.h hVar = this.f530058f;
        if (linkedList != null) {
            boolean z17 = this.f530060h;
            for (r45.ea2 ea2Var : linkedList) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2);
                if (c19792x256d2725 != null) {
                    cu2.t tVar = cu2.u.f303974a;
                    java.util.List c17 = kz5.b0.c(c19792x256d2725);
                    int d17 = hc2.d0.d(0);
                    android.app.Activity context = hVar.f530062a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) kz5.n0.Z(tVar.j(c17, d17, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6()));
                    if (c14994x9b99c079 != null) {
                        int m75939xb282bd08 = ea2Var.m75939xb282bd08(1);
                        if (m75939xb282bd08 == 4) {
                            arrayList.add(new vp2.d0(c14994x9b99c079, ea2Var, fa2Var, ea2Var.m75945x2fec8307(8), z17));
                        } else if (m75939xb282bd08 == 13) {
                            arrayList.add(new vp2.i0(c14994x9b99c079, ea2Var, fa2Var, ea2Var.m75945x2fec8307(8), z17));
                        }
                    }
                }
            }
        }
        java.lang.String themeId = hVar.f530068g;
        java.lang.String str = containerInfo.f469281e;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        r45.yz2 yz2Var = this.f530059g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeId, "themeId");
        it.f556564g.Q6(themeId, str2, 0, 0, arrayList, yz2Var != null ? yz2Var.f473055i : null, yz2Var);
        return jz5.f0.f384359a;
    }
}
