package ff1;

/* loaded from: classes15.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e f343164d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e) {
        this.f343164d = abstractC12278xb84f839e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/video/videoview/AbstractVideoView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e = this.f343164d;
        abstractC12278xb84f839e.k("MicroMsg.Video.AbstractVideoView", "seek bar play button on click ", new java.lang.Object[0]);
        if (abstractC12278xb84f839e.f165217o != null) {
            if (abstractC12278xb84f839e.mo51382xc00617a4()) {
                abstractC12278xb84f839e.mo51383x65825f6();
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractC12278xb84f839e.f165217o.mo51452x4edea88a())) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12279x72b371cf) abstractC12278xb84f839e).mo51399x68ac462();
            } else {
                abstractC12278xb84f839e.mo51384x348b34();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/video/videoview/AbstractVideoView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
