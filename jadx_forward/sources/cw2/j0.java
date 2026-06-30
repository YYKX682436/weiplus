package cw2;

/* loaded from: classes3.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f305313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.graphics.Matrix matrix) {
        super(1);
        this.f305313d = matrix;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Matrix it = (android.graphics.Matrix) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.set(this.f305313d);
        return java.lang.Boolean.TRUE;
    }
}
