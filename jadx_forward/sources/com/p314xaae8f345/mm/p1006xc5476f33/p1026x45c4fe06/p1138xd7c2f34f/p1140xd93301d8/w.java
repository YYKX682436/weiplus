package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* loaded from: classes7.dex */
public class w extends android.content.ContextWrapper implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f166560h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f166561d;

    /* renamed from: e, reason: collision with root package name */
    public int f166562e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f166563f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s f166564g;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9 activityC12328x4aa1de9) {
        super(activityC12328x4aa1de9);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f166561d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12573x6a664d3b>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.FromMMProxyUI$1
            {
                this.f39173x3fe91575 = 551436157;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12573x6a664d3b c12573x6a664d3b) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.w.f166560h;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.w wVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.w.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s sVar = wVar.f166564g;
                if (sVar != null && !sVar.f166468e) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FromMMProxyUI", "reason[%s] process[%s] isFinished, just finish activity", "AppBrand_onEnterAnimationComplete", wVar.f166563f);
                wVar.getBaseContext().finish();
                return false;
            }
        };
        this.f166562e = 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y
    public void a(android.content.Intent intent, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.ui.v9.e(getBaseContext().getWindow());
        com.p314xaae8f345.mm.ui.v9.c(getBaseContext().getWindow(), true);
        java.lang.String stringExtra = intent.getStringExtra("extra_entry_token");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s l17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s.l(stringExtra);
        if (l17 == null) {
            getBaseContext().finish();
            return;
        }
        getBaseContext().overridePendingTransition(0, 0);
        l17.setBaseContext(getBaseContext());
        this.f166563f = stringExtra;
        this.f166564g = l17;
        this.f166561d.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y
    public boolean b() {
        return true;
    }

    @Override // android.content.ContextWrapper
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9 getBaseContext() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9) super.getBaseContext();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y
    /* renamed from: onDestroy */
    public void mo51791xac79a11b() {
        this.f166561d.mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s sVar = this.f166564g;
        if (sVar != null) {
            sVar.d();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y
    /* renamed from: onPause */
    public void mo51788xb01dfb57() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y
    /* renamed from: onResume */
    public void mo51789x57429eec() {
        int i17 = this.f166562e + 1;
        this.f166562e = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FromMMProxyUI", "onResume, resume count:%d", java.lang.Integer.valueOf(i17));
        if (this.f166562e > 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s sVar = this.f166564g;
            if (sVar == null || sVar.f166468e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FromMMProxyUI", "reason[%s] process[%s] isFinished, just finish activity", "NotFirstResume", this.f166563f);
                getBaseContext().finish();
            }
        }
    }
}
