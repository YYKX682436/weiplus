package fo5;

/* loaded from: classes14.dex */
public final class v implements p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f346657a;

    public v(java.util.ArrayList arrayList) {
        this.f346657a = arrayList;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b
    public void a(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "after add member is " + list);
        java.util.Set G0 = list != null ? kz5.n0.G0(list, kz5.n0.X0(this.f346657a)) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.e(G0 != null ? new java.util.ArrayList(kz5.n0.S0(G0)) : null, fo5.u.f346654a);
    }
}
