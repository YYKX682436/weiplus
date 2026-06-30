package fi2;

/* loaded from: classes10.dex */
public final class k implements fi2.l {

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.List f344402l = kz5.c0.i(2, 3, 4);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f344403a;

    /* renamed from: b, reason: collision with root package name */
    public final lj2.v0 f344404b;

    /* renamed from: c, reason: collision with root package name */
    public final lj2.x0 f344405c;

    /* renamed from: d, reason: collision with root package name */
    public final int f344406d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f344407e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f344408f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f344409g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f344410h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f344411i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 f344412j;

    /* renamed from: k, reason: collision with root package name */
    public r45.xn1 f344413k;

    public k(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 widgetService, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widgetService, "widgetService");
        this.f344403a = context;
        this.f344404b = pluginAbility;
        this.f344405c = widgetService;
        this.f344406d = i17;
        this.f344407e = jz5.h.b(new fi2.h(this));
        this.f344408f = jz5.h.b(new fi2.e(this));
        this.f344409g = jz5.h.b(new fi2.g(this));
        this.f344410h = jz5.h.b(new fi2.j(this));
        this.f344411i = jz5.h.b(new fi2.f(this));
    }

    @Override // fi2.l
    public void b(java.util.Map micUserMap, boolean z17, java.lang.String anchorUserId) {
        android.widget.LinearLayout chatContentLayout;
        km2.q qVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserMap, "micUserMap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserId, "anchorUserId");
        java.lang.Object obj = null;
        if (!f()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f344412j;
            if (c14245x86828950 == null || (chatContentLayout = c14245x86828950.getChatContentLayout()) == null) {
                return;
            }
            int childCount = chatContentLayout.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = chatContentLayout.getChildAt(i17);
                oj2.c cVar = childAt instanceof oj2.c ? (oj2.c) childAt : null;
                if (cVar != null) {
                    cVar.a0(z17);
                }
                android.view.View childAt2 = chatContentLayout.getChildAt(i17);
                wj2.w wVar = childAt2 instanceof wj2.w ? (wj2.w) childAt2 : null;
                if (wVar != null) {
                    xh2.a m145852x5565c7c2 = wVar.m145852x5565c7c2();
                    wVar.I((m145852x5565c7c2 == null || (qVar = m145852x5565c7c2.f536053a) == null || !qVar.f390716n) ? false : true);
                }
            }
            return;
        }
        java.util.List V = kz5.n0.V(micUserMap.values());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) V).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (!((km2.q) next).f390716n) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        if (it6.hasNext()) {
            obj = it6.next();
            if (it6.hasNext()) {
                int i18 = ((km2.q) obj).f390725w;
                do {
                    java.lang.Object next2 = it6.next();
                    int i19 = ((km2.q) next2).f390725w;
                    if (i18 > i19) {
                        obj = next2;
                        i18 = i19;
                    }
                } while (it6.hasNext());
            }
        }
        km2.q qVar2 = (km2.q) obj;
        if (qVar2 != null) {
            this.f344413k = qVar2.f390720r;
            ci2.n e17 = e();
            r45.xn1 xn1Var = qVar2.f390720r;
            e17.getClass();
            pm0.v.X(new ci2.m(e17, xn1Var, true));
            return;
        }
        if (this.f344413k != null) {
            ci2.n e18 = e();
            r45.xn1 xn1Var2 = this.f344413k;
            e18.getClass();
            pm0.v.X(new ci2.m(e18, xn1Var2, false));
            return;
        }
        km2.q qVar3 = (km2.q) micUserMap.get(anchorUserId);
        if (qVar3 != null) {
            ci2.n e19 = e();
            r45.xn1 xn1Var3 = qVar3.f390720r;
            e19.getClass();
            pm0.v.X(new ci2.m(e19, xn1Var3, false));
        }
    }

    @Override // fi2.l
    public void c(xh2.e micTopicData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micTopicData, "micTopicData");
        if (f()) {
            return;
        }
        ((ci2.d) ((jz5.n) this.f344407e).mo141623x754a37bb()).b(micTopicData);
    }

    public final gi2.e d() {
        if (f()) {
            return (gi2.e) ((jz5.n) this.f344411i).mo141623x754a37bb();
        }
        return this.f344406d == 1 ? (gi2.e) ((jz5.n) this.f344409g).mo141623x754a37bb() : (gi2.e) ((jz5.n) this.f344408f).mo141623x754a37bb();
    }

    public final ci2.n e() {
        return (ci2.n) ((jz5.n) this.f344410h).mo141623x754a37bb();
    }

    public final boolean f() {
        return f344402l.contains(java.lang.Integer.valueOf(this.f344406d));
    }

    public final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        jz5.g gVar = this.f344407e;
        android.view.ViewParent parent = ((ci2.d) ((jz5.n) gVar).mo141623x754a37bb()).getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView((ci2.d) ((jz5.n) gVar).mo141623x754a37bb());
        }
        android.view.ViewParent parent2 = e().getParent();
        android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(e());
        }
        it.getChatVoiceRoomContentLayout().removeAllViews();
        this.f344412j = it;
        if (f()) {
            it.getChatVoiceRoomContentLayout().addView(e(), new android.view.ViewGroup.LayoutParams(-1, -1));
        } else {
            it.getChatVoiceRoomContentLayout().addView((ci2.d) ((jz5.n) gVar).mo141623x754a37bb(), new android.view.ViewGroup.LayoutParams(-1, -2));
        }
    }
}
