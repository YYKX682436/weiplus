package tl5;

/* loaded from: classes10.dex */
public final class r implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f501916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl5.s f501917e;

    public r(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, tl5.s sVar) {
        this.f501916d = c1163xf1deaba4;
        this.f501917e = sVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        tl5.a aVar;
        java.util.List list;
        boolean z17;
        tl5.s sVar;
        java.lang.String str;
        java.util.ArrayList arrayList;
        android.graphics.drawable.Drawable drawable;
        this.f501916d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        tl5.s sVar2 = this.f501917e;
        java.lang.ref.WeakReference weakReference = sVar2.f501923f;
        if (weakReference == null || ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) weakReference.get()) == null || (aVar = sVar2.f501924g) == null || (list = sVar2.f501927j) == null) {
            return;
        }
        if (sVar2.f501920c != tl5.l.f501903e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("PinchZoomEngine", "onToSideLayoutComplete: state=" + sVar2.f501920c + ", aborting");
            return;
        }
        cd5.a aVar2 = (cd5.a) sVar2.f501918a;
        java.util.List a17 = aVar2.a();
        int i17 = sVar2.f501925h;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c17 = aVar2.c();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c17.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager : null;
        uc5.r rVar = aVar2.f122192a;
        if (c1161x57298f5d == null) {
            z17 = false;
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) rVar;
            activityC21814x1938a8b3.B.e(i17);
            c1161x57298f5d.c0(i17);
            tc5.e eVar = new tc5.e(c17, i17);
            eVar.f93758b = true;
            c1161x57298f5d.B = eVar;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 p2Var = activityC21814x1938a8b3.G;
            if (p2Var != null) {
                c17.S0(p2Var);
            }
            z17 = false;
            ed5.a aVar3 = new ed5.a(i17, i65.a.h(c17.getContext(), activityC21814x1938a8b3.C), 0, 4, null);
            activityC21814x1938a8b3.G = aVar3;
            c17.N(aVar3);
            int i18 = aVar.f501863a;
            if (i18 != -1) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(aVar.f501864b));
                arrayList2.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c1161x57298f5d, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/pinchzoom/MsgHistoryGalleryPinchZoomAdapter", "restoreLayout", "(III)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c1161x57298f5d.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.f(c1161x57298f5d, "com/tencent/mm/ui/chatting/history/pinchzoom/MsgHistoryGalleryPinchZoomAdapter", "restoreLayout", "(III)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            c17.requestLayout();
        }
        if (a17.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("PinchZoomEngine", "onToSideLayoutComplete: no to-side items");
            sVar2.a(z17);
            return;
        }
        tl5.h hVar = tl5.h.f501882a;
        int i19 = sVar2.f501925h;
        int i27 = sVar2.f501926i;
        int i28 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) rVar).D;
        tl5.o oVar = new tl5.o(sVar2);
        if (list.isEmpty() || a17.isEmpty()) {
            sVar = sVar2;
            str = "PinchZoomEngine";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("PinchZoomPosCalc", "calculateRenderItems: empty inputs");
        } else {
            java.util.List c18 = hVar.c(list);
            java.util.List c19 = hVar.c(a17);
            long j17 = aVar.f501865c;
            tl5.e a18 = hVar.a(c18, j17);
            tl5.e a19 = hVar.a(c19, j17);
            if (a18 != null && a19 != null) {
                tl5.j jVar = a19.f501877a;
                float centerX = jVar.f501895a.centerX();
                tl5.j jVar2 = a18.f501877a;
                java.util.List list2 = c18;
                float centerX2 = centerX - jVar2.f501895a.centerX();
                android.graphics.RectF rectF = jVar.f501895a;
                float centerY = rectF.centerY();
                android.graphics.RectF rectF2 = jVar2.f501895a;
                float centerY2 = centerY - rectF2.centerY();
                float width = rectF.width() / rectF2.width();
                float height = rectF.height() / rectF2.height();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((tl5.j) it.next()).f501895a);
                }
                int i29 = i19;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(a17, 10));
                java.util.Iterator it6 = a17.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(((tl5.j) it6.next()).f501895a);
                }
                java.util.ArrayList arrayList5 = (java.util.ArrayList) kz5.n0.t0(arrayList3, arrayList4);
                java.util.Iterator it7 = arrayList5.iterator();
                if (!it7.hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                float f17 = ((android.graphics.RectF) it7.next()).top;
                while (it7.hasNext()) {
                    f17 = java.lang.Math.min(f17, ((android.graphics.RectF) it7.next()).top);
                }
                java.util.Iterator it8 = arrayList5.iterator();
                if (!it8.hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                float f18 = ((android.graphics.RectF) it8.next()).bottom;
                while (it8.hasNext()) {
                    f18 = java.lang.Math.max(f18, ((android.graphics.RectF) it8.next()).bottom);
                }
                java.util.Iterator it9 = arrayList5.iterator();
                if (!it9.hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                float f19 = ((android.graphics.RectF) it9.next()).right;
                while (it9.hasNext()) {
                    f19 = java.lang.Math.max(f19, ((android.graphics.RectF) it9.next()).right);
                }
                float height2 = rectF2.height();
                str = "PinchZoomEngine";
                float f27 = 2 * height2;
                android.graphics.RectF rectF3 = new android.graphics.RectF(-height2, f17 - f27, f19 + height2, f18 + f27);
                arrayList = new java.util.ArrayList();
                int d17 = kz5.b1.d(kz5.d0.q(list, 10));
                if (d17 < 16) {
                    d17 = 16;
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
                for (java.lang.Object obj : list) {
                    linkedHashMap.put(java.lang.Long.valueOf(((tl5.j) obj).f501897c), obj);
                }
                java.util.Iterator it10 = c19.iterator();
                while (it10.hasNext()) {
                    java.util.Iterator it11 = ((java.util.List) it10.next()).iterator();
                    while (it11.hasNext()) {
                        tl5.e eVar2 = (tl5.e) it11.next();
                        tl5.j jVar3 = eVar2.f501877a;
                        if (!jVar3.f501899e && android.graphics.RectF.intersects(rectF3, jVar3.f501895a)) {
                            tl5.j jVar4 = eVar2.f501877a;
                            java.util.Iterator it12 = it10;
                            java.util.Iterator it13 = it11;
                            float f28 = centerY2;
                            tl5.e eVar3 = a19;
                            java.util.List list3 = list2;
                            float f29 = centerX2;
                            tl5.s sVar3 = sVar2;
                            java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
                            int i37 = i29;
                            tl5.h hVar2 = hVar;
                            android.graphics.RectF b17 = hVar.b(jVar4.f501895a, -centerX2, -centerY2, 1.0f / width, 1.0f / height, 0, eVar2.f501878b - a19.f501878b, eVar2.f501879c - a19.f501879c);
                            boolean intersects = android.graphics.RectF.intersects(rectF3, b17);
                            long j18 = jVar4.f501897c;
                            tl5.j jVar5 = (tl5.j) linkedHashMap2.get(java.lang.Long.valueOf(j18));
                            if (jVar5 == null || (drawable = jVar5.f501896b) == null) {
                                drawable = (android.graphics.drawable.Drawable) oVar.mo146xb9724478(java.lang.Long.valueOf(j18));
                            }
                            arrayList.add(new tl5.i(b17, jVar4.f501895a, intersects ? 0 : 255, 255, null, drawable != null ? drawable.mutate() : null, 0, 80, null));
                            hVar = hVar2;
                            linkedHashMap = linkedHashMap2;
                            centerX2 = f29;
                            sVar2 = sVar3;
                            it11 = it13;
                            centerY2 = f28;
                            a19 = eVar3;
                            i29 = i37;
                            list2 = list3;
                            it10 = it12;
                        }
                    }
                }
                sVar = sVar2;
                float f37 = centerY2;
                tl5.h hVar3 = hVar;
                java.util.List list4 = list2;
                int i38 = i29;
                float f38 = centerX2;
                java.util.Iterator it14 = list4.iterator();
                while (it14.hasNext()) {
                    for (tl5.e eVar4 : (java.util.List) it14.next()) {
                        tl5.j jVar6 = eVar4.f501877a;
                        if (!jVar6.f501899e) {
                            android.graphics.RectF b18 = hVar3.b(jVar6.f501895a, f38, f37, width, height, 0, eVar4.f501878b - a18.f501878b, eVar4.f501879c - a18.f501879c);
                            tl5.j jVar7 = eVar4.f501877a;
                            android.graphics.RectF rectF4 = jVar7.f501895a;
                            android.graphics.drawable.Drawable drawable2 = jVar7.f501896b;
                            arrayList.add(new tl5.i(rectF4, b18, 255, 0, null, drawable2 != null ? drawable2.mutate() : null, 0, 80, null));
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PinchZoomPosCalc", "calculateRenderItems: " + arrayList.size() + " items, " + i38 + (char) 8594 + i27);
                if (arrayList != null || arrayList.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onToSideLayoutComplete: calculateRenderItems failed");
                    sVar.a(false);
                }
                tl5.s sVar4 = sVar;
                sVar4.f501927j = null;
                tl5.d dVar = sVar4.f501921d;
                if (dVar != null) {
                    dVar.a(arrayList);
                }
                sVar4.f501920c = tl5.l.f501904f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onToSideLayoutComplete: MANUAL, " + arrayList.size() + " render items");
                tl5.k kVar = sVar4.f501930m;
                if (kVar == null) {
                    tl5.d dVar2 = sVar4.f501921d;
                    if (dVar2 != null) {
                        dVar2.b(sVar4.f501929l, false);
                        return;
                    }
                    return;
                }
                sVar4.f501930m = null;
                tl5.d dVar3 = sVar4.f501921d;
                if (dVar3 != null) {
                    dVar3.b(sVar4.f501929l, false);
                }
                sVar4.c(kVar.f501900a, kVar.f501901b);
                return;
            }
            sVar = sVar2;
            str = "PinchZoomEngine";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PinchZoomPosCalc", "calculateRenderItems: anchor not found, from=" + j17 + ", to=" + j17);
        }
        arrayList = null;
        if (arrayList != null) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onToSideLayoutComplete: calculateRenderItems failed");
        sVar.a(false);
    }
}
