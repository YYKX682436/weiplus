package yd;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yd.u f542492d;

    public o(yd.u uVar) {
        this.f542492d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (java.lang.String str : this.f542492d.f542502e) {
            yd.e eVar = this.f542492d.f542500c;
            if (eVar.f542480i) {
                eVar.b(str);
            } else {
                if (eVar.f542479h == null) {
                    eVar.f542479h = new java.util.LinkedList();
                }
                eVar.f542479h.add(str);
            }
        }
        ((java.util.LinkedList) this.f542492d.f542502e).clear();
    }
}
