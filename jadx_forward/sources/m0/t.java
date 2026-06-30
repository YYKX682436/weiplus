package m0;

/* loaded from: classes14.dex */
public final class t extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final int f404041d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f404042e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f404043f;

    /* renamed from: g, reason: collision with root package name */
    public final m0.u f404044g;

    /* renamed from: h, reason: collision with root package name */
    public int f404045h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f404041d = 5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f404042e = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f404043f = arrayList2;
        this.f404044g = new m0.u();
        setClipChildren(false);
        m0.v vVar = new m0.v(context);
        addView(vVar);
        arrayList.add(vVar);
        arrayList2.add(vVar);
        this.f404045h = 1;
        setTag(com.p314xaae8f345.mm.R.id.f566776h04, java.lang.Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(0, 0);
    }
}
