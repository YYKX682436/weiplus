package ls1;

/* loaded from: classes8.dex */
public final class h0 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f402524d;

    public h0(int i17) {
        this.f402524d = i17;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myQueue().removeIdleHandler(this);
        int i17 = this.f402524d;
        if (i17 == -1) {
            is1.l lVar = is1.l.f375956a;
            for (java.lang.Integer num : (java.lang.Integer[]) ((jz5.n) is1.l.f375959d).mo141623x754a37bb()) {
                ls1.j0.a(ls1.j0.f402528a, num.intValue());
            }
        } else {
            ls1.j0.a(ls1.j0.f402528a, i17);
        }
        return false;
    }
}
