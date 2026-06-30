package mq5;

/* loaded from: classes15.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2816xed9644dc.p2817x373aa5.C22939x715c4d57 f412344n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p2816xed9644dc.p2817x373aa5.C22939x715c4d57 c22939x715c4d57, android.content.Context context) {
        super(context);
        this.f412344n = c22939x715c4d57;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayMetrics, "displayMetrics");
        return this.f412344n.f295879v / displayMetrics.densityDpi;
    }
}
