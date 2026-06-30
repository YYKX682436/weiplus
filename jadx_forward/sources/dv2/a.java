package dv2;

/* loaded from: classes10.dex */
public final class a implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27306x72625785.reportMsgReadCGICallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv2.b f325337a;

    public a(dv2.b bVar) {
        this.f325337a = bVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27306x72625785.reportMsgReadCGICallback
    /* renamed from: complete */
    public final void mo112788xdc453139(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        dv2.b bVar = this.f325337a;
        sb6.append(bVar.hashCode());
        sb6.append(" report task reportMsgReadCGI complete username=");
        sb6.append(bVar.f325347e);
        sb6.append(",sessionId=");
        sb6.append(bVar.f325346d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb6.toString());
    }
}
