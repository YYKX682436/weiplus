package pk2;

/* loaded from: classes3.dex */
public final class p8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f437701d;

    public p8(pk2.d9 d9Var) {
        this.f437701d = d9Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        kn0.g gVar;
        r45.ka4 ka4Var;
        g4Var.clear();
        pk2.d9 d9Var = this.f437701d;
        pk2.o9 o9Var = d9Var.f437213w;
        java.lang.String str = o9Var.f437605a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareAnchorZeroMenuItems: business(LiveCommonSlice::class.java).liveFinderObject.id:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
        java.lang.String str2 = null;
        sb6.append(c19792x256d2725 != null ? java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()) : null);
        sb6.append(" hlsUrl:");
        kn0.i iVar = ((mm2.e1) o9Var.c(mm2.e1.class)).f410523t;
        if (iVar != null && (gVar = iVar.f391091b) != null && (ka4Var = gVar.f391081o) != null) {
            str2 = ka4Var.f460092z;
        }
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        java.util.Iterator it = ((java.util.ArrayList) d9Var.f437203m).iterator();
        while (it.hasNext()) {
            ((qk2.h) it.next()).w(g4Var);
        }
    }
}
