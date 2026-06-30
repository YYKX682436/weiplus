package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final /* synthetic */ class s6 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public s6(java.lang.Object obj) {
        super(1, obj, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7.class, "onTemplateSelected", "onTemplateSelected(Lcom/tencent/mm/mj_template/sns/compose/widget/SnsTemplateListData;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 p07 = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7) this.f72685xcfcbe9ef;
        m7Var.getClass();
        boolean z17 = m7Var.f151622g;
        boolean z18 = p07.f151612c;
        java.lang.String str = p07.f151610a;
        if (z17) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p07, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.h5.f151516e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "open more panel");
                m7Var.f151624i.mo152xb9724478();
            } else if (!z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "click unselectable item");
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, m7Var.a())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "same current " + str + ", open segment clip");
                p3325xe03a0797.p3326xc267989b.l.d(m7Var.f151616a, null, null, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.f7(m7Var, p07, null), 3, null);
            } else {
                az0.d dVar = m7Var.f151627l;
                if (dVar != null) {
                    ((dz0.k0) dVar).e(str);
                }
                az0.d dVar2 = m7Var.f151627l;
                if (dVar2 != null) {
                    ((dz0.k0) dVar2).f(p07, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.g7(m7Var, p07));
                }
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p07, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.h5.f151516e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "open more panel");
            m7Var.f151624i.mo152xb9724478();
        } else if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "click unselectable item");
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, m7Var.a())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "no need to select " + str);
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.b7 b7Var = m7Var.f151634s;
            if (b7Var != null) {
                b7Var.d(str);
            }
            m7Var.f151625j.mo146xb9724478(m7Var.a());
        } else {
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.b7 b7Var2 = m7Var.f151634s;
            if (b7Var2 != null) {
                b7Var2.f(str, m7Var.b().indexOf(p07));
            }
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.f151616a, null, null, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.i7(p07, m7Var, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
