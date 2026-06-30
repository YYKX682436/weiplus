package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class td extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18655x563a1fc7 f255856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18655x563a1fc7 activityC18655x563a1fc7) {
        super(0);
        this.f255856d = activityC18655x563a1fc7;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18655x563a1fc7 activityC18655x563a1fc7 = this.f255856d;
        int intExtra = activityC18655x563a1fc7.getIntent().getIntExtra("k_last_range_visible_state", -1);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = activityC18655x563a1fc7.getIntent().getStringArrayListExtra("k_last_range_label_list");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>();
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = activityC18655x563a1fc7.getIntent().getStringArrayListExtra("k_last_range_user_list");
        if (stringArrayListExtra2 == null) {
            stringArrayListExtra2 = new java.util.ArrayList<>();
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q(intExtra, stringArrayListExtra, stringArrayListExtra2);
    }
}
