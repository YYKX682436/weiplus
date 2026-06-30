package mm2;

/* loaded from: classes3.dex */
public final class c5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.e5 f410471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f410472e;

    public c5(mm2.e5 e5Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f410471d = e5Var;
        this.f410472e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mm2.e5 e5Var = this.f410471d;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f410472e;
        synchronized (e5Var) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveMsgSpeedControlSlice", "add msg size = " + ((java.util.ArrayList) h0Var.f391656d).size());
            e5Var.f410539m.addAll((java.util.Collection) h0Var.f391656d);
            if (e5Var.f410539m.size() > e5Var.f410535f.m75939xb282bd08(0)) {
                int size = e5Var.f410539m.size() - e5Var.f410535f.m75939xb282bd08(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveMsgSpeedControlSlice", "cacheSize: " + e5Var.f410539m.size() + ", reach cache limit:" + e5Var.f410535f.m75939xb282bd08(0) + " del size:" + size);
                e5Var.f410539m.d(size);
            }
        }
    }
}
