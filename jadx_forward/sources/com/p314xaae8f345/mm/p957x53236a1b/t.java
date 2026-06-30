package com.p314xaae8f345.mm.p957x53236a1b;

@j95.b
/* loaded from: classes11.dex */
public class t extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6 {
    public java.util.List Ai() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!c01.d9.b().F()) {
            return arrayList;
        }
        java.util.Iterator it = ug3.i.K().iterator();
        while (it.hasNext()) {
            ug3.k kVar = (ug3.k) it.next();
            if ((kVar.f474001h & 1) != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v6 v6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v6();
                v6Var.f170339a = kVar.f474004n;
                v6Var.f170341c = kVar.f473997d;
                v6Var.f170340b = kVar.f474003m & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                arrayList.add(v6Var);
            }
        }
        return arrayList;
    }

    public boolean Bi() {
        java.util.Iterator it = ((java.util.ArrayList) Ai()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v6 v6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v6) it.next();
            int i17 = v6Var.f170341c;
            long j17 = v6Var.f170340b;
            if (i17 == 38 && j17 >= 4066640128L) {
                return true;
            }
            if (i17 == 37 && j17 >= 4065591552L) {
                return true;
            }
            if (i17 == 43 && j17 >= 4071883008L) {
                return true;
            }
            if (i17 == 39 && j17 >= 4067688704L) {
                return true;
            }
        }
        return false;
    }

    public boolean Di() {
        if (Bi()) {
            return true;
        }
        java.util.Iterator it = ((java.util.ArrayList) Ai()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v6 v6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v6) it.next();
            int i17 = v6Var.f170341c;
            long j17 = v6Var.f170340b;
            if (i17 == 14 && j17 >= 318898176) {
                return true;
            }
            if (i17 == 15 && j17 >= 1661009920) {
                return true;
            }
        }
        return false;
    }

    public java.util.List wi() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = ug3.i.f509073n;
        if (i17 == 9) {
            java.util.Iterator it = ug3.i.K().iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(((ug3.k) it.next()).f474004n));
            }
        } else {
            arrayList.add(java.lang.Integer.valueOf(i17));
        }
        return arrayList;
    }
}
