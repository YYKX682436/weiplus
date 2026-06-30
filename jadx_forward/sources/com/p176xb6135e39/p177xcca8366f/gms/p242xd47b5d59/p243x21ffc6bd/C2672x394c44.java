package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzhl */
/* loaded from: classes13.dex */
final class C2672x394c44 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.Notifier<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener> {

    /* renamed from: zzan */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 f7800x394b6d;

    public C2672x394c44(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16) {
        this.f7800x394b6d = c1888xafe09e16;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.Notifier
    /* renamed from: notifyListener */
    public final /* synthetic */ void mo17886xc41b671d(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2458xb93d91f0.DataListener dataListener) {
        try {
            dataListener.mo19715xf050804b(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2461xbdd2f950(this.f7800x394b6d));
        } finally {
            this.f7800x394b6d.close();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.Notifier
    /* renamed from: onNotifyListenerFailed */
    public final void mo17888xea3cfa39() {
        this.f7800x394b6d.close();
    }
}
