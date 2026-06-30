package jw2;

/* loaded from: classes10.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15206x9fc9f265 c15206x9fc9f265, android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int g(int i17, int i18, int i19, int i27, int i28) {
        return (i19 + ((i27 - i19) / 2)) - (i17 + ((i18 - i17) / 2));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayMetrics, "displayMetrics");
        return 100.0f / displayMetrics.densityDpi;
    }
}
