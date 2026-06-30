package com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a f233908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f233909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f233910f;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a aVar, android.util.Pair pair, boolean z17) {
        this.f233908d = aVar;
        this.f233909e = pair;
        this.f233910f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a aVar = this.f233908d;
        android.util.Pair pair = this.f233909e;
        boolean z17 = this.f233910f;
        android.util.Pair f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.f(aVar, pair, z17);
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = aVar.mo54844xfb83cc9b();
        java.lang.Object obj = pair.first;
        if (obj == null) {
            obj = "null";
        }
        objArr[1] = obj;
        objArr[2] = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.m((r45.pm6) pair.second);
        objArr[3] = java.lang.Boolean.valueOf(z17);
        objArr[4] = f17.first;
        objArr[5] = f17.second;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsHelper", "showNewTipsMainThread() path:%s pair:(%s, %s) show:%s state:%s result:%s", objArr);
    }
}
