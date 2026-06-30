package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final /* synthetic */ class s6 extends kotlin.jvm.internal.m implements yz5.l {
    public s6(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.mj_template.sns.compose.widget.m7.class, "onTemplateSelected", "onTemplateSelected(Lcom/tencent/mm/mj_template/sns/compose/widget/SnsTemplateListData;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.mj_template.sns.compose.widget.m5 p07 = (com.tencent.mm.mj_template.sns.compose.widget.m5) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var = (com.tencent.mm.mj_template.sns.compose.widget.m7) this.receiver;
        m7Var.getClass();
        boolean z17 = m7Var.f70089g;
        boolean z18 = p07.f70079c;
        java.lang.String str = p07.f70077a;
        if (z17) {
            if (kotlin.jvm.internal.o.b(p07, com.tencent.mm.mj_template.sns.compose.widget.h5.f69983e)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "open more panel");
                m7Var.f70091i.invoke();
            } else if (!z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "click unselectable item");
            } else if (kotlin.jvm.internal.o.b(str, m7Var.a())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "same current " + str + ", open segment clip");
                kotlinx.coroutines.l.d(m7Var.f70083a, null, null, new com.tencent.mm.mj_template.sns.compose.widget.f7(m7Var, p07, null), 3, null);
            } else {
                az0.d dVar = m7Var.f70094l;
                if (dVar != null) {
                    ((dz0.k0) dVar).e(str);
                }
                az0.d dVar2 = m7Var.f70094l;
                if (dVar2 != null) {
                    ((dz0.k0) dVar2).f(p07, new com.tencent.mm.mj_template.sns.compose.widget.g7(m7Var, p07));
                }
            }
        } else if (kotlin.jvm.internal.o.b(p07, com.tencent.mm.mj_template.sns.compose.widget.h5.f69983e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "open more panel");
            m7Var.f70091i.invoke();
        } else if (!z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "click unselectable item");
        } else if (kotlin.jvm.internal.o.b(str, m7Var.a())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "no need to select " + str);
            com.tencent.mm.mj_template.sns.compose.widget.b7 b7Var = m7Var.f70101s;
            if (b7Var != null) {
                b7Var.d(str);
            }
            m7Var.f70092j.invoke(m7Var.a());
        } else {
            com.tencent.mm.mj_template.sns.compose.widget.b7 b7Var2 = m7Var.f70101s;
            if (b7Var2 != null) {
                b7Var2.f(str, m7Var.b().indexOf(p07));
            }
            kotlinx.coroutines.l.d(m7Var.f70083a, null, null, new com.tencent.mm.mj_template.sns.compose.widget.i7(p07, m7Var, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
