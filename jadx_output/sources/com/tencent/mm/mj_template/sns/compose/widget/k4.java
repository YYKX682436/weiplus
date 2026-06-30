package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final /* synthetic */ class k4 extends kotlin.jvm.internal.m implements yz5.a {
    public k4(java.lang.Object obj) {
        super(0, obj, com.tencent.mm.mj_template.sns.compose.widget.c1.class, "onConfirmed", "onConfirmed()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var = (com.tencent.mm.mj_template.sns.compose.widget.c1) this.receiver;
        az0.d dVar = c1Var.f69877h;
        if (dVar != null) {
            az0.d.b(dVar, null, 1, null);
        }
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = c1Var.f69884o;
        com.tencent.mm.mj_template.sns.compose.widget.e5 e5Var = m5Var instanceof com.tencent.mm.mj_template.sns.compose.widget.e5 ? (com.tencent.mm.mj_template.sns.compose.widget.e5) m5Var : null;
        if (e5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "now not select anything");
        } else {
            java.lang.String str = c1Var.f69880k;
            java.lang.String str2 = e5Var.f70077a;
            if (kotlin.jvm.internal.o.b(str2, str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onConfirmed: " + str2 + ", same initialSelect");
                c1Var.c();
            } else {
                c1Var.f69875f.invoke(e5Var.f69947p);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onConfirmed: " + str2);
                c1Var.f69874e.invoke();
            }
        }
        return jz5.f0.f302826a;
    }
}
