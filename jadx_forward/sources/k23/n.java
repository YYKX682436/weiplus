package k23;

/* loaded from: classes12.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.q f385156d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k23.q qVar) {
        super(0);
        this.f385156d = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        k23.q qVar = this.f385156d;
        ofFloat.addUpdateListener(new k23.m(ofFloat, qVar));
        ofFloat.setDuration(150L);
        arrayList.add(ofFloat);
        k23.x xVar = (k23.x) qVar;
        xVar.getClass();
        k23.d0 m141835x29c21c7c = xVar.m141835x29c21c7c();
        m141835x29c21c7c.getClass();
        k23.w0 w0Var = k23.w0.f385269f;
        k23.w0 w0Var2 = m141835x29c21c7c.f385081e;
        if ((w0Var2 == w0Var || w0Var2 == k23.w0.f385268e) ? false : true) {
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(xVar.f385278q.getAlpha(), 0.0f);
            ofFloat2.addUpdateListener(new k23.v(xVar, ofFloat2));
            ofFloat2.setDuration(150L);
            arrayList.add(ofFloat2);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator) it.next()).setInterpolator(ta5.h.f498412a.a());
        }
        return arrayList;
    }
}
