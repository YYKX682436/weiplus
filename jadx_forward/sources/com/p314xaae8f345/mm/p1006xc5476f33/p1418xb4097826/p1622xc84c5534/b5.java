package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class b5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5 {

    /* renamed from: w, reason: collision with root package name */
    public long f206500w;

    /* renamed from: x, reason: collision with root package name */
    public int f206501x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f206501x = -1;
        this.f206822p = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0, fc2.d
    public void H0() {
        super.H0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTopicTwoFeedFlowReporter", "onRelease");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0
    public void O0() {
        if (this.f206822p) {
            super.O0();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTopicTwoFeedFlowReporter", "onInvisible");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5
    public org.json.JSONObject T0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 record) {
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f206816g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            this.f206500w = activityC21401x6ce6f73f.getIntent().getLongExtra("KEY_TOPIC_ID", 0L);
            java.lang.String stringExtra = activityC21401x6ce6f73f.getIntent().getStringExtra("key_topic_title");
            if (stringExtra == null) {
                stringExtra = "";
            }
            jSONObject.put("topicid", pm0.v.u(this.f206500w));
            jSONObject.put("topictab", this.f206501x);
            jSONObject.put("topictag", stringExtra);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderTopicTwoFeedFlowReporter", e17.getMessage());
        }
        return jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5
    public void U0(java.lang.String invokeSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(invokeSource, "onRelease")) {
            return;
        }
        super.U0(invokeSource);
    }
}
