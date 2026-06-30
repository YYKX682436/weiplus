package pk4;

/* loaded from: classes10.dex */
public final class k implements pk4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c f438033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kk4.v f438034b;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c, kk4.v vVar) {
        this.f438033a = c18689xd498e45c;
        this.f438034b = vVar;
    }

    @Override // pk4.v
    public void a(dk4.a aVar, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c = this.f438033a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c.d(c18689xd498e45c, false, false, 3, null);
        kk4.v vVar = this.f438034b;
        dk4.a aVar2 = vVar.f390111c;
        long j18 = aVar2 != null ? aVar2.f316011o : 0L;
        long j19 = aVar2 != null ? aVar2.f316012p : 0L;
        java.lang.String str = c18689xd498e45c.f256045d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("timeMs=");
        sb6.append(j17);
        sb6.append(", originOffset=");
        dk4.a aVar3 = vVar.f390111c;
        sb6.append(aVar3 != null ? java.lang.Long.valueOf(aVar3.f316012p) : null);
        sb6.append(", length=");
        dk4.a aVar4 = vVar.f390111c;
        sb6.append(aVar4 != null ? java.lang.Long.valueOf(aVar4.f316011o) : null);
        sb6.append(", media=");
        sb6.append(aVar != null ? aVar.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, sb6.toString());
        yz5.p onProgressUpdate = c18689xd498e45c.getOnProgressUpdate();
        if (onProgressUpdate != null) {
            onProgressUpdate.mo149xb9724478(java.lang.Long.valueOf(j17 - j19), java.lang.Long.valueOf(j18));
        }
    }
}
