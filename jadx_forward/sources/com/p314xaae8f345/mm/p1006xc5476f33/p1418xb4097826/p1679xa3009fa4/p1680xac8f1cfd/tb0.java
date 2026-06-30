package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class tb0 extends pk3.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 25;
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info, r45.fr4 animateData, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateData, "animateData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.m mVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.n.f202406z;
        android.content.Context context = view != null ? view.getContext() : null;
        mVar.a(info, animateData, true, context instanceof android.app.Activity ? (android.app.Activity) context : null);
    }

    @Override // pk3.h
    public void Q6(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c obj, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedid", obj.f66791xc8a07680);
        jSONObject.put("feed_index", i17 + 1);
        jSONObject.put("import_time", obj.f66789xac3be4e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, null, "float_feed_delete", 1, jSONObject, false, null, 48, null);
    }

    @Override // pk3.h
    public void S6() {
    }

    @Override // pk3.h
    public void T6() {
    }

    @Override // pk3.h
    public void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedid", info.f66791xc8a07680);
        jSONObject.put("feed_index", i17 + 1);
        jSONObject.put("import_time", info.f66789xac3be4e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, null, "float_feed", 0, jSONObject, false, null, 48, null);
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f437968e;
    }
}
