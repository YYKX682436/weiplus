package gh1;

/* loaded from: classes7.dex */
public final class d extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "removeMagicBrushFrameSet";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (!data.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d)) {
            s().mo146xb9724478(i(new lc3.z(1, "fail")));
            return;
        }
        java.lang.String name = data.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "");
        lc3.e eVar = this.f399423a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MagicSclMBFrameBiz");
        fh1.z zVar = (fh1.z) ((fh1.x0) eVar).f344155x;
        zVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        zVar.e(new fh1.v(zVar, name));
        s().mo146xb9724478(k());
    }
}
