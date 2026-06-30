package xl5;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static yz5.a f536667f = xl5.a.f536665d;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f536668a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f536669b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.PopupWindow f536670c;

    /* renamed from: d, reason: collision with root package name */
    public xl5.d f536671d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f536672e;

    public c(xl5.f scene, android.view.View mHostView, boolean z17, android.widget.PopupWindow popupWindow) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mHostView, "mHostView");
        this.f536668a = mHostView;
        this.f536669b = z17;
        this.f536670c = popupWindow;
        this.f536671d = new xl5.e();
        this.f536672e = jz5.h.b(new xl5.b(this));
    }

    public final void a() {
        jz5.f0 f0Var;
        if (android.os.Build.VERSION.SDK_INT >= 28 && this.f536668a.isAttachedToWindow()) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                nl5.l lVar = (nl5.l) ((jz5.n) this.f536672e).mo141623x754a37bb();
                if (lVar != null) {
                    lVar.f419850a.dismiss();
                    lVar.f419851b.cancel();
                    lVar.f419852c = false;
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
        }
        android.widget.PopupWindow popupWindow = this.f536670c;
        android.view.View contentView = popupWindow != null ? popupWindow.getContentView() : null;
        if (contentView == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        android.view.View view = contentView;
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "dismissMagnifier", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "dismissMagnifier", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.MotionEvent r11, int r12) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xl5.c.b(android.view.MotionEvent, int):void");
    }

    public final void c(nl5.l lVar, android.graphics.Rect rect) {
        android.view.View contentView;
        android.graphics.Point point;
        android.widget.PopupWindow popupWindow = this.f536670c;
        if (popupWindow == null || (contentView = popupWindow.getContentView()) == null) {
            return;
        }
        if (rect == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "updateHandlesVisibility", "(Lcom/tencent/mm/ui/widget/edittext/MagnifierMotionAnimator;Landroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(contentView, "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "updateHandlesVisibility", "(Lcom/tencent/mm/ui/widget/edittext/MagnifierMotionAnimator;Landroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 29) {
            point = lVar.f419850a.getPosition();
        } else {
            java.lang.Object obj = null;
            if (i17 == 28) {
                android.widget.Magnifier magnifier = lVar.f419850a;
                java.lang.Class<?>[] clsArr = new java.lang.Class[0];
                java.lang.reflect.Method method = null;
                for (java.lang.Class<?> cls = magnifier.getClass(); cls != java.lang.Object.class; cls = cls.getSuperclass()) {
                    try {
                        method = cls.getDeclaredMethod("getWindowCoords", clsArr);
                    } catch (java.lang.Throwable unused) {
                    }
                }
                if (method == null) {
                    new java.lang.Throwable("MB getWindowCoords");
                }
                java.lang.Object[] objArr = new java.lang.Object[0];
                try {
                    method.setAccessible(true);
                    obj = method.invoke(magnifier, objArr);
                } catch (java.lang.Throwable unused2) {
                }
                point = (android.graphics.Point) obj;
            } else {
                point = null;
            }
        }
        if (point == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(contentView, arrayList2.toArray(), "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "updateHandlesVisibility", "(Lcom/tencent/mm/ui/widget/edittext/MagnifierMotionAnimator;Landroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(contentView, "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "updateHandlesVisibility", "(Lcom/tencent/mm/ui/widget/edittext/MagnifierMotionAnimator;Landroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int i18 = point.x;
        int i19 = android.graphics.Rect.intersects(rect, new android.graphics.Rect(i18, point.y, lVar.f419850a.getWidth() + i18, point.y + lVar.f419850a.getHeight())) ^ true ? 0 : 4;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(contentView, arrayList3.toArray(), "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "updateHandlesVisibility", "(Lcom/tencent/mm/ui/widget/edittext/MagnifierMotionAnimator;Landroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/ui/widget/textview/magnifier/TextMagnifierHelper", "updateHandlesVisibility", "(Lcom/tencent/mm/ui/widget/edittext/MagnifierMotionAnimator;Landroid/graphics/Rect;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
