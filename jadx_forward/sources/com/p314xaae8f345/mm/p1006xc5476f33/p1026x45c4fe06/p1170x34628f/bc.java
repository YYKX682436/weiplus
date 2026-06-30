package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class bc implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public int f167973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.cc f167974e;

    public bc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.cc ccVar) {
        this.f167974e = ccVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.cc ccVar = this.f167974e;
        if (ccVar.f168032a == null) {
            ccVar.a();
            return;
        }
        int i17 = this.f167973d + 1;
        this.f167973d = i17;
        if (i17 == 2) {
            ccVar.a();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ac) ccVar.f168032a).run();
        }
    }
}
