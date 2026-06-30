package cm1;

/* loaded from: classes14.dex */
public final class e implements com.p314xaae8f345.mm.app.t2 {
    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "willEnterWxaVoipCallingOnAppForeground[" + cm1.t.f124852d + "] currentDataEnterWxaVoipCalling=[" + cm1.t.f124851c + ']');
        if (cm1.t.f124852d) {
            cm1.t tVar = cm1.t.f124849a;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            tVar.b(context, false);
            if (((uf0.e) i95.n0.c(uf0.e.class)) != null) {
                ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) mo3.f.f411939a).f(41);
            }
        }
    }
}
