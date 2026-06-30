package n10;

/* loaded from: classes.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "enableNirvanaBackPress";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        boolean optBoolean = data.optBoolean("enable");
        lc3.e eVar = this.f399423a;
        if (!((eVar != null ? eVar.B0() : null) instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1)) {
            s().mo146xb9724478(i(lc3.x.f399469c));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiEnableNirvanaBackPress", "enableNirvanaBackPress: " + optBoolean);
        lc3.e eVar2 = this.f399423a;
        android.app.Activity B0 = eVar2 != null ? eVar2.B0() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(B0, "null cannot be cast to non-null type com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaUI", "setEnableBackPress, enable:" + optBoolean);
        ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1) B0).f147380s = optBoolean;
        s().mo146xb9724478(k());
    }
}
