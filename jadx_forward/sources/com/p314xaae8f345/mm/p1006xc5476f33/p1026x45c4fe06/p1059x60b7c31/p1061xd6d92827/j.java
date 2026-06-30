package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827;

/* loaded from: classes7.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f160288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yz5.l lVar) {
        super(1);
        this.f160288d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) obj;
        java.lang.String mo48798x74292566 = e9Var != null ? e9Var.mo48798x74292566() : null;
        boolean z17 = false;
        if (e9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] keepAlive service null, skip setPauseType");
        } else {
            if (mo48798x74292566 == null || mo48798x74292566.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] keepAlive appid empty, skip setPauseType");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.g(mo48798x74292566, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.LAUNCH_MINI_PROGRAM);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] keepAlive setPauseType applied, hostAppId=" + mo48798x74292566);
                z17 = true;
            }
        }
        this.f160288d.mo146xb9724478(java.lang.Boolean.valueOf(z17));
        return jz5.f0.f384359a;
    }
}
