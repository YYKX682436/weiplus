package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes5.dex */
public class a1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f220223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f220224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220225c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 f220226d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var, android.content.Context context, int i17, java.lang.String str) {
        this.f220226d = p0Var;
        this.f220223a = context;
        this.f220224b = i17;
        this.f220225c = str;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", "createLiteApp fail");
        this.f220226d.getClass();
        int i17 = this.f220224b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str = this.f220225c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", "fallbackActivity! fromScene:%d username:%s", valueOf, str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("finish_direct", true);
        if (i17 != 0) {
            intent.putExtra("chat_from_scene", i17);
        }
        j45.l.u(this.f220223a, ".ui.chatting.ChattingUI", intent, null);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().b0("gh_25d9ac85a4bc");
        this.f220226d.f222136d.mo48813x58998cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", "createLiteApp success");
    }
}
