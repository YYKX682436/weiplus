package com.tencent.mm.feature.ecs.nirvana.accessibility;

/* loaded from: classes15.dex */
public class h extends android.view.accessibility.AccessibilityNodeProvider {

    /* renamed from: x, reason: collision with root package name */
    public static final int f65680x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f65681y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f65682z;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f65683a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.nirvana.accessibility.l f65684b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityManager f65685c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.nirvana.accessibility.AccessibilityViewEmbedder f65686d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.nirvana.accessibility.p f65687e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.ContentResolver f65688f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f65689g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f65690h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.feature.ecs.nirvana.accessibility.g f65691i;

    /* renamed from: j, reason: collision with root package name */
    public int f65692j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.feature.ecs.nirvana.accessibility.g f65693k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.feature.ecs.nirvana.accessibility.g f65694l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.feature.ecs.nirvana.accessibility.g f65695m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f65696n;

    /* renamed from: o, reason: collision with root package name */
    public int f65697o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Integer f65698p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.feature.ecs.nirvana.accessibility.f f65699q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f65700r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f65701s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.nirvana.accessibility.k f65702t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener f65703u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener f65704v;

    /* renamed from: w, reason: collision with root package name */
    public final android.database.ContentObserver f65705w;

    static {
        h10.b bVar = h10.b.f277958e;
        f65680x = 60;
        h10.c cVar = h10.c.f277978e;
        f65681y = 10682871;
        f65682z = 267386881;
    }

    public h(android.view.View view, com.tencent.mm.feature.ecs.nirvana.accessibility.l lVar, android.view.accessibility.AccessibilityManager accessibilityManager, android.content.ContentResolver contentResolver, com.tencent.mm.feature.ecs.nirvana.accessibility.p pVar) {
        com.tencent.mm.feature.ecs.nirvana.accessibility.AccessibilityViewEmbedder accessibilityViewEmbedder = new com.tencent.mm.feature.ecs.nirvana.accessibility.AccessibilityViewEmbedder(view, 65536);
        this.f65689g = new java.util.HashMap();
        this.f65690h = new java.util.HashMap();
        boolean z17 = false;
        this.f65692j = 0;
        this.f65696n = new java.util.ArrayList();
        this.f65697o = 0;
        this.f65698p = 0;
        this.f65700r = false;
        this.f65701s = false;
        this.f65702t = new com.tencent.mm.feature.ecs.nirvana.accessibility.a(this);
        com.tencent.mm.feature.ecs.nirvana.accessibility.b bVar = new com.tencent.mm.feature.ecs.nirvana.accessibility.b(this);
        this.f65703u = bVar;
        com.tencent.mm.feature.ecs.nirvana.accessibility.c cVar = new com.tencent.mm.feature.ecs.nirvana.accessibility.c(this, new android.os.Handler());
        this.f65705w = cVar;
        this.f65683a = view;
        this.f65684b = lVar;
        this.f65685c = accessibilityManager;
        this.f65688f = contentResolver;
        this.f65686d = accessibilityViewEmbedder;
        this.f65687e = pVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        com.tencent.mm.feature.ecs.nirvana.accessibility.d dVar = new com.tencent.mm.feature.ecs.nirvana.accessibility.d(this, accessibilityManager);
        this.f65704v = dVar;
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
                int i18 = this.f65692j;
                h10.a[] aVarArr = h10.a.f277957d;
                this.f65692j = i18 | 8;
            } else {
                int i19 = this.f65692j;
                h10.a[] aVarArr2 = h10.a.f277957d;
                this.f65692j = i19 & (-9);
            }
            int i27 = this.f65692j;
            lVar.f65713d = i27;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("accessibilityFeatureFlags", i27);
                lVar.d("setAccessibilityFeatures", jSONObject);
            } catch (org.json.JSONException e17) {
                io.flutter.Log.e("AccessibilityChannel", "setAccessibilityFeatures error", e17);
            }
        }
        ((com.tencent.mm.feature.ecs.nirvana.mb.view.MagicEcsNirvanaCanvasViewContainer) pVar).getClass();
    }

    public final com.tencent.mm.feature.ecs.nirvana.accessibility.e a(int i17) {
        java.util.Map map = this.f65690h;
        com.tencent.mm.feature.ecs.nirvana.accessibility.e eVar = (com.tencent.mm.feature.ecs.nirvana.accessibility.e) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
        if (eVar != null) {
            return eVar;
        }
        com.tencent.mm.feature.ecs.nirvana.accessibility.e eVar2 = new com.tencent.mm.feature.ecs.nirvana.accessibility.e();
        eVar2.f65649b = i17;
        eVar2.f65648a = f65682z + i17;
        ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), eVar2);
        return eVar2;
    }

    public final com.tencent.mm.feature.ecs.nirvana.accessibility.g b(int i17) {
        java.util.Map map = this.f65689g;
        com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar = (com.tencent.mm.feature.ecs.nirvana.accessibility.g) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
        if (gVar != null) {
            return gVar;
        }
        com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar2 = new com.tencent.mm.feature.ecs.nirvana.accessibility.g(this);
        gVar2.f65655b = i17;
        ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), gVar2);
        return gVar2;
    }

    public final android.view.accessibility.AccessibilityEvent c(int i17, int i18) {
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(i18);
        android.view.View view = this.f65683a;
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
            return this.f65686d.createAccessibilityNodeInfo(i17);
        }
        java.util.Map map = this.f65689g;
        android.view.View view = this.f65683a;
        if (i17 == -1) {
            android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (((java.util.HashMap) map).containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar = (com.tencent.mm.feature.ecs.nirvana.accessibility.g) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
        if (gVar == null) {
            return null;
        }
        int i28 = gVar.f65662i;
        com.tencent.mm.feature.ecs.nirvana.accessibility.p pVar = this.f65687e;
        if (i28 != -1) {
            pVar.getClass();
        }
        android.view.accessibility.AccessibilityNodeInfo obtain2 = android.view.accessibility.AccessibilityNodeInfo.obtain(view, i17);
        int i29 = android.os.Build.VERSION.SDK_INT;
        h10.c cVar = h10.c.f277989s;
        obtain2.setImportantForAccessibility((gVar.f(cVar) || (com.tencent.mm.feature.ecs.nirvana.accessibility.g.b(gVar) == null && (gVar.f65657d & (-1)) == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        java.lang.String str2 = gVar.f65668o;
        if (str2 != null) {
            obtain2.setViewIdResourceName(str2);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i17);
        obtain2.setFocusable(gVar.h());
        com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar2 = this.f65693k;
        if (gVar2 != null) {
            obtain2.setFocused(gVar2.f65655b == i17);
        }
        com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar3 = this.f65691i;
        if (gVar3 != null) {
            obtain2.setAccessibilityFocused(gVar3.f65655b == i17);
        }
        h10.c cVar2 = h10.c.f277982i;
        if (gVar.f(cVar2)) {
            obtain2.setPassword(gVar.f(h10.c.f277988r));
            if (!gVar.f(h10.c.A)) {
                obtain2.setClassName("android.widget.EditText");
            }
            obtain2.setEditable(!gVar.f(r15));
            int i37 = gVar.f65660g;
            if (i37 != -1 && (i27 = gVar.f65661h) != -1) {
                obtain2.setTextSelection(i37, i27);
            }
            com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar4 = this.f65691i;
            if (gVar4 != null && gVar4.f65655b == i17) {
                obtain2.setLiveRegion(1);
            }
            if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277967q)) {
                obtain2.addAction(256);
                i19 = 1;
            } else {
                i19 = 0;
            }
            if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277968r)) {
                obtain2.addAction(512);
                i19 |= 1;
            }
            if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.A)) {
                obtain2.addAction(256);
                i19 |= 2;
            }
            if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.B)) {
                obtain2.addAction(512);
                i19 |= 2;
            }
            obtain2.setMovementGranularities(i19);
            if (gVar.f65658e >= 0) {
                java.lang.String str3 = gVar.f65671r;
                obtain2.setMaxTextLength(((str3 == null ? 0 : str3.length()) - gVar.f65659f) + gVar.f65658e);
            }
        }
        if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277969s)) {
            obtain2.addAction(131072);
        }
        if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277970t)) {
            obtain2.addAction(16384);
        }
        if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277971u)) {
            obtain2.addAction(65536);
        }
        if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277972v)) {
            obtain2.addAction(32768);
        }
        if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.C)) {
            obtain2.addAction(2097152);
        }
        if (gVar.f(h10.c.f277981h)) {
            obtain2.setClassName(com.tencent.mm.accessibility.core.provider.TypeModifier.BUTTON_CLASS);
        }
        if (gVar.f(h10.c.f277992v)) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277976z)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar5 = gVar.O;
        if (gVar5 != null) {
            obtain2.setParent(view, gVar5.f65655b);
        } else {
            obtain2.setParent(view);
        }
        int i38 = gVar.A;
        if (i38 != -1) {
            obtain2.setTraversalAfter(view, i38);
        }
        android.graphics.Rect rect = gVar.Y;
        com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar6 = gVar.O;
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
        obtain2.setEnabled(!gVar.f(h10.c.f277984n) || gVar.f(h10.c.f277985o));
        if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277958e)) {
            if (gVar.S != null) {
                obtain2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(16, gVar.S.f65652e));
                obtain2.setClickable(true);
            } else {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
        } else if (gVar.f(h10.c.C)) {
            obtain2.addAction(16);
            obtain2.setClickable(true);
        }
        if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277959f)) {
            if (gVar.T != null) {
                obtain2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(32, gVar.T.f65652e));
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            }
        }
        h10.b bVar = h10.b.f277960g;
        if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar) || com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277962i) || com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277961h) || com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277963m)) {
            obtain2.setScrollable(true);
            if (gVar.f(h10.c.f277996z)) {
                if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar) || com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277961h)) {
                    if (i(gVar)) {
                        obtain2.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(0, gVar.f65663j, false));
                    } else {
                        obtain2.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (i(gVar)) {
                    obtain2.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(gVar.f65663j, 0, false));
                } else {
                    obtain2.setClassName("android.widget.ScrollView");
                }
            }
            if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar) || com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277962i)) {
                obtain2.addAction(4096);
            }
            if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277961h) || com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277963m)) {
                obtain2.addAction(8192);
            }
        }
        h10.b bVar2 = h10.b.f277964n;
        if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar2) || com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277965o)) {
            obtain2.setClassName("android.widget.SeekBar");
            if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar2)) {
                obtain2.addAction(4096);
            }
            if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277965o)) {
                obtain2.addAction(8192);
            }
        }
        if (gVar.f(h10.c.f277993w)) {
            obtain2.setLiveRegion(1);
        }
        if (gVar.f(cVar2)) {
            obtain2.setText(gVar.d(gVar.f65671r, gVar.f65672s));
            if (i29 >= 28) {
                java.lang.CharSequence[] charSequenceArr = {gVar.d(gVar.f65669p, gVar.f65670q), gVar.d(gVar.f65677x, gVar.f65678y)};
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
                java.lang.CharSequence b17 = com.tencent.mm.feature.ecs.nirvana.accessibility.g.b(gVar);
                if (i29 < 28 && gVar.f65679z != null) {
                    b17 = ((java.lang.Object) (b17 != null ? b17 : "")) + "\n" + gVar.f65679z;
                }
                if (b17 != null) {
                    obtain2.setContentDescription(b17);
                }
            }
        }
        int i48 = android.os.Build.VERSION.SDK_INT;
        if (i48 >= 28 && (str = gVar.f65679z) != null) {
            obtain2.setTooltipText(str);
        }
        boolean f17 = gVar.f(h10.c.f277978e);
        boolean f18 = gVar.f(h10.c.f277994x);
        if (!f17 && !f18) {
            z18 = z17;
        }
        obtain2.setCheckable(z18);
        if (f17) {
            obtain2.setChecked(gVar.f(h10.c.f277979f));
            if (gVar.f(h10.c.f277986p)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
        } else if (f18) {
            obtain2.setChecked(gVar.f(h10.c.f277995y));
            obtain2.setClassName("android.widget.Switch");
        }
        obtain2.setSelected(gVar.f(h10.c.f277980g));
        if (i48 >= 28) {
            obtain2.setHeading(gVar.f(h10.c.f277987q));
        }
        com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar7 = this.f65691i;
        if (gVar7 == null || gVar7.f65655b != i17) {
            obtain2.addAction(64);
        } else {
            obtain2.addAction(128);
        }
        java.util.List list = gVar.R;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                com.tencent.mm.feature.ecs.nirvana.accessibility.e eVar = (com.tencent.mm.feature.ecs.nirvana.accessibility.e) it.next();
                obtain2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(eVar.f65648a, eVar.f65651d));
            }
        }
        java.util.Iterator it6 = ((java.util.ArrayList) gVar.P).iterator();
        while (it6.hasNext()) {
            com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar8 = (com.tencent.mm.feature.ecs.nirvana.accessibility.g) it6.next();
            if (!gVar8.f(h10.c.f277991u)) {
                if (gVar8.f65662i != -1) {
                    pVar.getClass();
                    obtain2.addChild(null);
                } else {
                    obtain2.addChild(view, gVar8.f65655b);
                }
            }
        }
        return obtain2;
    }

    public boolean d(android.view.MotionEvent motionEvent) {
        com.tencent.mm.feature.ecs.nirvana.accessibility.g g17;
        if (!this.f65685c.isTouchExplorationEnabled()) {
            return false;
        }
        java.util.Map map = this.f65689g;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        if (hashMap.isEmpty()) {
            return false;
        }
        com.tencent.mm.feature.ecs.nirvana.accessibility.g g18 = ((com.tencent.mm.feature.ecs.nirvana.accessibility.g) ((java.util.HashMap) map).get(0)).g(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, false);
        if (g18 != null && g18.f65662i != -1) {
            return this.f65686d.onAccessibilityHoverEvent(g18.f65655b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            if (!hashMap.isEmpty() && (g17 = ((com.tencent.mm.feature.ecs.nirvana.accessibility.g) ((java.util.HashMap) map).get(0)).g(new float[]{x17, y17, 0.0f, 1.0f}, false)) != this.f65695m) {
                if (g17 != null) {
                    f(g17.f65655b, 128);
                }
                com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar = this.f65695m;
                if (gVar != null) {
                    f(gVar.f65655b, 256);
                }
                this.f65695m = g17;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                io.flutter.Log.d("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar2 = this.f65695m;
            if (gVar2 != null) {
                f(gVar2.f65655b, 256);
                this.f65695m = null;
            }
        }
        return true;
    }

    public final boolean e(com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar, int i17, android.os.Bundle bundle, boolean z17) {
        int i18;
        int i19 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z18 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i27 = gVar.f65660g;
        int i28 = gVar.f65661h;
        if (i28 >= 0 && i27 >= 0) {
            if (i19 != 1) {
                if (i19 != 2) {
                    if (i19 != 4) {
                        if (i19 == 8 || i19 == 16) {
                            if (z17) {
                                gVar.f65661h = gVar.f65671r.length();
                            } else {
                                gVar.f65661h = 0;
                            }
                        }
                    } else if (z17 && i28 < gVar.f65671r.length()) {
                        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(?!^)(\\n)").matcher(gVar.f65671r.substring(gVar.f65661h));
                        if (matcher.find()) {
                            gVar.f65661h += matcher.start(1);
                        } else {
                            gVar.f65661h = gVar.f65671r.length();
                        }
                    } else if (!z17 && gVar.f65661h > 0) {
                        java.util.regex.Matcher matcher2 = java.util.regex.Pattern.compile("(?s:.*)(\\n)").matcher(gVar.f65671r.substring(0, gVar.f65661h));
                        if (matcher2.find()) {
                            gVar.f65661h = matcher2.start(1);
                        } else {
                            gVar.f65661h = 0;
                        }
                    }
                } else if (z17 && i28 < gVar.f65671r.length()) {
                    java.util.regex.Matcher matcher3 = java.util.regex.Pattern.compile("\\p{L}(\\b)").matcher(gVar.f65671r.substring(gVar.f65661h));
                    matcher3.find();
                    if (matcher3.find()) {
                        gVar.f65661h += matcher3.start(1);
                    } else {
                        gVar.f65661h = gVar.f65671r.length();
                    }
                } else if (!z17 && gVar.f65661h > 0) {
                    java.util.regex.Matcher matcher4 = java.util.regex.Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(gVar.f65671r.substring(0, gVar.f65661h));
                    if (matcher4.find()) {
                        gVar.f65661h = matcher4.start(1);
                    }
                }
            } else if (z17 && i28 < gVar.f65671r.length()) {
                gVar.f65661h++;
            } else if (!z17 && (i18 = gVar.f65661h) > 0) {
                gVar.f65661h = i18 - 1;
            }
            if (!z18) {
                gVar.f65660g = gVar.f65661h;
            }
        }
        if (i27 != gVar.f65660g || i28 != gVar.f65661h) {
            java.lang.String str = gVar.f65671r;
            if (str == null) {
                str = "";
            }
            android.view.accessibility.AccessibilityEvent c17 = c(gVar.f65655b, 8192);
            c17.getText().add(str);
            c17.setFromIndex(gVar.f65660g);
            c17.setToIndex(gVar.f65661h);
            c17.setItemCount(str.length());
            g(c17);
        }
        com.tencent.mm.feature.ecs.nirvana.accessibility.l lVar = this.f65684b;
        if (i19 == 1) {
            if (z17) {
                h10.b bVar = h10.b.f277967q;
                if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar)) {
                    lVar.b(i17, bVar, java.lang.Boolean.valueOf(z18));
                    return true;
                }
            }
            if (!z17) {
                h10.b bVar2 = h10.b.f277968r;
                if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar2)) {
                    lVar.b(i17, bVar2, java.lang.Boolean.valueOf(z18));
                    return true;
                }
            }
        } else if (i19 == 2) {
            if (z17) {
                h10.b bVar3 = h10.b.A;
                if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar3)) {
                    lVar.b(i17, bVar3, java.lang.Boolean.valueOf(z18));
                    return true;
                }
            }
            if (!z17) {
                h10.b bVar4 = h10.b.B;
                if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar4)) {
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
        if (this.f65685c.isEnabled()) {
            g(c(i17, i18));
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int i17) {
        if (i17 == 1) {
            com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar = this.f65693k;
            if (gVar != null) {
                return createAccessibilityNodeInfo(gVar.f65655b);
            }
        } else if (i17 != 2) {
            return null;
        }
        com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar2 = this.f65691i;
        if (gVar2 != null) {
            return createAccessibilityNodeInfo(gVar2.f65655b);
        }
        return null;
    }

    public final void g(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (this.f65685c.isEnabled()) {
            android.view.View view = this.f65683a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void h(boolean z17) {
        if (this.f65700r == z17) {
            return;
        }
        this.f65700r = z17;
        if (z17) {
            int i17 = this.f65692j;
            h10.a[] aVarArr = h10.a.f277957d;
            this.f65692j = i17 | 1;
        } else {
            int i18 = this.f65692j;
            h10.a[] aVarArr2 = h10.a.f277957d;
            this.f65692j = i18 & (-2);
        }
        int i19 = this.f65692j;
        com.tencent.mm.feature.ecs.nirvana.accessibility.l lVar = this.f65684b;
        lVar.f65713d = i19;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("accessibilityFeatureFlags", i19);
            lVar.d("setAccessibilityFeatures", jSONObject);
        } catch (org.json.JSONException e17) {
            io.flutter.Log.e("AccessibilityChannel", "setAccessibilityFeatures error", e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(com.tencent.mm.feature.ecs.nirvana.accessibility.g r6) {
        /*
            r5 = this;
            int r0 = r6.f65663j
            r1 = 0
            if (r0 <= 0) goto L3f
            com.tencent.mm.feature.ecs.nirvana.accessibility.g r0 = r5.f65691i
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
            com.tencent.mm.feature.ecs.nirvana.accessibility.g r6 = r5.f65691i
            if (r6 == 0) goto L3b
            com.tencent.mm.feature.ecs.nirvana.accessibility.g r6 = r6.O
        L28:
            if (r6 == 0) goto L37
            h10.c r0 = h10.c.f277996z
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.nirvana.accessibility.h.i(com.tencent.mm.feature.ecs.nirvana.accessibility.g):boolean");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i17, int i18, android.os.Bundle bundle) {
        if (i17 >= 65536) {
            return this.f65686d.performAction(i17, i18, bundle);
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.f65689g;
        com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar = (com.tencent.mm.feature.ecs.nirvana.accessibility.g) hashMap.get(java.lang.Integer.valueOf(i17));
        boolean z17 = false;
        if (gVar == null) {
            return false;
        }
        com.tencent.mm.feature.ecs.nirvana.accessibility.l lVar = this.f65684b;
        switch (i18) {
            case 16:
                lVar.a(i17, h10.b.f277958e);
                return true;
            case 32:
                lVar.a(i17, h10.b.f277959f);
                return true;
            case 64:
                if (this.f65691i == null) {
                    this.f65683a.invalidate();
                }
                this.f65691i = gVar;
                lVar.a(i17, h10.b.f277973w);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", java.lang.Integer.valueOf(gVar.f65655b));
                java.lang.String obj = new lc3.a0(hashMap2).toString();
                io.flutter.Log.i("AccessibilityChannel", "send accessibility message " + obj);
                gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
                if (tVar == null) {
                    io.flutter.Log.w("AccessibilityChannel", " service is null");
                } else {
                    iq0.c cVar = lVar.f65711b;
                    if (cVar == null) {
                        io.flutter.Log.w("AccessibilityChannel", " magicCardStarterHandle is null");
                    } else {
                        ((nq0.p) tVar).Ui(cVar, new com.tencent.mm.plugin.magicbrush.base.MBJsEventBase("accessibilityMessage", obj));
                    }
                }
                f(i17, 32768);
                if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277964n) || com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, h10.b.f277965o)) {
                    f(i17, 4);
                }
                return true;
            case 128:
                com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar2 = this.f65691i;
                if (gVar2 != null && gVar2.f65655b == i17) {
                    this.f65691i = null;
                }
                lVar.a(i17, h10.b.f277974x);
                f(i17, 65536);
                return true;
            case 256:
                return e(gVar, i17, bundle, true);
            case 512:
                return e(gVar, i17, bundle, false);
            case 4096:
                h10.b bVar = h10.b.f277962i;
                if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar)) {
                    lVar.a(i17, bVar);
                } else {
                    h10.b bVar2 = h10.b.f277960g;
                    if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar2)) {
                        lVar.a(i17, bVar2);
                    } else {
                        h10.b bVar3 = h10.b.f277964n;
                        if (!com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar3)) {
                            return false;
                        }
                        gVar.f65671r = gVar.f65673t;
                        gVar.f65672s = gVar.f65674u;
                        f(i17, 4);
                        lVar.a(i17, bVar3);
                    }
                }
                return true;
            case 8192:
                h10.b bVar4 = h10.b.f277963m;
                if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar4)) {
                    lVar.a(i17, bVar4);
                } else {
                    h10.b bVar5 = h10.b.f277961h;
                    if (com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar5)) {
                        lVar.a(i17, bVar5);
                    } else {
                        h10.b bVar6 = h10.b.f277965o;
                        if (!com.tencent.mm.feature.ecs.nirvana.accessibility.g.a(gVar, bVar6)) {
                            return false;
                        }
                        gVar.f65671r = gVar.f65675v;
                        gVar.f65672s = gVar.f65676w;
                        f(i17, 4);
                        lVar.a(i17, bVar6);
                    }
                }
                return true;
            case 16384:
                lVar.a(i17, h10.b.f277970t);
                return true;
            case 32768:
                lVar.a(i17, h10.b.f277972v);
                return true;
            case 65536:
                lVar.a(i17, h10.b.f277971u);
                return true;
            case 131072:
                java.util.HashMap hashMap3 = new java.util.HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z17 = true;
                }
                if (z17) {
                    hashMap3.put(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE, java.lang.Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", java.lang.Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE, java.lang.Integer.valueOf(gVar.f65661h));
                    hashMap3.put("extent", java.lang.Integer.valueOf(gVar.f65661h));
                }
                lVar.b(i17, h10.b.f277969s, hashMap3);
                com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar3 = (com.tencent.mm.feature.ecs.nirvana.accessibility.g) hashMap.get(java.lang.Integer.valueOf(i17));
                gVar3.f65660g = ((java.lang.Integer) hashMap3.get(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE)).intValue();
                gVar3.f65661h = ((java.lang.Integer) hashMap3.get("extent")).intValue();
                return true;
            case 1048576:
                lVar.a(i17, h10.b.f277976z);
                return true;
            case 2097152:
                java.lang.String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                lVar.b(i17, h10.b.C, string);
                gVar.f65671r = string;
                gVar.f65672s = null;
                return true;
            case android.R.id.accessibilityActionShowOnScreen:
                lVar.a(i17, h10.b.f277966p);
                return true;
            default:
                com.tencent.mm.feature.ecs.nirvana.accessibility.e eVar = (com.tencent.mm.feature.ecs.nirvana.accessibility.e) ((java.util.HashMap) this.f65690h).get(java.lang.Integer.valueOf(i18 - f65682z));
                if (eVar == null) {
                    return false;
                }
                lVar.b(i17, h10.b.f277975y, java.lang.Integer.valueOf(eVar.f65649b));
                return true;
        }
    }
}
