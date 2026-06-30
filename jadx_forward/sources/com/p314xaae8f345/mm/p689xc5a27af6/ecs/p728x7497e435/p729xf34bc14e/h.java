package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e;

/* loaded from: classes15.dex */
public class h extends android.view.accessibility.AccessibilityNodeProvider {

    /* renamed from: x, reason: collision with root package name */
    public static final int f147213x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f147214y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f147215z;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f147216a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.l f147217b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityManager f147218c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.C10535x6f8a34ab f147219d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.p f147220e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.ContentResolver f147221f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f147222g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f147223h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g f147224i;

    /* renamed from: j, reason: collision with root package name */
    public int f147225j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g f147226k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g f147227l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g f147228m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f147229n;

    /* renamed from: o, reason: collision with root package name */
    public int f147230o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Integer f147231p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.f f147232q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f147233r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f147234s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.k f147235t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener f147236u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener f147237v;

    /* renamed from: w, reason: collision with root package name */
    public final android.database.ContentObserver f147238w;

    static {
        h10.b bVar = h10.b.f359491e;
        f147213x = 60;
        h10.c cVar = h10.c.f359511e;
        f147214y = 10682871;
        f147215z = 267386881;
    }

    public h(android.view.View view, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.l lVar, android.view.accessibility.AccessibilityManager accessibilityManager, android.content.ContentResolver contentResolver, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.p pVar) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.C10535x6f8a34ab c10535x6f8a34ab = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.C10535x6f8a34ab(view, 65536);
        this.f147222g = new java.util.HashMap();
        this.f147223h = new java.util.HashMap();
        boolean z17 = false;
        this.f147225j = 0;
        this.f147229n = new java.util.ArrayList();
        this.f147230o = 0;
        this.f147231p = 0;
        this.f147233r = false;
        this.f147234s = false;
        this.f147235t = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.a(this);
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.b bVar = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.b(this);
        this.f147236u = bVar;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.c cVar = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.c(this, new android.os.Handler());
        this.f147238w = cVar;
        this.f147216a = view;
        this.f147217b = lVar;
        this.f147218c = accessibilityManager;
        this.f147221f = contentResolver;
        this.f147219d = c10535x6f8a34ab;
        this.f147220e = pVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.d dVar = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.d(this, accessibilityManager);
        this.f147237v = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false, null);
        contentResolver.registerContentObserver(android.provider.Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (android.os.Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            int i17 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i17 != Integer.MAX_VALUE && i17 >= 300) {
                z17 = true;
            }
            if (z17) {
                int i18 = this.f147225j;
                h10.a[] aVarArr = h10.a.f359490d;
                this.f147225j = i18 | 8;
            } else {
                int i19 = this.f147225j;
                h10.a[] aVarArr2 = h10.a.f359490d;
                this.f147225j = i19 & (-9);
            }
            int i27 = this.f147225j;
            lVar.f147246d = i27;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("accessibilityFeatureFlags", i27);
                lVar.d("setAccessibilityFeatures", jSONObject);
            } catch (org.json.JSONException e17) {
                io.p3284xd2ae381c.Log.e("AccessibilityChannel", "setAccessibilityFeatures error", e17);
            }
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.mb.p732x373aa5.AbstractC10540x771b4b57) pVar).getClass();
    }

    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.e a(int i17) {
        java.util.Map map = this.f147223h;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.e eVar = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.e) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
        if (eVar != null) {
            return eVar;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.e eVar2 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.e();
        eVar2.f147182b = i17;
        eVar2.f147181a = f147215z + i17;
        ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), eVar2);
        return eVar2;
    }

    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g b(int i17) {
        java.util.Map map = this.f147222g;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
        if (gVar != null) {
            return gVar;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar2 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g(this);
        gVar2.f147188b = i17;
        ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), gVar2);
        return gVar2;
    }

    public final android.view.accessibility.AccessibilityEvent c(int i17, int i18) {
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(i18);
        android.view.View view = this.f147216a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i17);
        return obtain;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i17) {
        boolean z17;
        java.lang.String str;
        int i18;
        int i19;
        int i27;
        boolean z18 = true;
        h(true);
        if (i17 >= 65536) {
            return this.f147219d.m44239x427e11a2(i17);
        }
        java.util.Map map = this.f147222g;
        android.view.View view = this.f147216a;
        if (i17 == -1) {
            android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (((java.util.HashMap) map).containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
        if (gVar == null) {
            return null;
        }
        int i28 = gVar.f147195i;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.p pVar = this.f147220e;
        if (i28 != -1) {
            pVar.getClass();
        }
        android.view.accessibility.AccessibilityNodeInfo obtain2 = android.view.accessibility.AccessibilityNodeInfo.obtain(view, i17);
        int i29 = android.os.Build.VERSION.SDK_INT;
        h10.c cVar = h10.c.f359522s;
        obtain2.setImportantForAccessibility((gVar.f(cVar) || (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.b(gVar) == null && (gVar.f147190d & (-1)) == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        java.lang.String str2 = gVar.f147201o;
        if (str2 != null) {
            obtain2.setViewIdResourceName(str2);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i17);
        obtain2.setFocusable(gVar.h());
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar2 = this.f147226k;
        if (gVar2 != null) {
            obtain2.setFocused(gVar2.f147188b == i17);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar3 = this.f147224i;
        if (gVar3 != null) {
            obtain2.setAccessibilityFocused(gVar3.f147188b == i17);
        }
        h10.c cVar2 = h10.c.f359515i;
        if (gVar.f(cVar2)) {
            obtain2.setPassword(gVar.f(h10.c.f359521r));
            if (!gVar.f(h10.c.A)) {
                obtain2.setClassName("android.widget.EditText");
            }
            obtain2.setEditable(!gVar.f(r15));
            int i37 = gVar.f147193g;
            if (i37 != -1 && (i27 = gVar.f147194h) != -1) {
                obtain2.setTextSelection(i37, i27);
            }
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar4 = this.f147224i;
            if (gVar4 != null && gVar4.f147188b == i17) {
                obtain2.setLiveRegion(1);
            }
            if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359500q)) {
                obtain2.addAction(256);
                i19 = 1;
            } else {
                i19 = 0;
            }
            if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359501r)) {
                obtain2.addAction(512);
                i19 |= 1;
            }
            if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.A)) {
                obtain2.addAction(256);
                i19 |= 2;
            }
            if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.B)) {
                obtain2.addAction(512);
                i19 |= 2;
            }
            obtain2.setMovementGranularities(i19);
            if (gVar.f147191e >= 0) {
                java.lang.String str3 = gVar.f147204r;
                obtain2.setMaxTextLength(((str3 == null ? 0 : str3.length()) - gVar.f147192f) + gVar.f147191e);
            }
        }
        if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359502s)) {
            obtain2.addAction(131072);
        }
        if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359503t)) {
            obtain2.addAction(16384);
        }
        if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359504u)) {
            obtain2.addAction(65536);
        }
        if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359505v)) {
            obtain2.addAction(32768);
        }
        if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.C)) {
            obtain2.addAction(2097152);
        }
        if (gVar.f(h10.c.f359514h)) {
            obtain2.setClassName(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4930x24ae7051.f21227xcdc820b);
        }
        if (gVar.f(h10.c.f359525v)) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359509z)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar5 = gVar.O;
        if (gVar5 != null) {
            obtain2.setParent(view, gVar5.f147188b);
        } else {
            obtain2.setParent(view);
        }
        int i38 = gVar.A;
        if (i38 != -1) {
            obtain2.setTraversalAfter(view, i38);
        }
        android.graphics.Rect rect = gVar.Y;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar6 = gVar.O;
        if (gVar6 != null) {
            android.graphics.Rect rect2 = gVar6.Y;
            android.graphics.Rect rect3 = new android.graphics.Rect(rect);
            rect3.offset(-rect2.left, -rect2.top);
            obtain2.setBoundsInParent(rect3);
        } else {
            obtain2.setBoundsInParent(rect);
        }
        android.graphics.Rect rect4 = new android.graphics.Rect(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect4.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect4);
        obtain2.setVisibleToUser(true);
        obtain2.setEnabled(!gVar.f(h10.c.f359517n) || gVar.f(h10.c.f359518o));
        if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359491e)) {
            if (gVar.S != null) {
                obtain2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(16, gVar.S.f147185e));
                obtain2.setClickable(true);
            } else {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
        } else if (gVar.f(h10.c.C)) {
            obtain2.addAction(16);
            obtain2.setClickable(true);
        }
        if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359492f)) {
            if (gVar.T != null) {
                obtain2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(32, gVar.T.f147185e));
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            }
        }
        h10.b bVar = h10.b.f359493g;
        if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar) || com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359495i) || com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359494h) || com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359496m)) {
            obtain2.setScrollable(true);
            if (gVar.f(h10.c.f359529z)) {
                if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar) || com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359494h)) {
                    if (i(gVar)) {
                        obtain2.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(0, gVar.f147196j, false));
                    } else {
                        obtain2.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (i(gVar)) {
                    obtain2.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(gVar.f147196j, 0, false));
                } else {
                    obtain2.setClassName("android.widget.ScrollView");
                }
            }
            if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar) || com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359495i)) {
                obtain2.addAction(4096);
            }
            if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359494h) || com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359496m)) {
                obtain2.addAction(8192);
            }
        }
        h10.b bVar2 = h10.b.f359497n;
        if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar2) || com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359498o)) {
            obtain2.setClassName("android.widget.SeekBar");
            if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar2)) {
                obtain2.addAction(4096);
            }
            if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359498o)) {
                obtain2.addAction(8192);
            }
        }
        if (gVar.f(h10.c.f359526w)) {
            obtain2.setLiveRegion(1);
        }
        if (gVar.f(cVar2)) {
            obtain2.setText(gVar.d(gVar.f147204r, gVar.f147205s));
            if (i29 >= 28) {
                java.lang.CharSequence[] charSequenceArr = {gVar.d(gVar.f147202p, gVar.f147203q), gVar.d(gVar.f147210x, gVar.f147211y)};
                java.lang.CharSequence charSequence = null;
                int i39 = 0;
                int i47 = 2;
                while (i39 < i47) {
                    java.lang.CharSequence charSequence2 = charSequenceArr[i39];
                    if (charSequence2 == null || charSequence2.length() <= 0) {
                        i18 = 2;
                    } else if (charSequence == null || charSequence.length() == 0) {
                        i18 = 2;
                        charSequence = charSequence2;
                    } else {
                        i18 = 2;
                        charSequence = android.text.TextUtils.concat(charSequence, ", ", charSequence2);
                    }
                    i39++;
                    i47 = i18;
                }
                z17 = false;
                obtain2.setHintText(charSequence);
            } else {
                z17 = false;
            }
        } else {
            z17 = false;
            if (!gVar.f(cVar)) {
                java.lang.CharSequence b17 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.b(gVar);
                if (i29 < 28 && gVar.f147212z != null) {
                    b17 = ((java.lang.Object) (b17 != null ? b17 : "")) + "\n" + gVar.f147212z;
                }
                if (b17 != null) {
                    obtain2.setContentDescription(b17);
                }
            }
        }
        int i48 = android.os.Build.VERSION.SDK_INT;
        if (i48 >= 28 && (str = gVar.f147212z) != null) {
            obtain2.setTooltipText(str);
        }
        boolean f17 = gVar.f(h10.c.f359511e);
        boolean f18 = gVar.f(h10.c.f359527x);
        if (!f17 && !f18) {
            z18 = z17;
        }
        obtain2.setCheckable(z18);
        if (f17) {
            obtain2.setChecked(gVar.f(h10.c.f359512f));
            if (gVar.f(h10.c.f359519p)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
        } else if (f18) {
            obtain2.setChecked(gVar.f(h10.c.f359528y));
            obtain2.setClassName("android.widget.Switch");
        }
        obtain2.setSelected(gVar.f(h10.c.f359513g));
        if (i48 >= 28) {
            obtain2.setHeading(gVar.f(h10.c.f359520q));
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar7 = this.f147224i;
        if (gVar7 == null || gVar7.f147188b != i17) {
            obtain2.addAction(64);
        } else {
            obtain2.addAction(128);
        }
        java.util.List list = gVar.R;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.e eVar = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.e) it.next();
                obtain2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(eVar.f147181a, eVar.f147184d));
            }
        }
        java.util.Iterator it6 = ((java.util.ArrayList) gVar.P).iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar8 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g) it6.next();
            if (!gVar8.f(h10.c.f359524u)) {
                if (gVar8.f147195i != -1) {
                    pVar.getClass();
                    obtain2.addChild(null);
                } else {
                    obtain2.addChild(view, gVar8.f147188b);
                }
            }
        }
        return obtain2;
    }

    public boolean d(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g g17;
        if (!this.f147218c.isTouchExplorationEnabled()) {
            return false;
        }
        java.util.Map map = this.f147222g;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        if (hashMap.isEmpty()) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g g18 = ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g) ((java.util.HashMap) map).get(0)).g(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, false);
        if (g18 != null && g18.f147195i != -1) {
            return this.f147219d.m44242x32e691cd(g18.f147188b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            if (!hashMap.isEmpty() && (g17 = ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g) ((java.util.HashMap) map).get(0)).g(new float[]{x17, y17, 0.0f, 1.0f}, false)) != this.f147228m) {
                if (g17 != null) {
                    f(g17.f147188b, 128);
                }
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar = this.f147228m;
                if (gVar != null) {
                    f(gVar.f147188b, 256);
                }
                this.f147228m = g17;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                io.p3284xd2ae381c.Log.d("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar2 = this.f147228m;
            if (gVar2 != null) {
                f(gVar2.f147188b, 256);
                this.f147228m = null;
            }
        }
        return true;
    }

    public final boolean e(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar, int i17, android.os.Bundle bundle, boolean z17) {
        int i18;
        int i19 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z18 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i27 = gVar.f147193g;
        int i28 = gVar.f147194h;
        if (i28 >= 0 && i27 >= 0) {
            if (i19 != 1) {
                if (i19 != 2) {
                    if (i19 != 4) {
                        if (i19 == 8 || i19 == 16) {
                            if (z17) {
                                gVar.f147194h = gVar.f147204r.length();
                            } else {
                                gVar.f147194h = 0;
                            }
                        }
                    } else if (z17 && i28 < gVar.f147204r.length()) {
                        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(?!^)(\\n)").matcher(gVar.f147204r.substring(gVar.f147194h));
                        if (matcher.find()) {
                            gVar.f147194h += matcher.start(1);
                        } else {
                            gVar.f147194h = gVar.f147204r.length();
                        }
                    } else if (!z17 && gVar.f147194h > 0) {
                        java.util.regex.Matcher matcher2 = java.util.regex.Pattern.compile("(?s:.*)(\\n)").matcher(gVar.f147204r.substring(0, gVar.f147194h));
                        if (matcher2.find()) {
                            gVar.f147194h = matcher2.start(1);
                        } else {
                            gVar.f147194h = 0;
                        }
                    }
                } else if (z17 && i28 < gVar.f147204r.length()) {
                    java.util.regex.Matcher matcher3 = java.util.regex.Pattern.compile("\\p{L}(\\b)").matcher(gVar.f147204r.substring(gVar.f147194h));
                    matcher3.find();
                    if (matcher3.find()) {
                        gVar.f147194h += matcher3.start(1);
                    } else {
                        gVar.f147194h = gVar.f147204r.length();
                    }
                } else if (!z17 && gVar.f147194h > 0) {
                    java.util.regex.Matcher matcher4 = java.util.regex.Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(gVar.f147204r.substring(0, gVar.f147194h));
                    if (matcher4.find()) {
                        gVar.f147194h = matcher4.start(1);
                    }
                }
            } else if (z17 && i28 < gVar.f147204r.length()) {
                gVar.f147194h++;
            } else if (!z17 && (i18 = gVar.f147194h) > 0) {
                gVar.f147194h = i18 - 1;
            }
            if (!z18) {
                gVar.f147193g = gVar.f147194h;
            }
        }
        if (i27 != gVar.f147193g || i28 != gVar.f147194h) {
            java.lang.String str = gVar.f147204r;
            if (str == null) {
                str = "";
            }
            android.view.accessibility.AccessibilityEvent c17 = c(gVar.f147188b, 8192);
            c17.getText().add(str);
            c17.setFromIndex(gVar.f147193g);
            c17.setToIndex(gVar.f147194h);
            c17.setItemCount(str.length());
            g(c17);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.l lVar = this.f147217b;
        if (i19 == 1) {
            if (z17) {
                h10.b bVar = h10.b.f359500q;
                if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar)) {
                    lVar.b(i17, bVar, java.lang.Boolean.valueOf(z18));
                    return true;
                }
            }
            if (!z17) {
                h10.b bVar2 = h10.b.f359501r;
                if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar2)) {
                    lVar.b(i17, bVar2, java.lang.Boolean.valueOf(z18));
                    return true;
                }
            }
        } else if (i19 == 2) {
            if (z17) {
                h10.b bVar3 = h10.b.A;
                if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar3)) {
                    lVar.b(i17, bVar3, java.lang.Boolean.valueOf(z18));
                    return true;
                }
            }
            if (!z17) {
                h10.b bVar4 = h10.b.B;
                if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar4)) {
                    lVar.b(i17, bVar4, java.lang.Boolean.valueOf(z18));
                    return true;
                }
            }
        } else if (i19 == 4 || i19 == 8 || i19 == 16) {
            return true;
        }
        return false;
    }

    public void f(int i17, int i18) {
        if (this.f147218c.isEnabled()) {
            g(c(i17, i18));
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int i17) {
        if (i17 == 1) {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar = this.f147226k;
            if (gVar != null) {
                return createAccessibilityNodeInfo(gVar.f147188b);
            }
        } else if (i17 != 2) {
            return null;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar2 = this.f147224i;
        if (gVar2 != null) {
            return createAccessibilityNodeInfo(gVar2.f147188b);
        }
        return null;
    }

    public final void g(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (this.f147218c.isEnabled()) {
            android.view.View view = this.f147216a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void h(boolean z17) {
        if (this.f147233r == z17) {
            return;
        }
        this.f147233r = z17;
        if (z17) {
            int i17 = this.f147225j;
            h10.a[] aVarArr = h10.a.f359490d;
            this.f147225j = i17 | 1;
        } else {
            int i18 = this.f147225j;
            h10.a[] aVarArr2 = h10.a.f359490d;
            this.f147225j = i18 & (-2);
        }
        int i19 = this.f147225j;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.l lVar = this.f147217b;
        lVar.f147246d = i19;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("accessibilityFeatureFlags", i19);
            lVar.d("setAccessibilityFeatures", jSONObject);
        } catch (org.json.JSONException e17) {
            io.p3284xd2ae381c.Log.e("AccessibilityChannel", "setAccessibilityFeatures error", e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g r6) {
        /*
            r5 = this;
            int r0 = r6.f147196j
            r1 = 0
            if (r0 <= 0) goto L3f
            com.tencent.mm.feature.ecs.nirvana.accessibility.g r0 = r5.f147224i
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1f
            com.tencent.mm.feature.ecs.nirvana.accessibility.g r0 = r0.O
        Ld:
            if (r0 == 0) goto L1a
            if (r0 != r6) goto L13
            r4 = r3
            goto L14
        L13:
            r4 = r1
        L14:
            if (r4 == 0) goto L17
            goto L1b
        L17:
            com.tencent.mm.feature.ecs.nirvana.accessibility.g r0 = r0.O
            goto Ld
        L1a:
            r0 = r2
        L1b:
            if (r0 == 0) goto L1f
            r6 = r3
            goto L20
        L1f:
            r6 = r1
        L20:
            if (r6 != 0) goto L3e
            com.tencent.mm.feature.ecs.nirvana.accessibility.g r6 = r5.f147224i
            if (r6 == 0) goto L3b
            com.tencent.mm.feature.ecs.nirvana.accessibility.g r6 = r6.O
        L28:
            if (r6 == 0) goto L37
            h10.c r0 = h10.c.f359529z
            boolean r0 = r6.f(r0)
            if (r0 == 0) goto L34
            r2 = r6
            goto L37
        L34:
            com.tencent.mm.feature.ecs.nirvana.accessibility.g r6 = r6.O
            goto L28
        L37:
            if (r2 == 0) goto L3b
            r6 = r3
            goto L3c
        L3b:
            r6 = r1
        L3c:
            if (r6 != 0) goto L3f
        L3e:
            r1 = r3
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.h.i(com.tencent.mm.feature.ecs.nirvana.accessibility.g):boolean");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i17, int i18, android.os.Bundle bundle) {
        if (i17 >= 65536) {
            return this.f147219d.m44243x8c1184f7(i17, i18, bundle);
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.f147222g;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g) hashMap.get(java.lang.Integer.valueOf(i17));
        boolean z17 = false;
        if (gVar == null) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.l lVar = this.f147217b;
        switch (i18) {
            case 16:
                lVar.a(i17, h10.b.f359491e);
                return true;
            case 32:
                lVar.a(i17, h10.b.f359492f);
                return true;
            case 64:
                if (this.f147224i == null) {
                    this.f147216a.invalidate();
                }
                this.f147224i = gVar;
                lVar.a(i17, h10.b.f359506w);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", java.lang.Integer.valueOf(gVar.f147188b));
                java.lang.String obj = new lc3.a0(hashMap2).toString();
                io.p3284xd2ae381c.Log.i("AccessibilityChannel", "send accessibility message " + obj);
                gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
                if (tVar == null) {
                    io.p3284xd2ae381c.Log.w("AccessibilityChannel", " service is null");
                } else {
                    iq0.c cVar = lVar.f147244b;
                    if (cVar == null) {
                        io.p3284xd2ae381c.Log.w("AccessibilityChannel", " magicCardStarterHandle is null");
                    } else {
                        ((nq0.p) tVar).Ui(cVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d("accessibilityMessage", obj));
                    }
                }
                f(i17, 32768);
                if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359497n) || com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, h10.b.f359498o)) {
                    f(i17, 4);
                }
                return true;
            case 128:
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar2 = this.f147224i;
                if (gVar2 != null && gVar2.f147188b == i17) {
                    this.f147224i = null;
                }
                lVar.a(i17, h10.b.f359507x);
                f(i17, 65536);
                return true;
            case 256:
                return e(gVar, i17, bundle, true);
            case 512:
                return e(gVar, i17, bundle, false);
            case 4096:
                h10.b bVar = h10.b.f359495i;
                if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar)) {
                    lVar.a(i17, bVar);
                } else {
                    h10.b bVar2 = h10.b.f359493g;
                    if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar2)) {
                        lVar.a(i17, bVar2);
                    } else {
                        h10.b bVar3 = h10.b.f359497n;
                        if (!com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar3)) {
                            return false;
                        }
                        gVar.f147204r = gVar.f147206t;
                        gVar.f147205s = gVar.f147207u;
                        f(i17, 4);
                        lVar.a(i17, bVar3);
                    }
                }
                return true;
            case 8192:
                h10.b bVar4 = h10.b.f359496m;
                if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar4)) {
                    lVar.a(i17, bVar4);
                } else {
                    h10.b bVar5 = h10.b.f359494h;
                    if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar5)) {
                        lVar.a(i17, bVar5);
                    } else {
                        h10.b bVar6 = h10.b.f359498o;
                        if (!com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g.a(gVar, bVar6)) {
                            return false;
                        }
                        gVar.f147204r = gVar.f147208v;
                        gVar.f147205s = gVar.f147209w;
                        f(i17, 4);
                        lVar.a(i17, bVar6);
                    }
                }
                return true;
            case 16384:
                lVar.a(i17, h10.b.f359503t);
                return true;
            case 32768:
                lVar.a(i17, h10.b.f359505v);
                return true;
            case 65536:
                lVar.a(i17, h10.b.f359504u);
                return true;
            case 131072:
                java.util.HashMap hashMap3 = new java.util.HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z17 = true;
                }
                if (z17) {
                    hashMap3.put(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395, java.lang.Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", java.lang.Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395, java.lang.Integer.valueOf(gVar.f147194h));
                    hashMap3.put("extent", java.lang.Integer.valueOf(gVar.f147194h));
                }
                lVar.b(i17, h10.b.f359502s, hashMap3);
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g gVar3 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.g) hashMap.get(java.lang.Integer.valueOf(i17));
                gVar3.f147193g = ((java.lang.Integer) hashMap3.get(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395)).intValue();
                gVar3.f147194h = ((java.lang.Integer) hashMap3.get("extent")).intValue();
                return true;
            case 1048576:
                lVar.a(i17, h10.b.f359509z);
                return true;
            case 2097152:
                java.lang.String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                lVar.b(i17, h10.b.C, string);
                gVar.f147204r = string;
                gVar.f147205s = null;
                return true;
            case android.R.id.accessibilityActionShowOnScreen:
                lVar.a(i17, h10.b.f359499p);
                return true;
            default:
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.e eVar = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p729xf34bc14e.e) ((java.util.HashMap) this.f147223h).get(java.lang.Integer.valueOf(i18 - f147215z));
                if (eVar == null) {
                    return false;
                }
                lVar.b(i17, h10.b.f359508y, java.lang.Integer.valueOf(eVar.f147182b));
                return true;
        }
    }
}
