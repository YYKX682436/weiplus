package l00;

/* loaded from: classes7.dex */
public final class e extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "notifyEcsGiftAnimationStatus";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiNotifyEcsGiftAnimationStatus", "notifyEcsGiftAnimationStatus invoke");
        java.lang.String optString = data.optString("status", "");
        bw5.rc0 rc0Var = new bw5.rc0();
        rc0Var.f114024d = optString;
        rc0Var.f114025e[1] = true;
        byte[] mo14344x5f01b1f6 = rc0Var.mo14344x5f01b1f6();
        lc3.e eVar = this.f399423a;
        l00.h hVar = eVar instanceof l00.h ? (l00.h) eVar : null;
        if (hVar == null) {
            s().mo146xb9724478(h(1, "invalid context"));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        l00.i iVar = hVar.f396259y;
        if (iVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "onEcsGiftAnimationStatus apiName: notifyEcsGiftAnimationStatus, data size: " + mo14344x5f01b1f6.length);
            com.p314xaae8f345.p2845xc516c4b6.ecs.C23651x33940179 c23651x33940179 = ((l00.m) iVar).f396266g;
            if (c23651x33940179 != null) {
                c23651x33940179.m87668xb9724478("", "notifyEcsGiftAnimationStatus", mo14344x5f01b1f6, l00.l.f396262d);
            }
        }
        s().mo146xb9724478(k());
    }
}
