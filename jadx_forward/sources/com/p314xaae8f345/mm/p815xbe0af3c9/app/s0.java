package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes12.dex */
public class s0 extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850 f150055d;

    public s0(com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850 c10820x69adf850) {
        this.f150055d = c10820x69adf850;
    }

    @Override // hm0.t
    public void b() {
        boolean z17;
        android.app.Application application = this.f150055d.f150019a;
        java.lang.String str = com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150029a;
        java.lang.String a17 = bm5.f1.a();
        java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150034f).iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (((com.p314xaae8f345.mm.p815xbe0af3c9.app.f) it.next()).b()) {
                z17 = true;
                break;
            }
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AccidentallyQuitMonitor", "[!] Process [%s] is not targeted, skip rest logic.", a17);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMKV_AccidentiallyQuitMarks_");
        int indexOf = a17.indexOf(58);
        sb6.append(indexOf != -1 ? a17.substring(indexOf) : "");
        com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150029a = sb6.toString();
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p815xbe0af3c9.app.e(application));
    }
}
