package ru5;

/* loaded from: classes10.dex */
public class h implements ru5.j {

    /* renamed from: d, reason: collision with root package name */
    public final qu5.a f481341d;

    public h(ru5.i iVar) {
        this.f481341d = xu5.b.d() == null ? new qu5.b(new android.os.Handler(android.os.Looper.myLooper())) : new xu5.o(xu5.b.d(), null);
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f481341d.mo50293x3498a0(runnable);
    }

    @Override // ru5.j
    /* renamed from: getTag */
    public java.lang.String mo163057xb5887064() {
        qu5.a aVar = this.f481341d;
        return aVar instanceof xu5.o ? aVar.mo50284xdd3e8650() : xu5.b.c(aVar.mo50280x23b2dd47());
    }

    @Override // ru5.j
    public void j() {
        this.f481341d.mo50302x6b17ad39(null);
    }
}
