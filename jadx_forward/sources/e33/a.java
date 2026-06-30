package e33;

/* loaded from: classes10.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.b0 f328640d;

    public a(e33.b0 b0Var) {
        this.f328640d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        kn5.e eVar = this.f328640d.F;
        eVar.getClass();
        try {
            eVar.f391332s = true;
            eVar.d();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DragSelectTouchListener", th6, "forceDragStop err", new java.lang.Object[0]);
        }
    }
}
