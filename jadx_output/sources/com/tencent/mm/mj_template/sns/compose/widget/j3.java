package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f70005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.c1 f70006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f70007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f70008g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(androidx.paging.compose.e eVar, com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var, yz5.p pVar, yz5.p pVar2) {
        super(1);
        this.f70005d = eVar;
        this.f70006e = c1Var;
        this.f70007f = pVar;
        this.f70008g = pVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        f0.t0 LazyVerticalGrid = (f0.t0) obj;
        kotlin.jvm.internal.o.g(LazyVerticalGrid, "$this$LazyVerticalGrid");
        androidx.paging.compose.e eVar = this.f70005d;
        int c17 = eVar.c();
        com.tencent.mm.mj_template.sns.compose.widget.w2 w2Var = new com.tencent.mm.mj_template.sns.compose.widget.w2(eVar);
        yz5.p pVar = this.f70007f;
        yz5.p pVar2 = this.f70008g;
        com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var = this.f70006e;
        f0.r0.b(LazyVerticalGrid, c17, w2Var, null, null, u0.j.c(581608132, true, new com.tencent.mm.mj_template.sns.compose.widget.c3(eVar, c1Var, pVar, pVar2)), 12, null);
        java.util.List list = ((g4.u0) ((n0.q4) eVar.f11717b).getValue()).f268578g;
        if (((com.tencent.mm.mj_template.sns.compose.widget.m5) kz5.n0.k0(list)) instanceof com.tencent.mm.mj_template.sns.compose.widget.c5) {
            f0.r0.a(LazyVerticalGrid, "@@@no_more_template_item@@@", new com.tencent.mm.mj_template.sns.compose.widget.d3(c1Var), null, com.tencent.mm.mj_template.sns.compose.widget.l0.f70041c, 4, null);
        } else {
            int c18 = eVar.c();
            boolean z17 = !c1Var.f69889t;
            if (c1Var.f69871b && c18 == 0 && z17) {
                com.tencent.mm.mj_template.sns.compose.widget.b5 b5Var = com.tencent.mm.mj_template.sns.compose.widget.b5.f69865e;
                f0.r0.a(LazyVerticalGrid, b5Var.f70077a, null, null, u0.j.c(-395050644, true, new com.tencent.mm.mj_template.sns.compose.widget.g3(c1Var, b5Var)), 6, null);
                c18 = 1;
            }
            int i17 = c1Var.f69887r;
            int i18 = i17 - (c18 % i17);
            if (i18 > 0 && i18 < i17) {
                f0.r0.b(LazyVerticalGrid, i18, com.tencent.mm.mj_template.sns.compose.widget.h3.f69981d, null, null, com.tencent.mm.mj_template.sns.compose.widget.l0.f70042d, 12, null);
            }
            f0.r0.a(LazyVerticalGrid, "@@@loading_more_template_placeholder_item_left@@@", null, null, com.tencent.mm.mj_template.sns.compose.widget.l0.f70043e, 6, null);
            if ((eVar.d().f268195c instanceof g4.w0) || z17) {
                f0.r0.a(LazyVerticalGrid, new com.tencent.mm.mj_template.sns.compose.widget.i3("@@@loading_more@@@"), null, null, com.tencent.mm.mj_template.sns.compose.widget.l0.f70044f, 6, null);
            }
            f0.r0.a(LazyVerticalGrid, "@@@loading_more_template_placeholder_item_right@@@", null, null, com.tencent.mm.mj_template.sns.compose.widget.l0.f70045g, 6, null);
        }
        int i19 = 0;
        if ((c1Var.f69894y && !c1Var.f69893x) && !kotlin.jvm.internal.o.b(c1Var.f69881l, "")) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.mj_template.sns.compose.widget.m5) it.next()).f70077a, c1Var.f69881l)) {
                    break;
                }
                i19++;
            }
            if (i19 >= 0) {
                kotlinx.coroutines.l.d(c1Var.f69870a, null, null, new com.tencent.mm.mj_template.sns.compose.widget.u0(i19, c1Var, null), 3, null);
            }
        }
        if (eVar.c() > 0) {
            c1Var.f69889t = true;
        }
        return jz5.f0.f302826a;
    }
}
