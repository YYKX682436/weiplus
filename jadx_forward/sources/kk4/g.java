package kk4;

/* loaded from: classes15.dex */
public final class g implements ek4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kk4.v f390075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kk4.h f390076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f390077c;

    public g(kk4.v vVar, kk4.h hVar, long j17) {
        this.f390075a = vVar;
        this.f390076b = hVar;
        this.f390077c = j17;
    }

    @Override // ek4.v
    public void a(int i17) {
        kk4.v vVar = this.f390075a;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f390109a, "requestVideoData requestDataRet:" + i17 + " requestLength:" + this.f390077c);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(vVar.f390109a, "requestedResource() requestVideoData fail, ret:" + i17 + ' ' + this);
        this.f390076b.f390082h = false;
    }
}
