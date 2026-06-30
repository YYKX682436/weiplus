package db2;

/* loaded from: classes.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f309513d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(yz5.p pVar) {
        super(1);
        this.f309513d = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.dd1 dd1Var;
        r45.dd1 dd1Var2;
        java.lang.Object obj2;
        java.lang.Object obj3;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType=");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
        sb6.append(" errCode=");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
        sb6.append(", errMsg=");
        sb6.append(fVar != null ? fVar.f152150c : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CgiFinderGetNewLbsList", sb6.toString());
        if ((fVar != null && fVar.f152148a == 0) && fVar.f152149b == 0) {
            java.util.LinkedList m75941xfb821914 = ((r45.b91) fVar.f152151d).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getResponse_list(...)");
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((r45.dd1) obj2).m75939xb282bd08(0) == 1) {
                    break;
                }
            }
            dd1Var2 = (r45.dd1) obj2;
            java.util.LinkedList m75941xfb8219142 = ((r45.b91) fVar.f152151d).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getResponse_list(...)");
            java.util.Iterator it6 = m75941xfb8219142.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it6.next();
                r45.dd1 dd1Var3 = (r45.dd1) obj3;
                if (dd1Var3.m75939xb282bd08(0) == 2 || dd1Var3.m75939xb282bd08(0) == 3) {
                    break;
                }
            }
            dd1Var = (r45.dd1) obj3;
        } else {
            dd1Var = null;
            dd1Var2 = null;
        }
        yz5.p pVar = this.f309513d;
        if (pVar == null) {
            return null;
        }
        pVar.mo149xb9724478(dd1Var2, dd1Var);
        return jz5.f0.f384359a;
    }
}
