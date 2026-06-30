package gc0;

/* loaded from: classes.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final gc0.a1 f351621d = new gc0.a1();

    public a1() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        java.util.List finishData = (java.util.List) obj;
        java.util.List chooseData = (java.util.List) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finishData, "finishData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chooseData, "chooseData");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(chooseData, 10));
        java.util.Iterator it = chooseData.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                break;
            }
            arrayList.add(((r45.kl5) it.next()).m75945x2fec8307(1));
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            if (!finishData.contains((java.lang.String) it6.next())) {
                z17 = false;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
