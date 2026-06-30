package pr;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static pr.o f439283e;

    /* renamed from: a, reason: collision with root package name */
    public final fp0.o f439284a;

    /* renamed from: b, reason: collision with root package name */
    public int f439285b;

    /* renamed from: c, reason: collision with root package name */
    public int f439286c;

    /* renamed from: d, reason: collision with root package name */
    public final pr.m f439287d;

    public o() {
        fp0.o oVar = new fp0.o(new gp0.g(new gp0.b(Integer.MAX_VALUE, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "EmojiDesigner"));
        this.f439284a = oVar;
        pr.m mVar = new pr.m(this);
        this.f439287d = mVar;
        oVar.g(mVar);
    }

    public final void a() {
        r45.v75 v75Var;
        java.util.ArrayList d17 = gr.t.g().d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = d17.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) it.next();
            z85.s y07 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().d().y0(c21051xbc71d247.f68396x5bec8145);
            r45.se3 se3Var = new r45.se3();
            if ((y07 != null ? y07.f65848xad49e234 : null) != null) {
                try {
                    se3Var.mo11468x92b714fd(y07.f65848xad49e234);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiPackSyncManager", e17, "", new java.lang.Object[0]);
                }
            }
            r45.qj0 qj0Var = se3Var.f467185d;
            if (qj0Var == null || (v75Var = qj0Var.E) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPackSyncManager", "start: GetEmotionDetail " + c21051xbc71d247.f68396x5bec8145);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c21051xbc71d247.f68396x5bec8145, "17")) {
                    continue;
                } else {
                    java.lang.String str = c21051xbc71d247.f68396x5bec8145;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getProductID(...)");
                    new gr.e(str).l().K(new pr.n(c21051xbc71d247));
                }
            } else {
                int i17 = v75Var.f469497d;
                if (!arrayList.contains(java.lang.Integer.valueOf(i17))) {
                    arrayList.add(java.lang.Integer.valueOf(i17));
                }
            }
            if (arrayList.size() >= 50) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPackSyncManager", "start: too many groups " + d17.size());
                break;
            }
        }
        this.f439285b = arrayList.size();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPackSyncManager", "checkStart: add task " + intValue);
            this.f439284a.a(new pr.f(intValue));
        }
    }
}
