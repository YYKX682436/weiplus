package yx;

/* loaded from: classes5.dex */
public final class e implements com.p314xaae8f345.mm.p2470x93e71c27.ui.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed f548545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 f548546b;

    public e(com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed activityC10499xbd0fa9ed, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32) {
        this.f548545a = activityC10499xbd0fa9ed;
        this.f548546b = c19651x7fe9d32;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f548545a.f146811d, "vKBUpdate hideBtnGuide");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void b(int i17) {
        com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed activityC10499xbd0fa9ed = this.f548545a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC10499xbd0fa9ed.f146811d, "vKBUpdate btnState:" + i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC10499xbd0fa9ed.f146814g;
        android.text.Editable text = c22621x7603e017 != null ? c22621x7603e017.getText() : null;
        if (text == null || r26.n0.N(text)) {
            this.f548546b.c(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void c(float f17, float f18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void d() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void e(float f17, float f18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void f() {
        com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed activityC10499xbd0fa9ed = this.f548545a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC10499xbd0fa9ed.f146811d, "callShowVKB");
        activityC10499xbd0fa9ed.mo26063x7b383410();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    /* renamed from: onHide */
    public void mo75913xc39a57c1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f548545a.f146811d, "onHide");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    /* renamed from: onShow */
    public void mo75914xc39f557c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f548545a.f146811d, "onShow");
    }
}
