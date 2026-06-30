package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class a0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f164633a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f164634b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f164635c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f164636d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f164637e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f164638f;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject) {
        this.f164633a = jSONObject.optString("videoPath");
        java.lang.String optString = jSONObject.optString("videoThumbPath");
        this.f164634b = jSONObject.optString("videoMD5");
        this.f164635c = jSONObject.optString("videoButtonText");
        this.f164636d = jSONObject.optString("playDesc");
        this.f164637e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.e(uVar.f164789b, this.f164633a, uVar.D);
        this.f164638f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.e(uVar.f164789b, optString, uVar.D);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f164637e) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f164638f) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f164634b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShareAppMessageBase", "hy: try share video but video path or video thumbpath or md5 is null nil");
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t("try share video but video path or video thumbpath is null nil");
        }
        uVar.I.put("is_video", java.lang.Boolean.TRUE);
        uVar.I.put("footer_icon", uVar.f164790c.f387376f);
        uVar.I.put("footer_text", uVar.f164790c.f387374d);
        uVar.I.put("video_path", this.f164637e);
        uVar.I.put("video_thumb_path", this.f164638f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713 c12236xd46e1713, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        c12236xd46e1713.B = 4;
        c12236xd46e1713.U = true;
        c12236xd46e1713.f164605p1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.b(this.f164637e);
        c12236xd46e1713.f164618y1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.b(this.f164638f);
        c12236xd46e1713.f164615x1 = this.f164634b;
        c12236xd46e1713.f164620z1 = this.f164635c;
        c12236xd46e1713.A1 = this.f164636d;
        c12236xd46e1713.f164607r = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.b(this.f164638f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public boolean e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar) {
        java.lang.String str = uVar.C;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (!str.startsWith("delayLoadFile://")) {
            java.lang.String str2 = this.f164637e;
            if (str2 == null) {
                str2 = "";
            }
            if (!str2.startsWith("delayLoadFile://")) {
                java.lang.String str3 = this.f164638f;
                if (!(str3 != null ? str3 : "").startsWith("delayLoadFile://")) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m51277x9616526c() {
        return "ShareTypeVideo{videoPath='" + this.f164633a + "', videoMD5='" + this.f164634b + "', videoButtonText='" + this.f164635c + "', videoPlayDesc='" + this.f164636d + "', videoPathInFileSystem='" + this.f164637e + "', videoThumbPathInFileSystem='" + this.f164638f + "'}";
    }
}
