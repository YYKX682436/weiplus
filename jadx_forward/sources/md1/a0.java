package md1;

/* loaded from: classes7.dex */
public class a0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f407244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f407246c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md1.c0 f407247d;

    public a0(md1.c0 c0Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2, int i17) {
        this.f407247d = c0Var;
        this.f407244a = z17;
        this.f407245b = c0Var2;
        this.f407246c = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", "hy: microphone done! %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int i19 = this.f407246c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f407245b;
        md1.c0 c0Var2 = this.f407247d;
        if (i17 != 0 || i18 != 0) {
            c0Var.a(i19, c0Var2.o("fail: " + str));
        } else {
            c0Var2.f407255i = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new md1.z(this), 500L);
            if (c0Var2.f407255i && c0Var2.f407256m) {
                c0Var.a(i19, c0Var2.o("ok"));
            }
        }
    }
}
