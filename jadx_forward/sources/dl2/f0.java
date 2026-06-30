package dl2;

/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f316730a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f316731b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f316732c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f316733d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f316734e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f316735f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f316736g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f316737h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f316738i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.a f316739j;

    /* renamed from: k, reason: collision with root package name */
    public dl2.g f316740k;

    /* renamed from: l, reason: collision with root package name */
    public long f316741l;

    /* renamed from: m, reason: collision with root package name */
    public long f316742m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedHashMap f316743n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f316744o;

    /* renamed from: p, reason: collision with root package name */
    public long f316745p;

    /* renamed from: q, reason: collision with root package name */
    public int f316746q;

    /* renamed from: r, reason: collision with root package name */
    public final int f316747r;

    /* renamed from: s, reason: collision with root package name */
    public final char f316748s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedHashMap f316749t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f316750u;

    /* renamed from: v, reason: collision with root package name */
    public int f316751v;

    /* renamed from: w, reason: collision with root package name */
    public int f316752w;

    public f0(android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f316730a = root;
        this.f316731b = "FinderLiveGiftPkgChooseView";
        this.f316732c = jz5.h.b(new dl2.a0(this));
        this.f316733d = jz5.h.b(new dl2.x(this));
        jz5.g b17 = jz5.h.b(new dl2.y(this));
        jz5.g b18 = jz5.h.b(new dl2.r(this));
        jz5.g b19 = jz5.h.b(new dl2.u(this));
        this.f316734e = b19;
        this.f316735f = jz5.h.b(new dl2.t(this));
        jz5.g b27 = jz5.h.b(new dl2.b0(this));
        this.f316736g = b27;
        jz5.g b28 = jz5.h.b(new dl2.c0(this));
        this.f316737h = b28;
        this.f316740k = new dl2.g(0, 0L, new java.util.LinkedList());
        this.f316743n = new java.util.LinkedHashMap();
        this.f316744o = new java.util.LinkedList();
        this.f316747r = 999;
        this.f316748s = (char) 8197;
        this.f316749t = new java.util.LinkedHashMap();
        this.f316750u = jz5.h.b(dl2.w.f316797d);
        this.f316751v = -1;
        ((android.view.View) ((jz5.n) b17).mo141623x754a37bb()).setOnClickListener(new dl2.h(this));
        ((android.view.View) ((jz5.n) b18).mo141623x754a37bb()).setOnClickListener(new dl2.i(this));
        ((android.view.View) ((jz5.n) b19).mo141623x754a37bb()).setOnClickListener(new dl2.j(this));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) b27).mo141623x754a37bb();
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(root.getContext()));
        c22849x81a93d25.mo7960x6cab2c8d((dl2.p) ((jz5.n) b28).mo141623x754a37bb());
    }

    public final void a(boolean z17) {
        yz5.l lVar;
        jz5.g gVar = this.f316732c;
        if (((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) ((jz5.n) gVar).mo141623x754a37bb()).isShowing) {
            java.util.LinkedHashMap linkedHashMap = this.f316749t;
            linkedHashMap.forEach(dl2.s.f316793a);
            linkedHashMap.clear();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22613xe7040d9c, "<get-reChooseGiftPanel>(...)");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(c22613xe7040d9c, null, 1, null);
            if (z17 && (lVar = this.f316738i) != null) {
                lVar.mo146xb9724478(null);
            }
            android.view.View view = this.f316730a;
            android.content.Context context = view.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                android.view.View currentFocus = activity.getCurrentFocus();
                android.os.IBinder windowToken = currentFocus != null ? currentFocus.getWindowToken() : null;
                if (windowToken != null) {
                    java.lang.Object systemService = view.getContext().getSystemService("input_method");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
                }
            }
            this.f316751v = -1;
        }
    }

    public final void b() {
        java.lang.Object obj;
        java.lang.Object obj2;
        r45.s64 s64Var;
        java.util.Iterator it = this.f316744o.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((r45.s64) obj2).m75939xb282bd08(0) == this.f316746q) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        r45.s64 s64Var2 = (r45.s64) obj2;
        if (s64Var2 == null) {
            return;
        }
        java.util.LinkedList linkedList = this.f316740k.f316755c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj3 : linkedList) {
            dl2.f fVar = (dl2.f) obj3;
            if (fVar.f316728a && fVar.f316729b.m75939xb282bd08(1) > 0) {
                arrayList.add(obj3);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        long j17 = 0;
        while (it6.hasNext()) {
            j17 += r8.f316729b.m75939xb282bd08(1) * (((r45.kv1) this.f316743n.get(((dl2.f) it6.next()).f316729b.m75945x2fec8307(0))) != null ? r9.m75938x746dc8a6(9) : 0.0f);
        }
        this.f316740k.f316754b = j17;
        long j18 = this.f316745p + j17;
        if (j18 <= ((r45.s64) kz5.n0.X(this.f316744o)).m75942xfb822ef2(1)) {
            s64Var = (r45.s64) kz5.n0.X(this.f316744o);
        } else {
            java.util.LinkedList linkedList2 = this.f316744o;
            java.util.ListIterator listIterator = linkedList2.listIterator(linkedList2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                java.lang.Object previous = listIterator.previous();
                if (j18 >= ((r45.s64) previous).m75942xfb822ef2(1)) {
                    obj = previous;
                    break;
                }
            }
            s64Var = (r45.s64) obj;
            if (s64Var == null) {
                s64Var = (r45.s64) kz5.n0.i0(this.f316744o);
            }
        }
        int m75939xb282bd08 = s64Var.m75939xb282bd08(0);
        long m75942xfb822ef2 = s64Var2.m75942xfb822ef2(1);
        android.view.View view = this.f316730a;
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(view.getContext(), com.p314xaae8f345.mm.R.raw.f78868xd4a8b967, i65.a.d(view.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaq));
        e17.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        al5.w wVar = new al5.w(e17, 1);
        int i17 = this.f316746q;
        jz5.g gVar = this.f316734e;
        jz5.g gVar2 = this.f316735f;
        if (m75939xb282bd08 < i17) {
            android.text.SpannableString spannableString = new android.text.SpannableString(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.din, java.lang.Long.valueOf(m75942xfb822ef2 - j18)));
            java.lang.String string = view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dio);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            int K = r26.n0.K(spannableString, this.f316748s, 0, false, 6, null);
            spannableString.setSpan(wVar, K, K + 1, 34);
            int L = r26.n0.L(spannableString, string, 0, false, 6, null);
            if (L >= 0 && string.length() + L < spannableString.length()) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y)), L, string.length() + L, 34);
            }
            ((android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb()).setText(spannableString);
            this.f316740k.f316753a = this.f316746q;
            ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setEnabled(false);
            return;
        }
        if (i17 < m75939xb282bd08) {
            android.text.SpannableString spannableString2 = new android.text.SpannableString(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dil, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(m75939xb282bd08)));
            int K2 = r26.n0.K(spannableString2, this.f316748s, 0, false, 6, null);
            spannableString2.setSpan(wVar, K2, K2 + 1, 34);
            ((android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb()).setText(spannableString2);
            this.f316740k.f316753a = m75939xb282bd08;
            ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setEnabled(true);
            return;
        }
        android.text.SpannableString spannableString3 = new android.text.SpannableString(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dim, java.lang.Long.valueOf(j17)));
        int K3 = r26.n0.K(spannableString3, this.f316748s, 0, false, 6, null);
        spannableString3.setSpan(wVar, K3, K3 + 1, 34);
        ((android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb()).setText(spannableString3);
        this.f316740k.f316753a = this.f316746q;
        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setEnabled(true);
    }
}
