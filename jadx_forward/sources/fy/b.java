package fy;

/* loaded from: classes11.dex */
public final class b implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f348697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Semaphore f348698e;

    public b(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.util.concurrent.Semaphore semaphore) {
        this.f348697d = h0Var;
        this.f348698e = semaphore;
    }

    @Override // o13.x
    public final void X2(p13.v vVar) {
        this.f348697d.f391656d = vVar.f432693e;
        this.f348698e.release();
    }
}
