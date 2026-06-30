package r02;

/* loaded from: classes8.dex */
public class b1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 f449822d;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928) {
        this.f449822d = c13250xfa9a7928;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928 = this.f449822d;
        c13250xfa9a7928.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = c13250xfa9a7928.f178951f2.f449857d.iterator();
        while (true) {
            int i18 = 0;
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) it.next();
            if (r0Var.f178846b) {
                linkedList.add(r0Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.e(r0Var.f178850f);
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o.e(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(r0Var.f178850f), r0Var);
                int i19 = r0Var.f178847c;
                if (i19 == 2) {
                    i18 = 1101;
                } else if (i19 == 4) {
                    i18 = 1102;
                } else if (i19 == 6) {
                    i18 = 1103;
                }
                o02.a.b(11, i18, r0Var.f178848d, 81, r0Var.f178850f, "", "");
            }
        }
        if (linkedList.size() != 0) {
            c13250xfa9a7928.f178951f2.x(linkedList);
            if (c13250xfa9a7928.f178951f2.f449857d.size() <= 5) {
                c13250xfa9a7928.l1();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.b(false);
    }
}
