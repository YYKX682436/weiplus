package com.tencent.mm.app;

/* loaded from: classes11.dex */
public class k2 implements com.tencent.mm.app.h4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.n2 f53484d;

    public k2(com.tencent.mm.app.n2 n2Var) {
        this.f53484d = n2Var;
    }

    @Override // com.tencent.mm.app.h4
    public void a(java.lang.Thread thread, java.lang.String str, java.lang.Throwable th6) {
        ((com.tencent.mm.app.l2) this.f53484d.f53528d).uncaughtException(thread, th6);
    }

    @Override // com.tencent.mm.app.h4
    public void e(int i17, java.lang.String str) {
    }
}
