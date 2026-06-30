package w12;

/* loaded from: classes.dex */
public final class e extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "notifyFireworkPlayEnd";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString(dm.i4.f66865x76d1ec5a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSnsTimeline", "firework " + optString + " play end");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (!(optString.length() > 0)) {
            s().mo146xb9724478(i(lc3.x.f399470d));
            return;
        }
        v12.f fVar = (v12.f) this.f399423a;
        if (fVar != null) {
            v12.e eVar = fVar.f514036e;
        }
        s().mo146xb9724478(k());
    }
}
