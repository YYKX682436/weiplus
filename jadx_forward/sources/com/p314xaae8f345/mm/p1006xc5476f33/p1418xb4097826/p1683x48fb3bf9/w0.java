package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public class w0 implements hy4.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 f218467a;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var) {
        this.f218467a = n1Var;
    }

    @Override // hy4.r
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var = this.f218467a;
        if (n1Var.h()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "onCaptureFinish:" + str);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1.f218428p = currentTimeMillis;
        n1Var.f218439j.put(str, java.lang.Long.valueOf(currentTimeMillis));
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15499x16f3c825(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1.f218428p, n1Var.f().mo63370x315c2bef().floatValue(), n1Var.f().mo63371x315c2bf0().floatValue(), n1Var.f().mo63373x86b9ebe3().getMeasuredWidth(), n1Var.f().mo63373x86b9ebe3().getMeasuredHeight()), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.k1.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.j1(new java.lang.ref.WeakReference(n1Var), str));
        n1Var.f218442m = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
    }
}
