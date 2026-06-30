package iy2;

/* loaded from: classes15.dex */
public final class g extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 f377427a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 c15487x24678974) {
        this.f377427a = c15487x24678974;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = msg.what;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974.f218276y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 c15487x24678974 = this.f377427a;
        c15487x24678974.getClass();
        if (i17 == 0) {
            if (c15487x24678974.currentState != c15487x24678974.STATE_STARTED) {
                return;
            }
            c15487x24678974.currentState = c15487x24678974.STATE_WAITING;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = c15487x24678974.mmHandler;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n3Var);
            n3Var.mo50303x856b99f0(0);
            n3Var.mo50307xb9e94560(0, c15487x24678974.f218288r);
            n3Var.mo50307xb9e94560(1, c15487x24678974.f218289s);
            c15487x24678974.c(false);
            return;
        }
        if (i17 == c15487x24678974.f218281h) {
            android.os.Bundle data = msg.getData();
            int i19 = data.getInt("localCode");
            int i27 = data.getInt("errType");
            int i28 = data.getInt("errCode");
            c15487x24678974.currentState = c15487x24678974.STATE_PREPARED;
            c15487x24678974.e();
            iy2.e eVar = c15487x24678974.voiceDetectListener;
            if (eVar != null) {
                ((iy2.z) eVar).a(i19, i27, i28);
            }
        }
    }
}
