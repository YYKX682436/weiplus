package ug5;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug5.v f509172d;

    public p(ug5.v vVar) {
        this.f509172d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ug5.v vVar = this.f509172d;
        if (vVar.f509195e) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentPerformer", "fallback to exec completed. ");
        vVar.b(true);
    }
}
