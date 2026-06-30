package mm2;

/* loaded from: classes3.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.w f411000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(mm2.w wVar) {
        super(2);
        this.f411000d = wVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        mm2.w wVar = this.f411000d;
        ((mm2.w) wVar.m147920xbba4bfc0(mm2.w.class)).f411038q = intValue;
        ((mm2.w) wVar.m147920xbba4bfc0(mm2.w.class)).f411039r = intValue2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveUtil", "validVideoSize videoWidth:" + intValue + ",videoHeight:" + intValue2);
        boolean z17 = intValue > 0 && intValue2 > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveUtil", "isLandscapeVideo validVideoSize:" + z17);
        if (z17 && intValue >= intValue2) {
            mm2.h hVar = wVar.f411037p;
            if (hVar != null) {
                hVar.m66756xebd28962(1);
            }
        } else {
            mm2.h hVar2 = wVar.f411037p;
            if (hVar2 != null) {
                hVar2.m66756xebd28962(0);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", "onVideoSizeChange [" + intValue + " x " + intValue2 + ']');
        return jz5.f0.f384359a;
    }
}
