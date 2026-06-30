package ff1;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e f343166d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e) {
        this.f343166d = abstractC12278xb84f839e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e = this.f343166d;
        if (abstractC12278xb84f839e.B) {
            abstractC12278xb84f839e.B = false;
            oe1.h1 h1Var = abstractC12278xb84f839e.f165219q;
            if (h1Var != null) {
                h1Var.k(abstractC12278xb84f839e.m51468x23a7af9b(), abstractC12278xb84f839e.m51467x75e04be9());
            }
            android.widget.ProgressBar progressBar = abstractC12278xb84f839e.f165213h;
            if (progressBar == null || progressBar.getVisibility() == 8) {
                return;
            }
            abstractC12278xb84f839e.k("MicroMsg.Video.AbstractVideoView", "hide loading", new java.lang.Object[0]);
            abstractC12278xb84f839e.f165213h.setVisibility(8);
        }
    }
}
