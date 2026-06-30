package cf3;

/* loaded from: classes7.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cf3.d f122446d;

    public b(cf3.d dVar) {
        this.f122446d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cf3.d dVar = this.f122446d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f122461m, dVar.f122460l) || dVar.f122454f) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBExternalViewStub", "layoutChecker trigger layout");
        cf3.d dVar2 = this.f122446d;
        jc3.r rVar = dVar2.f122449a;
        int i17 = dVar2.f122458j;
        android.graphics.Rect rect = dVar2.f122461m;
        rVar.f(i17, dVar2, rect.left, rect.top, rect.width(), dVar.f122461m.height());
        dVar.f122460l = dVar.f122461m;
    }
}
