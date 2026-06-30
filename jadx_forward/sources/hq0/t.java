package hq0;

/* loaded from: classes7.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f364595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(hq0.b0 b0Var, java.lang.String str) {
        super(0);
        this.f364595d = b0Var;
        this.f364596e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hq0.b0 b0Var = this.f364595d;
        java.lang.String str = b0Var.f364504y;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("innerRemoveAllView rootConfigId: ");
        java.lang.String str2 = this.f364596e;
        sb6.append(str2);
        sb6.append(" size: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = b0Var.D;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) concurrentHashMap.get(str2);
        sb6.append(copyOnWriteArrayList != null ? java.lang.Integer.valueOf(copyOnWriteArrayList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = (java.util.concurrent.CopyOnWriteArrayList) concurrentHashMap.get(str2);
        if (copyOnWriteArrayList2 != null) {
            java.util.Iterator it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                java.util.Collection<com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d> values = ((java.util.HashMap) it.next()).values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                for (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d : values) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10867x3e50a04d);
                    d75.b.g(new hq0.y(c10867x3e50a04d, b0Var));
                    c10867x3e50a04d.f();
                }
            }
        }
        concurrentHashMap.remove(str2);
        b0Var.U1(str2);
        b0Var.C.remove(str2);
        return jz5.f0.f384359a;
    }
}
