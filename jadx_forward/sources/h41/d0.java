package h41;

/* loaded from: classes15.dex */
public final class d0 implements ey.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f360308a;

    public d0(h41.i0 i0Var) {
        this.f360308a = i0Var;
    }

    @Override // ey.k
    public java.lang.String a() {
        return "voip";
    }

    @Override // ey.k
    public java.lang.String b() {
        return "voip::make_voice_call";
    }

    @Override // ey.k
    public void c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.e notification) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notification, "notification");
        boolean z17 = false;
        try {
            i17 = new org.json.JSONObject(notification.b()).getInt("voip_scene");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCFunctionCallEventStubImpl", "make voip parametersJson error " + e17);
            i17 = 0;
        }
        try {
            z17 = new org.json.JSONObject(notification.c()).getBoolean(ya.b.f77504xbb80cbe3);
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCFunctionCallEventStubImpl", "make voip " + i17 + ' ' + z17);
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.d dVar = this.f360308a.f360327a;
        if (dVar != null) {
            dVar.n1(i17, z17);
        }
    }
}
