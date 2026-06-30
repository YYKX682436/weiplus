package qs3;

/* loaded from: classes15.dex */
public final class l0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16952x9dd7e703 f447892a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16952x9dd7e703 c16952x9dd7e703, android.os.Looper looper) {
        super(looper);
        this.f447892a = c16952x9dd7e703;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = msg.what;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16952x9dd7e703.f236551v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16952x9dd7e703 c16952x9dd7e703 = this.f447892a;
        c16952x9dd7e703.getClass();
        if (i17 == 0) {
            c16952x9dd7e703.b();
            return;
        }
        if (i17 == c16952x9dd7e703.f236558m) {
            if (c16952x9dd7e703.f236564s && c16952x9dd7e703.f236565t) {
                java.lang.String string = c16952x9dd7e703.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574290hr4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                c16952x9dd7e703.f(string, -1);
                return;
            }
            return;
        }
        if (i17 == c16952x9dd7e703.f236560o) {
            c16952x9dd7e703.e();
        } else if (i17 == c16952x9dd7e703.f236561p) {
            c16952x9dd7e703.a();
        }
    }
}
