package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class z8 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10357xc0cc360e f146255a;

    public z8(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10357xc0cc360e activityC10357xc0cc360e) {
        this.f146255a = activityC10357xc0cc360e;
    }

    @Override // db5.c1
    public void e(int i17) {
        java.lang.String str;
        if (i17 != 0) {
            return;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10357xc0cc360e activityC10357xc0cc360e = this.f146255a;
        activityC10357xc0cc360e.f145386q = false;
        java.lang.String string = activityC10357xc0cc360e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10357xc0cc360e activityC10357xc0cc360e2 = this.f146255a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC10357xc0cc360e, string, activityC10357xc0cc360e2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p648x55baa833.ui.w8(this));
        if (activityC10357xc0cc360e2.f145386q) {
            str = null;
        } else {
            str = ((ng0.o) ((og0.n) i95.n0.c(og0.n.class))).wi(activityC10357xc0cc360e2.f145380h.d1());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10357xc0cc360e.V6(activityC10357xc0cc360e2, Q);
            return;
        }
        Q.dismiss();
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10357xc0cc360e activityC10357xc0cc360e3 = this.f146255a;
        db5.e1.L(activityC10357xc0cc360e3, false, activityC10357xc0cc360e3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kk_, str), null, activityC10357xc0cc360e2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fs8), activityC10357xc0cc360e2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b96), new com.p314xaae8f345.mm.p648x55baa833.ui.x8(this), new com.p314xaae8f345.mm.p648x55baa833.ui.y8(this, Q), -1, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
    }
}
