package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes2.dex */
public final class la {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f187226a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f187227b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f187228c;

    public la(zy2.fa redDotManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotManager, "redDotManager");
        this.f187226a = redDotManager;
        this.f187227b = "Finder.RedDotSwipeDownRevokeHandler";
        this.f187228c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ka.f187171d);
    }

    public final void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 swipeView, int i17) {
        java.util.HashMap hashMap;
        r45.ii6 ii6Var;
        java.lang.Object obj;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(swipeView, "swipeView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = swipeView.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            return;
        }
        int x17 = c1162x665295de.x();
        android.util.ArrayMap arrayMap = (android.util.ArrayMap) ((jz5.n) this.f187228c).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ia iaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ia(i17, x17);
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrayMap, "<this>");
        synchronized (arrayMap) {
            java.util.Iterator it = arrayMap.entrySet().iterator();
            hashMap = null;
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (((java.lang.Boolean) iaVar.mo146xb9724478(entry.getValue())).booleanValue()) {
                    if (hashMap == null) {
                        hashMap = new java.util.HashMap();
                    }
                    hashMap.put(entry.getKey(), entry.getValue());
                    it.remove();
                }
            }
        }
        if (hashMap == null) {
            return;
        }
        java.lang.String str = this.f187227b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkSwipeDownRevoke curTabType=");
        sb6.append(i17);
        sb6.append(",curFocusItemPos=");
        sb6.append(x17);
        sb6.append(",find revoke config:");
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("path=");
            sb7.append((java.lang.String) entry2.getKey());
            sb7.append(",config=");
            java.lang.Object value = entry2.getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
            java.lang.Iterable iterable = (java.lang.Iterable) value;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(iterable, 10));
            java.util.Iterator it6 = iterable.iterator();
            while (it6.hasNext()) {
                arrayList2.add(pm0.b0.g((r45.ii6) it6.next()));
            }
            sb7.append(arrayList2);
            arrayList.add(sb7.toString());
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        java.util.Iterator it7 = hashMap.entrySet().iterator();
        while (it7.hasNext()) {
            java.lang.String str2 = (java.lang.String) ((java.util.Map.Entry) it7.next()).getKey();
            zy2.fa faVar = this.f187226a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            r45.f03 I0 = faVar.I0(str2);
            java.util.LinkedList<r45.ii6> linkedList = I0 != null ? I0.D : null;
            if (linkedList != null) {
                java.util.Iterator it8 = linkedList.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it8.next();
                    r45.ii6 ii6Var2 = (r45.ii6) obj;
                    if (ii6Var2.f458619d && ii6Var2.f458620e == i17 && (i18 = ii6Var2.f458621f) >= 0 && x17 >= i18) {
                        break;
                    }
                }
                ii6Var = (r45.ii6) obj;
            } else {
                ii6Var = null;
            }
            if (ii6Var != null) {
                java.lang.String str3 = this.f187227b;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("checkSwipeDownRevoke revoke showInfo:");
                sb8.append(hc2.z0.b(I0, 0));
                sb8.append("; config:");
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                for (r45.ii6 ii6Var3 : linkedList) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ii6Var3);
                    arrayList3.add(pm0.b0.g(ii6Var3));
                }
                sb8.append(arrayList3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb8.toString());
                this.f187226a.N(str2);
            }
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb localCtrlInfo) {
        java.lang.Object m143895xf1229813;
        jz5.f0 f0Var;
        java.util.LinkedList<r45.f03> linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localCtrlInfo, "localCtrlInfo");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.E() == 1) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                r45.vs2 vs2Var = localCtrlInfo.f65874xb5f7102a;
                if (vs2Var == null || (linkedList = vs2Var.f470022g) == null) {
                    f0Var = null;
                } else {
                    for (r45.f03 f03Var : linkedList) {
                        java.util.LinkedList swipe_down_revoke_config = f03Var.D;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(swipe_down_revoke_config, "swipe_down_revoke_config");
                        if (!swipe_down_revoke_config.isEmpty()) {
                            synchronized (((android.util.ArrayMap) ((jz5.n) this.f187228c).mo141623x754a37bb())) {
                                android.util.ArrayMap arrayMap = (android.util.ArrayMap) ((jz5.n) this.f187228c).mo141623x754a37bb();
                                java.lang.String str = f03Var.f455425i;
                                java.util.LinkedList swipe_down_revoke_config2 = f03Var.D;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(swipe_down_revoke_config2, "swipe_down_revoke_config");
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (java.lang.Object obj : swipe_down_revoke_config2) {
                                    r45.ii6 ii6Var = (r45.ii6) obj;
                                    if (ii6Var.f458619d && ii6Var.f458621f >= 0) {
                                        arrayList.add(obj);
                                    }
                                }
                                arrayMap.put(str, kz5.n0.V0(arrayList));
                                java.lang.String str2 = this.f187227b;
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append("saveSwipeDownRevokeConfig showInfo:");
                                sb6.append(hc2.z0.b(f03Var, 0));
                                sb6.append("; config:");
                                java.util.LinkedList<r45.ii6> swipe_down_revoke_config3 = f03Var.D;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(swipe_down_revoke_config3, "swipe_down_revoke_config");
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(swipe_down_revoke_config3, 10));
                                for (r45.ii6 ii6Var2 : swipe_down_revoke_config3) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ii6Var2);
                                    arrayList2.add(pm0.b0.g(ii6Var2));
                                }
                                sb6.append(arrayList2);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                            }
                        }
                    }
                    f0Var = jz5.f0.f384359a;
                }
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f187227b, m143898xd4a2fc34, "read show_infos crash!", new java.lang.Object[0]);
            }
        }
    }
}
