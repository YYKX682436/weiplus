package lt3;

/* loaded from: classes10.dex */
public final class t implements fp0.p {
    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        lt3.q task = (lt3.q) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoMixHandler", "loader finish! taskId:" + task.f402804f.f68213x11522065 + ", status " + status);
        lt3.v.f402811b = false;
        yz5.a aVar = lt3.v.f402815f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        lt3.v.f402815f = null;
        int ordinal = status.ordinal();
        if (ordinal == 2) {
            lt3.v vVar = lt3.v.f402810a;
            lt3.g gVar = task.f402804f;
            int i17 = gVar.f68205x9ebc75fd;
            java.lang.String field_taskId = gVar.f68213x11522065;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_taskId, "field_taskId");
            lt3.v.a(vVar, i17, field_taskId, true, task.f402805g);
            vVar.b();
            return;
        }
        if (ordinal == 3) {
            lt3.v vVar2 = lt3.v.f402810a;
            lt3.g gVar2 = task.f402804f;
            int i18 = gVar2.f68205x9ebc75fd;
            java.lang.String field_taskId2 = gVar2.f68213x11522065;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_taskId2, "field_taskId");
            lt3.v.a(vVar2, i18, field_taskId2, false, task.f402805g);
            vVar2.b();
            return;
        }
        if (ordinal != 4) {
            return;
        }
        lt3.e eVar = lt3.e.f402742a;
        lt3.g gVar3 = task.f402804f;
        int i19 = gVar3.f68205x9ebc75fd;
        java.lang.String field_taskId3 = gVar3.f68213x11522065;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_taskId3, "field_taskId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.BgMixManager", "notifyWait, taskId:".concat(field_taskId3));
        ((ku5.t0) ku5.t0.f394148d).h(new lt3.d(i19, field_taskId3), "BgMixManager_notifyWait");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.String field_taskId4 = task.f402804f.f68213x11522065;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_taskId4, "field_taskId");
        lt3.r rVar = new lt3.r(field_taskId4, task.f402805g);
        h0Var.f391656d = rVar;
        lt3.v.f402813d.add(rVar);
        pm0.v.V(30000L, new lt3.s(h0Var));
    }
}
