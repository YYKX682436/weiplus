package rx2;

/* loaded from: classes10.dex */
public final class q extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 f482524n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8, android.content.Context context) {
        super(context);
        this.f482524n = c15415x74224fd8;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayMetrics, "displayMetrics");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = this.f482524n;
        c15415x74224fd8.getClass();
        float f17 = c15415x74224fd8.f214173y;
        if (f17 > 0.0f) {
            i17 = displayMetrics.heightPixels;
        } else {
            f17 = c15415x74224fd8.f214172x;
            i17 = displayMetrics.densityDpi;
        }
        return f17 / i17;
    }
}
