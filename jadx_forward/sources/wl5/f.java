package wl5;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl5.x f528642d;

    public f(wl5.x xVar) {
        this.f528642d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "dismiss all runnable.", new java.lang.Object[0]);
        wl5.u uVar = this.f528642d.Y;
        if (uVar != null) {
            uVar.a();
        }
    }
}
