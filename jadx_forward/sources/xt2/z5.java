package xt2;

/* loaded from: classes3.dex */
public final class z5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021 f538689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021 c14982x50d7e021) {
        super(0);
        this.f538689d = c14982x50d7e021;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021 c14982x50d7e021 = this.f538689d;
        android.view.View inflate = android.view.LayoutInflater.from(c14982x50d7e021.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ddh, (android.view.ViewGroup) null);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(i65.a.a(inflate.getContext(), 12.0f));
        inflate.setLayoutParams(marginLayoutParams);
        ym5.a1.h(inflate, new xt2.y5(c14982x50d7e021));
        return inflate;
    }
}
