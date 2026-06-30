package sc2;

/* loaded from: classes2.dex */
public final class y1 implements ff0.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.f2 f487911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f487912b;

    public y1(sc2.f2 f2Var, yz5.l lVar) {
        this.f487911a = f2Var;
        this.f487912b = lVar;
    }

    @Override // ff0.x
    public void a(ff0.z zVar) {
        yz5.l lVar;
        java.lang.String k17 = this.f487911a.k();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPickImageColorFinished ");
        sb6.append(zVar != null ? java.lang.Integer.valueOf(zVar.f343128a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(k17, sb6.toString());
        if (zVar == null || (lVar = this.f487912b) == null) {
            return;
        }
        lVar.mo146xb9724478(java.lang.Integer.valueOf(zVar.f343129b));
    }
}
