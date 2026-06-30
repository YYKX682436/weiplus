package oz4;

/* loaded from: classes12.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f431831a = new java.util.ArrayList();

    public void a(android.text.Spannable spannable) {
        java.util.Iterator it = this.f431831a.iterator();
        while (it.hasNext()) {
            oz4.q qVar = (oz4.q) it.next();
            oz4.g gVar = qVar.f431828a;
            oz4.o oVar = qVar.f431829b;
            int i17 = oVar.f414883d;
            int i18 = 34;
            if (qVar.f431830c) {
                int spanStart = spannable.getSpanStart(gVar);
                if (spanStart > -1 && spanStart < i17) {
                    spannable.setSpan(gVar.a(), spanStart, i17, 34);
                }
                spannable.removeSpan(gVar);
            } else {
                int i19 = oVar.f414884e;
                if (!oVar.f431827g || !oVar.a()) {
                    boolean z17 = oVar.f431827g;
                    if (z17 && oVar.f431826f) {
                        i18 = 18;
                    } else if (!z17) {
                        i18 = 33;
                    }
                }
                if (i19 > spannable.length()) {
                    i19 = spannable.length();
                }
                spannable.setSpan(gVar, i17, i19, i18);
            }
        }
    }

    public void b(java.util.ArrayList arrayList, oz4.o oVar) {
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof oz4.g) {
                this.f431831a.add(new oz4.q(next, oVar, true));
            }
        }
    }
}
