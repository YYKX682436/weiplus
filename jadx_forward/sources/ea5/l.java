package ea5;

/* loaded from: classes15.dex */
public abstract class l implements fs.n, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i {

    /* renamed from: udrCallback */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.udr.h f69662x7945d528;

    /* renamed from: addToPeriod */
    public boolean mo40417x561213dd() {
        return !(this instanceof il0.d);
    }

    /* renamed from: getParameter */
    public java.util.ArrayList<com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v> mo14972x73ec24f3() {
        return new java.util.ArrayList<>();
    }

    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return null;
    }

    /* renamed from: getProjectIdList */
    public java.util.ArrayList<java.lang.String> mo65744x5efea91c() {
        return null;
    }

    /* renamed from: getUdrCallback */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.udr.h m127230x531c1bf2() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.h hVar = this.f69662x7945d528;
        if (hVar != null) {
            return hVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("udrCallback");
        throw null;
    }

    /* renamed from: haveSpecifiedResourceAsync */
    public void mo14012xafcc46c6(long j17, java.lang.String projectId, java.lang.String name, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        m127230x531c1bf2().N1(j17);
    }

    /* renamed from: onCallBackCheckSuccessAsync */
    public void mo52027x9bd1065d(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        m127230x531c1bf2().F(j17);
    }

    /* renamed from: onCallBackFailAsync */
    public void mo46983xd73276fa(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        m127230x531c1bf2().e(j17);
    }

    /* renamed from: onCallBackStartPeriodAsync */
    public void mo65745x66f572fd(long j17, java.lang.String projectId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        m127230x531c1bf2().c0(j17);
    }

    /* renamed from: onCallBackSuccessAsync */
    public void mo40418x5e6271bd(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        m127230x531c1bf2().I(j17);
    }

    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        m127230x531c1bf2().Y0(j17);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: setCallback */
    public void mo117621x6c4ebec7(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.h p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        m127231xe9818f66(p07);
    }

    /* renamed from: setUdrCallback */
    public final void m127231xe9818f66(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hVar, "<set-?>");
        this.f69662x7945d528 = hVar;
    }
}
