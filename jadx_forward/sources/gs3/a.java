package gs3;

/* loaded from: classes15.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.C16926xe775fb17 f356611a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.C16926xe775fb17 c16926xe775fb17) {
        this.f356611a = c16926xe775fb17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.C16926xe775fb17 c16926xe775fb17 = this.f356611a;
        int scrollY = c16926xe775fb17.getScrollY();
        if (scrollY == c16926xe775fb17.f236307d) {
            c16926xe775fb17.a(0);
            return;
        }
        c16926xe775fb17.f236307d = scrollY;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = c16926xe775fb17.f236310g;
        n3Var.mo50311x7ab51103(n3Var.mo50288x733c63a2(), 5L);
        c16926xe775fb17.a(1);
    }
}
