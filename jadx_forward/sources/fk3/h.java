package fk3;

/* loaded from: classes8.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk3.o f345090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f345091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f345092f;

    public h(fk3.o oVar, int i17, boolean z17) {
        this.f345090d = oVar;
        this.f345091e = i17;
        this.f345092f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fk3.o oVar = this.f345090d;
        ek3.d dVar = oVar.f345120c;
        android.graphics.Rect rect = dVar != null ? dVar.f335140v : null;
        int i17 = this.f345091e;
        if (rect != null) {
            oVar.d(i17, this.f345092f, oVar.f345122e);
            return;
        }
        kk3.d dVar2 = oVar.f345122e;
        if (dVar2 == null || dVar2 == null) {
            return;
        }
        dVar2.e(i17);
    }
}
