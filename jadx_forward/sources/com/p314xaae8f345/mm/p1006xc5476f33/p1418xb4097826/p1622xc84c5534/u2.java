package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class u2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5
    public org.json.JSONObject T0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 record) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = this.f206816g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int i17 = 1;
        if (activity.getIntent().getIntExtra("key_click_avatar_type", 0) != 1 && activity.getIntent().getIntExtra("key_enter_profile_type", 0) != 11) {
            i17 = activity.getIntent().getBooleanExtra("key_is_from_slide", false) ? 2 : 3;
        }
        jSONObject.put("enter_profile_method", i17);
        return jSONObject;
    }
}
