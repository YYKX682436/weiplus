package zn0;

/* loaded from: classes3.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zn0.s f555900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(zn0.s sVar) {
        super(0);
        this.f555900d = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zn0.s sVar = this.f555900d;
        java.lang.String str = sVar.f555918c;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "publishMediaStreamTaskId.length is 0");
        } else {
            if (sVar.f555921f != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "Has nextDataWrap");
                sVar.f555921f = null;
            }
            if (sVar.f555920e != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "Has currentDataWrap");
                sVar.f555920e = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "currentState: " + sVar.f555922g + ", publishMediaStreamTaskId: " + sVar.f555918c);
            sVar.f555916a.mo30408x53095397(sVar.f555918c);
        }
        return jz5.f0.f384359a;
    }
}
