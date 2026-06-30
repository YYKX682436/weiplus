package fr5;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.h f347477d;

    public g(fr5.h hVar) {
        this.f347477d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fr5.h hVar = this.f347477d;
        if (hVar.f347491i) {
            android.widget.OverScroller overScroller = hVar.f347489g;
            if (!overScroller.computeScrollOffset()) {
                hVar.f347491i = false;
                hVar.f347488f.mo152xb9724478();
            } else {
                hVar.f347487e.mo146xb9724478(new zq5.c(zq5.d.a(overScroller.getCurrX(), overScroller.getCurrY())));
                hVar.f347483a.postOnAnimation(hVar.f347490h);
            }
        }
    }
}
