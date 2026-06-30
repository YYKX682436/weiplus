package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes7.dex */
public final class f1 extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    public java.lang.Object initialValue() {
        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(choreographer, "getInstance()");
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper == null) {
            throw new java.lang.IllegalStateException("no Looper on this thread".toString());
        }
        android.os.Handler a17 = j3.k.a(myLooper);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "createAsync(\n           …d\")\n                    )");
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1 i1Var = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1(choreographer, a17, null);
        return i1Var.mo7096x348d9a(i1Var.f92131q);
    }
}
