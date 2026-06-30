package com.tencent.mm.plugin.facedetect;

/* loaded from: classes5.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f99943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f99945f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f99946g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.j f99947h;

    public i(com.tencent.mm.plugin.facedetect.j jVar, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String[] strArr3) {
        this.f99947h = jVar;
        this.f99943d = strArr;
        this.f99944e = str;
        this.f99945f = strArr2;
        this.f99946g = strArr3;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mm.plugin.facedetect.j jVar;
        java.lang.String[] strArr = this.f99943d;
        int length = strArr.length;
        int i17 = 0;
        while (true) {
            str = this.f99944e;
            jVar = this.f99947h;
            if (i17 >= length) {
                break;
            }
            java.lang.String str2 = strArr[i17];
            com.tencent.mm.plugin.facedetect.j.b(jVar, str + str2, "face_detect/" + ("detector/" + str2));
            i17++;
        }
        for (java.lang.String str3 : this.f99945f) {
            com.tencent.mm.plugin.facedetect.j.b(jVar, str + str3, "face_detect/" + ("ufa/" + str3));
        }
        for (java.lang.String str4 : this.f99946g) {
            com.tencent.mm.plugin.facedetect.j.b(jVar, str + str4, "face_detect/" + ("poseest/" + str4));
        }
        java.lang.String g17 = com.tencent.mm.plugin.facedetect.model.s0.g();
        java.lang.String concat = com.tencent.mm.plugin.facedetect.model.s0.h().concat("/ufat.bin");
        boolean b17 = o35.a.b(g17);
        boolean b18 = o35.a.b(concat);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskInitFace", "detectmodel: %s, exist: %b, alignModel: %s, exist: %b", g17, java.lang.Boolean.valueOf(b17), concat, java.lang.Boolean.valueOf(b18));
        if (b17) {
            jVar.d(g17, "face_detect/ufdmtcc.bin");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskInitFace", "copy detect model file");
            com.tencent.mm.plugin.facedetect.j.c(com.tencent.mm.sdk.platformtools.x2.f193071a, "face_detect/ufdmtcc.bin", g17);
        }
        if (b18) {
            jVar.d(concat, "face_detect/ufat.bin");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskInitFace", "copy alignment model file");
            com.tencent.mm.plugin.facedetect.j.c(com.tencent.mm.sdk.platformtools.x2.f193071a, "face_detect/ufat.bin", concat);
        }
    }
}
