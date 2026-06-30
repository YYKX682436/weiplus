package yw4;

/* loaded from: classes7.dex */
public final class o extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yw4.q f548510a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yw4.q qVar, android.os.Looper looper) {
        super(looper);
        this.f548510a = qVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        yw4.q qVar = this.f548510a;
        if (qVar.f548515e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebPrefetcherJsApiHandler", "handleMsg destroyed and ignore");
            return;
        }
        int i17 = msg.what;
        boolean z17 = true;
        if (i17 != 1) {
            if (i17 == 2) {
                java.util.Objects.toString(msg.obj);
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                qVar.f548515e = true;
                return;
            }
        }
        java.lang.Object obj = msg.obj;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            ((java.util.ArrayList) qVar.f548516f).add(str);
        }
        yw4.q.b(qVar);
    }
}
