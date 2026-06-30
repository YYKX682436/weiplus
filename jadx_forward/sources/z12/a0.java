package z12;

/* loaded from: classes4.dex */
public final class a0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z12.b0 f550811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f550812b;

    public a0(z12.b0 b0Var, yz5.p pVar) {
        this.f550811a = b0Var;
        this.f550812b = pVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        r45.fu4 fu4Var = (r45.fu4) fVar.f152151d;
        z12.b0 b0Var = this.f550811a;
        b0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.StoreEmoticonGetDesignerAcctInfoCgi", "[onSceneEnd] MMFunc_MMGetDesignerAcctInfoNew: " + i17 + ", " + i18);
        java.lang.String str = b0Var.f550813a;
        yz5.p pVar = this.f550812b;
        if (i18 == 0) {
            pVar.mo149xb9724478(fu4Var != null ? fu4Var.f456132d : null, str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.StoreEmoticonGetDesignerAcctInfoCgi", "get designerAccInfo failed");
            pVar.mo149xb9724478(null, str);
        }
        return jz5.f0.f384359a;
    }
}
