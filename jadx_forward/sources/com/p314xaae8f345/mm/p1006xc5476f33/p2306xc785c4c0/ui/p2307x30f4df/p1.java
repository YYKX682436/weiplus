package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes10.dex */
public class p1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18743x7cb33d67 f256601d;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18743x7cb33d67 activityC18743x7cb33d67) {
        this.f256601d = activityC18743x7cb33d67;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        java.util.Iterator it = ((java.util.HashSet) this.f256601d.f256446s).iterator();
        while (it.hasNext()) {
            gm0.j1.n().f354821b.d((sm4.i) it.next());
        }
    }
}
