package ox1;

/* loaded from: classes12.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox1.s f431135d;

    public i(ox1.s sVar) {
        this.f431135d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        int i18;
        int d17;
        java.lang.String sb6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Editor.EditorSelectManager", "paste");
        boolean z17 = ox1.s.K;
        ox1.s sVar = this.f431135d;
        if (!z17 || !sVar.f431148a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "paste: not init or not editable");
            sVar.p();
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (ox1.s.a(sVar)) {
            mx1.a aVar = sVar.f431169v;
            if (aVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar).h7();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        sVar.p();
        int c17 = nx1.b.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.String str = "";
        boolean z18 = false;
        java.util.ArrayList arrayList2 = null;
        if (c17 == 2) {
            if (sVar.f431169v != null && nx1.b.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) sVar.f431169v).f7();
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            try {
                java.lang.CharSequence a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.a();
                if (a17 instanceof android.text.Spanned) {
                    sb6 = lx1.c.a((android.text.Spanned) a17);
                } else {
                    java.lang.String charSequence = a17.toString();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    lx1.c.c(charSequence, sb7, 0, charSequence.length());
                    sb6 = sb7.toString();
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb6)) {
                    str = sb6;
                }
                nx1.b.a();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "get clipboard data error : ", e17);
                sVar.r();
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else {
            if (c17 != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "paste: no data");
                sVar.r();
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.util.ArrayList b17 = nx1.b.b();
            if (b17.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "paste: tempDataList is null or empty");
                sVar.r();
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (b17.size() == 1 && b17.get(0) != null && ((ix1.a) b17.get(0)).b() == 1) {
                str = ((ix1.l) b17.get(0)).f376871s;
            } else {
                arrayList2 = b17;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (arrayList2 == null || arrayList2.size() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "paste: no useful data");
            sVar.r();
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (sVar.f431169v != null) {
            int m17 = sVar.m();
            if (m17 != 0) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder(str);
                if (arrayList2 != null) {
                    java.util.Iterator it = arrayList2.iterator();
                    i17 = 0;
                    while (it.hasNext()) {
                        ix1.a aVar2 = (ix1.a) it.next();
                        if (aVar2 != null) {
                            if (aVar2.b() != 1) {
                                i17++;
                            } else {
                                sb8.append(((ix1.l) aVar2).f376871s);
                            }
                        }
                    }
                } else {
                    i17 = 0;
                }
                int d18 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.d(sb8.toString());
                if (m17 == 2 || m17 == 3) {
                    for (int i19 = sVar.f431170w.f431128a; i19 <= sVar.f431170w.f431130c; i19++) {
                        ix1.a l17 = nx1.d.q().l(i19);
                        if (l17 != null) {
                            if (l17.b() == 1) {
                                ox1.e eVar = sVar.f431170w;
                                int i27 = eVar.f431128a;
                                if (i19 == i27 && i19 == eVar.f431130c) {
                                    java.lang.String str2 = ((ix1.l) l17).f376871s;
                                    int i28 = eVar.f431129b;
                                    int i29 = eVar.f431131d;
                                    i18 = 0;
                                    d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.e(str2, i28, i29, false);
                                } else if (i19 == i27) {
                                    d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.e(((ix1.l) l17).f376871s, eVar.f431129b, -1, true);
                                    i18 = 0;
                                } else if (i19 == eVar.f431130c) {
                                    java.lang.String str3 = ((ix1.l) l17).f376871s;
                                    int i37 = eVar.f431131d;
                                    i18 = 0;
                                    d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.e(str3, 0, i37, false);
                                } else {
                                    i18 = 0;
                                    d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.d(((ix1.l) l17).f376871s);
                                }
                                d18 -= d17 + i18;
                            } else if (l17.b() != 1) {
                                i17--;
                            }
                        }
                    }
                }
                z18 = nx1.d.q().f(d18, i17);
            }
            if (z18) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) sVar.f431169v).f7();
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        int m18 = sVar.m();
        if (m18 == 1 || m18 == 2) {
            sVar.f(true, arrayList2, str);
        } else if (m18 == 3) {
            sVar.e(true, arrayList2, str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "paste: invalid selection");
            sVar.r();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
