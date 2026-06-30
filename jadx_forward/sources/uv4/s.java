package uv4;

/* loaded from: classes8.dex */
public final class s extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f512984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.udr.e0 f512985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uv4.p f512986c;

    public s(java.lang.String str, com.p314xaae8f345.mm.udr.e0 e0Var, uv4.p pVar) {
        this.f512984a = str;
        this.f512985b = e0Var;
        this.f512986c = pVar;
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackFailAsync */
    public void mo13581xd73276fa(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: failed taskId=" + j17 + ", errNo=" + i17 + ", errCode=" + i18 + ", projectId=" + projectId + ", name=" + name + ", version=" + i19);
        try {
            boolean z17 = true;
            if (!(name.length() > 0)) {
                name = null;
            }
            if (name == null) {
                name = this.f512984a;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) this.f512985b).Ui(projectId, name);
            java.lang.String m117639xfb83cc9b = Ui != null ? Ui.m117639xfb83cc9b() : null;
            if (m117639xfb83cc9b == null) {
                m117639xfb83cc9b = "";
            }
            if (m117639xfb83cc9b.length() <= 0) {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: even failed, got resource path=" + m117639xfb83cc9b + ", calling updateTemplateByUDR");
                this.f512986c.z(m117639xfb83cc9b);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: failed and resource is null or path is empty");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchTemplateHolder", e17, "checkUDRResourcesIfNeeded: failed to get resource or update template after check failed", new java.lang.Object[0]);
        }
        uv4.x xVar = uv4.x.f512991a;
        uv4.x.f512994d = false;
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackSuccessAsync */
    public void mo13582x5e6271bd(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: success taskId=" + j17 + ", projectId=" + projectId + ", name=" + name + ", version=" + i17 + ", type=" + type);
        uv4.x xVar = uv4.x.f512991a;
        uv4.x.f512994d = false;
    }
}
