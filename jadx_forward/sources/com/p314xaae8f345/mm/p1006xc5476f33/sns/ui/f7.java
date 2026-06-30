package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class f7 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d f249843d;

    public f7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d c17982x5116533d) {
        this.f249843d = c17982x5116533d;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e4
    public void v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTextureUpdate", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$7");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d c17982x5116533d = this.f249843d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVideoView", "%d on texture update.", java.lang.Integer.valueOf(c17982x5116533d.hashCode()));
        try {
            c17982x5116533d.o(true, 1.0f);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflineVideoView", "texture view update. error " + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTextureUpdate", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$7");
    }
}
