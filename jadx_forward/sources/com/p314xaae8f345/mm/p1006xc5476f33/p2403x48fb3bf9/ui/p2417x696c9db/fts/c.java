package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f265892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 f265893f;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627, int i17, boolean z17) {
        this.f265893f = activityC19366xa1004627;
        this.f265891d = i17;
        this.f265892e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627 = this.f265893f;
        if (activityC19366xa1004627.s9() != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (activityC19366xa1004627.ja() != 0) {
                hashMap.put("sugClickType", java.lang.Integer.valueOf(activityC19366xa1004627.ja()));
                hashMap.put("sugId", activityC19366xa1004627.ka());
            }
            hashMap.put("fromRecommendSearchQuery", java.lang.Integer.valueOf(this.f265891d));
            hashMap.put("isFromVoice", java.lang.Boolean.valueOf(activityC19366xa1004627.f265780d4));
            hashMap.put("isKeyboard", java.lang.Boolean.valueOf(this.f265892e));
            nw4.n s96 = activityC19366xa1004627.s9();
            java.lang.String P9 = activityC19366xa1004627.P9();
            java.lang.String N9 = activityC19366xa1004627.N9();
            org.json.JSONArray O9 = activityC19366xa1004627.O9();
            s96.getClass();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.putAll(hashMap);
            hashMap2.put("query", P9);
            hashMap2.put("custom", N9);
            hashMap2.put("tagList", O9);
            s96.i0("onSearchInputConfirm", hashMap2, null);
            if (android.text.TextUtils.isEmpty(activityC19366xa1004627.N9())) {
                return;
            }
            su4.k2.k(activityC19366xa1004627.Z3, activityC19366xa1004627.B3, activityC19366xa1004627.C3, true, activityC19366xa1004627.N9(), activityC19366xa1004627.f265778b4);
        }
    }
}
