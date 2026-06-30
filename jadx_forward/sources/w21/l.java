package w21;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f523957d;

    public l(w21.k kVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f523957d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.v8 v8Var = w21.k.f523933u;
        if (v8Var != null) {
            v8Var.a(this.f523957d);
        }
    }
}
