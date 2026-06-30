package ko4;

/* loaded from: classes14.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ko4.l f391609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f391610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ko4.l lVar, int i17) {
        super(0);
        this.f391609d = lVar;
        this.f391610e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ko4.l lVar = this.f391609d;
        java.lang.Object obj = lVar.f391625m;
        int i17 = this.f391610e;
        synchronized (obj) {
            ko4.b c17 = lVar.f391622j.c(i17);
            try {
                ko4.d dVar = lVar.f391623k;
                if (dVar != null) {
                    dVar.c(c17.f391571b);
                }
            } catch (java.lang.Exception unused) {
                lVar.f391626n = true;
            }
            lVar.f391622j.d();
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = lVar.f391615c;
            if (c25779x3338e719 != null) {
                c25779x3338e719.m97638xab5ea589(c17.f391570a.presentationTimeUs);
            }
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e7192 = lVar.f391615c;
            if (c25779x3338e7192 != null) {
                c25779x3338e7192.m97641x82211f20();
            }
            lVar.f391625m.notifyAll();
        }
        return jz5.f0.f384359a;
    }
}
