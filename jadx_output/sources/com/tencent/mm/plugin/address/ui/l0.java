package com.tencent.mm.plugin.address.ui;

/* loaded from: classes8.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f74575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.MMScrollView f74576e;

    public l0(com.tencent.mm.plugin.address.ui.MMScrollView mMScrollView, android.view.View view) {
        this.f74576e = mMScrollView;
        this.f74575d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        int top = this.f74575d.getTop();
        com.tencent.mm.plugin.address.ui.MMScrollView mMScrollView = this.f74576e;
        mMScrollView.scrollTo(0, top - i65.a.b(mMScrollView.getContext(), 10));
    }
}
