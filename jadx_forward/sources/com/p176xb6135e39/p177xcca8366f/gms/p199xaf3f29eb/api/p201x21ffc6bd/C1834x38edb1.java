package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zabl */
/* loaded from: classes13.dex */
final class C1834x38edb1 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ComponentCallbacks2C1769xa5d87f34.BackgroundStateChangeListener {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c zaa;

    public C1834x38edb1(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c) {
        this.zaa = c1775x7d99476c;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ComponentCallbacks2C1769xa5d87f34.BackgroundStateChangeListener
    /* renamed from: onBackgroundStateChanged */
    public final void mo17872x7ebbedf0(boolean z17) {
        android.os.Handler handler;
        android.os.Handler handler2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c = this.zaa;
        handler = c1775x7d99476c.zar;
        handler2 = c1775x7d99476c.zar;
        handler.sendMessage(handler2.obtainMessage(1, java.lang.Boolean.valueOf(z17)));
    }
}
