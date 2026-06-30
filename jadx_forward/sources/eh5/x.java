package eh5;

/* loaded from: classes10.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh5.y f334509d;

    public x(eh5.y yVar) {
        this.f334509d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh5.y yVar = this.f334509d;
        if (!yVar.f334517p) {
            yVar.f334517p = false;
            return;
        }
        if (yVar.f334518q) {
            yVar.f334518q = false;
            yVar.f334517p = false;
            yVar.dismiss();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = yVar.f334515n;
        if (c22642x62f5b194 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        int height = c22642x62f5b194.getHeight();
        if (height <= 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b1942 = yVar.f334515n;
            if (c22642x62f5b1942 != null) {
                c22642x62f5b1942.post(new eh5.u(yVar));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
                throw null;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b1943 = yVar.f334515n;
        if (c22642x62f5b1943 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        c22642x62f5b1943.setTranslationY(height * (-1.0f));
        android.view.View view = yVar.f334514m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentDimMask");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/immersive/ImmersiveHeaderHalfScreenBaseDialog$show$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/immersive/ImmersiveHeaderHalfScreenBaseDialog$show$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b1944 = yVar.f334515n;
        if (c22642x62f5b1944 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        c22642x62f5b1944.animate().setDuration(yVar.f334512h).setInterpolator(new y3.b()).translationY(0.0f).setUpdateListener(new eh5.v(yVar)).withEndAction(new eh5.w(yVar)).start();
        android.view.View view2 = yVar.f334514m;
        if (view2 != null) {
            view2.animate().setDuration(yVar.f334512h).alpha(1.0f).start();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentDimMask");
            throw null;
        }
    }
}
