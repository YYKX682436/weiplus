package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class e7 {

    /* renamed from: a, reason: collision with root package name */
    public final r32.d f99447a;

    /* renamed from: b, reason: collision with root package name */
    public final int f99448b;

    /* renamed from: c, reason: collision with root package name */
    public int f99449c;

    public e7(int i17, int i18, java.lang.String str, java.lang.String str2, r32.d dVar, com.tencent.mm.plugin.exdevice.ui.c7 c7Var) {
        this.f99448b = i17;
        this.f99449c = i18;
        if (i17 != 0) {
            if (dVar != null) {
                this.f99447a = dVar;
                return;
            }
            r32.d dVar2 = new r32.d();
            dVar2.field_username = str2;
            dVar2.field_appusername = str;
            dVar2.field_ranknum = 0;
            dVar2.field_selfLikeState = 0;
            dVar2.field_rankID = "";
            dVar2.field_likecount = 0;
            dVar2.field_score = 0;
            this.f99447a = dVar2;
        }
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = "{ view type: " + this.f99448b + " display flag: " + this.f99449c;
        r32.d dVar = this.f99447a;
        if (dVar != null) {
            str = str2 + dVar.toString();
        } else {
            str = str2 + " mExdeviceRankInfo is null";
        }
        return str + "}";
    }
}
