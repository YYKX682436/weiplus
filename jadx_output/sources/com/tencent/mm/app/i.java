package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class i implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.j f53442a;

    public i(com.tencent.mm.app.j jVar) {
        this.f53442a = jVar;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        final com.tencent.mm.app.a3 a3Var = (com.tencent.mm.app.a3) nVar;
        android.os.Handler handler = a3Var.getHandler();
        com.tencent.mm.app.j jVar = this.f53442a;
        if (handler == null) {
            a3Var.onAppBackground(jVar.f53461d);
            return false;
        }
        android.os.Handler handler2 = a3Var.getHandler();
        final java.lang.String str = jVar.f53461d;
        handler2.post(new java.lang.Runnable() { // from class: com.tencent.mm.app.i$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.app.a3.this.onAppBackground(str);
            }
        });
        return false;
    }
}
