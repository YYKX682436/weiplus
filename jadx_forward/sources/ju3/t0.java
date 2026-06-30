package ju3;

/* loaded from: classes10.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6 f383550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6 c17018x4aa057d6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f383550d = c17018x4aa057d6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ju3.t0(this.f383550d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ju3.t0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6 c17018x4aa057d6 = this.f383550d;
        c17018x4aa057d6.getClosePlugin().mo9067x901b6914(8);
        c17018x4aa057d6.getCameraSwitchPlugin().mo9067x901b6914(8);
        c17018x4aa057d6.getSwitchFlashPlugin().f546878d.setVisibility(8);
        nu3.i iVar = nu3.i.f421751a;
        iVar.n("KEY_CAMERA_SESSION_ID", nu3.f.f421745c);
        iVar.n("KEY_CAMERA_ENTER_SESSION_ID", nu3.f.f421746d);
        iVar.n("KEY_CHAT_USERNAME", nu3.f.f421747e);
        iVar.n("KEY_ROOM_SIZE", new java.lang.Integer(nu3.f.f421748f));
        iVar.n("KEY_MEDIA_SOURCE_INT", new java.lang.Integer(c17018x4aa057d6.getCameraSwitchPlugin().f547264h ? 1 : 2));
        c17018x4aa057d6.K(1, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6.G(c17018x4aa057d6);
        yt3.b recordPlugin = c17018x4aa057d6.getRecordPlugin();
        if (recordPlugin == null) {
            return null;
        }
        recordPlugin.f(false);
        return jz5.f0.f384359a;
    }
}
