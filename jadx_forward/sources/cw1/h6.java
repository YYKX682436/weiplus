package cw1;

/* loaded from: classes12.dex */
public final class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.l6 f304501d;

    public h6(cw1.l6 l6Var) {
        this.f304501d = l6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw1.l6 l6Var = this.f304501d;
        yv1.h1.f(1, l6Var.f304655q);
        if (!cw1.l6.a(l6Var)) {
            return;
        }
        while (true) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = l6Var.f304655q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c26987xeef691ab);
            if (c26987xeef691ab.m108008xc9602be3()) {
                return;
            } else {
                java.lang.Thread.sleep(100L);
            }
        }
    }
}
