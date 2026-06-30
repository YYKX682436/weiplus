package db5;

/* loaded from: classes8.dex */
public class w1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21488x3b5d0f43 f310092a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21488x3b5d0f43 c21488x3b5d0f43, android.os.Looper looper) {
        super(looper);
        this.f310092a = c21488x3b5d0f43;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        java.lang.Float valueOf;
        int i17 = message.what;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21488x3b5d0f43 c21488x3b5d0f43 = this.f310092a;
        switch (i17) {
            case 1000:
                int i18 = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21488x3b5d0f43.f278866o;
                c21488x3b5d0f43.setVisibility(0);
                c21488x3b5d0f43.setAlpha(1.0f);
                return;
            case 1001:
                float f17 = c21488x3b5d0f43.f278868e;
                if (f17 < 600.0f) {
                    c21488x3b5d0f43.f278868e = f17 + c21488x3b5d0f43.f278869f;
                } else if (f17 >= 600.0f && f17 < 800.0f) {
                    c21488x3b5d0f43.f278868e = f17 + c21488x3b5d0f43.f278870g;
                } else if (f17 >= 800.0f && f17 < 920.0f) {
                    c21488x3b5d0f43.f278868e = f17 + c21488x3b5d0f43.f278871h;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = c21488x3b5d0f43.f278874n;
                if (n3Var != null) {
                    if (c21488x3b5d0f43.f278868e < 920.0f) {
                        n3Var.mo50307xb9e94560(1001, 10L);
                    } else {
                        n3Var.mo50303x856b99f0(1001);
                    }
                }
                c21488x3b5d0f43.setProgress((int) c21488x3b5d0f43.f278868e);
                return;
            case 1002:
                if (c21488x3b5d0f43.f278867d) {
                    float f18 = c21488x3b5d0f43.f278868e;
                    if (f18 < 950.0f) {
                        float f19 = f18 + c21488x3b5d0f43.f278872i;
                        c21488x3b5d0f43.f278868e = f19;
                        c21488x3b5d0f43.f278868e = f19 <= 950.0f ? f19 : 950.0f;
                        valueOf = java.lang.Float.valueOf(1.0f);
                    } else {
                        float f27 = f18 + 1.0f;
                        c21488x3b5d0f43.f278868e = f27;
                        valueOf = java.lang.Float.valueOf(((1000.0f - f27) * 0.01f) + 0.3f);
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = c21488x3b5d0f43.f278874n;
                    if (n3Var2 != null) {
                        if (c21488x3b5d0f43.f278868e < 1000.0f) {
                            n3Var2.mo50307xb9e94560(1002, 10L);
                        } else {
                            c21488x3b5d0f43.f278868e = 1000.0f;
                            n3Var2.mo50303x856b99f0(1002);
                            n3Var2.mo50307xb9e94560(1003, 10L);
                        }
                    }
                    c21488x3b5d0f43.setAlpha(valueOf.floatValue());
                    c21488x3b5d0f43.setProgress((int) c21488x3b5d0f43.f278868e);
                    return;
                }
                return;
            case 1003:
                c21488x3b5d0f43.f278868e = 0.0f;
                c21488x3b5d0f43.f278867d = false;
                c21488x3b5d0f43.postInvalidateDelayed(200L);
                c21488x3b5d0f43.setVisibility(8);
                return;
            default:
                return;
        }
    }
}
