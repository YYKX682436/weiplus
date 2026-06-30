package mz0;

/* loaded from: classes5.dex */
public final class p2 implements com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mz0.x2 f414557a;

    public p2(mz0.x2 x2Var) {
        this.f414557a = x2Var;
    }

    @Override // com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c7
    public void a(int i17, java.lang.String templateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
    }

    @Override // com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.b7
    public void b(java.lang.String templateId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        dx1.f fVar = dx1.g.f326022a;
        bx1.u uVar = bx1.u.f117843e;
        fVar.j("SnsTemplate", "egviewcnt", 1, uVar);
        fVar.m("SnsTemplate", "egdetail", "egids", templateId, uVar, "#");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(templateId, "@@miaojian@@")) {
            bz0.j jVar = bz0.j.f118283a;
            bz0.j.f118284b.f140521l = 1;
            c(dw3.o0.f325775f);
        } else {
            bz0.j jVar2 = bz0.j.f118283a;
            java.util.ArrayList arrayList = (java.util.ArrayList) bz0.j.f118286d;
            if (arrayList.contains(templateId)) {
                return;
            }
            arrayList.add(templateId);
        }
    }

    @Override // com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c7
    public void c(dw3.o0 launchType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchType, "launchType");
        nu3.g.f421749a.c(this.f414557a.m80379x76847179(), launchType);
    }

    @Override // com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.b7
    public void d(java.lang.String templateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        bz0.j jVar = bz0.j.f118283a;
        bz0.j.f118294l = new bz0.h(templateId, false, null, null, 14, null);
    }

    @Override // com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c7
    public void e(int i17, java.lang.String templateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(templateId, "@@@miaojian@@@")) {
            bz0.j jVar = bz0.j.f118283a;
            bz0.j.f118284b.f140521l = 1;
            c(dw3.o0.f325776g);
        } else {
            java.util.TreeMap treeMap = bz0.j.f118287e;
            if (treeMap.containsKey(java.lang.Integer.valueOf(i17))) {
                return;
            }
            treeMap.put(java.lang.Integer.valueOf(i17), templateId);
        }
    }

    @Override // com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.b7
    public void f(java.lang.String templateId, int i17) {
        n0.e5 e5Var;
        n0.e5 e5Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        dx1.f fVar = dx1.g.f326022a;
        bx1.u uVar = bx1.u.f117843e;
        fVar.j("SnsTemplate", "egpreviewcnt", 1, uVar);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        mz0.x2 x2Var = this.f414557a;
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "egpreviewtime", java.lang.Long.valueOf(currentTimeMillis - x2Var.K), uVar, false, null, null, 224, null);
        ty0.b1 b1Var = x2Var.f414422m;
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "musicStatus", java.lang.Integer.valueOf(((b1Var == null || (e5Var2 = b1Var.f504327d) == null || !((java.lang.Boolean) e5Var2.mo128745x754a37bb()).booleanValue()) ? 0 : 1) ^ 1), null, false, null, null, 240, null);
        ty0.b1 b1Var2 = x2Var.f414422m;
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "oriMusicStatus", java.lang.Integer.valueOf(1 ^ ((b1Var2 == null || (e5Var = b1Var2.f504328e) == null || !((java.lang.Boolean) e5Var.mo128745x754a37bb()).booleanValue()) ? 0 : 1)), null, false, null, null, 240, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "td", java.lang.Integer.valueOf(x2Var.f414613J), null, true, "egtd", null, 144, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "maasSessionKey", bz0.a.f118255a, null, false, null, null, 240, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "egid", templateId, null, false, null, null, 240, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "eglocation", java.lang.Integer.valueOf(i17), null, false, null, null, 240, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "musicSearchFlag", 0, null, false, null, null, 240, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "musiccnt", 0, uVar, false, null, null, 224, null);
        bz0.j jVar = bz0.j.f118283a;
        jVar.a(templateId, "");
        jVar.b(templateId, "");
    }
}
