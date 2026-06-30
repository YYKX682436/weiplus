package cl;

/* loaded from: classes7.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42613d;

    public d1(cl.q0 q0Var, com.tencent.mm.plugin.appbrand.jsruntime.e1 e1Var) {
        this.f42613d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f42613d.f42728f.iterator();
        while (it.hasNext()) {
            cl.r1 r1Var = (cl.r1) it.next();
            if (r1Var instanceof cl.c2) {
                ((cl.c2) r1Var).getClass();
                return;
            }
        }
    }
}
