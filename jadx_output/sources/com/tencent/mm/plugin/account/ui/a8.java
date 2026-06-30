package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public final class a8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f73713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMBaseAccountActivity f73714e;

    public a8(int i17, com.tencent.mm.plugin.account.ui.MMBaseAccountActivity mMBaseAccountActivity) {
        this.f73713d = i17;
        this.f73714e = mMBaseAccountActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.account.ui.MMBaseAccountActivity mMBaseAccountActivity = this.f73714e;
        android.widget.ScrollView scrollView = mMBaseAccountActivity.f73433d;
        if (scrollView == null) {
            kotlin.jvm.internal.o.o("scrollView");
            throw null;
        }
        int scrollY = this.f73713d - scrollView.getScrollY();
        if (scrollY > 0) {
            android.widget.ScrollView scrollView2 = mMBaseAccountActivity.f73433d;
            if (scrollView2 != null) {
                scrollView2.smoothScrollBy(0, scrollY);
            } else {
                kotlin.jvm.internal.o.o("scrollView");
                throw null;
            }
        }
    }
}
