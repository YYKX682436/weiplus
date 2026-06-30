package rb5;

/* loaded from: classes11.dex */
public class b implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb5.l f475396d;

    public b(rb5.l lVar) {
        this.f475396d = lVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        rb5.l lVar = this.f475396d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = lVar.f475413d;
        if (abstractActivityC21394xb3d2c0cf != null && !abstractActivityC21394xb3d2c0cf.isDestroyed() && !lVar.f475413d.isFinishing()) {
            rb5.l.a(lVar, true);
        }
        return false;
    }
}
