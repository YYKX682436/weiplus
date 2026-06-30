package ea5;

/* loaded from: classes15.dex */
public abstract class k implements com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e {

    /* renamed from: udrCallback */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.udr.d f69661x7945d528;

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackCheckSuccessAsync */
    public void mo52024x9bd1065d(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.d dVar = this.f69661x7945d528;
        if (dVar != null) {
            dVar.F(j17);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackFailAsync */
    public void mo13581xd73276fa(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.d dVar = this.f69661x7945d528;
        if (dVar != null) {
            dVar.e(j17);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackSuccessAsync */
    public void mo13582x5e6271bd(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.d dVar = this.f69661x7945d528;
        if (dVar != null) {
            dVar.I(j17);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: setCallback */
    public void mo117620x6c4ebec7(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.d dVar) {
        if (dVar != null) {
            this.f69661x7945d528 = dVar;
        }
    }
}
