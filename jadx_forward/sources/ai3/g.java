package ai3;

/* loaded from: classes10.dex */
public final class g implements t21.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f86644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f86645b;

    public g(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.Object obj) {
        this.f86644a = c0Var;
        this.f86645b = obj;
    }

    @Override // t21.f0
    public void a(boolean z17, int i17) {
        this.f86644a.f391645d = z17;
        java.lang.Object obj = this.f86645b;
        synchronized (obj) {
            try {
                obj.notifyAll();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoTransCodeHelper", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
