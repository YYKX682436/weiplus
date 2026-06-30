package z81;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z81.g f552222d;

    public c(z81.g gVar) {
        this.f552222d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f552222d.f552237n;
        this.f552222d.f552237n = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawActionDelegateImpl", "preStae %b, hasChanged %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f552222d.f552230d));
        if (z17 && this.f552222d.f552230d) {
            this.f552222d.f552235i.a();
        }
    }
}
