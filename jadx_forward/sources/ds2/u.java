package ds2;

/* loaded from: classes2.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f324433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ds2.b0 b0Var, java.lang.String str) {
        super(0);
        this.f324433d = b0Var;
        this.f324434e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        pm0.v.d0(this.f324433d.f324389d, new ds2.t(this.f324434e, linkedList));
        return linkedList;
    }
}
