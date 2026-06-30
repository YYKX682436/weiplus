package hp2;

/* loaded from: classes2.dex */
public class g implements hp2.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f364460a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f364461b;

    /* renamed from: c, reason: collision with root package name */
    public final int f364462c;

    /* renamed from: d, reason: collision with root package name */
    public final int f364463d;

    /* renamed from: e, reason: collision with root package name */
    public final int f364464e;

    /* renamed from: f, reason: collision with root package name */
    public int f364465f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f364466g;

    /* renamed from: h, reason: collision with root package name */
    public int f364467h;

    public g(java.util.List feedList, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedList, "feedList");
        this.f364460a = feedList;
        this.f364461b = c22848x6ddd90cf;
        this.f364462c = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "create NearbyLiveAutoPlaySelector focusItemCount: " + i17);
        this.f364463d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().heightPixels;
        this.f364464e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().widthPixels;
        this.f364465f = 1;
        this.f364466g = kz5.p0.f395529d;
    }

    @Override // hp2.a
    public void a(int i17) {
        this.f364465f = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] setFocusPlayMode: " + this.f364465f);
        zl2.q4 q4Var = zl2.q4.f555466a;
        if (q4Var.E()) {
            ae2.in inVar = ae2.in.f85221a;
            jz5.g gVar = ae2.in.f85438w;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() != -1) {
                this.f364465f = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "setFocusPlayModeFromMock: " + this.f364465f);
            }
        }
        if (q4Var.E()) {
            ae2.in inVar2 = ae2.in.f85221a;
            jz5.g gVar2 = ae2.in.f85447x;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue() != -1) {
                this.f364465f = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "setFocusPlayModeFromMock: " + this.f364465f);
            }
        }
    }

    @Override // hp2.a
    public boolean b(int i17, boolean z17) {
        int i18;
        this.f364467h = i17;
        boolean z18 = false;
        if (i17 == 0 ? (i18 = this.f364465f) == 0 || i18 == 1 || i18 == 2 : i17 == 1 && this.f364465f == 2) {
            z18 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]setPlayOrder: playOrder=" + i17 + ", focusPlayMode=" + this.f364465f + ", shouldPlay=" + z18);
        return z18;
    }

    @Override // hp2.a
    public int c() {
        return this.f364465f;
    }

    @Override // hp2.a
    public java.util.Set d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 layoutManager, java.util.HashSet curLivePreviewDataSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curLivePreviewDataSet, "curLivePreviewDataSet");
        if (this.f364466g.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]findAutoStopItem: cachedTargetPlayItems empty, stop all " + curLivePreviewDataSet.size() + " cards");
            return curLivePreviewDataSet;
        }
        java.util.List list = this.f364466g;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((hp2.b) it.next()).f364455b));
        }
        java.util.HashSet Q0 = kz5.n0.Q0(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : curLivePreviewDataSet) {
            if (!Q0.contains(java.lang.Long.valueOf(((gp2.f) obj).f355750d.mo2128x1ed62e84()))) {
                arrayList2.add(obj);
            }
        }
        java.util.HashSet Q02 = kz5.n0.Q0(arrayList2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck]findAutoStopItem: cachedItems=");
        java.util.List list2 = this.f364466g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            arrayList3.add(java.lang.Integer.valueOf(((hp2.b) it6.next()).f364454a));
        }
        sb6.append(arrayList3);
        sb6.append(", curSize=");
        sb6.append(curLivePreviewDataSet.size());
        sb6.append(", toStopItemIds=");
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(Q02, 10));
        java.util.Iterator it7 = Q02.iterator();
        while (it7.hasNext()) {
            arrayList4.add(java.lang.Long.valueOf(((gp2.f) it7.next()).f355750d.mo2128x1ed62e84()));
        }
        sb6.append(arrayList4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", sb6.toString());
        return Q02;
    }

    @Override // hp2.a
    public int[] e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 layoutManager, int[] firstVisibleItemPos, int[] lastVisibleItemPos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(firstVisibleItemPos, "firstVisibleItemPos");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastVisibleItemPos, "lastVisibleItemPos");
        int[] f17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85333l1).mo141623x754a37bb()).r()).intValue() == 1 ? f(layoutManager, firstVisibleItemPos, lastVisibleItemPos) : f(layoutManager, firstVisibleItemPos, lastVisibleItemPos);
        java.util.List x07 = kz5.z.x0(f17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = x07.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            so2.j5 h17 = h(intValue);
            hp2.b bVar = h17 != null ? new hp2.b(intValue, h17.mo2128x1ed62e84()) : null;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        this.f364466g = arrayList;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck] findAutoPlayItem: cached positions=");
        java.lang.String arrays = java.util.Arrays.toString(f17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", items=");
        java.util.List<hp2.b> list = this.f364466g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (hp2.b bVar2 : list) {
            arrayList2.add(new jz5.l(java.lang.Integer.valueOf(bVar2.f364454a), java.lang.Long.valueOf(bVar2.f364455b)));
        }
        sb6.append(arrayList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", sb6.toString());
        return f17;
    }

    public int[] f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1, int[] firstVisibleItemPos, int[] lastVisibleItemPos) {
        int[] iArr;
        boolean z17;
        hp2.g gVar = this;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 layoutManager = c1164x587b7ff1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(firstVisibleItemPos, "firstVisibleItemPos");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastVisibleItemPos, "lastVisibleItemPos");
        int i17 = gVar.f364467h;
        boolean z18 = false;
        boolean z19 = true;
        if (i17 == 0) {
            int i18 = gVar.f364465f;
            if (i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: CenterFirstRow mode, playOrder=0, find center visible");
                int i19 = gVar.f364463d / 2;
                int i27 = gVar.f364462c;
                int[] iArr2 = new int[i27];
                iArr2[0] = firstVisibleItemPos[0];
                int i28 = firstVisibleItemPos[0];
                int i29 = lastVisibleItemPos[lastVisibleItemPos.length - 1];
                if (i28 <= i29) {
                    int i37 = 0;
                    while (true) {
                        so2.j5 h17 = gVar.h(i28);
                        if (h17 instanceof so2.h1) {
                            android.view.View mo7935xa188593e = layoutManager.mo7935xa188593e(i28);
                            if (mo7935xa188593e != null) {
                                android.graphics.Rect rect = new android.graphics.Rect();
                                mo7935xa188593e.getGlobalVisibleRect(rect);
                                if (rect.contains(rect.left, i19)) {
                                    if (z19) {
                                        z19 = false;
                                        i37 = 0;
                                    }
                                    int i38 = i37 + 1;
                                    iArr2[i37] = i28;
                                    if (gVar.i(layoutManager, i28)) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "finderCenterVisibleItemPos item hit baseline for big card, focus[" + iArr2[0] + "] focusItemIndex:" + i38 + " rect:" + rect + " baseline:" + i19);
                                        iArr = new int[]{i28};
                                        break;
                                    }
                                    if (i38 >= i27) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "finderCenterVisibleItemPos item hit baseline, focus[" + iArr2[0] + "] focusItemIndex:" + i38 + " rect:" + rect + " baseline:" + i19);
                                        break;
                                    }
                                    i37 = i38;
                                    z17 = false;
                                } else {
                                    if (rect.top > i19) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "finderCenterVisibleItemPos item hit divider, focus[" + iArr2[0] + "] focusItemIndex:" + i37 + " rect:" + rect + " baseline:" + i19);
                                        break;
                                    }
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finderCenterVisibleItemPos item hit cache, focus[");
                                    z17 = false;
                                    sb6.append(iArr2[0]);
                                    sb6.append("] focusItemIndex:");
                                    sb6.append(i37);
                                    sb6.append(" rect:");
                                    sb6.append(rect);
                                    sb6.append(" baseline:");
                                    sb6.append(i19);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", sb6.toString());
                                    int i39 = i37 + 1;
                                    iArr2[i37] = i28;
                                    i37 = i39 >= i27 ? 0 : i39;
                                }
                            } else {
                                z17 = z18;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveAutoPlaySelector", "finderCenterVisibleItemPos invalid view index:" + i28);
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveAutoPlaySelector", "finderCenterVisibleItemPos invalid feed:" + h17 + " index:" + i28);
                            z17 = z18;
                        }
                        if (i28 == i29) {
                            break;
                        }
                        i28++;
                        layoutManager = c1164x587b7ff1;
                        z18 = z17;
                        gVar = this;
                    }
                }
                iArr = iArr2;
            } else if (i18 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: TotalFirstRow mode, playOrder=0, find first full row");
                iArr = gVar.g(firstVisibleItemPos, lastVisibleItemPos, layoutManager, hp2.f.f364459d);
            } else if (i18 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: unknown focusPlayMode=" + gVar.f364465f + ", return empty");
                iArr = new int[0];
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: TotalTwoRows mode, playOrder=0, find two rows");
                int[] g17 = gVar.g(firstVisibleItemPos, lastVisibleItemPos, layoutManager, hp2.d.f364457d);
                if (g17.length == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]finderFirstFullVisibleAndBelowItemPos no full visible item found");
                    iArr = new int[0];
                } else {
                    int e07 = kz5.z.e0(g17) + 1;
                    int[] g18 = e07 <= kz5.z.e0(lastVisibleItemPos) ? gVar.g(new int[]{e07}, lastVisibleItemPos, layoutManager, hp2.e.f364458d) : new int[0];
                    int length = g17.length;
                    int length2 = g18.length;
                    int[] copyOf = java.util.Arrays.copyOf(g17, length + length2);
                    java.lang.System.arraycopy(g18, 0, copyOf, length, length2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(copyOf);
                    java.lang.String arrays = java.util.Arrays.toString(copyOf);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]finderFirstFullVisibleAndBelowItemPos return focusItemPos:".concat(arrays));
                    iArr = copyOf;
                }
            }
        } else if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: playOrder=" + gVar.f364467h + ", return empty");
            iArr = new int[0];
        } else if (gVar.f364465f == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: TotalTwoRows mode, playOrder=1, find first visible row");
            iArr = gVar.g(firstVisibleItemPos, lastVisibleItemPos, layoutManager, hp2.c.f364456d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: playOrder=1, focusPlayMode=" + gVar.f364465f + ", return empty");
            iArr = new int[0];
        }
        java.lang.String arrays2 = java.util.Arrays.toString(iArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays2, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: autoPlayList=".concat(arrays2));
        return iArr;
    }

    public final int[] g(int[] iArr, int[] iArr2, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1, yz5.q qVar) {
        int i17;
        int i18 = this.f364462c;
        int[] iArr3 = new int[i18];
        int i19 = iArr[0];
        boolean z17 = true;
        int i27 = iArr2[iArr2.length - 1];
        if (i19 <= i27) {
            int i28 = 0;
            while (true) {
                so2.j5 h17 = h(i19);
                if (h17 instanceof so2.h1) {
                    android.view.View mo7935xa188593e = c1164x587b7ff1.mo7935xa188593e(i19);
                    if (mo7935xa188593e != null) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        mo7935xa188593e.getGlobalVisibleRect(rect);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]finderTargetVisibleItemPos feed.nickname[" + ((so2.h1) h17).getFeedObject().m59273x80025a04() + "] index:" + i19 + " rect:" + rect);
                        if (((java.lang.Boolean) qVar.mo147xb9724478(java.lang.Integer.valueOf(i19), mo7935xa188593e, rect)).booleanValue()) {
                            if (z17) {
                                i28 = 0;
                                z17 = false;
                            }
                            i17 = i28 + 1;
                            iArr3[i28] = i19;
                            if (i(c1164x587b7ff1, i19)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]finderTargetVisibleItemPos item hit baseline for big card, focus[" + iArr3[0] + "] focusItemIndex:" + i17 + " rect:" + rect);
                                iArr3 = new int[]{i19};
                                break;
                            }
                            if (i17 >= i18) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck]finderTargetVisibleItemPos item hit baseline, focus[");
                                java.lang.String arrays = java.util.Arrays.toString(iArr3);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
                                sb6.append(arrays);
                                sb6.append("] rect:");
                                sb6.append(rect);
                                sb6.append(" focusItemCount:");
                                sb6.append(i18);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", sb6.toString());
                                break;
                            }
                            i28 = i17;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]finderTargetVisibleItemPos item not hit baseline, index:" + i19 + " rect:" + rect);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]finderTargetVisibleItemPos invalid view index:" + i19);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]finderTargetVisibleItemPos invalid feed:" + h17 + " index:" + i19);
                }
                if (i19 == i27) {
                    i17 = i28;
                    break;
                }
                i19++;
            }
        } else {
            i17 = 0;
        }
        if (i17 == 0) {
            return new int[0];
        }
        int[] copyOf = java.util.Arrays.copyOf(iArr3, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
        return copyOf;
    }

    public so2.j5 h(int i17) {
        java.util.List list = this.f364460a;
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveAutoPlaySelector", "getFeedByPos return for feedList:" + list);
            return null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f364461b;
        int a07 = i17 - (c22848x6ddd90cf != null ? c22848x6ddd90cf.a0() : 0);
        if (a07 < 0 || a07 >= list.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveAutoPlaySelector", "getFeedByPos return for invalid pos:" + i17);
            return null;
        }
        java.lang.Object obj = list.get(a07);
        if (obj instanceof so2.j5) {
            return (so2.j5) obj;
        }
        return null;
    }

    public boolean i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 layoutManager, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        if (h(i17) instanceof vp2.d) {
            return true;
        }
        android.view.View mo7935xa188593e = layoutManager.mo7935xa188593e(i17);
        if (mo7935xa188593e != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            mo7935xa188593e.getGlobalVisibleRect(rect);
            int i18 = rect.right;
            int i19 = this.f364464e;
            boolean z17 = i18 < i19 / 2;
            boolean z18 = rect.left > i19 / 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelector", "isSingleOneLine pos: " + i17 + " left: " + rect.left + " right: " + rect.right);
            if (z17) {
                return !(h(i17 + 1) instanceof so2.h1);
            }
            if (z18) {
                return !(h(i17 - 1) instanceof so2.h1);
            }
        }
        return false;
    }
}
