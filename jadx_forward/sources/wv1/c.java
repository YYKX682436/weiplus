package wv1;

/* loaded from: classes12.dex */
public class c extends wv1.a {

    /* renamed from: f, reason: collision with root package name */
    public final long f531469f;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.w wVar, long j17) {
        super(wVar);
        this.f531469f = j17;
    }

    @Override // wv1.a
    public long g() {
        return this.f531469f;
    }

    @Override // wv1.a
    public int h() {
        return 0;
    }

    @Override // wv1.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(wv1.l lVar, int i17, wv1.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.w wVar = this.f531462a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.a aVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.a) wVar;
        if (i17 != aVar2.mo1894x7e414b06() - 1) {
            long g17 = aVar2.x(i17 + 1).g();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = xv1.d.f538924a;
            long a17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(g17));
            long j17 = this.f531469f;
            if (a17 == com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(j17))) {
                lVar.f531488e.setVisibility(0);
                lVar.f531488e.setText(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().d(new java.util.Date(j17), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                boolean o17 = wVar.o();
                android.widget.ProgressBar progressBar = lVar.f531489f;
                if (o17) {
                    progressBar.setVisibility(0);
                    return;
                } else {
                    progressBar.setVisibility(8);
                    return;
                }
            }
        }
        lVar.f531488e.setVisibility(8);
    }
}
