package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class h7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f166170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12343x311a4728 f166171e;

    public h7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12343x311a4728 c12343x311a4728) {
        this.f166170d = o6Var;
        this.f166171e = c12343x311a4728;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f166170d.X1.m(this.f166171e.f165965f.f128834d);
        if (android.text.TextUtils.isEmpty(this.f166171e.f165965f.f128836f) && android.text.TextUtils.isEmpty(this.f166171e.f165965f.f128842o)) {
            return;
        }
        zb1.b bVar = new zb1.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f166170d;
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3900x5df21f9b c3900x5df21f9b = this.f166171e.f165965f;
        bVar.u(o6Var, c3900x5df21f9b.f128836f, c3900x5df21f9b.f128842o);
    }
}
