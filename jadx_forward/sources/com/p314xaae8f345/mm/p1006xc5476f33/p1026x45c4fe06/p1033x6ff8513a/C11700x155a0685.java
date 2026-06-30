package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.FileStructStat */
/* loaded from: classes7.dex */
public class C11700x155a0685 {

    /* renamed from: st_atime */
    public long f33486x4a239f50;

    /* renamed from: st_ctime */
    public long f33487x4a3fce52;

    /* renamed from: st_mode */
    public int f33488x8eccb8c1;

    /* renamed from: st_mtime */
    public long f33489x4accb95c;

    /* renamed from: st_size */
    public long f33490x8ecf5f1f;

    /* renamed from: fillAnother */
    public void m49607x15990000(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11700x155a0685 c11700x155a0685) {
        if (c11700x155a0685 == null) {
            return;
        }
        c11700x155a0685.f33488x8eccb8c1 = this.f33488x8eccb8c1;
        c11700x155a0685.f33490x8ecf5f1f = this.f33490x8ecf5f1f;
        c11700x155a0685.f33486x4a239f50 = this.f33486x4a239f50;
        c11700x155a0685.f33489x4accb95c = this.f33489x4accb95c;
        c11700x155a0685.f33487x4a3fce52 = this.f33487x4a3fce52;
    }

    /* renamed from: isDirectory */
    public boolean m49608xcdd6063() {
        return (this.f33488x8eccb8c1 & 16384) == 16384;
    }

    /* renamed from: isSymLink */
    public boolean m49609x757c6ed7() {
        return (this.f33488x8eccb8c1 & 61440) == 40960;
    }

    /* renamed from: makeItIsDir */
    public void m49610xc97826ca() {
        this.f33488x8eccb8c1 |= 16384;
    }
}
