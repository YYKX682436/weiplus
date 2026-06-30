package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.Application */
/* loaded from: classes12.dex */
public class ApplicationC4994xc00dad30 extends com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891 {

    /* renamed from: TINKER_LOADER_ENTRY_CLASSNAME */
    private static final java.lang.String f21400xbc28e52a = "com.tencent.tinker.loader.TinkerLoader";

    /* renamed from: WECHAT_APPLICATION_LIKE_CLASSNAME */
    private static final java.lang.String f21401x3201c8e3 = "com.tencent.mm.app.MMApplicationLike";

    /* renamed from: mIsAttachBaseContextDone */
    private boolean f21402xd748c704;

    /* renamed from: mIsDisallowedToCallGetBaseContextInAttachBaseContext */
    private final boolean[] f21403x4887cd02;

    public ApplicationC4994xc00dad30() {
        super(7, f21401x3201c8e3, f21400xbc28e52a, false, true, true);
        this.f21402xd748c704 = false;
        this.f21403x4887cd02 = new boolean[]{false};
    }

    /* renamed from: _doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking */
    public android.content.Context m42944x23d85138() {
        return super.getBaseContext();
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
        this.f21402xd748c704 = true;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context getApplicationContext() {
        return this;
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891, android.content.ContextWrapper
    public android.content.Context getBaseContext() {
        if (this.f21402xd748c704 || !m42945x34b1caaf()) {
            return super.getBaseContext();
        }
        throw new java.lang.UnsupportedOperationException("please don't call app.getBaseContext(), use app itself directly would be fine in most cases.");
    }

    /* renamed from: isDisallowedToCallGetBaseContextInAttachBaseContext */
    public boolean m42945x34b1caaf() {
        boolean z17;
        synchronized (this.f21403x4887cd02) {
            z17 = this.f21403x4887cd02[0];
        }
        return z17;
    }

    /* renamed from: markDisallowToCallGetBaseContextInAttachBaseContext */
    public void m42946xac28aeeb() {
        synchronized (this.f21403x4887cd02) {
            this.f21403x4887cd02[0] = true;
        }
    }
}
