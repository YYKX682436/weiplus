package cl;

/* loaded from: classes7.dex */
public class q2 implements com.eclipsesource.mmv8.JavaVoidCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.w2 f42747a;

    public q2(cl.w2 w2Var) {
        this.f42747a = w2Var;
    }

    @Override // com.eclipsesource.mmv8.JavaVoidCallback
    public void invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        if (v8Array.length() < 1 || v8Array.getType(0) != 1) {
            return;
        }
        int integer = v8Array.getInteger(0);
        android.util.SparseArray sparseArray = this.f42747a.f42814c;
        cl.u2 u2Var = (cl.u2) sparseArray.get(integer);
        if (u2Var != null) {
            u2Var.a();
            sparseArray.remove(integer);
        }
    }
}
