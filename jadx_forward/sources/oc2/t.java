package oc2;

/* loaded from: classes8.dex */
public final class t implements ep0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f425782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f425783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f425784c;

    public t(p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2) {
        this.f425782a = g0Var;
        this.f425783b = h0Var;
        this.f425784c = g0Var2;
    }

    @Override // ep0.c
    public void a(ip0.a aVar, cp0.n nVar, hp0.e eVar) {
        this.f425784c.f391654d = android.os.SystemClock.elapsedRealtime();
    }

    @Override // ep0.c
    public void b(ip0.a aVar, cp0.n nVar) {
        this.f425782a.f391654d = android.os.SystemClock.elapsedRealtime();
        java.lang.String obj = aVar != null ? aVar.f375106a.toString() : null;
        if (obj == null) {
            obj = "";
        }
        this.f425783b.f391656d = obj;
    }
}
