package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340;

/* loaded from: classes5.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f181476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f181478f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f181479g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.j f181480h;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.j jVar, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String[] strArr3) {
        this.f181480h = jVar;
        this.f181476d = strArr;
        this.f181477e = str;
        this.f181478f = strArr2;
        this.f181479g = strArr3;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.j jVar;
        java.lang.String[] strArr = this.f181476d;
        int length = strArr.length;
        int i17 = 0;
        while (true) {
            str = this.f181477e;
            jVar = this.f181480h;
            if (i17 >= length) {
                break;
            }
            java.lang.String str2 = strArr[i17];
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.j.b(jVar, str + str2, "face_detect/" + ("detector/" + str2));
            i17++;
        }
        for (java.lang.String str3 : this.f181478f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.j.b(jVar, str + str3, "face_detect/" + ("ufa/" + str3));
        }
        for (java.lang.String str4 : this.f181479g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.j.b(jVar, str + str4, "face_detect/" + ("poseest/" + str4));
        }
        java.lang.String g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.g();
        java.lang.String concat = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.h().concat("/ufat.bin");
        boolean b17 = o35.a.b(g17);
        boolean b18 = o35.a.b(concat);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskInitFace", "detectmodel: %s, exist: %b, alignModel: %s, exist: %b", g17, java.lang.Boolean.valueOf(b17), concat, java.lang.Boolean.valueOf(b18));
        if (b17) {
            jVar.d(g17, "face_detect/ufdmtcc.bin");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskInitFace", "copy detect model file");
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.j.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "face_detect/ufdmtcc.bin", g17);
        }
        if (b18) {
            jVar.d(concat, "face_detect/ufat.bin");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskInitFace", "copy alignment model file");
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.j.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "face_detect/ufat.bin", concat);
        }
    }
}
