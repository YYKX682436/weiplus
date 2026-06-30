package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public final class s7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd f284197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f284198e;

    public s7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd, java.util.List list) {
        this.f284197d = activityC21618x43234cfd;
        this.f284198e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd = this.f284197d;
        activityC21618x43234cfd.S.clear();
        activityC21618x43234cfd.S.addAll(this.f284198e);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = activityC21618x43234cfd.L;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8146xced61ae5();
        }
        java.util.Iterator it = activityC21618x43234cfd.Q.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2) obj).f148119d, activityC21618x43234cfd.Q1)) {
                    break;
                }
            }
        }
        if (obj == null) {
            com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = new com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2();
            c10597xb1f0d2.f148127o = true;
            c10597xb1f0d2.f148119d = activityC21618x43234cfd.Q1;
            c10597xb1f0d2.f148121f = activityC21618x43234cfd.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c47);
            activityC21618x43234cfd.Q.add(c10597xb1f0d2);
        }
    }
}
