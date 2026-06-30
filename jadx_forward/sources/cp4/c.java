package cp4;

/* loaded from: classes8.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2329x20ef99e6.C18798x1f17fe0a c18798x1f17fe0a, android.content.Context context) {
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
        return 200.0f / displayMetrics.densityDpi;
    }
}
