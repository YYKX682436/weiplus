package zn0;

/* loaded from: classes3.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zn0.s f555899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zn0.s sVar) {
        super(0);
        this.f555899d = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zn0.s sVar = this.f555899d;
        if (sVar.f555922g != zn0.k.f555892d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "currentState: " + sVar.f555922g);
            sVar.f555926k = true;
        } else {
            if (sVar.f555921f != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLivePublishMediaStream", "Has nextDataWrap");
                sVar.f555920e = sVar.f555921f;
                sVar.f555921f = null;
            }
            if (sVar.f555920e == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "currentDataWrap is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "Call realPublishMediaStream");
                sVar.f();
            }
        }
        return jz5.f0.f384359a;
    }
}
