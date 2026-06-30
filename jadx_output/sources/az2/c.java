package az2;

/* loaded from: classes3.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public static az2.f a(az2.c cVar, android.content.Context context, java.lang.String str, long j17, android.content.DialogInterface.OnCancelListener onCancelListener, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            j17 = 500;
        }
        if ((i17 & 8) != 0) {
            onCancelListener = null;
        }
        cVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        az2.f fVar = new az2.f();
        fVar.f16128c = j17;
        new java.lang.ref.WeakReference(context);
        az2.q qVar = new az2.q();
        if (str != null) {
            qVar.f16149c = str;
        }
        qVar.f16150d = onCancelListener;
        qVar.f16152a = new java.lang.ref.WeakReference(context);
        fVar.f16127b = qVar;
        return fVar;
    }
}
