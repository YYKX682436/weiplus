package com.tencent.mm.modelsimple;

@j95.b
/* loaded from: classes11.dex */
public class t extends i95.w implements com.tencent.mm.plugin.appbrand.service.b6 {
    public java.util.List Ai() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!c01.d9.b().F()) {
            return arrayList;
        }
        java.util.Iterator it = ug3.i.K().iterator();
        while (it.hasNext()) {
            ug3.k kVar = (ug3.k) it.next();
            if ((kVar.f392468h & 1) != 0) {
                com.tencent.mm.plugin.appbrand.service.v6 v6Var = new com.tencent.mm.plugin.appbrand.service.v6();
                v6Var.f88806a = kVar.f392471n;
                v6Var.f88808c = kVar.f392464d;
                v6Var.f88807b = kVar.f392470m & io.flutter.embedding.android.KeyboardMap.kValueMask;
                arrayList.add(v6Var);
            }
        }
        return arrayList;
    }

    public boolean Bi() {
        java.util.Iterator it = ((java.util.ArrayList) Ai()).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.service.v6 v6Var = (com.tencent.mm.plugin.appbrand.service.v6) it.next();
            int i17 = v6Var.f88808c;
            long j17 = v6Var.f88807b;
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
            com.tencent.mm.plugin.appbrand.service.v6 v6Var = (com.tencent.mm.plugin.appbrand.service.v6) it.next();
            int i17 = v6Var.f88808c;
            long j17 = v6Var.f88807b;
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
        int i17 = ug3.i.f427540n;
        if (i17 == 9) {
            java.util.Iterator it = ug3.i.K().iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(((ug3.k) it.next()).f392471n));
            }
        } else {
            arrayList.add(java.lang.Integer.valueOf(i17));
        }
        return arrayList;
    }
}
