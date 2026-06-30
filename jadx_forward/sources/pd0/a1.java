package pd0;

/* loaded from: classes11.dex */
public class a1 implements com.p314xaae8f345.mm.app.a3 {
    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: getHandler */
    public android.os.Handler mo14497x67189314() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppBackground */
    public void mo510x3be51a90(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppForeground */
    public void mo511x1952ea5(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ((ku5.t0) ku5.t0.f394148d).h(new od0.i(), "SIRWorker");
            if (!android.text.TextUtils.isEmpty(wo.w0.c()) || gm0.j1.a()) {
                od0.r.wi();
            }
        }
    }
}
