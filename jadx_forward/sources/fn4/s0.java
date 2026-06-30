package fn4;

/* loaded from: classes4.dex */
public class s0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.bl5 f346139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn4.t0 f346140e;

    public s0(fn4.t0 t0Var, r45.bl5 bl5Var) {
        this.f346140e = t0Var;
        this.f346139d = bl5Var;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "requestVideoUrlResultParse";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f346139d.f452390d.f470265d.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            r45.wz6 wz6Var = (r45.wz6) it.next();
            r45.xn6 xn6Var = new r45.xn6();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wz6Var.f471140d.f472386d)) {
                xn6Var.f471792h = wz6Var.f471140d.f472386d;
                r45.bz6 bz6Var = wz6Var.f471142f;
                if (bz6Var != null && bz6Var.f452715d == 1) {
                    r45.fv fvVar = bz6Var.f452717f;
                    if (fvVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(fvVar.f456145d)) {
                        xn6Var.K.clear();
                        r45.bz6 bz6Var2 = wz6Var.f471142f;
                        xn6Var.Q = bz6Var2.f452718g;
                        java.util.Iterator it6 = bz6Var2.f452717f.f456145d.iterator();
                        while (it6.hasNext()) {
                            r45.ev6 ev6Var = (r45.ev6) it6.next();
                            r45.zn6 zn6Var = new r45.zn6();
                            zn6Var.f473777d = ev6Var.f455285d.i();
                            zn6Var.f473778e = 0;
                            xn6Var.K.add(zn6Var);
                            xn6Var.f471787J = ev6Var.f455287f;
                        }
                        r45.zn6 f17 = pm4.w.f(xn6Var.K);
                        if (f17 != null) {
                            xn6Var.f471789e = f17.f473777d;
                            xn6Var.U = f17.f473778e;
                        }
                    }
                } else if (bz6Var != null && bz6Var.f452715d == 2) {
                    r45.fv fvVar2 = bz6Var.f452716e;
                    if (fvVar2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(fvVar2.f456145d)) {
                        xn6Var.K.clear();
                        r45.bz6 bz6Var3 = wz6Var.f471142f;
                        xn6Var.Q = bz6Var3.f452718g;
                        java.util.Iterator it7 = bz6Var3.f452716e.f456145d.iterator();
                        while (it7.hasNext()) {
                            r45.ev6 ev6Var2 = (r45.ev6) it7.next();
                            r45.zn6 zn6Var2 = new r45.zn6();
                            zn6Var2.f473777d = ev6Var2.f455285d.i();
                            zn6Var2.f473778e = 0;
                            xn6Var.K.add(zn6Var2);
                            xn6Var.f471787J = ev6Var2.f455287f;
                        }
                        r45.zn6 f18 = pm4.w.f(xn6Var.K);
                        if (f18 != null) {
                            xn6Var.f471789e = f18.f473777d;
                            xn6Var.U = f18.f473778e;
                        }
                    }
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wz6Var.f471143g)) {
                    xn6Var.K.clear();
                    fn4.z0.s(xn6Var, wz6Var.f471143g, "");
                    r45.zn6 f19 = pm4.w.f(xn6Var.K);
                    if (f19 != null) {
                        xn6Var.f471789e = f19.f473777d;
                        xn6Var.U = f19.f473778e;
                        r45.bz6 bz6Var4 = wz6Var.f471142f;
                        if (bz6Var4 != null) {
                            xn6Var.Q = bz6Var4.f452718g;
                        }
                    }
                }
                arrayList.add(xn6Var);
            }
        }
        synchronized (this.f346140e.f346143e) {
            java.util.List b17 = this.f346140e.f346143e.b();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(b17)) {
                return;
            }
            while (true) {
                java.util.LinkedList linkedList = (java.util.LinkedList) b17;
                if (i17 >= linkedList.size()) {
                    return;
                }
                r45.xn6 xn6Var2 = (r45.xn6) linkedList.get(i17);
                java.util.Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    r45.xn6 xn6Var3 = (r45.xn6) it8.next();
                    if (xn6Var2.f471792h.equals(xn6Var3.f471792h)) {
                        xn6Var2.K = xn6Var3.K;
                        xn6Var2.f471787J = xn6Var3.f471787J;
                        xn6Var2.f471789e = xn6Var3.f471789e;
                        xn6Var2.Q = xn6Var3.Q;
                    }
                }
                i17++;
            }
        }
    }
}
