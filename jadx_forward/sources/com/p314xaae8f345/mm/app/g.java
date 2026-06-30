package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class g implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.h f134952a;

    public g(com.p314xaae8f345.mm.app.h hVar) {
        this.f134952a = hVar;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        final com.p314xaae8f345.mm.app.a3 a3Var = (com.p314xaae8f345.mm.app.a3) nVar;
        android.os.Handler mo14497x67189314 = a3Var.mo14497x67189314();
        com.p314xaae8f345.mm.app.h hVar = this.f134952a;
        if (mo14497x67189314 == null) {
            a3Var.mo511x1952ea5(hVar.f134967d);
            return false;
        }
        android.os.Handler mo14497x671893142 = a3Var.mo14497x67189314();
        final java.lang.String str = hVar.f134967d;
        mo14497x671893142.post(new java.lang.Runnable() { // from class: com.tencent.mm.app.g$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.app.a3.this.mo511x1952ea5(str);
            }
        });
        return false;
    }
}
