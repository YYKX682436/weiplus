package wr;

/* loaded from: classes4.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f530275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr.j f530276e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, wr.j jVar) {
        super(1);
        this.f530275d = interfaceC4987x84e327cb;
        this.f530276e = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        wr.j jVar = this.f530276e;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f530275d;
        if (booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageMgr", "downloaded origin emoticon. start gen thumb. md5: " + interfaceC4987x84e327cb.mo42933xb5885648());
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), null, null, new wr.f(interfaceC4987x84e327cb, jVar, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EmoticonThumbImageMgr", "failed to download origin emoticon. md5: " + interfaceC4987x84e327cb.mo42933xb5885648());
            jVar.b();
        }
        return jz5.f0.f384359a;
    }
}
