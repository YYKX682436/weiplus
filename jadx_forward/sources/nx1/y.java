package nx1;

/* loaded from: classes12.dex */
public class y implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx1.z f422861d;

    public y(nx1.z zVar) {
        this.f422861d = zVar;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        boolean w17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        if (nx1.d.q().B() == 0) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        nx1.z zVar = this.f422861d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a b17 = zVar.b();
        if (b17 == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        int m54593xef703fb1 = b17.m54593xef703fb1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXRTManager", "current focus pos: %d", java.lang.Integer.valueOf(m54593xef703fb1));
        ix1.a l17 = nx1.d.q().l(m54593xef703fb1);
        if (l17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WXRTManager", "get current item is null %d", java.lang.Integer.valueOf(m54593xef703fb1));
            yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        int i18 = m54593xef703fb1 - 1;
        ix1.a l18 = nx1.d.q().l(i18);
        if (l18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXRTManager", "get preItem is null %d", java.lang.Integer.valueOf(m54593xef703fb1));
            if (b17.m54589xbc88a4a7() == 0 && !nx1.z.a(zVar, b17, m54593xef703fb1)) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
        }
        int m54589xbc88a4a7 = b17.m54589xbc88a4a7();
        if (m54589xbc88a4a7 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXRTManager", "Handle Editor Type EDITTEXT");
            if (!nx1.z.a(zVar, b17, m54593xef703fb1)) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
            java.lang.String w18 = b17.w(nx1.w.f422857b);
            nx1.d.q().i();
            if (l18.b() == 1) {
                w17 = nx1.d.q().w(m54593xef703fb1, true);
                ix1.l lVar = (ix1.l) l18;
                int length = lVar.f376849f.getText().toString().length();
                lVar.f376871s += w18;
                lVar.f376846c = length;
                lVar.f376845b = true;
                lVar.f376850g = false;
            } else {
                w17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w18) ? nx1.d.q().w(m54593xef703fb1, true) : false;
                l18.f376848e.setSelection(0);
                l18.f376845b = true;
                l18.f376850g = false;
            }
            if (w17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) zVar.f422865b;
                abstractActivityC13156x6363e8e1.getClass();
                abstractActivityC13156x6363e8e1.j3(i18, 0L);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e12 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) zVar.f422865b;
                abstractActivityC13156x6363e8e12.getClass();
                abstractActivityC13156x6363e8e12.e7(i18, 2);
            }
        } else if (m54589xbc88a4a7 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXRTManager", "Handle Editor Type PREBUTTON");
            if (l18 == null) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
            nx1.d.q().i();
            if (l18.b() == 1) {
                ix1.l lVar2 = (ix1.l) l18;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar2.f376871s)) {
                    l17.f376847d.setSelection(0);
                    l17.f376845b = true;
                    l17.f376850g = true;
                    nx1.d.q().w(i18, true);
                    yj0.a.i(true, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                    return true;
                }
                if (lVar2.f376871s.endsWith("<br/>")) {
                    lVar2.f376871s = lVar2.f376871s.substring(0, r4.length() - 5);
                    lVar2.f376846c = -1;
                    lVar2.f376845b = true;
                    lVar2.f376850g = false;
                } else {
                    lVar2.f376846c = -1;
                    lVar2.f376845b = true;
                    lVar2.f376850g = false;
                }
            } else {
                l18.f376848e.setSelection(0);
                l18.f376845b = true;
                l18.f376850g = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e13 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) zVar.f422865b;
            abstractActivityC13156x6363e8e13.getClass();
            abstractActivityC13156x6363e8e13.e7(i18, 2);
        } else if (m54589xbc88a4a7 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXRTManager", "Handle Editor Type NEXTBTTTON");
            if (l17.b() == 4 && ((ix1.n) l17).f376882w.booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXRTManager", "Current Item is Voice and Recording");
                yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
            if (!l17.f376851h && l17.b() != -1) {
                nx1.d.q().z(m54593xef703fb1, true, true);
                yj0.a.i(true, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
            nx1.d.q().i();
            nx1.d.q().w(m54593xef703fb1, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e14 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) zVar.f422865b;
            abstractActivityC13156x6363e8e14.getClass();
            abstractActivityC13156x6363e8e14.x1(m54593xef703fb1);
            ix1.l lVar3 = new ix1.l();
            lVar3.f376845b = true;
            lVar3.f376850g = false;
            lVar3.f376871s = "";
            lVar3.f376846c = 0;
            nx1.d.q().a(m54593xef703fb1, lVar3, true);
            nx1.d.q().d(i18, m54593xef703fb1 + 1, true);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) zVar.f422865b).f178030d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(m54593xef703fb1));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return true;
    }
}
