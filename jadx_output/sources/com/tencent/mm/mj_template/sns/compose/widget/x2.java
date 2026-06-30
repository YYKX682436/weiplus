package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final /* synthetic */ class x2 extends kotlin.jvm.internal.m implements yz5.l {
    public x2(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.mj_template.sns.compose.widget.c1.class, "checkTemplateItemEnablePlay", "checkTemplateItemEnablePlay(F)Z", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var = (com.tencent.mm.mj_template.sns.compose.widget.c1) this.receiver;
        int i17 = c1Var.f69888s - c1Var.f69873d;
        return java.lang.Boolean.valueOf((((((float) (i17 / 2)) + c1Var.f69892w) > floatValue ? 1 : ((((float) (i17 / 2)) + c1Var.f69892w) == floatValue ? 0 : -1)) <= 0 && (floatValue > (((float) i17) - ((float) i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, c1Var.b()))) ? 1 : (floatValue == (((float) i17) - ((float) i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, c1Var.b()))) ? 0 : -1)) <= 0) && !c1Var.f69893x);
    }
}
