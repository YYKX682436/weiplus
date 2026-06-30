package us2;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vt3.p f512025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest f512026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vt3.p pVar, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest) {
        super(1);
        this.f512025d = pVar;
        this.f512026e = c2CDownloadRequest;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadTemplate cancel. id:");
        vt3.p pVar = this.f512025d;
        sb6.append(pVar.f521553b);
        sb6.append(" version:");
        sb6.append(pVar.f521556e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", sb6.toString());
        ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37741x70920b1f(this.f512026e.f17792xcd096f43);
        return jz5.f0.f384359a;
    }
}
