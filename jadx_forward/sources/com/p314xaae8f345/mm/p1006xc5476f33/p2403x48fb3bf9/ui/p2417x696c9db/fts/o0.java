package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class o0 implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f266088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f266091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266093f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.p0 f266094g;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.p0 p0Var, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4) {
        this.f266094g = p0Var;
        this.f266088a = interfaceC4987x84e327cb;
        this.f266089b = str;
        this.f266090c = str2;
        this.f266091d = i17;
        this.f266092e = str3;
        this.f266093f = str4;
    }

    @Override // dr.q
    public void a(boolean z17) {
        java.lang.String str = this.f266090c;
        java.lang.String str2 = this.f266089b;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "loadFile %s %s fail", str2, str);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.p0 p0Var = this.f266094g;
        java.lang.String z96 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74.z9(p0Var.f266114b, this.f266088a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "loadFile %s %s emojiPath %s exist %b", str2, str, z96, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(z96)));
        p0Var.f266114b.s9().G(this.f266089b, this.f266090c, this.f266091d, !z17 ? 1 : 0, this.f266092e, this.f266093f);
    }
}
