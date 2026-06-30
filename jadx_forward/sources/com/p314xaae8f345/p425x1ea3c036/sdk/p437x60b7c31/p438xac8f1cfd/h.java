package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd;

/* loaded from: classes7.dex */
public class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b f128877a;

    public h(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        this.f128877a = bVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar = this.f128877a;
        android.view.View mo14662xc2a54588 = bVar.a2().mo14662xc2a54588();
        if (mo14662xc2a54588 == null) {
            return null;
        }
        int mo14668x755bd410 = bVar.a2().mo14668x755bd410();
        int mo14664x1c4fb41d = bVar.a2().mo14664x1c4fb41d();
        int mo14666x95a6d12d = bVar.a2().mo14666x95a6d12d();
        int mo14667x95a6d12e = bVar.a2().mo14667x95a6d12e();
        if (mo14668x755bd410 == 0 || mo14664x1c4fb41d == 0) {
            return null;
        }
        mo14662xc2a54588.scrollTo(0, 0);
        bVar.a2().e0(new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.g(this, mo14668x755bd410, mo14664x1c4fb41d, km5.u.c(), mo14662xc2a54588, mo14666x95a6d12d, mo14667x95a6d12e));
        return null;
    }
}
