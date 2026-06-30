package androidx.compose.ui.platform;

/* loaded from: classes3.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.compose.ui.platform.m4 f10660d = new androidx.compose.ui.platform.m4();

    public m4() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        android.graphics.Matrix matrix = (android.graphics.Matrix) obj2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(matrix, "matrix");
        matrix.set(view.getMatrix());
        return jz5.f0.f302826a;
    }
}
