package jo4;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jo4.l f382431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rm5.v f382433f;

    public d(jo4.l lVar, java.lang.String str, rm5.v vVar) {
        this.f382431d = lVar;
        this.f382432e = str;
        this.f382433f = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jo4.l lVar = this.f382431d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f382453a, "exporting cancel by controller: " + this.f382432e);
        this.f382433f.d();
        lVar.f382455c = true;
    }
}
