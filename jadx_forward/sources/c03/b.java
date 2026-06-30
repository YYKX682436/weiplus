package c03;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c03.g f119177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f119178e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c03.g gVar, android.widget.FrameLayout frameLayout) {
        super(2);
        this.f119177d = gVar;
        this.f119178e = frameLayout;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        boolean z18;
        java.lang.Object obj3;
        gx2.q drawer = (gx2.q) obj;
        android.view.MotionEvent event = (android.view.MotionEvent) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawer, "drawer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        c03.g gVar = this.f119177d;
        if (gVar.f119190g) {
            return java.lang.Boolean.TRUE;
        }
        java.util.Iterator it = gVar.f119191h.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                z18 = false;
                obj3 = null;
                break;
            }
            obj3 = it.next();
            com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23921x45ed4000 c23921x45ed4000 = (com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23921x45ed4000) obj3;
            int[] iArr = new int[2];
            this.f119178e.getLocationOnScreen(iArr);
            z17 = true;
            android.graphics.Rect rect = new android.graphics.Rect(ym5.x.a(drawer.getContext(), (float) c23921x45ed4000.m88592x305bc2()) + iArr[0], ym5.x.a(drawer.getContext(), (float) c23921x45ed4000.m88592x305bc2()) + iArr[1], ym5.x.a(drawer.getContext(), (float) (c23921x45ed4000.m88592x305bc2() + c23921x45ed4000.m88591x755bd410())) + iArr[0], ym5.x.a(drawer.getContext(), (float) (c23921x45ed4000.m88593x305bc3() + c23921x45ed4000.m88590x1c4fb41d())) + iArr[1]);
            drawer.getLocationOnScreen(new int[2]);
            z18 = false;
            float x17 = event.getX() + r5[0];
            float y17 = event.getY() + r5[1];
            c23921x45ed4000.m88596x9616526c();
            rect.toString();
            if (rect.contains((int) x17, (int) y17)) {
                break;
            }
        }
        return java.lang.Boolean.valueOf(obj3 == null ? z17 : z18);
    }
}
