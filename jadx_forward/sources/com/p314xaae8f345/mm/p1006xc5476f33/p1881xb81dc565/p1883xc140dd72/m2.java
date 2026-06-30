package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes8.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f231254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.n2 f231255f;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.n2 n2Var, int i17, byte[] bArr) {
        this.f231255f = n2Var;
        this.f231253d = i17;
        this.f231254e = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f231253d == 18) {
            byte[] bArr = this.f231254e;
            int i17 = 0;
            if (bArr != null && bArr.length > 0) {
                r45.v70 v70Var = new r45.v70();
                try {
                    v70Var.mo11468x92b714fd(this.f231254e);
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Multitalk.ILinkService", e17, "ConfFailInfo unable to parse from data", new java.lang.Object[0]);
                }
                i17 = v70Var.f469490d;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "tim: on switch av fail, retrySeconds: %s", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar = this.f231255f.f231264a.Y;
            if (cVar != null) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                cVar.getClass();
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.l(cVar, -1700, valueOf));
            }
        }
    }
}
