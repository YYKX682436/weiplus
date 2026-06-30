package rp1;

/* loaded from: classes14.dex */
public class r1 implements mp1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 f480053a;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700) {
        this.f480053a = c12931xa4a39700;
    }

    @Override // mp1.e
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700.I;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f480053a.f175119q).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d) ((mp1.f) it.next())).a(c12886x91aa2b6d);
        }
    }

    @Override // mp1.e
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700.b(this.f480053a, c12886x91aa2b6d, i17);
    }
}
