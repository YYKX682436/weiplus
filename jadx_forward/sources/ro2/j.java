package ro2;

/* loaded from: classes2.dex */
public final class j implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f479583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f479584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f479585c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f479587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f479588f;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.content.Context context, java.lang.String str, java.util.Map map) {
        this.f479583a = qeVar;
        this.f479584b = s0Var;
        this.f479585c = abstractC14490x69736cb5;
        this.f479586d = context;
        this.f479587e = str;
        this.f479588f = map;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g
    public final void a() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 footer;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f479583a;
        in5.s0 s0Var = this.f479584b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item = this.f479585c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
        android.content.Context context = this.f479586d;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.E0(qeVar, s0Var, item, false, 0L, null, 0, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, false, 0L, (int) (i17 * kx2.a.f394811a.a(context)), 0, 1468, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar2 = this.f479583a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 j27 = qeVar2.f185891f.j2();
        if (j27 != null && (c15268x6a41bd8a = j27.f213600a) != null && (footer = c15268x6a41bd8a.getFooter()) != null) {
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34.N1;
            footer.t(this.f479587e, false, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        d2Var.h(context, "poster_send_to_cmt", "view_clk", false, this.f479588f);
        al5.u4 u4Var = qeVar2.F;
        if (u4Var != null) {
            u4Var.dismiss();
        }
    }
}
