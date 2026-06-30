package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f289191d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f289192e;

    /* renamed from: f, reason: collision with root package name */
    public int f289193f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Intent f289194g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 f289195h;

    public f0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.s sVar) {
        this.f289195h = activityC22359x66709fa8;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        if (gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseConversationUI", "on post select image job, acc has ready, retry count %d", java.lang.Integer.valueOf(this.f289191d));
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = this.f289195h;
            str = activityC22359x66709fa8.f39544x38b8e391;
            activityC22359x66709fa8.m80490x5d4f20c8(str);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e0(this));
            return;
        }
        int i17 = this.f289191d;
        if (i17 >= 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseConversationUI", "on post select image job, match max retry count");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseConversationUI", "on post select image job, acc not ready, cur retry count %d", java.lang.Integer.valueOf(i17));
        this.f289191d++;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this, 300L);
    }

    /* renamed from: toString */
    public java.lang.String m80546x9616526c() {
        return super.toString() + "|PostSelectImageJob";
    }
}
