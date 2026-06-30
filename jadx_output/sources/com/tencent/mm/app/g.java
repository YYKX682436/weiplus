package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class g implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.h f53419a;

    public g(com.tencent.mm.app.h hVar) {
        this.f53419a = hVar;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        final com.tencent.mm.app.a3 a3Var = (com.tencent.mm.app.a3) nVar;
        android.os.Handler handler = a3Var.getHandler();
        com.tencent.mm.app.h hVar = this.f53419a;
        if (handler == null) {
            a3Var.onAppForeground(hVar.f53434d);
            return false;
        }
        android.os.Handler handler2 = a3Var.getHandler();
        final java.lang.String str = hVar.f53434d;
        handler2.post(new java.lang.Runnable() { // from class: com.tencent.mm.app.g$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.app.a3.this.onAppForeground(str);
            }
        });
        return false;
    }
}
