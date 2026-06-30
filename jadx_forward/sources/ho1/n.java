package ho1;

/* loaded from: classes15.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f364291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364292f;

    public n(ho1.v vVar, java.util.ArrayList arrayList, long j17) {
        this.f364290d = vVar;
        this.f364291e = arrayList;
        this.f364292f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ho1.v vVar = this.f364290d;
        ro1.g gVar = vVar.f364364c;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mUDiskChannel");
            throw null;
        }
        java.util.ArrayList l17 = gVar.l(this.f364291e);
        boolean isEmpty = l17.isEmpty();
        long j17 = this.f364292f;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(vVar.f364362a, "Get dir sizes failed!");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
            if (t0Var != null) {
                t0Var.t0(j17, -2, new java.util.ArrayList());
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f364362a, "Get dir sizes count: " + l17.size());
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var2 = vVar.f364369h;
        if (t0Var2 != null) {
            t0Var2.t0(j17, 0, l17);
        }
    }
}
