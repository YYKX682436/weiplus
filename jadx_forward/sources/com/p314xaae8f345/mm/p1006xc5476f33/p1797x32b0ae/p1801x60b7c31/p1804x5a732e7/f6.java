package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class f6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.g6 f225111b;

    public f6(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.g6 g6Var, java.lang.String str) {
        this.f225111b = g6Var;
        this.f225110a = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n6
    public void a(java.lang.String videoPath) {
        boolean isEmpty = android.text.TextUtils.isEmpty(videoPath);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.g6 g6Var = this.f225111b;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "handleLivePhoto fail, video path invalid");
            g6Var.f225120a.f225135n.f224976f.a("saveToPhotosAlbum:fail_live_video_invalid");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h6 h6Var = g6Var.f225120a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6 o6Var = h6Var.f225135n;
        org.json.JSONObject jSONObject = h6Var.f225134m;
        o6Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m6 m6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m6(o6Var, jSONObject);
        java.lang.String coverPath = this.f225110a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverPath, "coverPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppLivePhotoBridge", "makeLivePhoto coverPath=%s, videoPath=%s", coverPath, videoPath);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d8.a()) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null))), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c8(m6Var, videoPath, coverPath, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppLivePhotoBridge", "makeLivePhoto fail, device not support");
            m6Var.a(false, null, -2001, "device not support live photo");
        }
    }
}
