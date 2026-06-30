package nl2;

/* loaded from: classes3.dex */
public final class d implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl2.g f419707d;

    public d(nl2.g gVar) {
        this.f419707d = gVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        nl2.g gVar = this.f419707d;
        int i17 = ((mm2.u0) gVar.m56788xbba4bfc0(mm2.u0.class)).f410980m;
        if (num != null && i17 == num.intValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveOuterShortcutWordingController", "updateQuickReplyInfo, version:" + num);
            gVar.Z6();
        }
    }
}
