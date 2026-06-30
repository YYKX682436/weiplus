package hq0;

/* loaded from: classes7.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f364599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iq0.e f364600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364601f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(hq0.b0 b0Var, iq0.e eVar, java.lang.String str) {
        super(0);
        this.f364599d = b0Var;
        this.f364600e = eVar;
        this.f364601f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hq0.b0 b0Var = this.f364599d;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) b0Var.D.get(this.f364600e.a());
        if (copyOnWriteArrayList != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                java.util.HashMap hashMap = (java.util.HashMap) it.next();
                java.lang.String str = this.f364601f;
                com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d) hashMap.get(str);
                if (c10867x3e50a04d != null) {
                    d75.b.g(new hq0.y(c10867x3e50a04d, b0Var));
                    c10867x3e50a04d.f();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f364504y, "innerRemoveViewInViewCacheByFrameSetId with frameSetId = " + str);
                    arrayList.add(hashMap);
                }
            }
            copyOnWriteArrayList.removeAll(kz5.n0.X0(arrayList));
        }
        return jz5.f0.f384359a;
    }
}
