package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.zabp */
/* loaded from: classes13.dex */
public final class C1838x38edb5 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.SignOutCallbacks {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 zaa;

    public C1838x38edb5(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6) {
        this.zaa = c1839x38edb6;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.SignOutCallbacks
    /* renamed from: onSignOutComplete */
    public final void mo17964x98c228cb() {
        android.os.Handler handler;
        handler = this.zaa.zaa.zar;
        handler.post(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.RunnableC1837x38edb4(this));
    }
}
