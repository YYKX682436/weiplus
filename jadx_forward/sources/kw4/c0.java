package kw4;

/* loaded from: classes8.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f394688a;

    /* renamed from: f, reason: collision with root package name */
    public float[] f394693f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f394694g;

    /* renamed from: h, reason: collision with root package name */
    public lw4.a f394695h;

    /* renamed from: i, reason: collision with root package name */
    public final lw4.f f394696i;

    /* renamed from: d, reason: collision with root package name */
    public int f394691d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f394692e = -1;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f394689b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f394690c = new java.util.LinkedList();

    public c0(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, lw4.f fVar) {
        this.f394688a = c22633x83752a59;
        this.f394694g = new android.view.View(c22633x83752a59.getContext());
        this.f394696i = fVar;
    }

    public final boolean a(android.view.View view, int i17, int i18, float[] fArr, int i19) {
        android.view.ViewGroup c17;
        java.util.List list;
        android.view.ViewGroup.LayoutParams layoutParams;
        int i27;
        float f17;
        if (view == null || fArr == null || fArr.length < 5 || (c17 = c(i18)) == null || d(i17) != null) {
            return false;
        }
        float f18 = fArr[0];
        float f19 = fArr[1];
        float f27 = fArr[2];
        float f28 = fArr[3];
        int i28 = (int) fArr[4];
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.view.ViewGroup.LayoutParams((int) f27, (int) f28);
        java.util.List<kw4.b0> list2 = this.f394690c;
        int i29 = 0;
        for (kw4.b0 b0Var : list2) {
            if (i18 == b0Var.f394681c && i28 >= b0Var.f394682d) {
                i29++;
            }
        }
        if (i29 < 0) {
            i29 = 0;
        }
        if (i29 > c17.getChildCount()) {
            i29 = c17.getChildCount();
        }
        int i37 = i29;
        if (i19 == Integer.MAX_VALUE || i19 < 0) {
            list = list2;
            layoutParams = layoutParams2;
            i27 = i28;
            f17 = f19;
        } else {
            int i38 = i19 == 0 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i38));
            java.util.Collections.reverse(arrayList);
            list = list2;
            layoutParams = layoutParams2;
            i27 = i28;
            f17 = f19;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebViewCustomViewContainer", "addViewImpl", "(Landroid/view/View;II[FI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/fts/ui/FtsWebViewCustomViewContainer", "addViewImpl", "(Landroid/view/View;II[FI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c17.addView(view, i37, layoutParams);
        view.setX(f18);
        view.setY(f17);
        ((java.util.LinkedList) list).add(new kw4.b0(view, i17, i18, i27));
        return true;
    }

    public final java.util.List b(kw4.b0 b0Var) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (kw4.b0 b0Var2 : this.f394690c) {
            if (b0Var2.f394681c == b0Var.f394680b) {
                linkedList.addAll(b(b0Var2));
            }
        }
        linkedList.add(b0Var);
        return linkedList;
    }

    public final android.view.ViewGroup c(int i17) {
        if (i17 == 0) {
            android.view.ViewGroup mo120155xf9dcf964 = this.f394688a.mo120155xf9dcf964();
            if (mo120155xf9dcf964 instanceof android.widget.AbsoluteLayout) {
                return mo120155xf9dcf964;
            }
            return null;
        }
        kw4.b0 e17 = e(i17);
        if (e17 == null) {
            return null;
        }
        android.view.View view = (android.view.View) e17.f394679a.get();
        if (view instanceof android.view.ViewGroup) {
            return (android.view.ViewGroup) view;
        }
        return null;
    }

    public android.view.View d(int i17) {
        kw4.b0 e17 = e(i17);
        if (e17 == null) {
            return null;
        }
        return (android.view.View) e17.f394679a.get();
    }

    public final kw4.b0 e(int i17) {
        for (kw4.b0 b0Var : this.f394690c) {
            if (b0Var.f394680b == i17) {
                return b0Var;
            }
        }
        return null;
    }

    public final boolean f(int i17, float[] fArr, int i18) {
        if (this.f394692e == i17 || this.f394691d == i17) {
            return true;
        }
        kw4.b0 e17 = e(i17);
        if (e17 == null) {
            return false;
        }
        android.view.View view = (android.view.View) e17.f394679a.get();
        int i19 = e17.f394681c;
        android.view.ViewGroup c17 = c(i19);
        if (c17 == null) {
            return false;
        }
        if (i18 >= 0 && i18 != Integer.MAX_VALUE) {
            int i27 = i18 == 0 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebViewCustomViewContainer", "updateViewImpl", "(I[FI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/fts/ui/FtsWebViewCustomViewContainer", "updateViewImpl", "(I[FI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (fArr == null || fArr.length < 5) {
            return true;
        }
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = fArr[2];
        float f27 = fArr[3];
        int i28 = (int) fArr[4];
        java.util.List list = this.f394690c;
        ((java.util.LinkedList) list).remove(e17);
        if (e17.f394682d != i28) {
            c17.removeView(view);
            if (a(view, i17, e17.f394681c, fArr, i18)) {
                return true;
            }
            list.removeAll(b(e17));
            return false;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (f19 != Float.MAX_VALUE) {
            layoutParams.width = (int) f19;
        }
        if (f27 != Float.MAX_VALUE) {
            layoutParams.height = (int) f27;
        }
        if (f17 != Float.MAX_VALUE) {
            view.setX(f17);
        }
        if (f18 != Float.MAX_VALUE) {
            view.setY(f18);
        }
        view.requestLayout();
        ((java.util.LinkedList) list).add(new kw4.b0(view, i17, i19, i28));
        android.view.View view2 = this.f394694g;
        int indexOfChild = c17.indexOfChild(view2);
        if (c17.indexOfChild(view) != -1 || indexOfChild == -1) {
            return true;
        }
        c17.addView(view, indexOfChild);
        c17.removeView(view2);
        return true;
    }
}
