package yw;

/* loaded from: classes8.dex */
public final class e2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f547843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547844c;

    public e2(java.lang.String str, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.lang.String str2) {
        this.f547842a = str;
        this.f547843b = activityC0065xcd7aa112;
        this.f547844c = str2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            g45.b.f350379a.a(this.f547842a, str, 0);
            ((dk5.s5) tg3.t1.a()).Vi(this.f547843b, this.f547842a, this.f547844c, 1, "", "", null);
            if (com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20193x3d8621e2.f273747a.a()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterShareMsgHelper", "EnterChattingAfterTrans done config disabled");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f547843b;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, activityC0065xcd7aa112, null, null);
        }
    }
}
