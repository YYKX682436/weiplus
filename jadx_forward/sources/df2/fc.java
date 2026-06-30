package df2;

/* loaded from: classes3.dex */
public final class fc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.jc f311666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(df2.jc jcVar) {
        super(2);
        this.f311666d = jcVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 c14300xaa703dd8;
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        df2.jc jcVar = this.f311666d;
        if (booleanValue) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c14400x1527540f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f) jcVar.S6(com.p314xaae8f345.mm.R.id.ubl);
            if (c14400x1527540f != null) {
                c14400x1527540f.h();
                c14400x1527540f.m57906x5cc2687b(false);
                android.view.ViewGroup.LayoutParams layoutParams = c14400x1527540f.getLayoutParams();
                layoutParams.height = intValue;
                c14400x1527540f.setLayoutParams(layoutParams);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c14400x1527540f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f) jcVar.S6(com.p314xaae8f345.mm.R.id.ubl);
            if (c14400x1527540f2 != null && (c14300xaa703dd8 = jcVar.f312001o) != null) {
                c14300xaa703dd8.post(new df2.ec(c14400x1527540f2, intValue));
            }
        }
        return jz5.f0.f384359a;
    }
}
