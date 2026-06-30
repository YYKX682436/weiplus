package fg;

/* loaded from: classes7.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f343336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg.s f343337e;

    public q(fg.b0 b0Var, fg.s sVar) {
        this.f343336d = b0Var;
        this.f343337e = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fg.b0 b0Var = this.f343336d;
        if (b0Var.f343266j) {
            fg.s sVar = this.f343337e;
            sVar.b(sVar.f343340d);
        }
        b0Var.f343270n = false;
    }
}
