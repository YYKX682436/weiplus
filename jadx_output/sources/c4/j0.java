package c4;

/* loaded from: classes15.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f38312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f38313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.os.ResultReceiver f38314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f38315g;

    public j0(c4.k0 k0Var, c4.l0 l0Var, java.lang.String str, android.os.Bundle bundle, android.support.v4.os.ResultReceiver resultReceiver) {
        this.f38315g = k0Var;
        this.f38312d = l0Var;
        this.f38313e = bundle;
        this.f38314f = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.IBinder a17 = ((c4.m0) this.f38312d).a();
        c4.k0 k0Var = this.f38315g;
        if (((c4.n) k0Var.f38317a.f11705g.getOrDefault(a17, null)) == null) {
            java.util.Objects.toString(this.f38313e);
        } else {
            k0Var.f38317a.getClass();
            this.f38314f.b(-1, null);
        }
    }
}
