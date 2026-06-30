package sj5;

/* loaded from: classes10.dex */
public final class d implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 f490450d;

    public d(com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 c22478xb6499b94) {
        this.f490450d = c22478xb6499b94;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j17) {
        com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 c22478xb6499b94 = this.f490450d;
        c22478xb6499b94.f291335p = false;
        c22478xb6499b94.e();
        float f17 = c22478xb6499b94.f291332m;
        float f18 = c22478xb6499b94.f291331i;
        c22478xb6499b94.setTranslationY(f18 + ((f17 - f18) * e06.p.e(c22478xb6499b94.f291334o, 0.0f, 1.0f)));
    }
}
