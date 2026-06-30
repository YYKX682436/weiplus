package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29;

/* loaded from: classes5.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f256896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f256897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f256898f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.c f256899g;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.c cVar, int i17, int i18, int i19) {
        this.f256899g = cVar;
        this.f256896d = i17;
        this.f256897e = i18;
        this.f256898f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceInputAddr2", "error localCode = %s, errType = %s, errCode = %s.", java.lang.Integer.valueOf(this.f256896d), java.lang.Integer.valueOf(this.f256897e), java.lang.Integer.valueOf(this.f256898f));
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.c cVar = this.f256899g;
        z21.v vVar = cVar.f256901d;
        if (vVar != null) {
            vVar.e(this.f256896d, this.f256897e, this.f256898f, -1L);
        }
        cVar.c(false, true);
    }
}
