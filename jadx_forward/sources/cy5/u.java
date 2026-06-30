package cy5;

/* loaded from: classes13.dex */
public class u implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cy5.y f306449a;

    public u(cy5.y yVar) {
        this.f306449a = yVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        android.util.Pair pair = (android.util.Pair) obj;
        int intValue = ((java.lang.Integer) pair.first).intValue();
        cy5.y yVar = this.f306449a;
        if (intValue == 0) {
            java.lang.String m17 = yVar.m();
            by5.c4.e(m17);
        } else {
            if (((java.lang.Integer) pair.first).intValue() == 1) {
                by5.c4.b(yVar.m(), (java.lang.String) pair.second);
                return;
            }
            if (((java.lang.Integer) pair.first).intValue() == 2) {
                by5.c4.f(yVar.m(), (java.lang.String) pair.second);
            } else if (((java.lang.Integer) pair.first).intValue() == 3) {
                by5.c4.g(yVar.m(), (java.lang.String) pair.second);
            } else if (((java.lang.Integer) pair.first).intValue() == 4) {
                by5.c4.c(yVar.m(), (java.lang.String) pair.second);
            }
        }
    }
}
