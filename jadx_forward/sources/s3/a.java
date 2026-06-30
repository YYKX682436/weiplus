package s3;

/* loaded from: classes14.dex */
public abstract class a {
    public static final void a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        n3.v1 v1Var = new n3.v1(view, null);
        q26.o oVar = new q26.o();
        oVar.f441414g = pz5.f.a(v1Var, oVar, oVar);
        while (oVar.hasNext()) {
            java.util.ArrayList arrayList = b((android.view.View) oVar.next()).f483913a;
            for (int h17 = kz5.c0.h(arrayList); -1 < h17; h17--) {
                p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.AbstractC1058x6d8e7db5 abstractC1058x6d8e7db5 = ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i4) ((s3.b) arrayList.get(h17))).f92133a;
                n0.f1 f1Var = abstractC1058x6d8e7db5.f91984f;
                if (f1Var != null) {
                    f1Var.mo7062x63a5261f();
                }
                abstractC1058x6d8e7db5.f91984f = null;
                abstractC1058x6d8e7db5.requestLayout();
            }
        }
    }

    public static final s3.c b(android.view.View view) {
        s3.c cVar = (s3.c) view.getTag(com.p314xaae8f345.mm.R.id.kz9);
        if (cVar != null) {
            return cVar;
        }
        s3.c cVar2 = new s3.c();
        view.setTag(com.p314xaae8f345.mm.R.id.kz9, cVar2);
        return cVar2;
    }
}
