package es;

/* loaded from: classes15.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es.t f337803d;

    public o(es.t tVar) {
        this.f337803d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        es.t tVar = this.f337803d;
        if (tVar.f337811c.E != null) {
            kd.c.c("MicroMsg.SwipeBackLayout", "ashutest:: on popOut", new java.lang.Object[0]);
            if (tVar.f337811c.getContext() instanceof android.app.Activity) {
                com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab = tVar.f337811c;
                if (c10455x858f5ab.A != null) {
                    if (c10455x858f5ab.D) {
                        ((android.app.Activity) c10455x858f5ab.getContext()).getWindow().getDecorView().setBackground(tVar.f337811c.A);
                    }
                    tVar.f337811c.A = null;
                }
            }
            ((com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150) tVar.f337811c.E).m43745x59cfc822();
        }
        tVar.f337811c.f146509w = false;
    }
}
