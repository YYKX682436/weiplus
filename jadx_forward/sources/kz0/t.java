package kz0;

/* loaded from: classes5.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 f395343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var) {
        super(1);
        this.f395343d = m7Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285 it = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5 b17 = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5.f151558m.b(it, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5.f151559n);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var = this.f395343d;
        m7Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addMoreTemplate: ");
        java.lang.String templateId = b17.f151610a;
        sb6.append(templateId);
        sb6.append(", true");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", sb6.toString());
        java.util.Iterator it6 = m7Var.b().iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj2).f151610a, templateId)) {
                break;
            }
        }
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj2;
        if (m7Var.b().contains(b17) || m5Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "added tamplateInfo has existed in template list");
        } else {
            m7Var.f151630o.add(b17);
            m7Var.g(null);
            m7Var.f151636u = true;
            bz0.j jVar = bz0.j.f118283a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasReport25621", "addRecommendFromMoreTemplate: ".concat(templateId));
            ((java.util.ArrayList) bz0.j.f118290h).add(templateId);
            java.util.ArrayList arrayList = (java.util.ArrayList) bz0.j.f118286d;
            if (!arrayList.contains(templateId)) {
                arrayList.add(templateId);
            }
        }
        if (m7Var.f151622g) {
            m7Var.f(templateId);
        } else {
            m7Var.e(templateId);
        }
        return jz5.f0.f384359a;
    }
}
