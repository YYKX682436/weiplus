package rt2;

/* loaded from: classes3.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final rt2.b f481034d = new rt2.b();

    public b() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        am2.b1 b1Var;
        android.content.Intent intent = (android.content.Intent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        ((am2.t0) ((zy2.e8) i95.n0.c(zy2.e8.class))).getClass();
        java.lang.String stringExtra = intent.getStringExtra("gift_id");
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(intent.getStringExtra("count"), 0);
        if (D1 < 1) {
            D1 = 1;
        }
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(intent.getStringExtra("delay"));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(intent.getStringExtra("isSelf"), 0) == 1;
        java.lang.String stringExtra2 = intent.getStringExtra("comboId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftCmd", "gift_id " + stringExtra + " count " + D1 + " delay: " + E1 + " isSelf:" + z17 + " comboId:" + stringExtra2);
        java.lang.Object obj2 = am2.h3.f90214d;
        for (java.util.Map.Entry entry : am2.e1.f90192c.entrySet()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((am2.z0) entry.getValue()).f90312a, stringExtra)) {
                obj2 = entry.getKey();
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        am2.e1 e1Var = am2.e1.f90190a;
        am2.a1 a1Var = (am2.a1) am2.e1.f90193d.get(obj2);
        if (a1Var != null) {
            b1Var = ((am2.y0) a1Var).b(D1);
            b1Var.f90168d = E1;
        } else {
            b1Var = null;
        }
        if (z17 && b1Var != null) {
            b1Var.f90170f = true;
            b1Var.f90169e = c01.z1.l();
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) && b1Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
            b1Var.f90167c = stringExtra2;
        }
        linkedList.offerLast(b1Var);
        e1Var.a(linkedList, false);
        return jz5.f0.f384359a;
    }
}
