package na2;

/* loaded from: classes2.dex */
public final class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f {
    public final java.util.List F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.F = kz5.c0.i(new na2.l(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p4f), 1), new na2.l(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p4c), 2));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f, x92.m
    public void G7() {
        E7(null);
        java.util.LinkedList<r45.bo6> linkedList = new java.util.LinkedList();
        for (na2.l lVar : this.F) {
            r45.bo6 bo6Var = new r45.bo6();
            bo6Var.set(0, lVar.f417510a);
            bo6Var.set(1, java.lang.Integer.valueOf(lVar.f417511b));
            bo6Var.set(2, java.lang.Long.valueOf(m158359x1e885992().getLongExtra("topic_id", 0L)));
            linkedList.add(bo6Var);
        }
        for (r45.bo6 bo6Var2 : linkedList) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 I7 = I7(bo6Var2);
            if (this.f183363z == null) {
                this.f183363z = I7;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(this, K7(bo6Var2, false), I7, false, 4, null);
        }
        r7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 I7(r45.bo6 tagInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagInfo, "tagInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayNewTabUIC", "createFragment: " + tagInfo.m75945x2fec8307(0) + ", tabId:" + tagInfo.m75939xb282bd08(1));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca c14134xc5fab6ca = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca();
        c14134xc5fab6ca.f191581z = m158359x1e885992().getLongExtra("from_object_id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (stringExtra == null) {
            stringExtra = "";
        }
        c14134xc5fab6ca.G = stringExtra;
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("source_session_buffer");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        c14134xc5fab6ca.F = stringExtra2;
        java.lang.String stringExtra3 = m158359x1e885992().getStringExtra("jump_native_by_pass");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        c14134xc5fab6ca.H = stringExtra3;
        c14134xc5fab6ca.B = m158359x1e885992().getIntExtra("double_comment_scene", 0);
        c14134xc5fab6ca.C = m158359x1e885992().getIntExtra("single_comment_scene", 0);
        c14134xc5fab6ca.I = m158359x1e885992().getIntExtra("business_type", 0);
        java.lang.String stringExtra4 = m158359x1e885992().getStringExtra("cli_report_info");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        c14134xc5fab6ca.f191575J = stringExtra4;
        java.lang.String stringExtra5 = m158359x1e885992().getStringExtra("by_pass");
        c14134xc5fab6ca.A = stringExtra5 != null ? stringExtra5 : "";
        c14134xc5fab6ca.f191580y = tagInfo.m75939xb282bd08(1);
        c14134xc5fab6ca.f191579x = m158359x1e885992().getLongExtra("topic_id", 0L);
        if (tagInfo.m75939xb282bd08(1) == 1) {
            na2.m mVar = new na2.m(c14134xc5fab6ca);
            c14134xc5fab6ca.K = mVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = c14134xc5fab6ca.f191578w;
            if (abstractC13834x56f46d28 != null) {
                if (abstractC13834x56f46d28 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13882x61ebdb0d c13882x61ebdb0d = abstractC13834x56f46d28 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13882x61ebdb0d ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13882x61ebdb0d) abstractC13834x56f46d28 : null;
                if (c13882x61ebdb0d != null) {
                    c13882x61ebdb0d.f189105t = mVar;
                }
            }
        }
        return c14134xc5fab6ca;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f
    public w92.a K7(r45.bo6 tagInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagInfo, "tagInfo");
        java.lang.String m75945x2fec8307 = tagInfo.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        return new w92.a(-1, m75945x2fec8307, z17, tagInfo.m75939xb282bd08(1), 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f
    public int N7() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f
    public boolean Q7(r45.r03 topicInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicInfo, "topicInfo");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f, x92.m
    public int w7() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.adu;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f, x92.m
    public boolean y7() {
        return false;
    }

    @Override // x92.q
    public void z5() {
        mo55425x60022348();
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f215192h;
        if (c1190x18d3c3fe == null) {
            return;
        }
        c1190x18d3c3fe.m8321x40341e13(1);
    }
}
