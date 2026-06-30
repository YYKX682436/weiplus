package es;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es.r f337805d;

    public q(es.r rVar) {
        this.f337805d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        es.r rVar = this.f337805d;
        com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab = rVar.f337806a.f337808e.f337811c;
        if (c10455x858f5ab.E != null) {
            if (c10455x858f5ab.getContext() instanceof android.app.Activity) {
                com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab2 = rVar.f337806a.f337808e.f337811c;
                if (c10455x858f5ab2.A != null) {
                    if (c10455x858f5ab2.D) {
                        ((android.app.Activity) c10455x858f5ab2.getContext()).getWindow().getDecorView().setBackground(rVar.f337806a.f337808e.f337811c.A);
                    }
                    rVar.f337806a.f337808e.f337811c.A = null;
                }
            }
            ((com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150) rVar.f337806a.f337808e.f337811c.E).m43745x59cfc822();
            kd.c.a("MicroMsg.SwipeBackLayout", "ashutest:: on onSwipeBack", new java.lang.Object[0]);
        }
        es.k.b(1.0f);
        rVar.f337806a.f337808e.f337811c.f146509w = false;
    }
}
