package a4;

/* loaded from: classes13.dex */
public class f extends androidx.lifecycle.c1 {

    /* renamed from: f, reason: collision with root package name */
    public static final androidx.lifecycle.f1 f1164f = new a4.e();

    /* renamed from: d, reason: collision with root package name */
    public final x.o f1165d = new x.o();

    /* renamed from: e, reason: collision with root package name */
    public boolean f1166e = false;

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        x.o oVar = this.f1165d;
        int h17 = oVar.h();
        for (int i17 = 0; i17 < h17; i17++) {
            a4.c cVar = (a4.c) oVar.i(i17);
            androidx.loader.content.e eVar = cVar.f1157f;
            eVar.cancelLoad();
            eVar.abandon();
            a4.d dVar = cVar.f1159h;
            if (dVar != null) {
                cVar.removeObserver(dVar);
                if (dVar.f1163f) {
                    dVar.f1162e.onLoaderReset(dVar.f1161d);
                }
            }
            eVar.unregisterListener(cVar);
            eVar.reset();
        }
        int i18 = oVar.f450851g;
        java.lang.Object[] objArr = oVar.f450850f;
        for (int i19 = 0; i19 < i18; i19++) {
            objArr[i19] = null;
        }
        oVar.f450851g = 0;
        oVar.f450848d = false;
    }
}
