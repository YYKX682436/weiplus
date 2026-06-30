package mx2;

/* loaded from: classes2.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15402xc40c224a f414057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15402xc40c224a c15402xc40c224a) {
        super(0);
        this.f414057d = c15402xc40c224a;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView m62728x4eb0f6e5;
        java.lang.String f213863e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15402xc40c224a c15402xc40c224a = this.f414057d;
        cw2.da videoView = c15402xc40c224a.getVideoView();
        if (!((videoView != null ? videoView.m122867x742757a8() : 0.0f) == 0.0f)) {
            cw2.da videoView2 = c15402xc40c224a.getVideoView();
            if (videoView2 != null) {
                videoView2.m122872x52b5721c(0.0f);
            }
            m62728x4eb0f6e5 = c15402xc40c224a.m62728x4eb0f6e5();
            m62728x4eb0f6e5.setVisibility(0);
            f213863e = c15402xc40c224a.getF213863e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f213863e, "[showThumb]");
        }
        return jz5.f0.f384359a;
    }
}
