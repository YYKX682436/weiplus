package sc2;

/* loaded from: classes2.dex */
public final class f8 implements ff0.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.p8 f487427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f487428b;

    public f8(sc2.p8 p8Var, yz5.l lVar) {
        this.f487427a = p8Var;
        this.f487428b = lVar;
    }

    @Override // ff0.x
    public void a(ff0.z zVar) {
        yz5.l lVar;
        java.lang.String str = this.f487427a.f487685w;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPickImageColorFinished ");
        sb6.append(zVar != null ? java.lang.Integer.valueOf(zVar.f343128a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, sb6.toString());
        if (zVar == null || (lVar = this.f487428b) == null) {
            return;
        }
        lVar.mo146xb9724478(java.lang.Integer.valueOf(zVar.f343129b));
    }
}
