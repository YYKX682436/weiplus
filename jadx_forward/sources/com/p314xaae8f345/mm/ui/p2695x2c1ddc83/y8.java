package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public final class y8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuChattingUIFragment f289806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuChattingUIFragment openImKefuChattingUIFragment) {
        super(0);
        this.f289806d = openImKefuChattingUIFragment;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent;
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuChattingUIFragment openImKefuChattingUIFragment = this.f289806d;
        android.content.Intent m78387x1e885992 = openImKefuChattingUIFragment.m78387x1e885992();
        if (m78387x1e885992 != null && (c11207x71c7a1c1 = (com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1) m78387x1e885992.getParcelableExtra("key_start_conversation_request")) != null) {
            return c11207x71c7a1c1;
        }
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo78409x676b27cd = openImKefuChattingUIFragment.mo78409x676b27cd();
        if (mo78409x676b27cd == null || (intent = mo78409x676b27cd.getIntent()) == null) {
            return null;
        }
        return (com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1) intent.getParcelableExtra("key_start_conversation_request");
    }
}
