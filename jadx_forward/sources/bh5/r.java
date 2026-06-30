package bh5;

/* loaded from: classes8.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 f102490d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7) {
        super(4);
        this.f102490d = c22415x6ef905d7;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.View v17 = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7 = this.f102490d;
        java.lang.String str = c22415x6ef905d7.f290338f;
        android.view.ViewGroup.LayoutParams layoutParams = c22415x6ef905d7.y0().getLayoutParams();
        if (intValue2 == 0) {
            layoutParams.height = 0;
        }
        if (intValue > 0) {
            layoutParams.height = intValue;
        }
        c22415x6ef905d7.y0().setLayoutParams(layoutParams);
        return jz5.f0.f384359a;
    }
}
