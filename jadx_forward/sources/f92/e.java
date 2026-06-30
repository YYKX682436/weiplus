package f92;

/* loaded from: classes8.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final f92.e f341774d = new f92.e();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        boolean z18 = false;
        try {
            java.util.LinkedList y07 = ((c61.l7) i95.n0.c(c61.l7.class)).Vj().y0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountLogicHandler", "checkAccountDeletingTask size:" + y07.size());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : y07) {
                if (((so2.i4) obj).f72763xa3c65b86 != -1) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                so2.i4 i4Var = (so2.i4) it.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountLogicHandler", "checkAccountDeletingTask del username = " + i4Var.f69192xdec927b + ", type:" + i4Var.f69191x2262335f);
                int i17 = i4Var.f69191x2262335f;
                if (i17 == 1) {
                    g92.b bVar = g92.b.f351302e;
                    java.lang.String field_username = i4Var.f69192xdec927b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
                    bVar.V4(field_username, m92.j.f406540y);
                } else if (i17 != 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountLogicHandler", "checkAccountDeletingTask unknown type:" + i4Var.f69191x2262335f);
                } else {
                    c61.l7 l7Var = (c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class));
                    l7Var.getClass();
                    ((ku5.t0) ku5.t0.f394148d).q(new c61.j4(i4Var, "checkAccountDeletingTask", l7Var));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountLogicHandler", "checkAccountDeletingTask Exception:" + e17.getMessage());
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar2 = kb2.b.f387758a;
            }
            if (z18) {
                throw e17;
            }
        }
    }
}
