package id2;

/* loaded from: classes3.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f372095e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(id2.v1 v1Var, java.lang.String str) {
        super(1);
        this.f372094d = v1Var;
        this.f372095e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedHashMap linkedHashMap;
        java.lang.Object obj2;
        r45.s64 s64Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        id2.v1 v1Var = this.f372094d;
        android.view.View view = (android.view.View) ((jz5.n) v1Var.f372379s).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = 0;
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderGetUpLevelProductRequest, errType=");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
        sb6.append(", errCode=");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = v1Var.f372367d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (fVar != null && fVar.f152148a == 0 && fVar.f152149b == 0) {
            android.view.View view2 = (android.view.View) ((jz5.n) v1Var.f372382v).mo141623x754a37bb();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            v1Var.T6().setVisibility(0);
            ((android.widget.TextView) ((jz5.n) v1Var.f372372i).mo141623x754a37bb()).setEnabled(true);
            r45.qa1 qa1Var = (r45.qa1) fVar.f152151d;
            if (qa1Var == null) {
                return null;
            }
            v1Var.V6(true);
            android.view.View view3 = (android.view.View) ((jz5.n) v1Var.f372380t).mo141623x754a37bb();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "FinderGetUpLevelProductRequest, resp=" + pm0.b0.g(qa1Var));
            java.util.LinkedList m75941xfb821914 = qa1Var.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getItem_list(...)");
            v1Var.D = m75941xfb821914;
            java.util.LinkedList m75941xfb8219142 = qa1Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getProduct_meta_list(...)");
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                linkedHashMap = v1Var.E;
                if (!hasNext) {
                    break;
                }
                r45.kv1 kv1Var = (r45.kv1) it.next();
                java.lang.String m75945x2fec8307 = kv1Var.m75945x2fec8307(0);
                if (m75945x2fec8307 != null) {
                    linkedHashMap.put(m75945x2fec8307, kv1Var);
                }
            }
            v1Var.F = qa1Var.m75942xfb822ef2(3);
            java.util.LinkedList linkedList = v1Var.D;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj3 : linkedList) {
                if (((r45.n30) obj3).m75939xb282bd08(1) > 0) {
                    arrayList4.add(obj3);
                }
            }
            java.util.Iterator it6 = arrayList4.iterator();
            long j17 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                r45.n30 n30Var = (r45.n30) it6.next();
                java.lang.String m75945x2fec83072 = n30Var.m75945x2fec8307(i17);
                r45.kv1 kv1Var2 = (r45.kv1) linkedHashMap.get(m75945x2fec83072 != null ? m75945x2fec83072 : "");
                if (kv1Var2 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "pkg_gift = " + kv1Var2.m75945x2fec8307(8) + ", price = " + kv1Var2.m75938x746dc8a6(9) + ", count =" + n30Var.m75939xb282bd08(1));
                }
                j17 += n30Var.m75939xb282bd08(1) * (kv1Var2 != null ? kv1Var2.m75938x746dc8a6(9) : 0.0f);
                i17 = 0;
            }
            ((android.widget.TextView) ((jz5.n) v1Var.f372371h).mo141623x754a37bb()).setText(java.lang.String.valueOf(j17));
            v1Var.H = j17;
            java.util.LinkedList m75941xfb8219143 = qa1Var.m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getLevel_config_list(...)");
            v1Var.I = m75941xfb8219143;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("");
            for (r45.s64 s64Var2 : v1Var.I) {
                sb8.append("level(" + s64Var2.m75939xb282bd08(0) + ")-coin(" + s64Var2.m75942xfb822ef2(1) + ")\n");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[levelConfigList] " + ((java.lang.Object) sb8));
            v1Var.f372366J = qa1Var.m75942xfb822ef2(5);
            v1Var.K = qa1Var.m75942xfb822ef2(6);
            long j18 = v1Var.F + j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "targetConsumedCoin = " + j18 + ", giftTotalCoin = " + j17 + ", consumedCoin = " + v1Var.F);
            if (j18 <= ((r45.s64) kz5.n0.X(v1Var.I)).m75942xfb822ef2(1)) {
                s64Var = (r45.s64) kz5.n0.X(v1Var.I);
            } else {
                java.util.LinkedList linkedList2 = v1Var.I;
                java.util.ListIterator listIterator = linkedList2.listIterator(linkedList2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = listIterator.previous();
                    if (j18 > ((r45.s64) obj2).m75942xfb822ef2(1)) {
                        break;
                    }
                }
                s64Var = (r45.s64) obj2;
                if (s64Var == null) {
                    s64Var = (r45.s64) kz5.n0.i0(v1Var.I);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mTargetLevel = " + v1Var.L + ", svr told level = " + s64Var.m75939xb282bd08(0));
            if (v1Var.L < s64Var.m75939xb282bd08(0)) {
                v1Var.L = s64Var.m75939xb282bd08(0);
                v1Var.W6(null);
            }
            ((id2.q) ((jz5.n) v1Var.B).mo141623x754a37bb()).x();
        } else {
            java.lang.String str2 = fVar != null ? fVar.f152150c : null;
            if (str2 == null) {
                str2 = v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573095dj4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getString(...)");
            }
            db5.t7.m(v1Var.m158354x19263085(), str2);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f372095e, "initView")) {
                v1Var.m158354x19263085().finish();
            }
        }
        return f0Var;
    }
}
