package r02;

/* loaded from: classes8.dex */
public class t0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 f449869a;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928) {
        this.f449869a = c13250xfa9a7928;
    }

    public void a(int i17, long j17) {
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 != null) {
            java.lang.String str = c17.f68404x28d45f97;
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928 = this.f449869a;
            java.util.HashMap hashMap = (java.util.HashMap) c13250xfa9a7928.f178952g2;
            if (!hashMap.containsKey(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.d();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.f178862a);
                if (linkedList.contains(str) && i17 == 1) {
                    r02.o oVar = (r02.o) c13250xfa9a7928.f178954i2;
                    oVar.getClass();
                    java.util.LinkedList c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.c();
                    if (!c18.contains(str)) {
                        c18.add(str);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5 = oVar.f449849a;
                    activityC13242xdf6880d5.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.q0.b(c18, new r02.j(activityC13242xdf6880d5, null));
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) hashMap.get(str);
            if (r0Var == null) {
                return;
            }
            if (!c13250xfa9a7928.f178955j2) {
                r0Var.f178845a = false;
            }
            if (i17 == 9) {
                r0Var.f178847c = 6;
                c13250xfa9a7928.m1(r0Var);
                return;
            }
            if (r0Var.f178847c == 6) {
                r0Var.f178847c = 2;
                c13250xfa9a7928.m1(r0Var);
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) c13250xfa9a7928.getLayoutManager();
            int m8008x3d79f549 = c1162x665295de.m8008x3d79f549();
            for (int i18 = 0; i18 < m8008x3d79f549; i18++) {
                if (c1162x665295de.m8007x6a486239(i18) != null) {
                    android.view.View childAt = ((android.view.ViewGroup) c1162x665295de.m8007x6a486239(i18)).getChildAt(0);
                    if (childAt.getVisibility() == 0 && (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d) childAt;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskItemView", "refreshDownloadStatus, event = %s, appId: %s", java.lang.Integer.valueOf(i17), str);
                        if (c13249xf095011d.f178930d.getVisibility() != 0 && str.equals(c13249xf095011d.B.f178850f) && com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(c13249xf095011d.B.f178850f) != null) {
                            if (i17 != 1 && i17 != 7) {
                                c13249xf095011d.C = false;
                            }
                            c13249xf095011d.c();
                        }
                    }
                }
            }
        }
    }
}
