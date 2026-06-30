package vp;

/* loaded from: classes16.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f520296a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Handler f520297b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Handler f520298c;

    /* renamed from: d, reason: collision with root package name */
    public xp.d f520299d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f520300e;

    public d0(xp.d dVar) {
        this.f520296a = "";
        this.f520299d = dVar;
        this.f520296a = dVar.f537374i + "_DanmakuMeasureManager";
    }

    public static void b(xp.d dVar, wp.a aVar) {
        if (aVar.n()) {
            return;
        }
        wp.b c17 = dVar.c(aVar).c(aVar);
        aVar.f529871i = c17.f529889a + (xp.d.f().f537381e * 2);
        aVar.f529872j = c17.f529890b + (xp.d.f().f537380d * 2);
        wp.f fVar = (wp.f) aVar;
        fVar.f529885w = false;
        fVar.G = ((int) (fVar.h() + fVar.f529871i)) / ((float) fVar.f529867e.f556446a);
    }

    public static void e(xp.d dVar, wp.a aVar, yp.o oVar) {
        if (aVar.n() || oVar == null) {
            return;
        }
        wp.b d17 = dVar.c(aVar).d(aVar, oVar);
        aVar.f529871i = d17.f529889a + (xp.d.f().f537381e * 2);
        aVar.f529872j = d17.f529890b + (xp.d.f().f537380d * 2);
        wp.f fVar = (wp.f) aVar;
        fVar.f529885w = false;
        fVar.G = ((int) (fVar.h() + fVar.f529871i)) / ((float) fVar.f529867e.f556446a);
    }

    public final android.os.Handler a() {
        if (this.f520298c == null) {
            try {
                this.f520298c = new android.os.Handler(android.os.Looper.getMainLooper());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f520296a, th6.toString());
            }
        }
        return this.f520298c;
    }

    public void c(java.util.List list, java.lang.Boolean bool, vp.c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.f520300e == null) {
            this.f520300e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("DanmakuPremeasure");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        if (!bool.booleanValue() || a() == null) {
            this.f520300e.mo50293x3498a0(new vp.b0(this, arrayList, c0Var));
        } else {
            a().post(new vp.a0(this, arrayList, c0Var));
        }
    }

    public void d(wp.a aVar, vp.c0 c0Var) {
        if (this.f520297b == null) {
            try {
                this.f520297b = new android.os.Handler(android.os.Looper.getMainLooper());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f520296a, th6.toString());
            }
        }
        android.os.Handler handler = this.f520297b;
        if (handler != null) {
            handler.post(new vp.y(this, aVar, c0Var));
        }
    }
}
