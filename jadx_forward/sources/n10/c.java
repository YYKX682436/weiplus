package n10;

/* loaded from: classes.dex */
public final class c extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "enableNirvanaSwipeBack";
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
        rk0.c.c("MBJsApiEnableNirvanaSwipeBack", "enableNirvanaSwipeBack: " + optBoolean, new java.lang.Object[0]);
        lc3.e eVar2 = this.f399423a;
        android.app.Activity B0 = eVar2 != null ? eVar2.B0() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(B0, "null cannot be cast to non-null type com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI");
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1 activityC10542x4d3a27a1 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1) B0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaUI", "setEnableSwipeBack, enable:" + optBoolean);
        activityC10542x4d3a27a1.f147381t = optBoolean;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95 = activityC10542x4d3a27a1.m78735x28280f95();
        if (m78735x28280f95 != null) {
            m78735x28280f95.m81450x8e764904(optBoolean);
        }
        s().mo146xb9724478(k());
    }
}
