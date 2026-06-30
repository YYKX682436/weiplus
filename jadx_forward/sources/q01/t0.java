package q01;

/* loaded from: classes12.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f440868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f440869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(long j17, java.util.LinkedList linkedList) {
        super(1);
        this.f440868d = j17;
        this.f440869e = linkedList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (this.f440868d - ((q01.s0) it.getValue()).f440864c < 600000) {
            return java.lang.Boolean.FALSE;
        }
        this.f440869e.add(it.getValue());
        return java.lang.Boolean.TRUE;
    }
}
