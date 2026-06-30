package az2;

/* loaded from: classes3.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        az2.f fVar = new az2.f();
        fVar.f97661c = j17;
        new java.lang.ref.WeakReference(context);
        az2.q qVar = new az2.q();
        if (str != null) {
            qVar.f97682c = str;
        }
        qVar.f97683d = onCancelListener;
        qVar.f97685a = new java.lang.ref.WeakReference(context);
        fVar.f97660b = qVar;
        return fVar;
    }
}
