package z31;

/* loaded from: classes7.dex */
public final class c extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "postPlayableMessageToMiniProgramLib";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        x31.a E0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("extra");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicNewPlayable.MbJsApiPostPlayableMessageToMiniProgramLib", "extra:" + optString);
        z31.a aVar = (z31.a) this.f399423a;
        if (aVar != null && (E0 = aVar.E0()) != null) {
            x31.b[] bVarArr = x31.b.f533132d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            E0.b(3, "", optString);
        }
        s().mo146xb9724478(k());
    }
}
