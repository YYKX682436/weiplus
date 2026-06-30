package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f162628f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n0 f162629g;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n0 n0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, int i17) {
        this.f162629g = n0Var;
        this.f162626d = lVar;
        this.f162627e = str;
        this.f162628f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162626d;
        if (lVar.mo50262x39e05d35()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = lVar.mo50354x59eafec1();
            java.lang.String str = this.f162627e;
            com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = mo50354x59eafec1.mo49620x1d537609(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n0 n0Var = this.f162629g;
            int i17 = this.f162628f;
            if (mo49620x1d537609 == null) {
                lVar.a(i17, n0Var.o(java.lang.String.format(java.util.Locale.US, "fail no such file \"%s\"", str)));
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap(3);
            hashMap.put("size", java.lang.Long.valueOf(mo49620x1d537609.C()));
            hashMap.put("createTime", java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(mo49620x1d537609.B())));
            lVar.a(i17, n0Var.p("ok", hashMap));
        }
    }
}
