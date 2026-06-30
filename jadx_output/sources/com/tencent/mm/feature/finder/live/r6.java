package com.tencent.mm.feature.finder.live;

/* loaded from: classes5.dex */
public final class r6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f66897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f66898e;

    public r6(android.app.Activity activity, kotlin.jvm.internal.h0 h0Var) {
        this.f66897d = activity;
        this.f66898e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity = this.f66897d;
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.unregisterMMOnFragmentActivityResult((com.tencent.mm.ui.xc) this.f66898e.f310123d);
        }
    }
}
