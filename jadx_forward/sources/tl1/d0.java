package tl1;

/* loaded from: classes15.dex */
public class d0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12792x5854885f f501734a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12792x5854885f c12792x5854885f, java.lang.String str) {
        super(str);
        this.f501734a = c12792x5854885f;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int j17;
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12792x5854885f c12792x5854885f = this.f501734a;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12792x5854885f.a(c12792x5854885f, message.arg1, message.arg2, message.obj);
            return;
        }
        int i18 = 0;
        if (!c12792x5854885f.f173377y0.c()) {
            if (c12792x5854885f.F1 == 0) {
                c12792x5854885f.n(1);
            }
            c12792x5854885f.C1.mo50311x7ab51103(c12792x5854885f.g(1, 0, 0, message.obj), 32L);
            return;
        }
        if (c12792x5854885f.T1 != 0) {
            if (c12792x5854885f.F1 == 0) {
                c12792x5854885f.n(1);
            }
            int i19 = c12792x5854885f.T1;
            int i27 = c12792x5854885f.O1;
            if (i19 < (-i27) / 2) {
                int i28 = (int) (((i27 + i19) * 300.0f) / i27);
                c12792x5854885f.f173377y0.d(0, c12792x5854885f.U1, 0, i27 + i19, i28 * 3);
                j17 = c12792x5854885f.j(c12792x5854885f.U1 + c12792x5854885f.O1 + c12792x5854885f.T1);
                i18 = i28;
            } else {
                int i29 = (int) (((-i19) * 300.0f) / i27);
                c12792x5854885f.f173377y0.d(0, c12792x5854885f.U1, 0, i19, i29 * 3);
                i18 = i29;
                j17 = c12792x5854885f.j(c12792x5854885f.U1 + c12792x5854885f.T1);
            }
            c12792x5854885f.postInvalidate();
        } else {
            c12792x5854885f.n(0);
            j17 = c12792x5854885f.j(c12792x5854885f.U1);
        }
        android.os.Message g17 = c12792x5854885f.g(2, c12792x5854885f.F, j17, message.obj);
        if (c12792x5854885f.f173374x0) {
            c12792x5854885f.D1.sendMessageDelayed(g17, i18 * 2);
        } else {
            c12792x5854885f.C1.mo50311x7ab51103(g17, i18 * 2);
        }
    }
}
