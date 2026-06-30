package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class i implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.j f134975a;

    public i(com.p314xaae8f345.mm.app.j jVar) {
        this.f134975a = jVar;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        final com.p314xaae8f345.mm.app.a3 a3Var = (com.p314xaae8f345.mm.app.a3) nVar;
        android.os.Handler mo14497x67189314 = a3Var.mo14497x67189314();
        com.p314xaae8f345.mm.app.j jVar = this.f134975a;
        if (mo14497x67189314 == null) {
            a3Var.mo510x3be51a90(jVar.f134994d);
            return false;
        }
        android.os.Handler mo14497x671893142 = a3Var.mo14497x67189314();
        final java.lang.String str = jVar.f134994d;
        mo14497x671893142.post(new java.lang.Runnable() { // from class: com.tencent.mm.app.i$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.app.a3.this.mo510x3be51a90(str);
            }
        });
        return false;
    }
}
