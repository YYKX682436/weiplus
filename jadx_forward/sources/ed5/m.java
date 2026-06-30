package ed5;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f332900a;

    /* renamed from: b, reason: collision with root package name */
    public android.animation.AnimatorSet f332901b;

    /* renamed from: c, reason: collision with root package name */
    public ed5.b f332902c;

    /* renamed from: d, reason: collision with root package name */
    public ed5.c f332903d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 f332904e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f332905f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f332906g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewOverlay f332907h;

    public m(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f332900a = recyclerView;
    }

    public static final void a(ed5.m mVar) {
        android.animation.AnimatorSet animatorSet = mVar.f332901b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        mVar.f332901b = null;
        ed5.b bVar = mVar.f332902c;
        if (bVar == null) {
            mVar.c();
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(bVar.f332880k, 1.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.addUpdateListener(new ed5.k(bVar));
        ofFloat.addListener(new ed5.l(mVar));
        ofFloat.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i17) {
        android.view.View mo7935xa188593e;
        android.view.Window window;
        android.view.View decorView;
        android.view.ViewOverlay overlay;
        android.graphics.Bitmap bitmap;
        android.animation.AnimatorSet animatorSet = this.f332901b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f332901b = null;
        c();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f332900a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = c1163xf1deaba4.mo7951xfd37656d();
        if (mo7951xfd37656d != null && (mo7935xa188593e = mo7951xfd37656d.mo7935xa188593e(i17)) != null && mo7935xa188593e.getWidth() > 0 && mo7935xa188593e.getHeight() > 0) {
            android.content.Context context = c1163xf1deaba4.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (overlay = decorView.getOverlay()) == null) {
                return;
            }
            this.f332906g = mo7935xa188593e;
            this.f332907h = overlay;
            if (mo7935xa188593e.getWidth() > 0 && mo7935xa188593e.getHeight() > 0) {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    int width = mo7935xa188593e.getWidth();
                    int height = mo7935xa188593e.getHeight();
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(height));
                    arrayList.add(java.lang.Integer.valueOf(width));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryLocateHighlightAnimator", "captureViewBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                    yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryLocateHighlightAnimator", "captureViewBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
                    mo7935xa188593e.draw(new android.graphics.Canvas(createBitmap));
                    bitmap = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(createBitmap);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    bitmap = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                r2 = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(bitmap) ? null : bitmap;
            }
            android.graphics.Bitmap bitmap2 = r2;
            if (bitmap2 == null) {
                return;
            }
            int[] iArr = new int[2];
            mo7935xa188593e.getLocationInWindow(iArr);
            int i18 = iArr[0];
            int i19 = iArr[1];
            int width2 = mo7935xa188593e.getWidth();
            int height2 = mo7935xa188593e.getHeight();
            int width3 = activity.getWindow().getDecorView().getWidth();
            int height3 = activity.getWindow().getDecorView().getHeight();
            float f17 = (width2 * 0.20000005f) / 2.0f;
            float f18 = (height2 * 0.20000005f) / 2.0f;
            float f19 = 1.0f;
            float f27 = ((float) i18) < f17 ? 0.0f : ((float) ((width3 - i18) - width2)) < f17 ? 1.0f : 0.5f;
            if (i19 < f18) {
                f19 = 0.0f;
            } else if ((height3 - i19) - height2 >= f18) {
                f19 = 0.5f;
            }
            ed5.b bVar = new ed5.b(bitmap2, i18, i19, width2, height2, java.lang.Float.valueOf(f27).floatValue(), java.lang.Float.valueOf(f19).floatValue());
            this.f332902c = bVar;
            overlay.add(bVar);
            ed5.c cVar = new ed5.c(bVar);
            this.f332903d = cVar;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(mo7935xa188593e, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryLocateHighlightAnimator", "animate", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo7935xa188593e.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(mo7935xa188593e, "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryLocateHighlightAnimator", "animate", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 1.2f);
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofFloat.addUpdateListener(new ed5.j(bVar));
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.setDuration(1500L);
            android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.setDuration(1000L);
            ofFloat3.addUpdateListener(new ed5.g(cVar, overlay));
            ofFloat3.addListener(new ed5.h(cVar, overlay));
            android.animation.ValueAnimator ofFloat4 = android.animation.ValueAnimator.ofFloat(1.2f, 1.0f);
            ofFloat4.setDuration(150L);
            ofFloat4.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofFloat4.addUpdateListener(new ed5.i(bVar));
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.play(ofFloat).before(ofFloat2);
            animatorSet2.play(ofFloat2).with(ofFloat3);
            animatorSet2.play(ofFloat2).before(ofFloat4);
            animatorSet2.addListener(new ed5.d(this));
            animatorSet2.start();
            this.f332901b = animatorSet2;
            ed5.e eVar = new ed5.e(this);
            c1163xf1deaba4.P(eVar);
            this.f332904e = eVar;
            ed5.f fVar = new ed5.f(this);
            c1163xf1deaba4.i(fVar);
            this.f332905f = fVar;
        }
    }

    public final void c() {
        android.view.ViewOverlay viewOverlay = this.f332907h;
        ed5.c cVar = this.f332903d;
        if (cVar != null && cVar.f332883c) {
            if (viewOverlay != null) {
                viewOverlay.remove(cVar);
            }
            cVar.f332883c = false;
        }
        this.f332903d = null;
        ed5.b bVar = this.f332902c;
        if (bVar != null) {
            if (viewOverlay != null) {
                viewOverlay.remove(bVar);
            }
            android.graphics.Bitmap bitmap = bVar.f332870a;
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        this.f332902c = null;
        this.f332907h = null;
        android.view.View view = this.f332906g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryLocateHighlightAnimator", "cleanup", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryLocateHighlightAnimator", "cleanup", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationZ(0.0f);
        }
        this.f332906g = null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 v2Var = this.f332904e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f332900a;
        if (v2Var != null) {
            c1163xf1deaba4.U0(v2Var);
        }
        this.f332904e = null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.f332905f;
        if (w2Var != null) {
            c1163xf1deaba4.V0(w2Var);
        }
        this.f332905f = null;
    }
}
