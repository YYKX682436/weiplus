package c66;

/* loaded from: classes2.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f121022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.util.List list) {
        super(1);
        this.f121022d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List remainTidList = (java.util.List) obj;
        java.util.List list = this.f121022d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remainTidList, "remainTidList");
        try {
            c66.q qVar = c66.q.f121026a;
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae = (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) c66.q.f121035j).mo141623x754a37bb();
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = ni0.c.f418734c;
            java.lang.String[] strArr = (java.lang.String[]) remainTidList.toArray(new java.lang.String[0]);
            java.util.Collection<ni0.i> m107094xde3eb429 = c26924x4cd4bae.m107094xde3eb429(c26981x40bb0da.in((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107094xde3eb429, "getAllObjects(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107094xde3eb429, 10));
            for (ni0.i iVar : m107094xde3eb429) {
                arrayList.add(android.util.Pair.create(iVar.f418764a, iVar));
            }
            c66.q qVar2 = c66.q.f121026a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WCFinderWCDB", "getFinderFeedList success, tidList = " + list);
            return arrayList;
        } catch (java.lang.Exception unused) {
            c66.q qVar3 = c66.q.f121026a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.WCFinderWCDB", "getFinderFeedList fail, tidList = " + list);
            return null;
        }
    }
}
