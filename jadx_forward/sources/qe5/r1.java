package qe5;

/* loaded from: classes.dex */
public final class r1 extends k14.l0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f443716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(java.lang.Runnable runnable) {
        super(1, null);
        this.f443716e = runnable;
    }

    @Override // k14.l0
    public void a(android.view.View view) {
        this.f443716e.run();
    }
}
