package cw1;

/* loaded from: classes12.dex */
public final class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f304535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.l6 f304536e;

    public i6(boolean z17, cw1.l6 l6Var) {
        this.f304535d = z17;
        this.f304536e = l6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f304535d) {
            return;
        }
        cw1.l6.b(this.f304536e);
    }
}
