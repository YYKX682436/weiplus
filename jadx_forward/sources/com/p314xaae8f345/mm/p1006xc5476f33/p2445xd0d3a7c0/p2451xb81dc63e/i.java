package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e;

/* loaded from: classes8.dex */
public final class i extends pk3.h {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.h f269669d = new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.h(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 3;
    }

    @Override // pk3.h
    public void O6(java.lang.Object obj) {
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info, r45.fr4 animateData, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateData, "animateData");
        r45.w60 w60Var = new r45.w60();
        w60Var.set(0, animateData);
        w60Var.set(3, bm5.f1.a());
        if (view != null) {
            nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            r45.kr4 kr4Var = (r45.kr4) ((md0.e) eVar).wi(context, 5);
            w60Var.set(1, kr4Var != null ? kr4Var.m75945x2fec8307(0) : null);
        }
        r45.sw4 sw4Var = new r45.sw4();
        try {
            sw4Var.mo11468x92b714fd(info.f66790x225a93cf);
            int m75939xb282bd08 = sw4Var.m75939xb282bd08(0);
            java.lang.String m75945x2fec8307 = sw4Var.m75945x2fec8307(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.h hVar = f269669d;
            java.lang.String field_id = info.f66791xc8a07680;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                hVar.a(field_id, w60Var, true, m75939xb282bd08, m75945x2fec8307);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("isFromMultiTask", true);
            bundle.putString("eventData", m75945x2fec8307);
            bundle.putInt("eventType", m75939xb282bd08);
            bundle.putByteArray("commonMultiTaskData", w60Var.mo14344x5f01b1f6());
            bundle.putString("multiTaskId", field_id);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.g.class);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NoteMultiTaskUIC", e17.getMessage());
        }
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f437968e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
