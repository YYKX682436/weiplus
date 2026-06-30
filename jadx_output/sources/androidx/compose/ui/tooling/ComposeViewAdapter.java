package androidx.compose.ui.tooling;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fB!\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010\"R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR(\u0010\u0019\u001a\u00020\u00108\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter;", "Landroid/widget/FrameLayout;", "", "Lm2/j0;", "g", "Ljava/util/List;", "getViewInfos$ui_tooling_release", "()Ljava/util/List;", "setViewInfos$ui_tooling_release", "(Ljava/util/List;)V", "viewInfos", "", "h", "getDesignInfoList$ui_tooling_release", "setDesignInfoList$ui_tooling_release", "designInfoList", "Ln2/d;", org.chromium.base.BaseSwitches.V, "Ln2/d;", "getClock$ui_tooling_release", "()Ln2/d;", "setClock$ui_tooling_release", "(Ln2/d;)V", "getClock$ui_tooling_release$annotations", "()V", "clock", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-tooling_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes14.dex */
public final class ComposeViewAdapter extends android.widget.FrameLayout {
    public static final /* synthetic */ int A = 0;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.platform.ComposeView f10835d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10836e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10837f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public java.util.List viewInfos;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public java.util.List designInfoList;

    /* renamed from: i, reason: collision with root package name */
    public final m2.a0 f10840i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f10841m;

    /* renamed from: n, reason: collision with root package name */
    public final m2.i0 f10842n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.p f10843o;

    /* renamed from: p, reason: collision with root package name */
    public final n0.v2 f10844p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10845q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10846r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f10847s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.a f10848t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Paint f10849u;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public n2.d clock;

    /* renamed from: w, reason: collision with root package name */
    public final m2.i f10851w;

    /* renamed from: x, reason: collision with root package name */
    public final m2.j f10852x;

    /* renamed from: y, reason: collision with root package name */
    public final m2.h f10853y;

    /* renamed from: z, reason: collision with root package name */
    public final m2.g f10854z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapter(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "context");
        this.f10835d = new androidx.compose.ui.platform.ComposeView(context2, null, 0, 6, null);
        kz5.p0 p0Var = kz5.p0.f313996d;
        this.viewInfos = p0Var;
        this.designInfoList = p0Var;
        this.f10840i = new m2.b0();
        this.f10841m = "";
        this.f10842n = new m2.i0();
        this.f10843o = m2.e.f322910b;
        this.f10844p = n0.s4.c(m2.z.f322964a, null, 2, null);
        this.f10847s = "";
        this.f10848t = m2.y.f322963d;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setPathEffect(new android.graphics.DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(e1.a0.h(e1.y.f246316g));
        this.f10849u = paint;
        this.f10851w = new m2.i();
        this.f10852x = new m2.j();
        this.f10853y = new m2.h(this);
        this.f10854z = new m2.g();
        f(attrs);
    }

    public static final void a(androidx.compose.ui.tooling.ComposeViewAdapter composeViewAdapter, yz5.p pVar, n0.o oVar, int i17) {
        composeViewAdapter.getClass();
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(493526445);
        n0.h3 h3Var = androidx.compose.ui.platform.m2.f10648g;
        android.content.Context context = composeViewAdapter.getContext();
        kotlin.jvm.internal.o.f(context, "context");
        n0.i3 b17 = h3Var.b(new m2.e0(context));
        n0.h3 h3Var2 = androidx.compose.ui.platform.m2.f10649h;
        android.content.Context context2 = composeViewAdapter.getContext();
        kotlin.jvm.internal.o.f(context2, "context");
        n0.i3 b18 = h3Var2.b(f2.m.a(context2));
        n0.h3 h3Var3 = f.q.f257993a;
        m2.h dispatcherOwner = composeViewAdapter.f10853y;
        kotlin.jvm.internal.o.g(dispatcherOwner, "dispatcherOwner");
        n0.i3 b19 = f.q.f257993a.b(dispatcherOwner);
        n0.h3 h3Var4 = f.o.f257991a;
        m2.g registryOwner = composeViewAdapter.f10854z;
        kotlin.jvm.internal.o.g(registryOwner, "registryOwner");
        n0.n1.a(new n0.i3[]{b17, b18, b19, f.o.f257991a.b(registryOwner)}, u0.j.b(y0Var, -1966112531, true, new m2.k(composeViewAdapter, pVar, i17)), y0Var, 56);
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new m2.l(composeViewAdapter, pVar, i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public static final java.util.List b(java.util.List list, androidx.compose.ui.tooling.ComposeViewAdapter composeViewAdapter) {
        z.l2 l2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            o2.c cVar = (o2.c) kz5.n0.Z(composeViewAdapter.c((o2.c) it.next(), m2.q.f322939d, true));
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.util.Iterator it7 = ((o2.c) it6.next()).f342335f.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    l2Var = 0;
                    break;
                }
                l2Var = it7.next();
                if (l2Var instanceof z.l2) {
                    break;
                }
            }
            z.l2 l2Var2 = l2Var instanceof z.l2 ? l2Var : null;
            if (l2Var2 != null) {
                arrayList2.add(l2Var2);
            }
        }
        return arrayList2;
    }

    public static /* synthetic */ void getClock$ui_tooling_release$annotations() {
    }

    private static /* synthetic */ void getContent$annotations() {
    }

    public final java.util.List c(o2.c cVar, yz5.l lVar, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List k17 = kz5.c0.k(cVar);
        while (!k17.isEmpty()) {
            o2.c cVar2 = (o2.c) kz5.h0.D(k17);
            if (((java.lang.Boolean) lVar.invoke(cVar2)).booleanValue()) {
                if (z17) {
                    return kz5.b0.c(cVar2);
                }
                arrayList.add(cVar2);
            }
            k17.addAll(cVar2.f342336g);
        }
        return arrayList;
    }

    public final java.lang.reflect.Method d(java.lang.Object obj) {
        try {
            java.lang.Class<?> cls = obj.getClass();
            java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
            return cls.getDeclaredMethod("getDesignInfo", cls2, cls2, java.lang.String.class);
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f10845q) {
            yz5.p pVar = m2.e.f322911c;
            n0.v2 v2Var = this.f10844p;
            v2Var.setValue(pVar);
            v2Var.setValue(this.f10843o);
            invalidate();
        }
        this.f10848t.invoke();
        if (this.f10837f) {
            java.util.List<m2.j0> list = this.viewInfos;
            java.util.ArrayList<m2.j0> arrayList = new java.util.ArrayList();
            for (m2.j0 j0Var : list) {
                kz5.h0.u(arrayList, kz5.n0.t0(kz5.b0.c(j0Var), j0Var.a()));
            }
            for (m2.j0 j0Var2 : arrayList) {
                p2.o oVar = j0Var2.f322927c;
                if (((oVar.f351394d == 0 || oVar.f351393c == 0) ? false : true) && canvas != null) {
                    p2.o oVar2 = j0Var2.f322927c;
                    canvas.drawRect(new android.graphics.Rect(oVar2.f351391a, oVar2.f351392b, oVar2.f351393c, oVar2.f351394d), this.f10849u);
                }
            }
        }
    }

    public final boolean e(o2.c cVar) {
        java.lang.String str;
        o2.k kVar = cVar.f342332c;
        if (kVar == null || (str = kVar.f342361d) == null) {
            str = "";
        }
        if (str.length() == 0) {
            o2.k kVar2 = cVar.f342332c;
            if ((kVar2 != null ? kVar2.f342358a : -1) == -1) {
                return true;
            }
        }
        return false;
    }

    public final void f(android.util.AttributeSet attributeSet) {
        long j17;
        m2.i iVar = this.f10851w;
        setTag(com.tencent.mm.R.id.p28, iVar);
        o4.j.b(this, iVar);
        setTag(com.tencent.mm.R.id.p2_, this.f10852x);
        androidx.compose.ui.platform.ComposeView composeView = this.f10835d;
        addView(composeView);
        java.lang.String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/tools", "composableName");
        if (attributeValue == null) {
            return;
        }
        java.lang.Class<?> cls = null;
        java.lang.String t07 = r26.n0.t0(attributeValue, '.', null, 2, null);
        java.lang.String o07 = r26.n0.o0(attributeValue, '.', attributeValue);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
        java.lang.String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
        if (attributeValue2 != null) {
            try {
                cls = java.lang.Class.forName(attributeValue2);
            } catch (java.lang.ClassNotFoundException unused) {
            }
        }
        java.lang.Class<?> cls2 = cls;
        try {
            java.lang.String attributeValue3 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime");
            kotlin.jvm.internal.o.f(attributeValue3, "attrs.getAttributeValue(…animationClockStartTime\")");
            j17 = java.lang.Long.parseLong(attributeValue3);
        } catch (java.lang.Exception unused2) {
            j17 = -1;
        }
        boolean attributeBooleanValue = attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "forceCompositionInvalidation", false);
        boolean attributeBooleanValue2 = attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.f10837f);
        boolean attributeBooleanValue3 = attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.f10836e);
        boolean attributeBooleanValue4 = attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.f10846r);
        java.lang.String attributeValue4 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument");
        m2.s sVar = m2.s.f322941d;
        m2.t tVar = m2.t.f322942d;
        this.f10837f = attributeBooleanValue2;
        this.f10836e = attributeBooleanValue3;
        this.f10841m = o07;
        this.f10845q = attributeBooleanValue;
        this.f10846r = attributeBooleanValue4;
        if (attributeValue4 == null) {
            attributeValue4 = "";
        }
        this.f10847s = attributeValue4;
        this.f10848t = tVar;
        u0.a c17 = u0.j.c(-1704541905, true, new m2.x(sVar, this, j17, t07, o07, cls2, attributeIntValue));
        this.f10843o = c17;
        composeView.setContent(c17);
        invalidate();
    }

    public final m2.j0 g(o2.c cVar) {
        java.lang.String str;
        int size = cVar.f342336g.size();
        java.util.Collection collection = cVar.f342336g;
        if (size == 1 && e(cVar)) {
            return g((o2.c) kz5.n0.y0(collection));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            o2.c cVar2 = (o2.c) obj;
            if (!(e(cVar2) && cVar2.f342336g.isEmpty())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(g((o2.c) it.next()));
        }
        o2.k kVar = cVar.f342332c;
        if (kVar == null || (str = kVar.f342361d) == null) {
            str = "";
        }
        return new m2.j0(str, kVar != null ? kVar.f342358a : -1, cVar.f342334e, kVar, arrayList2);
    }

    public final n2.d getClock$ui_tooling_release() {
        n2.d dVar = this.clock;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.o.o("clock");
        throw null;
    }

    public final java.util.List<java.lang.String> getDesignInfoList$ui_tooling_release() {
        return this.designInfoList;
    }

    public final java.util.List<m2.j0> getViewInfos$ui_tooling_release() {
        return this.viewInfos;
    }

    public final void h(m2.j0 j0Var, int i17) {
        r26.i0.s("|  ", i17);
        java.util.Objects.toString(j0Var);
        java.util.Iterator it = j0Var.f322929e.iterator();
        while (it.hasNext()) {
            h((m2.j0) it.next(), i17 + 1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.f10835d.getRootView().setTag(com.tencent.mm.R.id.p28, this.f10851w);
        super.onAttachedToWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.lang.String str;
        java.lang.Object obj;
        java.lang.Object obj2;
        super.onLayout(z17, i17, i18, i19, i27);
        m2.i0 i0Var = this.f10842n;
        synchronized (i0Var.f322923b) {
            java.lang.Throwable th6 = i0Var.f322922a;
            if (th6 != null) {
                i0Var.f322922a = null;
                throw th6;
            }
        }
        java.util.Set set = ((m2.b0) this.f10840i).f322903a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(set, 10));
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(o2.i.b((y0.a) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(g((o2.c) it6.next()));
        }
        java.util.List S0 = kz5.n0.S0(arrayList2);
        this.viewInfos = S0;
        if (this.f10836e) {
            java.util.Iterator it7 = S0.iterator();
            while (it7.hasNext()) {
                h((m2.j0) it7.next(), 0);
            }
        }
        if (this.f10841m.length() > 0) {
            java.util.Set set2 = ((m2.b0) this.f10840i).f322903a;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(set2, 10));
            java.util.Iterator it8 = set2.iterator();
            while (it8.hasNext()) {
                arrayList3.add(o2.i.b((y0.a) it8.next()));
            }
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
            java.util.LinkedHashSet linkedHashSet3 = new java.util.LinkedHashSet();
            java.util.Iterator it9 = arrayList3.iterator();
            while (it9.hasNext()) {
                o2.c cVar = (o2.c) it9.next();
                linkedHashSet.addAll(b(c(cVar, m2.m.f322936d, false), this));
                java.util.List c17 = c(cVar, m2.n.f322937d, false);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.Iterator it10 = c17.iterator();
                while (it10.hasNext()) {
                    java.util.Iterator it11 = ((o2.c) it10.next()).f342336g.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            obj2 = it11.next();
                            if (kotlin.jvm.internal.o.b(((o2.c) obj2).f342331b, "updateTransition")) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    o2.c cVar2 = (o2.c) obj2;
                    if (cVar2 != null) {
                        arrayList4.add(cVar2);
                    }
                }
                linkedHashSet2.addAll(b(arrayList4, this));
                java.util.List c18 = c(cVar, m2.o.f322938d, false);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.util.Iterator it12 = c18.iterator();
                while (it12.hasNext()) {
                    java.util.Iterator it13 = ((o2.c) it12.next()).f342336g.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            obj = it13.next();
                            if (kotlin.jvm.internal.o.b(((o2.c) obj).f342331b, "updateTransition")) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    o2.c cVar3 = (o2.c) obj;
                    if (cVar3 != null) {
                        arrayList5.add(cVar3);
                    }
                }
                linkedHashSet3.addAll(b(arrayList5, this));
                linkedHashSet.removeAll(linkedHashSet2);
                linkedHashSet.removeAll(linkedHashSet3);
            }
            if (!(!linkedHashSet.isEmpty())) {
                linkedHashSet2.isEmpty();
            }
            if (this.clock != null) {
                java.util.Iterator it14 = linkedHashSet.iterator();
                while (it14.hasNext()) {
                    getClock$ui_tooling_release().b((z.l2) it14.next());
                }
                java.util.Iterator it15 = linkedHashSet2.iterator();
                while (it15.hasNext()) {
                    getClock$ui_tooling_release().a((z.l2) it15.next(), new m2.p(this));
                }
            }
            if (this.f10846r) {
                java.util.Set set3 = ((m2.b0) this.f10840i).f322903a;
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(set3, 10));
                java.util.Iterator it16 = set3.iterator();
                while (it16.hasNext()) {
                    arrayList6.add(o2.i.b((y0.a) it16.next()));
                }
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.util.Iterator it17 = arrayList6.iterator();
                loop12: while (it17.hasNext()) {
                    java.util.List<o2.c> c19 = c((o2.c) it17.next(), new m2.r(this), false);
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    for (o2.c cVar4 : c19) {
                        java.util.Iterator it18 = cVar4.f342336g.iterator();
                        while (true) {
                            if (!it18.hasNext()) {
                                break;
                            }
                            java.util.Iterator it19 = ((o2.c) it18.next()).f342335f.iterator();
                            while (it19.hasNext()) {
                                java.lang.Object next = it19.next();
                                if ((next != null ? d(next) : null) != null) {
                                    p2.o oVar = cVar4.f342334e;
                                    int i28 = oVar.f351391a;
                                    int i29 = oVar.f351392b;
                                    java.lang.reflect.Method d17 = d(next);
                                    if (d17 != null) {
                                        try {
                                            java.lang.Object invoke = d17.invoke(next, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), this.f10847s);
                                            if (invoke == null) {
                                                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                                                break loop12;
                                            } else {
                                                str = (java.lang.String) invoke;
                                                if (str.length() == 0) {
                                                }
                                            }
                                        } catch (java.lang.Exception unused) {
                                        }
                                    }
                                }
                            }
                        }
                        str = null;
                        if (str != null) {
                            arrayList8.add(str);
                        }
                    }
                    kz5.h0.u(arrayList7, arrayList8);
                }
                this.designInfoList = arrayList7;
            }
        }
    }

    public final void setClock$ui_tooling_release(n2.d dVar) {
        kotlin.jvm.internal.o.g(dVar, "<set-?>");
        this.clock = dVar;
    }

    public final void setDesignInfoList$ui_tooling_release(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.o.g(list, "<set-?>");
        this.designInfoList = list;
    }

    public final void setViewInfos$ui_tooling_release(java.util.List<m2.j0> list) {
        kotlin.jvm.internal.o.g(list, "<set-?>");
        this.viewInfos = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapter(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "context");
        this.f10835d = new androidx.compose.ui.platform.ComposeView(context2, null, 0, 6, null);
        kz5.p0 p0Var = kz5.p0.f313996d;
        this.viewInfos = p0Var;
        this.designInfoList = p0Var;
        this.f10840i = new m2.b0();
        this.f10841m = "";
        this.f10842n = new m2.i0();
        this.f10843o = m2.e.f322910b;
        this.f10844p = n0.s4.c(m2.z.f322964a, null, 2, null);
        this.f10847s = "";
        this.f10848t = m2.y.f322963d;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setPathEffect(new android.graphics.DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(e1.a0.h(e1.y.f246316g));
        this.f10849u = paint;
        this.f10851w = new m2.i();
        this.f10852x = new m2.j();
        this.f10853y = new m2.h(this);
        this.f10854z = new m2.g();
        f(attrs);
    }
}
