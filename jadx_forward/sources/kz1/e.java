package kz1;

@j95.b
/* loaded from: classes13.dex */
public class e extends i95.w implements dy1.w {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.Map f395371o;

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.Boolean f395372p;

    /* renamed from: q, reason: collision with root package name */
    public static volatile kz1.e f395373q;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f395377g;

    /* renamed from: d, reason: collision with root package name */
    public final uz1.a f395374d = new uz1.a();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f395375e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final uz1.b f395376f = new uz1.b(com.p314xaae8f345.mm.R.id.phb);

    /* renamed from: h, reason: collision with root package name */
    public long f395378h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f395379i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f395380m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final yj0.d f395381n = new kz1.f(this);

    static {
        android.view.ViewConfiguration.getDoubleTapTimeout();
        android.view.ViewConfiguration.getLongPressTimeout();
        java.util.HashMap hashMap = new java.util.HashMap();
        f395371o = hashMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("onClick", "(Landroid/view/View;)V"));
        hashMap.put("android/view/View$OnClickListener", arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(android.util.Pair.create("onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z"));
        hashMap.put("android/view/View$OnDragListener", arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(android.util.Pair.create("onLongClick", "(Landroid/view/View;)Z"));
        hashMap.put("android/view/View$OnLongClickListener", arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(android.util.Pair.create("onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"));
        hashMap.put("android/view/View$OnKeyListener", arrayList4);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(android.util.Pair.create("onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z"));
        hashMap.put("android/view/View$OnTouchListener", arrayList5);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(android.util.Pair.create("onHover", "(Landroid/view/View;Landroid/view/MotionEvent;)Z"));
        hashMap.put("android/view/View$OnHoverListener", arrayList6);
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(android.util.Pair.create("onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"));
        hashMap.put("android/widget/AdapterView$OnItemClickListener", arrayList7);
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(android.util.Pair.create("onItemLongClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"));
        hashMap.put("android/widget/AdapterView$OnItemLongClickListener", arrayList8);
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(android.util.Pair.create("onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"));
        hashMap.put("android/widget/AdapterView$OnItemSelectedListener", arrayList9);
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(android.util.Pair.create("onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V"));
        hashMap.put("androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", arrayList10);
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        arrayList11.add(android.util.Pair.create("onClick", "(Landroid/view/View;)V"));
        hashMap.put("android/text/style/ClickableSpan", arrayList11);
        java.util.ArrayList arrayList12 = new java.util.ArrayList();
        arrayList12.add(android.util.Pair.create("onClick", "(Landroid/view/View;)V"));
        hashMap.put("com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", arrayList12);
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        arrayList13.add(android.util.Pair.create("onTouchEvent", "(Landroid/view/MotionEvent;)Z"));
        hashMap.put("com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView", arrayList13);
        java.util.ArrayList arrayList14 = new java.util.ArrayList();
        arrayList14.add(android.util.Pair.create("onSingleTapUp", "(Landroid/view/MotionEvent;)Z"));
        arrayList14.add(android.util.Pair.create(if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V"));
        hashMap.put("android/view/GestureDetector$OnGestureListener", arrayList14);
        java.util.ArrayList arrayList15 = new java.util.ArrayList();
        arrayList15.add(android.util.Pair.create("onDoubleTap", "(Landroid/view/MotionEvent;)Z"));
        hashMap.put("android/view/GestureDetector$OnDoubleTapListener", arrayList15);
        java.util.ArrayList arrayList16 = new java.util.ArrayList();
        arrayList16.add(android.util.Pair.create("onContextClick", "(Landroid/view/MotionEvent;)Z"));
        hashMap.put("android/view/GestureDetector$OnContextClickListener", arrayList16);
        java.util.ArrayList arrayList17 = new java.util.ArrayList();
        arrayList17.add(android.util.Pair.create("onSingleTapUp", "(Landroid/view/MotionEvent;)Z"));
        arrayList17.add(android.util.Pair.create(if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V"));
        arrayList17.add(android.util.Pair.create("onDoubleTap", "(Landroid/view/MotionEvent;)Z"));
        arrayList17.add(android.util.Pair.create("onContextClick", "(Landroid/view/MotionEvent;)Z"));
        hashMap.put("android/view/GestureDetector$SimpleOnGestureListener", arrayList17);
        f395372p = null;
    }

    private e() {
    }

    public static void Ai(kz1.e eVar, android.view.View view) {
        eVar.getClass();
        if (view == null) {
            return;
        }
        eVar.f395380m = view.hashCode();
        java.util.Iterator it = ((java.util.ArrayList) eVar.f395375e).iterator();
        while (it.hasNext()) {
            ((iz1.a) ((dy1.v) it.next())).T(view);
        }
        dy1.v vVar = (dy1.v) eVar.f395376f.c(view);
        if (vVar != null) {
            ((iz1.a) vVar).T(view);
        }
    }

    public static kz1.e Bi() {
        if (f395373q == null) {
            synchronized (kz1.e.class) {
                if (f395373q == null) {
                    f395373q = new kz1.e();
                }
            }
        }
        return f395373q;
    }

    public static boolean Di() {
        if (f395372p == null) {
            f395372p = java.lang.Boolean.valueOf(h62.d.vj().fj(e42.d0.clicfg_data_report_view_operate_monitor_switch, false));
        }
        return f395372p.booleanValue();
    }

    public static void wi(kz1.e eVar, android.view.View view) {
        eVar.getClass();
        if (view == null) {
            return;
        }
        int hashCode = view.hashCode();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = hashCode;
        if (j17 != eVar.f395378h || currentTimeMillis - eVar.f395379i >= 500) {
            eVar.f395378h = j17;
            eVar.f395379i = currentTimeMillis;
            java.util.Iterator it = ((java.util.ArrayList) eVar.f395375e).iterator();
            while (it.hasNext()) {
                ((iz1.a) ((dy1.v) it.next())).R(view);
            }
            dy1.v vVar = (dy1.v) eVar.f395376f.c(view);
            if (vVar != null) {
                ((iz1.a) vVar).R(view);
            }
        }
    }

    public void Ni(final android.view.View view) {
        if (view == null || !Di()) {
            return;
        }
        sz1.i.c(new java.lang.Runnable() { // from class: kz1.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                uz1.a aVar = kz1.e.this.f395374d;
                android.view.View view2 = view;
                if (aVar.m170825xde2d761f(view2)) {
                    aVar.e(view2);
                }
            }
        });
    }
}
