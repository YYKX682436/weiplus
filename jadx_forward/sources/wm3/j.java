package wm3;

/* loaded from: classes9.dex */
public class j extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f528804d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f528805e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.g0 f528806f;

    /* renamed from: g, reason: collision with root package name */
    public final android.database.DataSetObserver f528807g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f528808h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f528809i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f528810m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f528811n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.WeakHashMap f528812o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f528804d = new android.graphics.Rect();
        this.f528805e = jz5.h.b(new wm3.i(this, activity));
        this.f528806f = new wm3.f(this);
        this.f528807g = new wm3.b(this);
        this.f528808h = new wm3.g(this);
        this.f528809i = jz5.h.b(new wm3.d(this, activity));
        this.f528810m = jz5.h.b(new wm3.e(activity));
        this.f528811n = new java.util.ArrayList();
        this.f528812o = new java.util.WeakHashMap();
    }

    public final android.view.ViewGroup T6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f528805e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.ViewGroup) mo141623x754a37bb;
    }

    public final void U6() {
        T6().post(new wm3.h(this));
    }

    public final void V6() {
        boolean z17;
        int i17;
        boolean z18;
        android.view.View view;
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = this.f528811n;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) ((java.lang.ref.WeakReference) it.next()).get();
            if (c21560x1fce98fb != null) {
                java.util.Set entrySet = this.f528812o.entrySet();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
                java.util.Iterator it6 = entrySet.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        view = null;
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) ((java.lang.ref.WeakReference) entry.getValue()).get();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c21560x1fce98fb2 != null ? c21560x1fce98fb2.f279313q : null, c21560x1fce98fb.f279313q)) {
                        view = (android.view.View) entry.getKey();
                        break;
                    }
                }
                if (view != null) {
                    android.graphics.Rect rect = this.f528804d;
                    if (!(view.getGlobalVisibleRect(rect) && rect.width() >= view.getMeasuredWidth() && rect.height() >= view.getMeasuredHeight() && view.isAttachedToWindow())) {
                        z17 = true;
                        break;
                    }
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        int childCount = T6().getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = T6().getChildAt(i18);
            if (childAt != null) {
                java.lang.Object tag = childAt.getTag();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str = (java.lang.String) tag;
                if (z17) {
                    java.util.Iterator it7 = arrayList.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            z18 = false;
                            break;
                        }
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) ((java.lang.ref.WeakReference) it7.next()).get();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c21560x1fce98fb3 != null ? c21560x1fce98fb3.f279313q : null, str)) {
                            z18 = true;
                            break;
                        }
                    }
                    if (z18) {
                        i17 = 0;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(java.lang.Integer.valueOf(i17));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC", "showFloatView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(childAt, "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC", "showFloatView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                i17 = 8;
                java.util.ArrayList arrayList22 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList22.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList22);
                yj0.a.d(childAt, arrayList22.toArray(), "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC", "showFloatView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC", "showFloatView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b abstractActivityC21555x39071a9b = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b) m158354x19263085 : null;
        if (abstractActivityC21555x39071a9b != null) {
            abstractActivityC21555x39071a9b.m79328xd4fbf521(this.f528808h);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = abstractActivityC21555x39071a9b.m79336x8b97809d();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = m79336x8b97809d instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d : null;
            if (h0Var != null) {
                h0Var.a(this.f528806f);
                h0Var.registerDataSetObserver(this.f528807g);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        U6();
    }
}
