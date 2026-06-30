package xn4;

/* loaded from: classes11.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.n1 f537176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f537177e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var, java.lang.String str) {
        super(1);
        this.f537176d = n1Var;
        this.f537177e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xn4.q callback = (xn4.q) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        callback.c(this.f537176d.f152637b, this.f537177e);
        return jz5.f0.f384359a;
    }
}
