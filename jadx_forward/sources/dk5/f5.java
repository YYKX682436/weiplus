package dk5;

/* loaded from: classes9.dex */
public class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f316155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk5.g5 f316156e;

    public f5(dk5.g5 g5Var, java.util.Map map) {
        this.f316156e = g5Var;
        this.f316155d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        dk5.r5 r5Var = this.f316156e.f316172e;
        if (r5Var != null) {
            ((dk5.C28228x688ed22) r5Var).a(this.f316155d);
        }
    }
}
