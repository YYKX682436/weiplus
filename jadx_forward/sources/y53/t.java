package y53;

/* loaded from: classes5.dex */
public final class t implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f541035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u53.x f541036b;

    public t(java.util.List list, u53.x xVar) {
        this.f541035a = list;
        this.f541036b = xVar;
    }

    @Override // u53.x
    public final void a(java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getContact] usernameList=");
        sb6.append(this.f541035a);
        sb6.append(" result=");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            arrayList.add(((java.lang.String) entry.getKey()) + '=' + ((y53.m) ((u53.u) entry.getValue())).f67429x21f9b213);
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ContactService", sb6.toString());
        this.f541036b.a(map);
    }
}
