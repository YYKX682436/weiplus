package ux2;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ux2.f f513382d;

    public d(ux2.f fVar) {
        this.f513382d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ux2.f fVar = this.f513382d;
        if (fVar.f513389f) {
            pm0.v.C(fVar.f513397n);
            db5.d5 d5Var = fVar.f513396m;
            if (d5Var != null) {
                d5Var.dismiss();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bubble");
                throw null;
            }
        }
    }
}
