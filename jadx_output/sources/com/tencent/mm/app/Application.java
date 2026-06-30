package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class Application extends com.tencent.tinker.loader.app.TinkerApplication {
    private static final java.lang.String TINKER_LOADER_ENTRY_CLASSNAME = "com.tencent.tinker.loader.TinkerLoader";
    private static final java.lang.String WECHAT_APPLICATION_LIKE_CLASSNAME = "com.tencent.mm.app.MMApplicationLike";
    private boolean mIsAttachBaseContextDone;
    private final boolean[] mIsDisallowedToCallGetBaseContextInAttachBaseContext;

    public Application() {
        super(7, WECHAT_APPLICATION_LIKE_CLASSNAME, TINKER_LOADER_ENTRY_CLASSNAME, false, true, true);
        this.mIsAttachBaseContextDone = false;
        this.mIsDisallowedToCallGetBaseContextInAttachBaseContext = new boolean[]{false};
    }

    public android.content.Context _doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking() {
        return super.getBaseContext();
    }

    @Override // com.tencent.tinker.loader.app.TinkerApplication, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
        this.mIsAttachBaseContextDone = true;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context getApplicationContext() {
        return this;
    }

    @Override // com.tencent.tinker.loader.app.TinkerApplication, android.content.ContextWrapper
    public android.content.Context getBaseContext() {
        if (this.mIsAttachBaseContextDone || !isDisallowedToCallGetBaseContextInAttachBaseContext()) {
            return super.getBaseContext();
        }
        throw new java.lang.UnsupportedOperationException("please don't call app.getBaseContext(), use app itself directly would be fine in most cases.");
    }

    public boolean isDisallowedToCallGetBaseContextInAttachBaseContext() {
        boolean z17;
        synchronized (this.mIsDisallowedToCallGetBaseContextInAttachBaseContext) {
            z17 = this.mIsDisallowedToCallGetBaseContextInAttachBaseContext[0];
        }
        return z17;
    }

    public void markDisallowToCallGetBaseContextInAttachBaseContext() {
        synchronized (this.mIsDisallowedToCallGetBaseContextInAttachBaseContext) {
            this.mIsDisallowedToCallGetBaseContextInAttachBaseContext[0] = true;
        }
    }
}
