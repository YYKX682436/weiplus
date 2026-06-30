package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public final class z9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 f146256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 activityC10359x5d5d51f0) {
        super(0);
        this.f146256d = activityC10359x5d5d51f0;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 activityC10359x5d5d51f0 = this.f146256d;
        sb6.append(activityC10359x5d5d51f0.getPackageName());
        sb6.append("_preferences");
        return activityC10359x5d5d51f0.getSharedPreferences(sb6.toString(), 0);
    }
}
