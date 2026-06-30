package qg5;

/* loaded from: classes.dex */
public final class c3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.e3 f444473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(qg5.e3 e3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444473d = e3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qg5.c3(this.f444473d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.c3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        jz5.f0 f0Var = jz5.f0.f384359a;
        qg5.e3 e3Var = this.f444473d;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            e3Var.getClass();
            str = ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).f444809r;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YuanBaoChatRecordsReportFeatureService", "reportAdExposeEndSummarizeFile: exception", e17);
        }
        if (str == null) {
            return f0Var;
        }
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).mj(str, wj.w0.f528075e, null);
        return f0Var;
    }
}
