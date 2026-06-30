package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class j8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 f292049d;

    public j8(p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89) {
        this.f292049d = c1095x65355f89;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = this.f292049d;
        if (c1095x65355f89 != null) {
            c1095x65355f89.s(0 - c1095x65355f89.getScrollX(), c1095x65355f89.getBottom() - c1095x65355f89.getScrollY(), 250, false);
        }
    }
}
