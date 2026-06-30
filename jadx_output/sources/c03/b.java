package c03;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c03.g f37644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f37645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c03.g gVar, android.widget.FrameLayout frameLayout) {
        super(2);
        this.f37644d = gVar;
        this.f37645e = frameLayout;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        boolean z18;
        java.lang.Object obj3;
        gx2.q drawer = (gx2.q) obj;
        android.view.MotionEvent event = (android.view.MotionEvent) obj2;
        kotlin.jvm.internal.o.g(drawer, "drawer");
        kotlin.jvm.internal.o.g(event, "event");
        c03.g gVar = this.f37644d;
        if (gVar.f37657g) {
            return java.lang.Boolean.TRUE;
        }
        java.util.Iterator it = gVar.f37658h.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                z18 = false;
                obj3 = null;
                break;
            }
            obj3 = it.next();
            com.tencent.pigeon.finder.FlutterRect flutterRect = (com.tencent.pigeon.finder.FlutterRect) obj3;
            int[] iArr = new int[2];
            this.f37645e.getLocationOnScreen(iArr);
            z17 = true;
            android.graphics.Rect rect = new android.graphics.Rect(ym5.x.a(drawer.getContext(), (float) flutterRect.getX()) + iArr[0], ym5.x.a(drawer.getContext(), (float) flutterRect.getX()) + iArr[1], ym5.x.a(drawer.getContext(), (float) (flutterRect.getX() + flutterRect.getWidth())) + iArr[0], ym5.x.a(drawer.getContext(), (float) (flutterRect.getY() + flutterRect.getHeight())) + iArr[1]);
            drawer.getLocationOnScreen(new int[2]);
            z18 = false;
            float x17 = event.getX() + r5[0];
            float y17 = event.getY() + r5[1];
            flutterRect.toString();
            rect.toString();
            if (rect.contains((int) x17, (int) y17)) {
                break;
            }
        }
        return java.lang.Boolean.valueOf(obj3 == null ? z17 : z18);
    }
}
