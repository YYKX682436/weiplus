package com.tencent.liteapp.ui;

/* loaded from: classes11.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f46237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppFragment f46238e;

    public x(com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment, boolean z17) {
        this.f46238e = wxaLiteAppFragment;
        this.f46237d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f46237d;
        com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment = this.f46238e;
        if (z17) {
            wxaLiteAppFragment.getActivity().getWindow().clearFlags(8192);
        } else {
            wxaLiteAppFragment.getActivity().getWindow().addFlags(8192);
        }
    }
}
