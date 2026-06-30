package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes15.dex */
public class j0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.MMFalseProgressBar f91741a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.appbrand.widget.MMFalseProgressBar mMFalseProgressBar, android.os.Looper looper) {
        super(looper);
        this.f91741a = mMFalseProgressBar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.appbrand.widget.MMFalseProgressBar mMFalseProgressBar = this.f91741a;
        switch (i17) {
            case 1000:
                int i18 = com.tencent.mm.plugin.appbrand.widget.MMFalseProgressBar.f91012i;
                mMFalseProgressBar.setVisibility(0);
                mMFalseProgressBar.setAlpha(1.0f);
                return;
            case 1001:
                float f17 = mMFalseProgressBar.f91013d;
                if (f17 < 600.0f) {
                    mMFalseProgressBar.f91013d = f17 + mMFalseProgressBar.f91014e;
                } else if (f17 >= 600.0f && f17 < 800.0f) {
                    mMFalseProgressBar.f91013d = f17 + mMFalseProgressBar.f91015f;
                } else if (f17 >= 800.0f && f17 < 920.0f) {
                    mMFalseProgressBar.f91013d = f17 + mMFalseProgressBar.f91016g;
                }
                com.tencent.mm.sdk.platformtools.n3 n3Var = mMFalseProgressBar.f91017h;
                if (n3Var != null) {
                    if (mMFalseProgressBar.f91013d < 920.0f) {
                        n3Var.sendEmptyMessageDelayed(1001, 10L);
                    } else {
                        n3Var.removeMessages(1001);
                    }
                }
                mMFalseProgressBar.setProgress((int) mMFalseProgressBar.f91013d);
                return;
            case 1002:
                int i19 = com.tencent.mm.plugin.appbrand.widget.MMFalseProgressBar.f91012i;
                mMFalseProgressBar.getClass();
                return;
            case 1003:
                mMFalseProgressBar.f91013d = 0.0f;
                mMFalseProgressBar.postInvalidateDelayed(200L);
                mMFalseProgressBar.setVisibility(8);
                return;
            default:
                return;
        }
    }
}
