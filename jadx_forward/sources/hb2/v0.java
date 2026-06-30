package hb2;

/* loaded from: classes2.dex */
public final class v0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb2.w0 f361637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361638b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f361639c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f361640d;

    public v0(hb2.w0 w0Var, java.lang.String str, java.lang.Object obj, zy2.gc gcVar) {
        this.f361637a = w0Var;
        this.f361638b = str;
        this.f361639c = obj;
        this.f361640d = gcVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        int i17;
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        hb2.w0 w0Var = this.f361637a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.k(), "[doRequest] errType:" + fVar.f152148a + " errCode:" + fVar.f152149b);
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.sn2 sn2Var = (r45.sn2) fVar.f152151d;
            if (sn2Var != null && (m75941xfb821914 = sn2Var.m75941xfb821914(1)) != null) {
                java.util.Iterator it = m75941xfb821914.iterator();
                i17 = 0;
                while (it.hasNext()) {
                    if (((r45.ix0) it.next()).m75939xb282bd08(0) == w0Var.i()) {
                        break;
                    }
                    i17++;
                }
            }
            i17 = -1;
            if (i17 != -1) {
                r45.ix0 ix0Var = (r45.ix0) ((r45.sn2) fVar.f152151d).m75941xfb821914(1).get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ix0Var);
                java.lang.String str = this.f361638b;
                java.lang.Object obj2 = this.f361639c;
                w0Var.l(str, obj2, ix0Var);
                zy2.gc gcVar = this.f361640d;
                if (gcVar != null) {
                    gcVar.r5(obj2, ix0Var);
                }
            } else {
                hb2.w0.f(this.f361637a, this.f361640d, this.f361639c, null, 4, null);
            }
        } else {
            hb2.w0.f(this.f361637a, this.f361640d, this.f361639c, null, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
