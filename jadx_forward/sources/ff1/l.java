package ff1;

/* loaded from: classes15.dex */
public class l implements ye1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 f343154a;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47) {
        this.f343154a = abstractC12277x3bbbdb47;
    }

    @Override // ye1.m
    public void a(ye1.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = this.f343154a;
        ye1.e eVar2 = abstractC12277x3bbbdb47.f165192g;
        if (eVar != eVar2 && eVar != null) {
            abstractC12277x3bbbdb47.g("another player callback, release now.[%s, %s]", eVar, eVar2);
            new ff1.g(abstractC12277x3bbbdb47, eVar).start();
            return;
        }
        abstractC12277x3bbbdb47.f165193h = true;
        abstractC12277x3bbbdb47.f165194i = eVar != null ? eVar.mo1855x8d5c7601() : 0;
        abstractC12277x3bbbdb47.f165195m = eVar != null ? eVar.mo1854x463504c() : 0;
        abstractC12277x3bbbdb47.e("on prepared. size [%d, %d] mStartWhenPrepared %b ", java.lang.Integer.valueOf(abstractC12277x3bbbdb47.f165194i), java.lang.Integer.valueOf(abstractC12277x3bbbdb47.f165195m), java.lang.Boolean.valueOf(abstractC12277x3bbbdb47.f165196n));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) abstractC12277x3bbbdb47.getLayoutParams();
        layoutParams.addRule(13);
        abstractC12277x3bbbdb47.setLayoutParams(layoutParams);
        if (abstractC12277x3bbbdb47.f165194i == 0 || abstractC12277x3bbbdb47.f165195m == 0) {
            if (abstractC12277x3bbbdb47.f165196n) {
                abstractC12277x3bbbdb47.f165192g.mo1865x68ac462();
                abstractC12277x3bbbdb47.f165196n = false;
                abstractC12277x3bbbdb47.f165192g.b(abstractC12277x3bbbdb47.f165205w);
            }
        } else if (abstractC12277x3bbbdb47.f165196n) {
            abstractC12277x3bbbdb47.f165192g.mo1865x68ac462();
            abstractC12277x3bbbdb47.f165192g.b(abstractC12277x3bbbdb47.f165205w);
            abstractC12277x3bbbdb47.f165196n = false;
        }
        ff1.z zVar = abstractC12277x3bbbdb47.f165197o;
        if (zVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e) zVar;
            abstractC12278xb84f839e.k("MicroMsg.Video.AbstractVideoView", "onPrepared startWhenPrepared[%b] seekTimeWhenPrepared[%d] isPrepared[%b]", java.lang.Boolean.valueOf(abstractC12278xb84f839e.f165222t), java.lang.Integer.valueOf(abstractC12278xb84f839e.f165223u), java.lang.Boolean.valueOf(abstractC12278xb84f839e.f165225w));
            abstractC12278xb84f839e.f165225w = true;
            ff1.e0 e0Var = abstractC12278xb84f839e.f165217o;
            if (e0Var != null) {
                e0Var.mo51460xfae314df(abstractC12278xb84f839e);
            }
            abstractC12278xb84f839e.m51471xa7077af8(abstractC12278xb84f839e.mo51380x6d590e18());
            if (!abstractC12278xb84f839e.f165222t) {
                int i17 = abstractC12278xb84f839e.f165223u;
                if (i17 >= 0) {
                    abstractC12278xb84f839e.a(i17, false);
                }
            } else if (abstractC12278xb84f839e.f165223u <= -1) {
                if (abstractC12278xb84f839e.mo51384x348b34()) {
                    abstractC12278xb84f839e.f165228z.c(1000L, 1000L);
                }
            } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12279x72b371cf) abstractC12278xb84f839e).j()) {
                abstractC12278xb84f839e.mo51384x348b34();
            } else {
                abstractC12278xb84f839e.a(abstractC12278xb84f839e.f165223u, abstractC12278xb84f839e.f165222t);
            }
            abstractC12278xb84f839e.f165223u = -1;
            abstractC12278xb84f839e.f165222t = true;
            oe1.h1 h1Var = abstractC12278xb84f839e.f165219q;
            if (h1Var != null) {
                h1Var.o(abstractC12278xb84f839e.m51468x23a7af9b(), abstractC12278xb84f839e.m51467x75e04be9());
            }
            if (abstractC12278xb84f839e.f165224v > 0) {
                java.util.Objects.toString(abstractC12278xb84f839e.f165226x);
                abstractC12278xb84f839e.A.c(5000L, 5000L);
            }
        }
    }
}
