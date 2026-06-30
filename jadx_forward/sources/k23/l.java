package k23;

/* loaded from: classes12.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.q f385145d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k23.q qVar) {
        super(0);
        this.f385145d = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        k23.q qVar = this.f385145d;
        ofFloat.addUpdateListener(new k23.j(ofFloat, qVar));
        ofFloat.setDuration(300L);
        arrayList.add(ofFloat);
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new k23.k(ofFloat2, qVar));
        ofFloat2.setDuration(300L);
        arrayList.add(ofFloat2);
        qVar.b(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator) it.next()).setInterpolator(ta5.h.f498412a.a());
        }
        return arrayList;
    }
}
