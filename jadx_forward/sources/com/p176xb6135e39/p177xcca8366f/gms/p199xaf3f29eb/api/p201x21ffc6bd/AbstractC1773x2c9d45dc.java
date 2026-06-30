package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.DataHolderNotifier */
/* loaded from: classes13.dex */
public abstract class AbstractC1773x2c9d45dc<L> implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.Notifier<L> {
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 zaa;

    public AbstractC1773x2c9d45dc(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16) {
        this.zaa = c1888xafe09e16;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.Notifier
    /* renamed from: notifyListener */
    public final void mo17886xc41b671d(L l17) {
        m17887xc41b671d(l17, this.zaa);
    }

    /* renamed from: notifyListener */
    public abstract void m17887xc41b671d(L l17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16);

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.Notifier
    /* renamed from: onNotifyListenerFailed */
    public void mo17888xea3cfa39() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16 = this.zaa;
        if (c1888xafe09e16 != null) {
            c1888xafe09e16.close();
        }
    }
}
