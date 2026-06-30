package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes11.dex */
public class j1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18743x7cb33d67 f256553d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18743x7cb33d67 activityC18743x7cb33d67) {
        this.f256553d = activityC18743x7cb33d67;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18743x7cb33d67 activityC18743x7cb33d67 = this.f256553d;
        java.util.Iterator it = ((java.util.ArrayList) activityC18743x7cb33d67.f256440m).iterator();
        while (it.hasNext()) {
            ((java.util.ArrayList) activityC18743x7cb33d67.f256438h).remove((java.lang.String) it.next());
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = activityC18743x7cb33d67.f256434d;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.S(activityC18743x7cb33d67.f256438h);
            activityC18743x7cb33d67.f256434d.s();
        }
        ((java.util.ArrayList) activityC18743x7cb33d67.f256440m).clear();
        activityC18743x7cb33d67.X6();
        activityC18743x7cb33d67.Y6();
    }
}
