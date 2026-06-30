package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* renamed from: com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView */
/* loaded from: classes11.dex */
public class C16628x1b8e963a extends android.widget.LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f232200i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f232201d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16637xca0f8dc2 f232202e;

    /* renamed from: f, reason: collision with root package name */
    public ql3.a f232203f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.k f232204g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f232205h;

    /* renamed from: com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView$3, reason: invalid class name */
    /* loaded from: classes11.dex */
    public class AnonymousClass3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4> {
        public AnonymousClass3(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = -1155728636;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f42 = c5722xb16ab0f4;
            if (c5722xb16ab0f42.f136045g.f88569b != 6) {
                return false;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.c(this, c5722xb16ab0f42));
            return false;
        }
    }

    public C16628x1b8e963a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: setMusicLyric */
    private void m67223xecdddb3c(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallMusicLyricView", "setMusicLyric: %s", str);
        if (this.f232202e != null) {
            ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
            this.f232203f = z17;
            if (z17 == null) {
                this.f232202e.setVisibility(8);
                return;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z17.f66995x4a6948ee)) {
                this.f232202e.setVisibility(8);
                return;
            }
            this.f232202e.setVisibility(8);
            ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).E(this.f232203f, false, false);
        }
    }

    /* renamed from: setMusicTitle */
    private void m67224xed475935(java.lang.String str) {
        android.widget.TextView textView = this.f232201d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: setMusicWrapper */
    public void m67225x65da7830(b21.r rVar) {
        m67224xed475935(rVar.f98881g);
        m67223xecdddb3c(rVar.f98888q);
    }

    public C16628x1b8e963a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f232203f = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.a(this);
        this.f232204g = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16628x1b8e963a.AnonymousClass3 anonymousClass3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16628x1b8e963a.AnonymousClass3(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f232205h = anonymousClass3;
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bao, (android.view.ViewGroup) this, true);
        this.f232201d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567584k04);
        this.f232202e = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16637xca0f8dc2) findViewById(com.p314xaae8f345.mm.R.id.jza);
        anonymousClass3.mo48813x58998cd();
        java.util.LinkedList linkedList = ((rl3.b) kl3.t.g().a()).f478768j;
        if (linkedList.contains(aVar)) {
            return;
        }
        linkedList.add(aVar);
    }
}
