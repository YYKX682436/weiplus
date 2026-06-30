package pc3;

/* loaded from: classes7.dex */
public final /* synthetic */ class n extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.p {
    public n(java.lang.Object obj) {
        super(2, obj, pc3.t.class, "onBizPauseStateChange", "onBizPauseStateChange(Ljava/lang/String;Z)V", 0);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String p07 = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        java.util.Collection values = ((pc3.t) this.f72685xcfcbe9ef).f434935h.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj3 : values) {
            if (obj3 instanceof sc3.q1) {
                arrayList.add(obj3);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sc3.q1 q1Var = (sc3.q1) it.next();
            synchronized (q1Var) {
                java.util.Set set = q1Var.f488059y0;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj4 : set) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((sc3.l1) obj4).f488030a, p07)) {
                        arrayList2.add(obj4);
                    }
                }
                java.util.Iterator it6 = arrayList2.iterator();
                boolean z17 = false;
                while (it6.hasNext()) {
                    sc3.l1 l1Var = (sc3.l1) it6.next();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q1Var.Q, p07 + " changed to pause? " + booleanValue);
                    l1Var.f488031b = booleanValue;
                    z17 = true;
                }
                if (z17) {
                    q1Var.B1();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
