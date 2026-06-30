package fm3;

/* loaded from: classes10.dex */
public final class e0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public static final fm3.e0 f345578d = new fm3.e0();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.what == 0) {
            java.util.Collection values = fm3.f0.f345593m.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.Iterator it6 = values.iterator();
            while (it6.hasNext()) {
                android.widget.TextView textView = (android.widget.TextView) ((java.lang.ref.WeakReference) it6.next()).get();
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
            java.util.Collection values2 = fm3.f0.f345594n.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
            java.util.Iterator it7 = values2.iterator();
            while (it7.hasNext()) {
                android.widget.TextView textView2 = (android.widget.TextView) ((java.lang.ref.WeakReference) it7.next()).get();
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
        }
        return false;
    }
}
