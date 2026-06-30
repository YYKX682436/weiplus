package md1;

/* loaded from: classes7.dex */
public class y implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f407352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ md1.c0 f407353c;

    public y(md1.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2, int i17) {
        this.f407353c = c0Var;
        this.f407351a = c0Var2;
        this.f407352b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", "hy: earphone done! %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        md1.c0 c0Var = this.f407353c;
        int i19 = this.f407352b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2 = this.f407351a;
        if (i17 != 0 || i18 != 0) {
            c0Var2.a(i19, c0Var.o("fail: " + str));
        } else {
            c0Var.f407256m = true;
            if (c0Var.f407255i) {
                c0Var2.a(i19, c0Var.o("ok"));
            }
        }
    }
}
