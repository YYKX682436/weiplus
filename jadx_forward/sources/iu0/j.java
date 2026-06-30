package iu0;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f376361d = str;
        this.f376362e = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new iu0.j(this.f376361d, this.f376362e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((iu0.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str = this.f376362e;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preparePublishResourceWithoutMusic: templateId=");
        java.lang.String str2 = this.f376361d;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.ResMgr", sb6.toString());
        iu0.k kVar = iu0.k.f376363a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        sb7.append(az0.i5.f97098i);
        sb7.append("/MJPublisher/ComposingCreation");
        java.lang.String sb8 = sb7.toString();
        com.p314xaae8f345.mm.vfs.w6.u(sb8);
        java.lang.String str3 = sb8 + "/download_" + java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.vfs.w6.u(str3);
        try {
            java.lang.String a17 = iu0.k.a(kVar, "http://dldir1v6.qq.com/weixin/checkresupdate/TemplateScript_10df1f6f5e9040289295af14c8b93d5a.lua", str3 + "/TemplateScript.lua");
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.ResMgr", "preparePublishResourceWithoutMusic: lua script download failed");
                return null;
            }
            java.lang.String str4 = sb8 + "/composing_creation_" + str2;
            com.p314xaae8f345.mm.vfs.w6.f(str4);
            java.lang.String str5 = str4 + '/' + str2;
            com.p314xaae8f345.mm.vfs.w6.u(str5);
            if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.ResMgr", "preparePublishResourceWithoutMusic: templateJsonFilePath not exist");
                return null;
            }
            com.p314xaae8f345.mm.vfs.w6.c(str, str5 + "/config.json");
            com.p314xaae8f345.mm.vfs.w6.c(a17, str5 + "/TemplateScript.lua");
            java.lang.String str6 = sb8 + '/' + str2 + ".zip";
            boolean b17 = iu0.k.b(kVar, str4, str6);
            com.p314xaae8f345.mm.vfs.w6.f(str4);
            com.p314xaae8f345.mm.vfs.w6.f(str3);
            if (b17) {
                return str6;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.ResMgr", "preparePublishResourceWithoutMusic: zip failed");
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.ResMgr", "preparePublishResourceWithoutMusic: exception: " + e17.getMessage());
            return null;
        }
    }
}
