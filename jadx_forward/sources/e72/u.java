package e72;

/* loaded from: classes14.dex */
public class u implements e72.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e72.v f331460a;

    public u(e72.v vVar) {
        this.f331460a = vVar;
    }

    public void a(int i17) {
        synchronized (this.f331460a.f331477q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NumberFaceMotion", "hy: on voice prepare error: %d", java.lang.Integer.valueOf(i17));
            if (i17 != 11) {
                e72.v vVar = this.f331460a;
                vVar.f331479s = true;
                vVar.f331480t = new e72.f(7, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn));
            } else {
                this.f331460a.getClass();
            }
        }
    }
}
