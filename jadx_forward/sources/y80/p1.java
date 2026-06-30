package y80;

/* loaded from: classes5.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f541428a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f541429b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f541430c;

    public p1(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f541428a = callback;
        this.f541429b = "ResultCallbackHolder";
    }

    public final void a(java.lang.Object obj) {
        if (this.f541430c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f541429b, "invoke: duplicate");
            return;
        }
        this.f541430c = true;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f541428a.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(obj)));
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }
}
