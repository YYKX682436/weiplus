package en2;

/* loaded from: classes10.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1547x31c90fad.C14423xb0a0cdaf f336813n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1547x31c90fad.C14423xb0a0cdaf c14423xb0a0cdaf, android.content.Context context) {
        super(context);
        this.f336813n = c14423xb0a0cdaf;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int i(android.view.View view, int i17) {
        int i18 = super.i(view, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f336813n.f200590v, "[calculateDyToMakeVisible] dy = " + i18);
        return i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayMetrics, "displayMetrics");
        int i17 = mm2.e5.f410534o;
        return mm2.e5.f410534o / displayMetrics.densityDpi;
    }
}
