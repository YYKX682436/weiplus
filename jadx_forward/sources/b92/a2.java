package b92;

/* loaded from: classes15.dex */
public final class a2 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.b2 f99903d;

    public a2(b92.b2 b2Var) {
        this.f99903d = b2Var;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        boolean z17;
        b92.b2 b2Var = this.f99903d;
        b92.y1 y1Var = b2Var.f99916g;
        if (y1Var != null) {
            if (y1Var.f100101c <= 0) {
                y1Var.f100101c = java.lang.System.nanoTime();
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                android.view.Window window = (android.view.Window) b2Var.f99912c.get();
                y1Var.f100105g = window != null ? or2.k.a(window) : y1Var.f100099a;
                b2Var.a("startWaiteIdle", y1Var);
            }
        }
        b2Var.f99916g = null;
        b2Var.f99926q = null;
        return false;
    }
}
