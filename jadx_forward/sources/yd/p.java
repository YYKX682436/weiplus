package yd;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yd.u f542494e;

    public p(yd.u uVar, java.lang.String str) {
        this.f542494e = uVar;
        this.f542493d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f542494e.f542500c != null) {
            yd.e eVar = this.f542494e.f542500c;
            java.lang.String str = this.f542493d;
            if (eVar.f542480i) {
                eVar.b(str);
                return;
            }
            if (eVar.f542479h == null) {
                eVar.f542479h = new java.util.LinkedList();
            }
            eVar.f542479h.add(str);
        }
    }
}
