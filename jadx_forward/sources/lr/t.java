package lr;

/* loaded from: classes15.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f402115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lr.u f402116e;

    public t(lr.u uVar) {
        this.f402116e = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        lr.u uVar = this.f402116e;
        lr.s sVar = new lr.s(uVar.f402119f.getContext());
        sVar.f93582a = this.f402115d;
        uVar.f402118e.m8099x6305639d(sVar);
    }
}
