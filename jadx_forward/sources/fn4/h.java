package fn4;

/* loaded from: classes3.dex */
public abstract class h extends com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    public void j() {
        super.j();
        setBackgroundColor(android.graphics.Color.parseColor("#40000000"));
    }

    /* renamed from: setCurrentPlaySecond */
    public void m129853xc49ceedf(int i17) {
        int mo69278x11ddf3f8;
        this.f244013p = i17;
        this.f244010m.setText(k(i17 / 60) + ":" + k(i17 % 60));
        if (i17 <= 0) {
            mo69278x11ddf3f8 = 0;
        } else {
            int i18 = this.f244012o;
            mo69278x11ddf3f8 = i17 >= i18 ? mo69278x11ddf3f8() : (int) (((i17 * 1.0d) / i18) * mo69278x11ddf3f8());
        }
        v(mo69278x11ddf3f8);
    }

    public abstract void w();

    public abstract void x();
}
