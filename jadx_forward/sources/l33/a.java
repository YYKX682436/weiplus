package l33;

/* loaded from: classes5.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final l33.a f396959d = new l33.a();

    public a() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.List list = (java.util.List) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        if (booleanValue) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : list) {
                y53.m mVar = ((z53.i) obj3).F;
                if (mVar != null && mVar.f67426x9f600742 == 2) {
                    arrayList.add(obj3);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((z53.i) it.next()).f67669xbed8694c);
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Bi((java.lang.String) it6.next());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameAccountManager", "gamelog.account, manage, delete gamelife conversation size = " + arrayList2.size());
        }
        return jz5.f0.f384359a;
    }
}
