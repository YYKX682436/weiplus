package cu0;

/* loaded from: classes5.dex */
public abstract class y extends cv3.h {

    /* renamed from: p, reason: collision with root package name */
    public final yz5.l f303899p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        super(context, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        this.f303899p = ignoreBackgroundTouchEvent;
    }

    @Override // cv3.c
    public vu3.c a() {
        return new cu0.c(this.f304102d, this.f303899p);
    }

    @Override // cv3.d
    /* renamed from: close */
    public void mo122716x5a5ddf8() {
        uu3.u uVar = this.f304104f;
        if (uVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6.a(uVar, false, 1, null);
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 d17 = d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(d17, "null cannot be cast to non-null type T of com.tencent.mm.mj_publisher.finder.common.music.ComposingMusicPickerDrawerImpl");
        return d17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c
    /* renamed from: setPlayMusicWhenSearchFinish */
    public void mo68200x8bd3c3e4(boolean z17) {
        e().mo68332xe66d9e81(z17);
    }
}
