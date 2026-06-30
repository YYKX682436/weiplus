package oj0;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f427257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f427258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.Object obj, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f427257d = obj;
        this.f427258e = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap it = (android.graphics.Bitmap) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object obj2 = this.f427257d;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f427258e;
        synchronized (obj2) {
            h0Var.f391656d = it;
            obj2.notifyAll();
        }
        return jz5.f0.f384359a;
    }
}
