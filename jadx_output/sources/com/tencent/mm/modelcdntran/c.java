package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public final class c extends w65.g {

    /* renamed from: h, reason: collision with root package name */
    public final kq.a f70894h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.modelcdntran.a f70895i;

    public c(kq.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f70894h = params;
        this.f70895i = new com.tencent.mm.modelcdntran.a(this);
    }

    @Override // w65.g, w65.m
    public java.lang.String Z0() {
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = this.f70894h.f311169c;
        if (msgIdTalker != null) {
            java.lang.String str = msgIdTalker.f149480d + '-' + msgIdTalker.f149481e;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // w65.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelcdntran.c.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        w65.m other = (w65.m) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof com.tencent.mm.modelcdntran.c)) {
            return 0;
        }
        this.f70894h.getClass();
        return 0;
    }

    @Override // w65.m
    public w65.p f0() {
        w65.p lVar;
        kq.a aVar = this.f70894h;
        int ordinal = aVar.f311176j.ordinal();
        if (ordinal == 0) {
            lVar = new w65.l(this.f443356e, this);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            lVar = new w65.p(this.f443356e, this);
        }
        lVar.f443364c = aVar.f311172f;
        lVar.f443365d = aVar.f311171e;
        if (lVar instanceof w65.l) {
            ((w65.l) lVar).f443361e = aVar.f311174h;
        }
        return lVar;
    }

    @Override // w65.g, w65.m
    public void f1() {
        super.f1();
        kq.a aVar = this.f70894h;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = aVar.f311169c;
        if (msgIdTalker != null) {
            qi3.c0 c0Var = new qi3.c0();
            c0Var.f363679a = msgIdTalker;
            c0Var.f363680b = aVar.f311171e;
            com.tencent.mm.modelcdntran.n1 n1Var = aVar.f311173g;
            if ((n1Var != null ? n1Var.f71103a : null) == com.tencent.mm.modelcdntran.m1.f71085q) {
                c0Var.f363681c = true;
            }
            jm.m mVar = (jm.m) ((qi3.w) i95.n0.c(qi3.w.class));
            mVar.getClass();
            v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) mVar.f300238m).getValue(), null, new jm.k(c0Var, mVar, null), 1, null);
        }
    }

    @Override // w65.m
    public java.lang.String id() {
        kq.a aVar = this.f70894h;
        java.lang.String str = aVar.f311167a.field_mediaId;
        if (str == null || r26.n0.N(str)) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        java.lang.String str3 = aVar.f311167a.field_mediaId;
        return str3 == null ? this.f443355d : str3;
    }

    @Override // w65.g, w65.m
    public void x() {
        super.x();
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(id());
    }

    @Override // w65.m
    public void z() {
        this.f70894h.getClass();
    }

    @Override // w65.m
    public java.lang.Class z1() {
        return this.f70894h.f311168b;
    }
}
