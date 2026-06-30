package p10;

/* loaded from: classes8.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 f432543d;

    public w(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3) {
        this.f432543d = c10541x905158a3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3.G;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3 = this.f432543d;
        java.lang.Object parent = c10541x905158a3.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view == null) {
            return;
        }
        int width = view.getWidth();
        if (c10541x905158a3.getWidth() <= 0 || width <= 0) {
            return;
        }
        float left = c10541x905158a3.getLeft() + c10541x905158a3.getTranslationX();
        float right = c10541x905158a3.getRight() + c10541x905158a3.getTranslationX();
        if (left < 0.0f) {
            c10541x905158a3.setTranslationX(-c10541x905158a3.getLeft());
            return;
        }
        float f17 = width;
        if (right > f17) {
            c10541x905158a3.setTranslationX(f17 - c10541x905158a3.getRight());
        }
    }
}
