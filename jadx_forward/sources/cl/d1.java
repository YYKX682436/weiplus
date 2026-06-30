package cl;

/* loaded from: classes7.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124146d;

    public d1(cl.q0 q0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.e1 e1Var) {
        this.f124146d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f124146d.f124261f.iterator();
        while (it.hasNext()) {
            cl.r1 r1Var = (cl.r1) it.next();
            if (r1Var instanceof cl.c2) {
                ((cl.c2) r1Var).getClass();
                return;
            }
        }
    }
}
