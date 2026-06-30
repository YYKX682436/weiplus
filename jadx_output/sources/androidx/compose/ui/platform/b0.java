package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class b0 extends android.view.accessibility.AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.x f10513a;

    public b0(androidx.compose.ui.platform.x xVar) {
        this.f10513a = xVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public void addExtraDataToAccessibilityNodeInfo(int i17, android.view.accessibility.AccessibilityNodeInfo info, java.lang.String extraDataKey, android.os.Bundle bundle) {
        y1.y yVar;
        java.lang.String str;
        int i18;
        d1.g gVar;
        android.graphics.RectF rectF;
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(extraDataKey, "extraDataKey");
        androidx.compose.ui.platform.x xVar = this.f10513a;
        androidx.compose.ui.platform.z3 z3Var = (androidx.compose.ui.platform.z3) xVar.g().get(java.lang.Integer.valueOf(i17));
        if (z3Var == null || (yVar = z3Var.f10832a) == null) {
            return;
        }
        java.lang.String h17 = xVar.h(yVar);
        y1.o0 o0Var = y1.k.f458749a;
        y1.l lVar = yVar.f458799e;
        if (!lVar.d(o0Var) || bundle == null || !kotlin.jvm.internal.o.b(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            y1.o0 o0Var2 = y1.i0.f458735q;
            if (!lVar.d(o0Var2) || bundle == null || !kotlin.jvm.internal.o.b(extraDataKey, "androidx.compose.ui.semantics.testTag") || (str = (java.lang.String) y1.m.a(lVar, o0Var2)) == null) {
                return;
            }
            info.getExtras().putCharSequence(extraDataKey, str);
            return;
        }
        int i19 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i27 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i27 <= 0 || i19 < 0) {
            return;
        }
        if (i19 >= (h17 != null ? h17.length() : Integer.MAX_VALUE)) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        yz5.l lVar2 = (yz5.l) ((y1.a) lVar.e(o0Var)).f458693b;
        boolean z17 = false;
        if (kotlin.jvm.internal.o.b(lVar2 != null ? (java.lang.Boolean) lVar2.invoke(arrayList) : null, java.lang.Boolean.TRUE)) {
            a2.k1 k1Var = (a2.k1) arrayList.get(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i28 = 0;
            while (i28 < i27) {
                int i29 = i19 + i28;
                if (i29 >= k1Var.f765a.f754a.length()) {
                    arrayList2.add(z17);
                    i18 = i27;
                } else {
                    d1.g d17 = k1Var.b(i29).d(!yVar.f458801g.x() ? d1.e.f225623b : s1.a0.d(yVar.c()));
                    d1.g d18 = yVar.d();
                    if (d17.b(d18)) {
                        i18 = i27;
                        gVar = new d1.g(java.lang.Math.max(d17.f225629a, d18.f225629a), java.lang.Math.max(d17.f225630b, d18.f225630b), java.lang.Math.min(d17.f225631c, d18.f225631c), java.lang.Math.min(d17.f225632d, d18.f225632d));
                    } else {
                        i18 = i27;
                        gVar = null;
                    }
                    if (gVar != null) {
                        long a17 = d1.f.a(gVar.f225629a, gVar.f225630b);
                        androidx.compose.ui.platform.AndroidComposeView androidComposeView = xVar.f10787e;
                        long j17 = androidComposeView.j(a17);
                        long j18 = androidComposeView.j(d1.f.a(gVar.f225631c, gVar.f225632d));
                        rectF = new android.graphics.RectF(d1.e.c(j17), d1.e.d(j17), d1.e.c(j18), d1.e.d(j18));
                    } else {
                        rectF = null;
                    }
                    arrayList2.add(rectF);
                }
                i28++;
                i27 = i18;
                z17 = false;
            }
            android.os.Bundle extras = info.getExtras();
            java.lang.Object[] array = arrayList2.toArray(new android.graphics.RectF[0]);
            if (array == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            extras.putParcelableArray(extraDataKey, (android.os.Parcelable[]) array);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i17) {
        int i18;
        u1.c1 c17;
        boolean z17;
        a2.d dVar;
        y1.l c18;
        androidx.lifecycle.y yVar;
        androidx.lifecycle.o mo133getLifecycle;
        androidx.compose.ui.platform.x xVar = this.f10513a;
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = xVar.f10787e;
        androidx.compose.ui.platform.m viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (((viewTreeOwners == null || (yVar = viewTreeOwners.f10638a) == null || (mo133getLifecycle = yVar.mo133getLifecycle()) == null) ? null : mo133getLifecycle.b()) != androidx.lifecycle.n.DESTROYED) {
            android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain();
            o3.l lVar = new o3.l(obtain);
            androidx.compose.ui.platform.z3 z3Var = (androidx.compose.ui.platform.z3) xVar.g().get(java.lang.Integer.valueOf(i17));
            if (z3Var != null) {
                y1.y semanticsNode = z3Var.f10832a;
                if (i17 == -1) {
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    java.lang.Object f17 = n3.u0.f(androidComposeView);
                    android.view.View view = f17 instanceof android.view.View ? (android.view.View) f17 : null;
                    lVar.f342643b = -1;
                    obtain.setParent(view);
                } else {
                    if (semanticsNode.g() == null) {
                        throw new java.lang.IllegalStateException("semanticsNode " + i17 + " has null parent");
                    }
                    y1.y g17 = semanticsNode.g();
                    kotlin.jvm.internal.o.d(g17);
                    int i19 = androidComposeView.getSemanticsOwner().a().f458800f;
                    int i27 = g17.f458800f;
                    int i28 = i27 != i19 ? i27 : -1;
                    lVar.f342643b = i28;
                    obtain.setParent(androidComposeView, i28);
                }
                lVar.f342644c = i17;
                obtain.setSource(androidComposeView, i17);
                android.graphics.Rect rect = z3Var.f10833b;
                long j17 = androidComposeView.j(d1.f.a(rect.left, rect.top));
                long j18 = androidComposeView.j(d1.f.a(rect.right, rect.bottom));
                lVar.l(new android.graphics.Rect((int) java.lang.Math.floor(d1.e.c(j17)), (int) java.lang.Math.floor(d1.e.d(j17)), (int) java.lang.Math.ceil(d1.e.c(j18)), (int) java.lang.Math.ceil(d1.e.d(j18))));
                kotlin.jvm.internal.o.g(semanticsNode, "semanticsNode");
                lVar.n("android.view.View");
                y1.o0 o0Var = y1.i0.f458734p;
                y1.l lVar2 = semanticsNode.f458799e;
                y1.i iVar = (y1.i) y1.m.a(lVar2, o0Var);
                u1.w wVar = semanticsNode.f458801g;
                if (iVar != null && (semanticsNode.f458797c || semanticsNode.h().isEmpty())) {
                    int i29 = iVar.f458718a;
                    if (i29 == 4) {
                        o3.g.c(obtain).putCharSequence("AccessibilityNodeInfo.roleDescription", androidComposeView.getContext().getResources().getString(com.tencent.mm.R.string.f493302jo1));
                    } else {
                        java.lang.String str = i29 == 0 ? com.tencent.mm.accessibility.core.provider.TypeModifier.BUTTON_CLASS : i29 == 1 ? "android.widget.CheckBox" : i29 == 2 ? "android.widget.Switch" : i29 == 3 ? "android.widget.RadioButton" : i29 == 5 ? "android.widget.ImageView" : null;
                        if (i29 == 5) {
                            u1.w p17 = wVar.p();
                            while (true) {
                                if (p17 == null) {
                                    p17 = null;
                                    break;
                                }
                                y1.n d17 = y1.z.d(p17);
                                if (java.lang.Boolean.valueOf((d17 == null || (c18 = d17.c()) == null || !c18.f458767e) ? false : true).booleanValue()) {
                                    break;
                                }
                                p17 = p17.p();
                            }
                            if (p17 == null || lVar2.f458767e) {
                                lVar.n(str);
                            }
                        } else {
                            lVar.n(str);
                        }
                    }
                }
                if (androidx.compose.ui.platform.h0.e(semanticsNode)) {
                    lVar.n("android.widget.EditText");
                }
                if (semanticsNode.f().d(y1.i0.f458736r)) {
                    lVar.n(com.tencent.mm.accessibility.core.provider.TypeModifier.TEXTVIEW_CLASS);
                }
                java.lang.String packageName = androidComposeView.getContext().getPackageName();
                android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = lVar.f342642a;
                accessibilityNodeInfo.setPackageName(packageName);
                java.util.List e17 = semanticsNode.e(true, false, true);
                int size = e17.size();
                for (int i37 = 0; i37 < size; i37++) {
                    y1.y yVar2 = (y1.y) e17.get(i37);
                    if (xVar.g().containsKey(java.lang.Integer.valueOf(yVar2.f458800f))) {
                        r2.o oVar = androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(yVar2.f458801g);
                        if (oVar != null) {
                            accessibilityNodeInfo.addChild(oVar);
                        } else {
                            accessibilityNodeInfo.addChild(androidComposeView, yVar2.f458800f);
                        }
                    }
                }
                if (xVar.f10792m == i17) {
                    lVar.i(true);
                    lVar.b(o3.f.f342627i);
                } else {
                    lVar.i(false);
                    lVar.b(o3.f.f342626h);
                }
                f2.g fontFamilyResolver = androidComposeView.getFontFamilyResolver();
                a2.d i38 = xVar.i(lVar2);
                android.text.SpannableString spannableString = (android.text.SpannableString) xVar.y(i38 != null ? i2.a.a(i38, androidComposeView.getDensity(), fontFamilyResolver) : null, 100000);
                java.util.List list = (java.util.List) y1.m.a(lVar2, y1.i0.f458736r);
                android.text.SpannableString spannableString2 = (android.text.SpannableString) xVar.y((list == null || (dVar = (a2.d) kz5.n0.Z(list)) == null) ? null : i2.a.a(dVar, androidComposeView.getDensity(), fontFamilyResolver), 100000);
                if (spannableString == null) {
                    spannableString = spannableString2;
                }
                lVar.v(spannableString);
                y1.o0 o0Var2 = y1.i0.f458743y;
                if (lVar2.d(o0Var2)) {
                    accessibilityNodeInfo.setContentInvalid(true);
                    accessibilityNodeInfo.setError((java.lang.CharSequence) y1.m.a(lVar2, o0Var2));
                }
                lVar.u((java.lang.CharSequence) y1.m.a(lVar2, y1.i0.f458720b));
                z1.a aVar = (z1.a) y1.m.a(lVar2, y1.i0.f458741w);
                if (aVar != null) {
                    lVar.m(true);
                    int ordinal = aVar.ordinal();
                    if (ordinal == 0) {
                        accessibilityNodeInfo.setChecked(true);
                        if ((iVar != null && iVar.f458718a == 2) && lVar.g() == null) {
                            lVar.u(androidComposeView.getContext().getResources().getString(com.tencent.mm.R.string.hec));
                        }
                    } else if (ordinal == 1) {
                        accessibilityNodeInfo.setChecked(false);
                        if ((iVar != null && iVar.f458718a == 2) && lVar.g() == null) {
                            lVar.u(androidComposeView.getContext().getResources().getString(com.tencent.mm.R.string.hdn));
                        }
                    } else if (ordinal == 2 && lVar.g() == null) {
                        lVar.u(androidComposeView.getContext().getResources().getString(com.tencent.mm.R.string.g1_));
                    }
                }
                java.lang.Boolean bool = (java.lang.Boolean) y1.m.a(lVar2, y1.i0.f458740v);
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (iVar != null && iVar.f458718a == 4) {
                        accessibilityNodeInfo.setSelected(booleanValue);
                    } else {
                        lVar.m(true);
                        accessibilityNodeInfo.setChecked(booleanValue);
                        if (lVar.g() == null) {
                            lVar.u(booleanValue ? androidComposeView.getContext().getResources().getString(com.tencent.mm.R.string.igx) : androidComposeView.getContext().getResources().getString(com.tencent.mm.R.string.h_a));
                        }
                    }
                }
                if (!lVar2.f458767e || semanticsNode.h().isEmpty()) {
                    java.util.List list2 = (java.util.List) y1.m.a(lVar2, y1.i0.f458719a);
                    lVar.p(list2 != null ? (java.lang.String) kz5.n0.Z(list2) : null);
                }
                if (lVar2.f458767e) {
                    lVar.s(true);
                }
                java.lang.String str2 = (java.lang.String) y1.m.a(lVar2, y1.i0.f458735q);
                if (str2 != null) {
                    y1.y yVar3 = semanticsNode;
                    while (true) {
                        if (yVar3 == null) {
                            z17 = false;
                            break;
                        }
                        y1.o0 o0Var3 = y1.k0.f458765a;
                        y1.l lVar3 = yVar3.f458799e;
                        if (lVar3.d(o0Var3)) {
                            z17 = ((java.lang.Boolean) lVar3.e(o0Var3)).booleanValue();
                            break;
                        }
                        yVar3 = yVar3.g();
                    }
                    if (z17) {
                        obtain.setViewIdResourceName(str2);
                    }
                }
                if (((jz5.f0) y1.m.a(lVar2, y1.i0.f458726h)) != null) {
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo.setHeading(true);
                    } else {
                        lVar.j(2, true);
                    }
                }
                obtain.setPassword(semanticsNode.f().d(y1.i0.f458742x));
                obtain.setEditable(androidx.compose.ui.platform.h0.e(semanticsNode));
                lVar.q(androidx.compose.ui.platform.h0.a(semanticsNode));
                y1.o0 o0Var4 = y1.i0.f458729k;
                lVar.r(lVar2.d(o0Var4));
                if (accessibilityNodeInfo.isFocusable()) {
                    accessibilityNodeInfo.setFocused(((java.lang.Boolean) lVar2.e(o0Var4)).booleanValue());
                    if (accessibilityNodeInfo.isFocused()) {
                        i18 = 2;
                        lVar.a(2);
                    } else {
                        i18 = 2;
                        lVar.a(1);
                    }
                } else {
                    i18 = 2;
                }
                if (semanticsNode.f458797c) {
                    y1.y g18 = semanticsNode.g();
                    c17 = g18 != null ? g18.c() : null;
                } else {
                    c17 = semanticsNode.c();
                }
                accessibilityNodeInfo.setVisibleToUser(!(c17 != null ? c17.q0() : false) && y1.m.a(lVar2, y1.i0.f458730l) == null);
                y1.c cVar = (y1.c) y1.m.a(lVar2, y1.i0.f458728j);
                if (cVar != null) {
                    cVar.getClass();
                    if ((!false) || !(!true)) {
                        i18 = 1;
                    }
                    obtain.setLiveRegion(i18);
                }
                accessibilityNodeInfo.setClickable(false);
                y1.a aVar2 = (y1.a) y1.m.a(lVar2, y1.k.f458750b);
                if (aVar2 != null) {
                    boolean b17 = kotlin.jvm.internal.o.b(y1.m.a(lVar2, y1.i0.f458740v), java.lang.Boolean.TRUE);
                    accessibilityNodeInfo.setClickable(!b17);
                    if (androidx.compose.ui.platform.h0.a(semanticsNode) && !b17) {
                        lVar.b(new o3.f(16, aVar2.f458692a));
                    }
                }
                accessibilityNodeInfo.setLongClickable(false);
                y1.a aVar3 = (y1.a) y1.m.a(lVar2, y1.k.f458751c);
                if (aVar3 != null) {
                    accessibilityNodeInfo.setLongClickable(true);
                    if (androidx.compose.ui.platform.h0.a(semanticsNode)) {
                        lVar.b(new o3.f(32, aVar3.f458692a));
                    }
                }
                y1.a aVar4 = (y1.a) y1.m.a(lVar2, y1.k.f458757i);
                if (aVar4 != null) {
                    lVar.b(new o3.f(16384, aVar4.f458692a));
                }
                if (androidx.compose.ui.platform.h0.a(semanticsNode)) {
                    y1.a aVar5 = (y1.a) y1.m.a(lVar2, y1.k.f458756h);
                    if (aVar5 != null) {
                        lVar.b(new o3.f(2097152, aVar5.f458692a));
                    }
                    y1.a aVar6 = (y1.a) y1.m.a(lVar2, y1.k.f458758j);
                    if (aVar6 != null) {
                        lVar.b(new o3.f(65536, aVar6.f458692a));
                    }
                    y1.a aVar7 = (y1.a) y1.m.a(lVar2, y1.k.f458759k);
                    if (aVar7 != null && accessibilityNodeInfo.isFocused()) {
                        android.content.ClipDescription primaryClipDescription = androidComposeView.getClipboardManager().f10621a.getPrimaryClipDescription();
                        if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/plain") : false) {
                            lVar.b(new o3.f(32768, aVar7.f458692a));
                        }
                    }
                }
                java.lang.String h17 = xVar.h(semanticsNode);
                if (!(h17 == null || h17.length() == 0)) {
                    obtain.setTextSelection(xVar.f(semanticsNode), xVar.e(semanticsNode));
                    y1.a aVar8 = (y1.a) y1.m.a(lVar2, y1.k.f458755g);
                    lVar.b(new o3.f(131072, aVar8 != null ? aVar8.f458692a : null));
                    lVar.a(256);
                    lVar.a(512);
                    accessibilityNodeInfo.setMovementGranularities(11);
                    java.util.List list3 = (java.util.List) y1.m.a(lVar2, y1.i0.f458719a);
                    if ((list3 == null || list3.isEmpty()) && lVar2.d(y1.k.f458749a) && !androidx.compose.ui.platform.h0.b(semanticsNode)) {
                        accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities() | 4 | 16);
                    }
                }
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.CharSequence h18 = lVar.h();
                    if (!(h18 == null || h18.length() == 0) && lVar2.d(y1.k.f458749a)) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (lVar2.d(y1.i0.f458735q)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (!arrayList.isEmpty()) {
                        androidx.compose.ui.platform.j.f10609a.a(obtain, arrayList);
                    }
                }
                y1.h hVar = (y1.h) y1.m.a(lVar2, y1.i0.f458721c);
                if (hVar != null) {
                    y1.o0 o0Var5 = y1.k.f458754f;
                    if (lVar2.d(o0Var5)) {
                        lVar.n("android.widget.SeekBar");
                    } else {
                        lVar.n("android.widget.ProgressBar");
                    }
                    y1.h hVar2 = y1.h.f458713d;
                    float f18 = hVar.f458714a;
                    e06.f fVar = hVar.f458715b;
                    if (hVar != hVar2) {
                        obtain.setRangeInfo(android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(1, ((java.lang.Number) fVar.h()).floatValue(), ((java.lang.Number) fVar.g()).floatValue(), f18));
                        if (lVar.g() == null) {
                            float e18 = e06.p.e(((((java.lang.Number) fVar.g()).floatValue() - ((java.lang.Number) fVar.h()).floatValue()) > 0.0f ? 1 : ((((java.lang.Number) fVar.g()).floatValue() - ((java.lang.Number) fVar.h()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f18 - ((java.lang.Number) fVar.h()).floatValue()) / (((java.lang.Number) fVar.g()).floatValue() - ((java.lang.Number) fVar.h()).floatValue()), 0.0f, 1.0f);
                            lVar.u(androidComposeView.getContext().getResources().getString(com.tencent.mm.R.string.ju6, java.lang.Integer.valueOf(e18 == 0.0f ? 0 : (e18 > 1.0f ? 1 : (e18 == 1.0f ? 0 : -1)) == 0 ? 100 : e06.p.f(a06.d.b(e18 * 100), 1, 99))));
                        }
                    } else if (lVar.g() == null) {
                        lVar.u(androidComposeView.getContext().getResources().getString(com.tencent.mm.R.string.f492320g15));
                    }
                    if (lVar2.d(o0Var5) && androidx.compose.ui.platform.h0.a(semanticsNode)) {
                        float floatValue = ((java.lang.Number) fVar.g()).floatValue();
                        float floatValue2 = ((java.lang.Number) fVar.h()).floatValue();
                        if (floatValue < floatValue2) {
                            floatValue = floatValue2;
                        }
                        if (f18 < floatValue) {
                            lVar.b(o3.f.f342630l);
                        }
                        float floatValue3 = ((java.lang.Number) fVar.h()).floatValue();
                        float floatValue4 = ((java.lang.Number) fVar.g()).floatValue();
                        if (floatValue3 > floatValue4) {
                            floatValue3 = floatValue4;
                        }
                        if (f18 > floatValue3) {
                            lVar.b(o3.f.f342631m);
                        }
                    }
                }
                androidx.compose.ui.platform.z.a(lVar, semanticsNode);
                y1.b bVar = (y1.b) y1.m.a(semanticsNode.f(), y1.i0.f458724f);
                if (bVar != null) {
                    accessibilityNodeInfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(bVar.f458695a, bVar.f458696b, false, 0));
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    if (y1.m.a(semanticsNode.f(), y1.i0.f458723e) != null) {
                        java.util.List h19 = semanticsNode.h();
                        int size2 = h19.size();
                        for (int i39 = 0; i39 < size2; i39++) {
                            y1.y yVar4 = (y1.y) h19.get(i39);
                            if (yVar4.f().d(y1.i0.f458740v)) {
                                arrayList2.add(yVar4);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        boolean a17 = v1.a.a(arrayList2);
                        accessibilityNodeInfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(a17 ? 1 : arrayList2.size(), a17 ? arrayList2.size() : 1, false, 0));
                    }
                }
                v1.a.c(semanticsNode, lVar);
                y1.j jVar = (y1.j) y1.m.a(lVar2, y1.i0.f458731m);
                y1.o0 o0Var6 = y1.k.f458749a;
                y1.a aVar9 = (y1.a) y1.m.a(lVar2, y1.k.f458752d);
                if (jVar != null && aVar9 != null) {
                    if (!v1.a.b(semanticsNode)) {
                        lVar.n("android.widget.HorizontalScrollView");
                    }
                    if (((java.lang.Number) jVar.f458746b.invoke()).floatValue() > 0.0f) {
                        lVar.t(true);
                    }
                    if (androidx.compose.ui.platform.h0.a(semanticsNode)) {
                        boolean o17 = androidx.compose.ui.platform.x.o(jVar);
                        p2.s sVar = p2.s.Rtl;
                        if (o17) {
                            lVar.b(o3.f.f342630l);
                            lVar.b(!(wVar.f423700x == sVar) ? o3.f.f342635q : o3.f.f342633o);
                        }
                        if (androidx.compose.ui.platform.x.n(jVar)) {
                            lVar.b(o3.f.f342631m);
                            lVar.b(!(wVar.f423700x == sVar) ? o3.f.f342633o : o3.f.f342635q);
                        }
                    }
                }
                y1.j jVar2 = (y1.j) y1.m.a(lVar2, y1.i0.f458732n);
                if (jVar2 != null && aVar9 != null) {
                    if (!v1.a.b(semanticsNode)) {
                        lVar.n("android.widget.ScrollView");
                    }
                    if (((java.lang.Number) jVar2.f458746b.invoke()).floatValue() > 0.0f) {
                        lVar.t(true);
                    }
                    if (androidx.compose.ui.platform.h0.a(semanticsNode)) {
                        if (androidx.compose.ui.platform.x.o(jVar2)) {
                            lVar.b(o3.f.f342630l);
                            lVar.b(o3.f.f342634p);
                        }
                        if (androidx.compose.ui.platform.x.n(jVar2)) {
                            lVar.b(o3.f.f342631m);
                            lVar.b(o3.f.f342632n);
                        }
                    }
                }
                java.lang.CharSequence charSequence = (java.lang.CharSequence) y1.m.a(lVar2, y1.i0.f458722d);
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    accessibilityNodeInfo.setPaneTitle(charSequence);
                } else {
                    o3.g.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                }
                if (!androidx.compose.ui.platform.h0.a(semanticsNode)) {
                    return obtain;
                }
                y1.a aVar10 = (y1.a) y1.m.a(lVar2, y1.k.f458760l);
                if (aVar10 != null) {
                    lVar.b(new o3.f(262144, aVar10.f458692a));
                }
                y1.a aVar11 = (y1.a) y1.m.a(lVar2, y1.k.f458761m);
                if (aVar11 != null) {
                    lVar.b(new o3.f(524288, aVar11.f458692a));
                }
                y1.a aVar12 = (y1.a) y1.m.a(lVar2, y1.k.f458762n);
                if (aVar12 != null) {
                    lVar.b(new o3.f(1048576, aVar12.f458692a));
                }
                y1.o0 o0Var7 = y1.k.f458764p;
                if (!lVar2.d(o0Var7)) {
                    return obtain;
                }
                java.util.List list4 = (java.util.List) lVar2.e(o0Var7);
                if (list4.size() >= 32) {
                    throw new java.lang.IllegalStateException("Can't have more than 32 custom actions for one widget");
                }
                x.o oVar2 = new x.o();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                x.o oVar3 = xVar.f10794o;
                if (oVar3.c(i17)) {
                    java.util.Map map = (java.util.Map) oVar3.e(i17, null);
                    java.util.List B0 = kz5.z.B0(androidx.compose.ui.platform.x.D);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    if (list4.size() > 0) {
                        android.support.v4.media.f.a(list4.get(0));
                        kotlin.jvm.internal.o.d(map);
                        throw null;
                    }
                    if (arrayList3.size() > 0) {
                        android.support.v4.media.f.a(arrayList3.get(0));
                        ((java.lang.Number) ((java.util.ArrayList) B0).get(0)).intValue();
                        throw null;
                    }
                } else if (list4.size() > 0) {
                    android.support.v4.media.f.a(list4.get(0));
                    throw null;
                }
                xVar.f10793n.g(i17, oVar2);
                oVar3.g(i17, linkedHashMap);
                return obtain;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:347:0x04dd, code lost:
    
        if (r1 != 16) goto L355;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.compose.ui.platform.c] */
    /* JADX WARN: Type inference failed for: r5v14, types: [androidx.compose.ui.platform.h] */
    /* JADX WARN: Type inference failed for: r5v15, types: [androidx.compose.ui.platform.b, androidx.compose.ui.platform.e] */
    /* JADX WARN: Type inference failed for: r5v16, types: [androidx.compose.ui.platform.b, androidx.compose.ui.platform.d] */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.compose.ui.platform.f, androidx.compose.ui.platform.b] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.compose.ui.platform.g] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x00b2 -> B:47:0x00b3). Please report as a decompilation issue!!! */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean performAction(int r18, int r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.b0.performAction(int, int, android.os.Bundle):boolean");
    }
}
