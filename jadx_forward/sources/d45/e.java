package d45;

/* loaded from: classes10.dex */
public final class e implements d45.g {
    public void a(d45.i iVar, int i17) {
        if ((iVar != null ? iVar.f307976d : null) == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = iVar.f307976d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(weakReference);
        android.widget.TextView textView = (android.widget.TextView) weakReference.get();
        if (textView == null) {
            return;
        }
        d45.i.f307974h.a(textView, i17);
        d45.i.f307975i.remove(textView);
    }
}
