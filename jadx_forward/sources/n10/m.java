package n10;

/* loaded from: classes7.dex */
public final class m extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "handleTextInput";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        data.toString();
        lc3.e eVar = this.f399423a;
        boolean z17 = (eVar != null ? eVar.B0() : null) instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1;
        lc3.z zVar = lc3.x.f399469c;
        if (!z17) {
            s().mo146xb9724478(i(zVar));
            return;
        }
        lc3.e eVar2 = this.f399423a;
        android.app.Activity B0 = eVar2 != null ? eVar2.B0() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(B0, "null cannot be cast to non-null type com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI");
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 textInputPlugin = ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1) B0).V6().getTextInputPlugin();
        if (textInputPlugin == null) {
            s().mo146xb9724478(i(zVar));
        } else {
            pm0.v.X(new n10.l(textInputPlugin, data, this));
        }
    }
}
