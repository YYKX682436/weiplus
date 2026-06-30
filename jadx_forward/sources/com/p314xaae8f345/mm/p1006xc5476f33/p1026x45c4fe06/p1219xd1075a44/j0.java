package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* loaded from: classes15.dex */
public class j0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12757x3b5d0f43 f173274a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12757x3b5d0f43 c12757x3b5d0f43, android.os.Looper looper) {
        super(looper);
        this.f173274a = c12757x3b5d0f43;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12757x3b5d0f43 c12757x3b5d0f43 = this.f173274a;
        switch (i17) {
            case 1000:
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12757x3b5d0f43.f172545i;
                c12757x3b5d0f43.setVisibility(0);
                c12757x3b5d0f43.setAlpha(1.0f);
                return;
            case 1001:
                float f17 = c12757x3b5d0f43.f172546d;
                if (f17 < 600.0f) {
                    c12757x3b5d0f43.f172546d = f17 + c12757x3b5d0f43.f172547e;
                } else if (f17 >= 600.0f && f17 < 800.0f) {
                    c12757x3b5d0f43.f172546d = f17 + c12757x3b5d0f43.f172548f;
                } else if (f17 >= 800.0f && f17 < 920.0f) {
                    c12757x3b5d0f43.f172546d = f17 + c12757x3b5d0f43.f172549g;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = c12757x3b5d0f43.f172550h;
                if (n3Var != null) {
                    if (c12757x3b5d0f43.f172546d < 920.0f) {
                        n3Var.mo50307xb9e94560(1001, 10L);
                    } else {
                        n3Var.mo50303x856b99f0(1001);
                    }
                }
                c12757x3b5d0f43.setProgress((int) c12757x3b5d0f43.f172546d);
                return;
            case 1002:
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12757x3b5d0f43.f172545i;
                c12757x3b5d0f43.getClass();
                return;
            case 1003:
                c12757x3b5d0f43.f172546d = 0.0f;
                c12757x3b5d0f43.postInvalidateDelayed(200L);
                c12757x3b5d0f43.setVisibility(8);
                return;
            default:
                return;
        }
    }
}
