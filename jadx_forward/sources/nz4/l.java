package nz4;

/* loaded from: classes12.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz4.y f423160d;

    public l(nz4.y yVar) {
        this.f423160d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList b17;
        java.lang.String str;
        int i17;
        int i18;
        int e17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NoteSelectManager", "paste");
        hz4.h hVar = ((hz4.f) hz4.f.wi()).f367940d;
        if (hVar != null) {
            java.lang.String h17 = hVar.h();
            hz4.i iVar = hVar.f367951i;
            java.lang.String a17 = iVar.a(h17);
            boolean g17 = hVar.g();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6447xbd8a5a3 c6447xbd8a5a3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6447xbd8a5a3();
            c6447xbd8a5a3.f137877d = 32;
            c6447xbd8a5a3.f137879f = c6447xbd8a5a3.b("noteid", a17, true);
            c6447xbd8a5a3.f137880g = g17 ? 1 : 0;
            c6447xbd8a5a3.f137878e = c6447xbd8a5a3.b("sessionID", iVar.f367958a, true);
            c6447xbd8a5a3.k();
            pz4.a.f440718a.b(c6447xbd8a5a3);
        }
        boolean z17 = nz4.y.M;
        nz4.y yVar = this.f423160d;
        if (!z17 || !yVar.f423176a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "paste: not init or not editable");
            yVar.p();
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (nz4.y.a(yVar)) {
            lz4.a aVar = yVar.f423197v;
            if (aVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).w7();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        yVar.p();
        int c17 = mz4.u.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        boolean z18 = false;
        if (c17 == 2) {
            if (yVar.f423197v != null && mz4.u.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) yVar.f423197v).v7();
                yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            try {
                nz4.d a18 = nz4.e.f423134a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                str = a18.f423132a;
                b17 = a18.f423133b;
                mz4.u.a();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "get clipboard data error : ", e18);
                yVar.s();
                yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else {
            if (c17 != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "paste: no data");
                yVar.s();
                yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            b17 = mz4.u.b();
            if (b17.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "paste: tempDataList is null or empty");
                yVar.s();
                yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (b17.size() == 1 && b17.get(0) != null && ((iz4.c) b17.get(0)).d() == 1) {
                str = ((iz4.i) b17.get(0)).f377688t;
                b17 = null;
            } else {
                str = "";
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (b17 == null || b17.size() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "paste: no useful data");
            yVar.s();
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (yVar.f423197v != null) {
            int m17 = yVar.m();
            if (m17 != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
                if (b17 != null) {
                    java.util.Iterator it = b17.iterator();
                    i17 = 0;
                    while (it.hasNext()) {
                        iz4.c cVar = (iz4.c) it.next();
                        if (cVar != null) {
                            if (cVar.d() != 1) {
                                i17++;
                            } else {
                                sb6.append(((iz4.i) cVar).f377688t);
                            }
                        }
                    }
                } else {
                    i17 = 0;
                }
                int e19 = qz4.c.e(sb6.toString());
                if (m17 == 2 || m17 == 3) {
                    for (int i19 = yVar.f423198w.f423152a; i19 <= yVar.f423198w.f423154c; i19++) {
                        iz4.c l17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) yVar.f423197v).J1.l(i19);
                        if (l17 != null) {
                            if (l17.d() == 1) {
                                nz4.h hVar2 = yVar.f423198w;
                                int i27 = hVar2.f423152a;
                                if (i19 == i27 && i19 == hVar2.f423154c) {
                                    java.lang.String str2 = ((iz4.i) l17).f377688t;
                                    int i28 = hVar2.f423153b;
                                    int i29 = hVar2.f423155d;
                                    i18 = 0;
                                    e17 = qz4.c.f(str2, i28, i29, false);
                                } else if (i19 == i27) {
                                    e17 = qz4.c.f(((iz4.i) l17).f377688t, hVar2.f423153b, -1, true);
                                    i18 = 0;
                                } else if (i19 == hVar2.f423154c) {
                                    java.lang.String str3 = ((iz4.i) l17).f377688t;
                                    int i37 = hVar2.f423155d;
                                    i18 = 0;
                                    e17 = qz4.c.f(str3, 0, i37, false);
                                } else {
                                    i18 = 0;
                                    e17 = qz4.c.e(((iz4.i) l17).f377688t);
                                }
                                e19 -= e17 + i18;
                            } else if (l17.d() != 1) {
                                i17--;
                            }
                        }
                    }
                }
                z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) yVar.f423197v).J1.f(e19, i17);
            }
            if (z18) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) yVar.f423197v).v7();
                yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        int m18 = yVar.m();
        if (m18 == 1 || m18 == 2) {
            yVar.f(true, b17, str);
        } else if (m18 == 3) {
            yVar.e(true, b17, str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "paste: invalid selection");
            yVar.s();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
