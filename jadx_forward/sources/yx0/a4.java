package yx0;

/* loaded from: classes5.dex */
public final class a4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f548660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f548661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f548662g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(yx0.b8 b8Var, java.lang.String str, java.lang.String str2, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548659d = b8Var;
        this.f548660e = str;
        this.f548661f = str2;
        this.f548662g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.a4(this.f548659d, this.f548660e, this.f548661f, this.f548662g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yx0.a4 a4Var = (yx0.a4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        mx0.e1 e1Var = this.f548659d.X1;
        if (e1Var != null) {
            java.lang.String draftBundleDirPath = this.f548660e;
            java.lang.String videoOutputFilePath = dw3.h.d(dw3.h.f325744a, null, null, 3, null);
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 s17 = this.f548659d.s();
            com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b a17 = ts2.a.a(ts2.a.f503153a, this.f548661f, false, 2, null);
            yz5.l callback = this.f548662g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftBundleDirPath, "draftBundleDirPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoOutputFilePath, "videoOutputFilePath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            if (e1Var.f413468b != mx0.d0.f413426d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaterialImportHelper", "openAsyncAIGCDraft: importPreviewState " + e1Var.f413468b);
                callback.mo146xb9724478(java.lang.Boolean.FALSE);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaterialImportHelper", "openAsyncAIGCDraft: importPreviewState " + e1Var.f413468b);
                e1Var.f(mx0.d0.f413435p);
                p3325xe03a0797.p3326xc267989b.l.d(e1Var.f413471e, null, null, new mx0.t0(e1Var, callback, draftBundleDirPath, videoOutputFilePath, s17, a17, null), 3, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
