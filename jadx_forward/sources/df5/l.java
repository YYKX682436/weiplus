package df5;

/* loaded from: classes5.dex */
public final class l extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f313684d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f313685e;

    /* renamed from: f, reason: collision with root package name */
    public final int f313686f;

    /* renamed from: g, reason: collision with root package name */
    public final float f313687g;

    /* renamed from: h, reason: collision with root package name */
    public final int f313688h;

    /* renamed from: i, reason: collision with root package name */
    public final int f313689i;

    /* renamed from: m, reason: collision with root package name */
    public final int f313690m;

    /* renamed from: n, reason: collision with root package name */
    public v11.h f313691n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f313692o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f313693p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f313694q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f313686f = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77832x4b0c7525);
        this.f313687g = android.util.TypedValue.applyDimension(1, i65.a.m(context) * 17.0f, context.getResources().getDisplayMetrics());
        this.f313688h = (int) android.util.TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics());
        this.f313689i = (int) android.util.TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics());
        this.f313690m = (int) android.util.TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics());
        this.f313692o = new java.util.LinkedHashMap();
        this.f313693p = new java.util.ArrayList();
        setOrientation(1);
        this.f313694q = new df5.j(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getActualContainerWidth */
    public final int m124337x4265fb69() {
        java.lang.Object parent = getParent();
        if (parent instanceof android.view.View) {
            if (((android.view.View) parent).getWidth() > 0) {
                return (int) (r0.getWidth() * 0.9f);
            }
        }
        return m124339xe33334eb();
    }

    /* renamed from: getDisabledTextColor */
    private final int m124338x3d0fa664() {
        return com.p314xaae8f345.mm.ui.bk.C() ? getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835) : this.f313686f;
    }

    /* renamed from: getEstimatedContainerWidth */
    private final int m124339xe33334eb() {
        int width;
        java.lang.Object parent = getParent();
        return (int) (((!(parent instanceof android.view.View) || (width = ((android.view.View) parent).getWidth()) <= 0) ? getContext().getResources().getDisplayMetrics().widthPixels * 0.8f : width) * 0.9f);
    }

    public final java.util.List b(java.util.List list, int i17) {
        int measureText;
        if (i17 <= 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kz5.b0.c((v11.e) it.next()));
            }
            return arrayList;
        }
        int i18 = (int) (i17 * 0.7f);
        int i19 = (this.f313689i * 2) + 1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it6 = list.iterator();
        int i27 = 0;
        while (it6.hasNext()) {
            v11.e eVar = (v11.e) it6.next();
            java.lang.String str = eVar.f513889b;
            if (str.length() == 0) {
                measureText = 0;
            } else {
                android.graphics.Paint paint = new android.graphics.Paint();
                paint.setTextSize(this.f313687g);
                paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0));
                measureText = (int) paint.measureText(str);
            }
            if (measureText > i18) {
                if (!arrayList3.isEmpty()) {
                    arrayList2.add(kz5.n0.S0(arrayList3));
                    arrayList3.clear();
                    i27 = 0;
                }
                arrayList2.add(kz5.b0.c(eVar));
            } else {
                int i28 = (arrayList3.isEmpty() ^ true ? i19 + measureText : measureText) + i27;
                if ((!arrayList3.isEmpty()) && (i28 > i17 || arrayList3.size() >= 6)) {
                    arrayList2.add(kz5.n0.S0(arrayList3));
                    arrayList3.clear();
                    i27 = 0;
                }
                arrayList3.add(eVar);
                if (arrayList3.size() > 1) {
                    measureText += i19;
                }
                i27 += measureText;
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(kz5.n0.S0(arrayList3));
        }
        return arrayList2;
    }

    public final android.widget.LinearLayout c(java.util.List list) {
        java.lang.String string;
        int color;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(8388627);
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            v11.e eVar = (v11.e) obj;
            if (i17 > 0) {
                v11.b bVar = eVar.f513893f;
                android.view.View view = new android.view.View(getContext());
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(com.p314xaae8f345.mm.ui.zk.a(view.getContext(), 1), com.p314xaae8f345.mm.ui.zk.a(view.getContext(), 16));
                int i19 = this.f313689i;
                layoutParams.setMarginStart(i19);
                layoutParams.setMarginEnd(i19);
                int i27 = this.f313688h;
                layoutParams.topMargin = i27;
                layoutParams.bottomMargin = i27;
                view.setLayoutParams(layoutParams);
                view.post(new dw3.a(view));
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    color = view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835);
                } else if (ordinal == 1) {
                    color = m124338x3d0fa664();
                } else {
                    if (ordinal != 2) {
                        throw new jz5.j();
                    }
                    color = m124338x3d0fa664();
                }
                view.setBackgroundColor(color);
                ((java.util.ArrayList) this.f313693p).add(view);
                linearLayout.addView(view);
            }
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            df5.g gVar = new df5.g(context);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            int i28 = this.f313690m;
            layoutParams2.topMargin = i28;
            layoutParams2.bottomMargin = i28;
            gVar.setLayoutParams(layoutParams2);
            java.lang.String str = eVar.f513889b;
            v11.b bVar2 = eVar.f513893f;
            gVar.b(str, bVar2);
            if (bVar2 == v11.b.f513862d) {
                gVar.setClickable(true);
                gVar.setOnTouchListener(new df5.h(gVar, this, eVar));
            }
            int ordinal2 = eVar.f513888a.ordinal();
            java.lang.String str2 = eVar.f513889b;
            if (ordinal2 == 0) {
                string = gVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p_v, str2);
            } else {
                if (ordinal2 != 1) {
                    throw new jz5.j();
                }
                string = gVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p_w, str2);
            }
            gVar.setContentDescription(string);
            java.lang.String str3 = eVar.f513894g;
            if (str3.length() > 0) {
                this.f313692o.put(str3, gVar);
            }
            linearLayout.addView(gVar);
            i17 = i18;
        }
        return linearLayout;
    }

    public final void d() {
        for (df5.g gVar : ((java.util.LinkedHashMap) this.f313692o).values()) {
            gVar.f313640v = false;
            android.animation.ValueAnimator valueAnimator = gVar.f313638t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            gVar.f313638t = null;
            gVar.f313639u = 0.0f;
            gVar.invalidate();
        }
        v11.h hVar = this.f313691n;
        if (hVar != null) {
            java.util.List list = hVar.f513926a;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((v11.e) it.next()).b(v11.b.f513862d));
            }
            f(new v11.h(arrayList));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawCallbackManager", "clearPendingCallback: msgSvrId=%d", java.lang.Long.valueOf(qy4.e.f449320a));
            qy4.e.f449320a = 0L;
        }
        removeCallbacks(this.f313694q);
    }

    public final void e(v11.h hVar) {
        this.f313691n = hVar;
        removeAllViews();
        ((java.util.LinkedHashMap) this.f313692o).clear();
        ((java.util.ArrayList) this.f313693p).clear();
        removeCallbacks(this.f313694q);
        if (hVar != null) {
            java.util.List list = hVar.f513926a;
            if (!list.isEmpty()) {
                int i17 = 0;
                setVisibility(0);
                if (list.isEmpty()) {
                    setVisibility(8);
                    return;
                }
                int m124339xe33334eb = m124339xe33334eb();
                java.util.List b17 = b(list, m124339xe33334eb);
                java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    addView(c((java.util.List) next));
                    i17 = i18;
                }
                post(new df5.i(this, m124339xe33334eb, list, b17));
                return;
            }
        }
        setVisibility(8);
    }

    public final void f(v11.h newOptions) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newOptions, "newOptions");
        this.f313691n = newOptions;
        java.util.List<v11.e> list = newOptions.f513926a;
        for (v11.e eVar : list) {
            df5.g gVar = (df5.g) ((java.util.LinkedHashMap) this.f313692o).get(eVar.f513894g);
            if (gVar != null) {
                java.lang.String str = eVar.f513889b;
                v11.b bVar = eVar.f513893f;
                gVar.b(str, bVar);
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    gVar.setClickable(true);
                    gVar.setOnTouchListener(new df5.k(gVar, this, eVar));
                } else if (ordinal == 1 || ordinal == 2) {
                    gVar.setClickable(false);
                    gVar.setFocusable(false);
                    gVar.setOnTouchListener(null);
                    gVar.m124324x76ebfb11(false);
                }
            }
        }
        if (list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f313693p;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = list.size();
        int i17 = 0;
        for (int i18 = 1; i18 < size && i17 < arrayList.size(); i18++) {
            v11.e eVar2 = (v11.e) list.get(i18 - 1);
            v11.e eVar3 = (v11.e) list.get(i18);
            v11.b bVar2 = eVar2.f513893f;
            v11.b bVar3 = v11.b.f513862d;
            ((android.view.View) arrayList.get(i17)).setBackgroundColor(bVar2 == bVar3 && eVar3.f513893f == bVar3 ? getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835) : m124338x3d0fa664());
            i17++;
        }
    }

    /* renamed from: getOnButtonClickListener */
    public final yz5.l m124340x2ec4da35() {
        return this.f313684d;
    }

    /* renamed from: getOnInteractionConsumed */
    public final yz5.a m124341x984bae05() {
        return this.f313685e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    /* renamed from: setOnButtonClickListener */
    public final void m124342xfed78ca9(yz5.l lVar) {
        this.f313684d = lVar;
    }

    /* renamed from: setOnInteractionConsumed */
    public final void m124343x685e6079(yz5.a aVar) {
        this.f313685e = aVar;
    }
}
