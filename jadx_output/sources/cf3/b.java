package cf3;

/* loaded from: classes7.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cf3.d f40913d;

    public b(cf3.d dVar) {
        this.f40913d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cf3.d dVar = this.f40913d;
        if (kotlin.jvm.internal.o.b(dVar.f40928m, dVar.f40927l) || dVar.f40921f) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MBExternalViewStub", "layoutChecker trigger layout");
        cf3.d dVar2 = this.f40913d;
        jc3.r rVar = dVar2.f40916a;
        int i17 = dVar2.f40925j;
        android.graphics.Rect rect = dVar2.f40928m;
        rVar.f(i17, dVar2, rect.left, rect.top, rect.width(), dVar.f40928m.height());
        dVar.f40927l = dVar.f40928m;
    }
}
