package au3;

/* loaded from: classes10.dex */
public final class q implements com.tencent.mm.plugin.mmsight.segment.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.h f14136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView f14137e;

    public q(com.tencent.mm.plugin.mmsight.segment.h hVar, com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView editVideoSeekBarView) {
        this.f14136d = hVar;
        this.f14137e = editVideoSeekBarView;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void d(boolean z17, float f17, float f18) {
        this.f14136d.d(z17, f17, f18);
        int i17 = com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView.f155731m;
        this.f14137e.c(f17, f18);
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void j(boolean z17, float f17, float f18) {
        this.f14136d.j(z17, f17, f18);
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void p(boolean z17, float f17, float f18) {
        this.f14136d.p(z17, f17, f18);
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void u(float f17, float f18) {
        this.f14136d.u(f17, f18);
    }
}
