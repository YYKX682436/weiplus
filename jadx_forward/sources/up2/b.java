package up2;

/* loaded from: classes10.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.C14536x9a32afac f511325n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.C14536x9a32afac c14536x9a32afac, android.content.Context context) {
        super(context);
        this.f511325n = c14536x9a32afac;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int i(android.view.View view, int i17) {
        int i18 = super.i(view, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f511325n.f203090v, "[calculateDyToMakeVisible] dy = " + i18);
        return i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayMetrics, "displayMetrics");
        return 100.0f / displayMetrics.densityDpi;
    }
}
