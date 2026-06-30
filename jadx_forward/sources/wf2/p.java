package wf2;

/* loaded from: classes.dex */
public final class p implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f527144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f527145b;

    public p(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f527144a = c0Var;
        this.f527145b = qVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f527144a;
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        ((p3325xe03a0797.p3326xc267989b.r) this.f527145b).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(bitmap));
    }
}
