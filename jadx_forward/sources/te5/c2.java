package te5;

/* loaded from: classes3.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f500153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f500154e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.view.View view, int i17, yz5.p pVar) {
        super(0);
        this.f500153d = view;
        this.f500154e = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f500153d;
        java.lang.Object tag = view.getTag(-208931566);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        boolean z17 = n3.x0.b(view) && view.getVisibility() == 0 && view.getLocalVisibleRect(new android.graphics.Rect());
        yz5.p pVar = this.f500154e;
        if (bool == null) {
            if (z17) {
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                pVar.mo149xb9724478(view, bool2);
                view.setTag(-208931566, bool2);
            }
        } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.valueOf(z17))) {
            pVar.mo149xb9724478(view, java.lang.Boolean.valueOf(z17));
            view.setTag(-208931566, java.lang.Boolean.valueOf(z17));
        }
        return jz5.f0.f384359a;
    }
}
