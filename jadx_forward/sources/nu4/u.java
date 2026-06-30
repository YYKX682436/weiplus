package nu4;

/* loaded from: classes7.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f421819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedDeque f421820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421821f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(nu4.b0 b0Var, java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque, java.lang.String str) {
        super(1);
        this.f421819d = b0Var;
        this.f421820e = concurrentLinkedDeque;
        this.f421821f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        nu4.b0 b0Var = this.f421819d;
        java.lang.String str = b0Var.C;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke create done, drain queue size=");
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f421820e;
        sb6.append(concurrentLinkedDeque.size());
        sb6.append(": id=");
        java.lang.String str2 = this.f421821f;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        b0Var.I.remove(str2);
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
