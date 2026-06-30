package hc2;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f361834a;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        f361834a = z65.c.a();
    }

    public static final java.lang.String a(bw5.e0 e0Var) {
        java.util.ArrayList arrayList;
        if (e0Var == null) {
            return "NULL";
        }
        bw5.ev b17 = e0Var.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uuid=");
        sb6.append(b17.m11860x5ec9c89());
        sb6.append(",id=");
        boolean[] zArr = b17.C;
        sb6.append(zArr[5] ? b17.f108601h : "");
        sb6.append(",type=");
        sb6.append(b17.f108598e);
        sb6.append(",time=");
        sb6.append(e0Var.f108206e);
        sb6.append(",username=");
        sb6.append(zArr[11] ? b17.f108607q : "");
        sb6.append(",pathList=");
        java.util.LinkedList<bw5.vy> linkedList = b17.f108600g;
        if (linkedList != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (bw5.vy vyVar : linkedList) {
                arrayList.add(vyVar.N[6] ? vyVar.f116047i : "");
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        return sb6.toString();
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb b(bw5.e0 e0Var) {
        if (e0Var != null) {
            java.lang.String m11860x5ec9c89 = e0Var.b().m11860x5ec9c89();
            boolean z17 = true;
            if (!(m11860x5ec9c89 == null || m11860x5ec9c89.length() == 0)) {
                bw5.ev b17 = e0Var.b();
                java.lang.String str = b17.C[5] ? b17.f108601h : "";
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
                    bw5.ev b18 = e0Var.b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "getSvrCtrlInfo(...)");
                    byte[] mo14344x5f01b1f6 = b18.mo14344x5f01b1f6();
                    r45.vs2 vs2Var = new r45.vs2();
                    vs2Var.mo11468x92b714fd(mo14344x5f01b1f6);
                    jbVar.t0(vs2Var);
                    jbVar.f65879x2261f6f2 = e0Var.f108206e;
                    return jbVar;
                }
            }
            if (f361834a) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("AffToLocalCtrInfo", a(e0Var) + " is invalid!", new java.lang.Object[0]);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AffToLocalCtrInfo", a(e0Var) + " is invalid!");
            }
        }
        return null;
    }
}
