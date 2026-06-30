package bh2;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bh2.v f102416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError f102417e;

    public n(bh2.v vVar, com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError tXChorusError) {
        this.f102416d = vVar;
        this.f102417e = tXChorusError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bh2.v vVar = this.f102416d;
        bh2.b bVar = vVar.f102431f;
        if (bVar != null) {
            om2.s sVar = vVar.f102427b;
            java.lang.String a17 = sVar != null ? sVar.a() : "";
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError tXChorusError = this.f102417e;
            bVar.Y4(a17, tXChorusError != null ? tXChorusError.ordinal() : 0);
        }
        vVar.f102436k = false;
        vVar.f102435j = true;
    }
}
