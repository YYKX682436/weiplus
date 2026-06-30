package n62;

/* loaded from: classes11.dex */
public class i implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n62.k f416727d;

    public i(n62.k kVar) {
        this.f416727d = kVar;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            return;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreExt", "onNotifyChange acc not ready");
        } else if (a1Var == c01.d9.b().q()) {
            this.f416727d.Vi(false);
        }
    }
}
