package ef0;

@j95.b
/* loaded from: classes11.dex */
public final class t1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f333859d = jz5.h.b(ef0.s1.f333851d);

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        rk4.k5.e("TingAudioPushConfigService onAccountInitialized", null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a) ((jz5.n) this.f333859d).mo141623x754a37bb();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18711x7115b73a.f256172a, "isOutdoorOpenFeature " + c18711x7115b73a.d());
        if (c18711x7115b73a.d()) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            java.util.Iterator it = c18711x7115b73a.L.iterator();
            while (it.hasNext()) {
                intentFilter.addAction((java.lang.String) it.next());
            }
            java.util.Iterator it6 = c18711x7115b73a.M.iterator();
            while (it6.hasNext()) {
                intentFilter.addAction((java.lang.String) it6.next());
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(c18711x7115b73a, intentFilter);
            ((android.media.AudioManager) ((jz5.n) c18711x7115b73a.H).mo141623x754a37bb()).registerAudioDeviceCallback(new tk4.i(c18711x7115b73a), null);
        }
        super.mo204xfac946a6(context);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a) ((jz5.n) this.f333859d).mo141623x754a37bb();
        if (c18711x7115b73a.d()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(c18711x7115b73a);
        }
        super.mo836xb8969aab(context);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        rk4.k5.e("TingAudioPushConfigService onCreate", null);
    }
}
