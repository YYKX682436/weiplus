package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class n0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f94368a;

    public n0(yz5.l lVar) {
        this.f94368a = lVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        kotlin.jvm.internal.o.d(str);
        this.f94368a.invoke(str);
    }
}
