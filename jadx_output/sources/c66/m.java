package c66;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f39489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.util.List list) {
        super(1);
        this.f39489d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List remainTidList = (java.util.List) obj;
        java.util.List list = this.f39489d;
        kotlin.jvm.internal.o.g(remainTidList, "remainTidList");
        try {
            c66.q qVar = c66.q.f39493a;
            com.tencent.wcdb.core.Table table = (com.tencent.wcdb.core.Table) ((jz5.n) c66.q.f39502j).getValue();
            com.tencent.wcdb.orm.Field field = ni0.c.f337201c;
            java.lang.String[] strArr = (java.lang.String[]) remainTidList.toArray(new java.lang.String[0]);
            java.util.Collection<ni0.i> allObjects = table.getAllObjects(field.in((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)));
            kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allObjects, 10));
            for (ni0.i iVar : allObjects) {
                arrayList.add(android.util.Pair.create(iVar.f337231a, iVar));
            }
            c66.q qVar2 = c66.q.f39493a;
            com.tencent.mars.xlog.Log.i("Finder.WCFinderWCDB", "getFinderFeedList success, tidList = " + list);
            return arrayList;
        } catch (java.lang.Exception unused) {
            c66.q qVar3 = c66.q.f39493a;
            com.tencent.mars.xlog.Log.w("Finder.WCFinderWCDB", "getFinderFeedList fail, tidList = " + list);
            return null;
        }
    }
}
