package tw;

/* loaded from: classes9.dex */
public final class d implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tw.i f503929a;

    public d(tw.i iVar) {
        this.f503929a = iVar;
    }

    @Override // e31.i
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandEcsNotifySettingUIC", "onSubscribeMsgStatusChanged error");
    }

    @Override // e31.i
    public void b(java.lang.String templateId, e31.j result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsNotifySettingUIC", "onSubscribeMsgStatusChanged templateId: " + templateId + ", businessType: " + result.f328616i + ", isSubscribed: " + result.f328608a + ", isSwitchOpened: " + result.f328609b);
        tw.i iVar = this.f503929a;
        iVar.f503939h.mo50300x3fa464aa(iVar.f503948t);
        iVar.f503939h.mo50297x7c4d7ca2(iVar.f503948t, 100L);
    }
}
