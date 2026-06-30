package tw;

/* loaded from: classes9.dex */
public final class c implements e31.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tw.i f503928a;

    public c(tw.i iVar) {
        this.f503928a = iVar;
    }

    @Override // e31.h
    public void a(java.lang.String bizUsername, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsNotifySettingUIC", "[NotifySwitchCB] onNotifySwitchInfoUpdated: bizUsername=" + bizUsername + ", isOpened=" + z17 + ", importantNotifyNum=" + i17);
        tw.i iVar = this.f503928a;
        iVar.f503943o.add(bizUsername);
        if (iVar.f503943o.size() >= 10) {
            iVar.f503943o.size();
            tw.i.T6(iVar);
        } else if (iVar.f503944p == null) {
            tw.f fVar = new tw.f(iVar);
            iVar.f503944p = fVar;
            iVar.f503939h.mo50297x7c4d7ca2(fVar, 200L);
        }
    }
}
