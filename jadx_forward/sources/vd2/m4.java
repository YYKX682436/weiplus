package vd2;

/* loaded from: classes3.dex */
public final class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f517344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517345f;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c, long j17, java.lang.String str) {
        this.f517343d = c14167x40aca97c;
        this.f517344e = j17;
        this.f517345f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        km2.n nVar;
        java.util.HashMap hashMap;
        km2.n nVar2;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5500xcde1614 c5500xcde1614 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5500xcde1614();
        vd2.t1 t1Var = this.f517343d.f193019h;
        int i17 = (t1Var == null || (nVar2 = dk2.ef.H) == null) ? 0 : nVar2.f390689h;
        am.dc dcVar = c5500xcde1614.f135832g;
        dcVar.f87974a = i17;
        java.lang.String str2 = this.f517345f;
        if (i17 != 4 || t1Var == null || (nVar = dk2.ef.H) == null || (hashMap = nVar.f390690i) == null || (str = (java.lang.String) hashMap.get(java.lang.Long.valueOf(this.f517344e))) == null) {
            str = str2;
        }
        dcVar.f87975b = str;
        c5500xcde1614.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "notifyLiveSwitch data.liveId:" + dcVar.f87975b + ", liveId:" + str2 + ", source:" + dcVar.f87974a);
    }
}
