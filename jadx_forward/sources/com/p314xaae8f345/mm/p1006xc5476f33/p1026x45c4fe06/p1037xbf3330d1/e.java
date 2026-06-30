package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd f158498d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd) {
        this.f158498d = c11734xf31693dd;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f158498d.f158450m = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd = this.f158498d;
        c11734xf31693dd.f158447g.cancel(c11734xf31693dd.b());
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd2 = this.f158498d;
            c11734xf31693dd2.f158446f.unregisterReceiver(c11734xf31693dd2.f158453p);
        } catch (java.lang.Exception unused) {
        }
        this.f158498d.f158451n = null;
        this.f158498d.f158452o = null;
    }
}
