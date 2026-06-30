package m13;

/* loaded from: classes10.dex */
public final class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i13.j f404396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f404397b;

    public c(i13.j jVar, yz5.l lVar) {
        this.f404396a = jVar;
        this.f404397b = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transformMsgItem, forcePushId:");
        i13.j jVar = this.f404396a;
        sb6.append(jVar.f66499xaeadb4bb);
        sb6.append(" username:");
        sb6.append(jVar.f66503x11b86abb);
        sb6.append(" nickname:");
        sb6.append(jVar.f66496x685e8417);
        sb6.append(" avatarUrl:");
        sb6.append(v5Var.f68910xea1bd3d4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ForceNotifyUtil", sb6.toString());
        java.lang.String str = jVar.f66499xaeadb4bb;
        java.lang.String str2 = jVar.f66503x11b86abb;
        java.lang.String str3 = jVar.f66496x685e8417;
        long j17 = jVar.f66495x81959a6e;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fev);
        java.lang.String str4 = v5Var.f68910xea1bd3d4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        this.f404397b.mo146xb9724478(new i13.p(str, str2, str3, string, j17, str4));
    }
}
