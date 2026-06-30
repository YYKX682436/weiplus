package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class la {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f105693a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f105694b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f105695c;

    public la(zy2.fa redDotManager) {
        kotlin.jvm.internal.o.g(redDotManager, "redDotManager");
        this.f105693a = redDotManager;
        this.f105694b = "Finder.RedDotSwipeDownRevokeHandler";
        this.f105695c = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.ka.f105638d);
    }

    public final void a(androidx.recyclerview.widget.RecyclerView swipeView, int i17) {
        java.util.HashMap hashMap;
        r45.ii6 ii6Var;
        java.lang.Object obj;
        int i18;
        kotlin.jvm.internal.o.g(swipeView, "swipeView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = swipeView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int x17 = linearLayoutManager.x();
        android.util.ArrayMap arrayMap = (android.util.ArrayMap) ((jz5.n) this.f105695c).getValue();
        com.tencent.mm.plugin.finder.extension.reddot.ia iaVar = new com.tencent.mm.plugin.finder.extension.reddot.ia(i17, x17);
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        kotlin.jvm.internal.o.g(arrayMap, "<this>");
        synchronized (arrayMap) {
            java.util.Iterator it = arrayMap.entrySet().iterator();
            hashMap = null;
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (((java.lang.Boolean) iaVar.invoke(entry.getValue())).booleanValue()) {
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
        java.lang.String str = this.f105694b;
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
            kotlin.jvm.internal.o.f(value, "<get-value>(...)");
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
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        java.util.Iterator it7 = hashMap.entrySet().iterator();
        while (it7.hasNext()) {
            java.lang.String str2 = (java.lang.String) ((java.util.Map.Entry) it7.next()).getKey();
            zy2.fa faVar = this.f105693a;
            kotlin.jvm.internal.o.d(str2);
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
                    if (ii6Var2.f377086d && ii6Var2.f377087e == i17 && (i18 = ii6Var2.f377088f) >= 0 && x17 >= i18) {
                        break;
                    }
                }
                ii6Var = (r45.ii6) obj;
            } else {
                ii6Var = null;
            }
            if (ii6Var != null) {
                java.lang.String str3 = this.f105694b;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("checkSwipeDownRevoke revoke showInfo:");
                sb8.append(hc2.z0.b(I0, 0));
                sb8.append("; config:");
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                for (r45.ii6 ii6Var3 : linkedList) {
                    kotlin.jvm.internal.o.d(ii6Var3);
                    arrayList3.add(pm0.b0.g(ii6Var3));
                }
                sb8.append(arrayList3);
                com.tencent.mars.xlog.Log.i(str3, sb8.toString());
                this.f105693a.N(str2);
            }
        }
    }

    public final void b(com.tencent.mm.plugin.finder.extension.reddot.jb localCtrlInfo) {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var;
        java.util.LinkedList<r45.f03> linkedList;
        kotlin.jvm.internal.o.g(localCtrlInfo, "localCtrlInfo");
        if (com.tencent.mm.plugin.finder.storage.aj0.f126440a.E() == 1) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                r45.vs2 vs2Var = localCtrlInfo.field_ctrInfo;
                if (vs2Var == null || (linkedList = vs2Var.f388489g) == null) {
                    f0Var = null;
                } else {
                    for (r45.f03 f03Var : linkedList) {
                        java.util.LinkedList swipe_down_revoke_config = f03Var.D;
                        kotlin.jvm.internal.o.f(swipe_down_revoke_config, "swipe_down_revoke_config");
                        if (!swipe_down_revoke_config.isEmpty()) {
                            synchronized (((android.util.ArrayMap) ((jz5.n) this.f105695c).getValue())) {
                                android.util.ArrayMap arrayMap = (android.util.ArrayMap) ((jz5.n) this.f105695c).getValue();
                                java.lang.String str = f03Var.f373892i;
                                java.util.LinkedList swipe_down_revoke_config2 = f03Var.D;
                                kotlin.jvm.internal.o.f(swipe_down_revoke_config2, "swipe_down_revoke_config");
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (java.lang.Object obj : swipe_down_revoke_config2) {
                                    r45.ii6 ii6Var = (r45.ii6) obj;
                                    if (ii6Var.f377086d && ii6Var.f377088f >= 0) {
                                        arrayList.add(obj);
                                    }
                                }
                                arrayMap.put(str, kz5.n0.V0(arrayList));
                                java.lang.String str2 = this.f105694b;
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append("saveSwipeDownRevokeConfig showInfo:");
                                sb6.append(hc2.z0.b(f03Var, 0));
                                sb6.append("; config:");
                                java.util.LinkedList<r45.ii6> swipe_down_revoke_config3 = f03Var.D;
                                kotlin.jvm.internal.o.f(swipe_down_revoke_config3, "swipe_down_revoke_config");
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(swipe_down_revoke_config3, 10));
                                for (r45.ii6 ii6Var2 : swipe_down_revoke_config3) {
                                    kotlin.jvm.internal.o.d(ii6Var2);
                                    arrayList2.add(pm0.b0.g(ii6Var2));
                                }
                                sb6.append(arrayList2);
                                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                            }
                        }
                    }
                    f0Var = jz5.f0.f302826a;
                }
                m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f105694b, m524exceptionOrNullimpl, "read show_infos crash!", new java.lang.Object[0]);
            }
        }
    }
}
