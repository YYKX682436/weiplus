package cb;

/* loaded from: classes13.dex */
public final class e0 implements com.google.android.gms.tasks.Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cb.c0 f40119a;

    public e0(cb.c0 c0Var) {
        this.f40119a = c0Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
        return this.f40119a.a((android.os.Bundle) task.getResult(java.io.IOException.class));
    }
}
