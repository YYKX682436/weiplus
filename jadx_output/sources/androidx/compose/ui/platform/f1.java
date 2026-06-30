package androidx.compose.ui.platform;

/* loaded from: classes7.dex */
public final class f1 extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    public java.lang.Object initialValue() {
        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
        kotlin.jvm.internal.o.f(choreographer, "getInstance()");
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper == null) {
            throw new java.lang.IllegalStateException("no Looper on this thread".toString());
        }
        android.os.Handler a17 = j3.k.a(myLooper);
        kotlin.jvm.internal.o.f(a17, "createAsync(\n           …d\")\n                    )");
        androidx.compose.ui.platform.i1 i1Var = new androidx.compose.ui.platform.i1(choreographer, a17, null);
        return i1Var.plus(i1Var.f10598q);
    }
}
