package xt2;

/* loaded from: classes3.dex */
public final class a6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021 f538157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021 c14982x50d7e021) {
        super(1);
        this.f538157d = c14982x50d7e021;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021.f207866p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveShoppingSkuList", "on bounce offset = " + intValue);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021 c14982x50d7e021 = this.f538157d;
        if (intValue < (-i65.a.b(c14982x50d7e021.getContext(), 40))) {
            android.os.Vibrator vibrator = c14982x50d7e021.f207871h;
            if (vibrator != null) {
                vibrator.vibrate(10L);
            }
            yz5.a onLoadMoreCallback = c14982x50d7e021.getOnLoadMoreCallback();
            if (onLoadMoreCallback != null) {
                onLoadMoreCallback.mo152xb9724478();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021.a(c14982x50d7e021);
        }
        return jz5.f0.f384359a;
    }
}
