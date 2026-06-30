package gc0;

/* loaded from: classes.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final gc0.b1 f351634d = new gc0.b1();

    public b1() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String finishData = (java.lang.String) obj;
        java.util.List chooseData = (java.util.List) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finishData, "finishData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chooseData, "chooseData");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(chooseData, 10));
        java.util.Iterator it = chooseData.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.kl5) it.next()).m75945x2fec8307(0));
        }
        java.util.Iterator it6 = arrayList.iterator();
        boolean z17 = true;
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            if (!r26.n0.B(finishData, str, false)) {
                z17 = false;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
