package hp2;

/* loaded from: classes2.dex */
public final class h implements hp2.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f364468a;

    /* renamed from: b, reason: collision with root package name */
    public int f364469b;

    public h(java.util.ArrayList feedList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedList, "feedList");
        this.f364468a = feedList;
        this.f364469b = 1;
    }

    @Override // hp2.a
    public void a(int i17) {
        this.f364469b = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelectorHorizontal", "setFocusPlayMode: " + this.f364469b);
        zl2.q4 q4Var = zl2.q4.f555466a;
        if (q4Var.E()) {
            ae2.in inVar = ae2.in.f85221a;
            jz5.g gVar = ae2.in.f85438w;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() != -1) {
                this.f364469b = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelectorHorizontal", "setFocusPlayModeFromMock: " + this.f364469b);
            }
        }
        if (q4Var.E()) {
            ae2.in inVar2 = ae2.in.f85221a;
            jz5.g gVar2 = ae2.in.f85447x;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue() != -1) {
                this.f364469b = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelectorHorizontal", "setFocusPlayModeFromMock: " + this.f364469b);
            }
        }
    }

    @Override // hp2.a
    public boolean b(int i17, boolean z17) {
        boolean z18 = false;
        if (i17 == 0 ? z17 : !(i17 != 1 || this.f364469b != 2)) {
            z18 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelectorHorizontal", "setPlayOrder: playOrder=" + i17 + ", focusPlayMode=" + this.f364469b + ", shouldPlay=" + z18 + "，isYAxisFullyVisible=" + z17);
        return z18;
    }

    @Override // hp2.a
    public int c() {
        return this.f364469b;
    }

    @Override // hp2.a
    public java.util.Set d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 layoutManager, java.util.HashSet curLivePreviewDataSet) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curLivePreviewDataSet, "curLivePreviewDataSet");
        java.util.HashSet hashSet = new java.util.HashSet();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        layoutManager.u(iArr);
        layoutManager.v(iArr2);
        int[] f17 = f(layoutManager, iArr, iArr2);
        int length = f17.length;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = f17[i17];
            java.util.Iterator it = curLivePreviewDataSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (i18 == ((gp2.f) obj).f355747a) {
                    break;
                }
            }
            gp2.f fVar = (gp2.f) obj;
            if (fVar != null) {
                hashSet.add(fVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveAutoPlaySelectorHorizontal", "findAutoStopItem hit cur play view index:" + fVar.f355747a + " size:" + hashSet.size());
            }
        }
        java.util.Set<gp2.f> g17 = kz5.q1.g(curLivePreviewDataSet, hashSet);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("findAutoStopItem list ");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(g17, 10));
        for (gp2.f fVar2 : g17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(fVar2.f355747a);
            sb7.append(' ');
            arrayList.add(sb7.toString());
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveAutoPlaySelectorHorizontal", sb6.toString());
        return g17;
    }

    @Override // hp2.a
    public int[] e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 layoutManager, int[] firstVisibleItemPos, int[] lastVisibleItemPos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(firstVisibleItemPos, "firstVisibleItemPos");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastVisibleItemPos, "lastVisibleItemPos");
        return f(layoutManager, firstVisibleItemPos, lastVisibleItemPos);
    }

    public final int[] f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1, int[] iArr, int[] iArr2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = iArr[0];
        int i18 = iArr2[0];
        if (i17 <= i18) {
            while (true) {
                so2.j5 j5Var = null;
                java.util.ArrayList arrayList2 = this.f364468a;
                if (arrayList2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveAutoPlaySelectorHorizontal", "getFeedByPos return for feedList:" + arrayList2);
                } else if (i17 < 0 || i17 >= arrayList2.size()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveAutoPlaySelectorHorizontal", "getFeedByPos return for invalid pos:" + i17);
                } else {
                    j5Var = (so2.j5) arrayList2.get(i17);
                }
                if (j5Var instanceof so2.h1) {
                    android.view.View mo7935xa188593e = c1164x587b7ff1.mo7935xa188593e(i17);
                    if (mo7935xa188593e != null) {
                        mo7935xa188593e.getGlobalVisibleRect(new android.graphics.Rect());
                        dp2.a aVar = dp2.a.f323716a;
                        android.graphics.Rect rect = new android.graphics.Rect();
                        mo7935xa188593e.getGlobalVisibleRect(rect);
                        if ((((float) rect.height()) * 1.0f) / ((float) mo7935xa188593e.getHeight()) >= 0.5f && (((float) rect.width()) * 1.0f) / ((float) mo7935xa188593e.getWidth()) >= 0.5f) {
                            arrayList.add(java.lang.Integer.valueOf(i17));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveAutoPlaySelectorHorizontal", "findAutoPlayItem hit view index:" + i17 + ' ' + arrayList);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveAutoPlaySelectorHorizontal", "findAutoPlayItem invalid view index:" + i17);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveAutoPlaySelectorHorizontal", "findAutoPlayItem invalid feed:" + j5Var + " index:" + i17);
                }
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
        }
        return kz5.n0.R0(arrayList);
    }
}
