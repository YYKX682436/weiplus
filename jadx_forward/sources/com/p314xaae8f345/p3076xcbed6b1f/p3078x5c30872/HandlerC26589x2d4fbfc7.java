package com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872;

/* renamed from: com.tencent.tinker.entry.TinkerApplicationInlineFence */
/* loaded from: classes16.dex */
public final class HandlerC26589x2d4fbfc7 extends android.os.Handler {

    /* renamed from: mAppLike */
    private final com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7 f55406x6ec2582b;

    public HandlerC26589x2d4fbfc7(com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7 abstractC26587x7a37b8e7) {
        this.f55406x6ec2582b = abstractC26587x7a37b8e7;
    }

    /* renamed from: dummyThrowExceptionMethod */
    private static void m104444xdfaad312() {
        if (com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.HandlerC26589x2d4fbfc7.class.isPrimitive()) {
            throw new java.lang.RuntimeException();
        }
    }

    /* renamed from: handleMessageImpl */
    private void m104445xebe8cb7f(android.os.Message message) {
        switch (message.what) {
            case 1:
                this.f55406x6ec2582b.mo42966xb9ef6503((android.content.Context) message.obj);
                return;
            case 2:
                this.f55406x6ec2582b.mo42968x3e5a77bb();
                return;
            case 3:
                this.f55406x6ec2582b.mo42967x50e1c15d((android.content.res.Configuration) message.obj);
                return;
            case 4:
                this.f55406x6ec2582b.mo42971x29685b02(((java.lang.Integer) message.obj).intValue());
                return;
            case 5:
                this.f55406x6ec2582b.mo42969xb5d8ba56();
                return;
            case 6:
                this.f55406x6ec2582b.mo42970x7784fb42();
                return;
            case 7:
                message.obj = this.f55406x6ec2582b.m104438xa0bf1275((java.lang.ClassLoader) message.obj);
                return;
            case 8:
                message.obj = this.f55406x6ec2582b.m104437x9bbaf068((android.content.Context) message.obj);
                return;
            case 9:
                message.obj = this.f55406x6ec2582b.mo42963x11279679((android.content.res.AssetManager) message.obj);
                return;
            case 10:
                message.obj = this.f55406x6ec2582b.mo42964x893a2f6f((android.content.res.Resources) message.obj);
                return;
            case 11:
                java.lang.Object[] objArr = (java.lang.Object[]) message.obj;
                message.obj = this.f55406x6ec2582b.m104439xac92a5d0((java.lang.String) objArr[0], objArr[1]);
                return;
            case 12:
                message.obj = java.lang.Integer.valueOf(this.f55406x6ec2582b.mo42965xc80aabb0());
                return;
            case 13:
                message.obj = this.f55406x6ec2582b.m104440x75311c13((android.content.res.Resources.Theme) message.obj);
                return;
            default:
                throw new java.lang.IllegalStateException("Should not be here.");
        }
    }

    /* renamed from: handleMessage_$noinline$ */
    private void m104446x1c798ba6(android.os.Message message) {
        try {
            m104444xdfaad312();
        } finally {
            m104445xebe8cb7f(message);
        }
    }

    @Override // android.os.Handler
    public void dispatchMessage(android.os.Message message) {
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        m104446x1c798ba6(message);
    }
}
