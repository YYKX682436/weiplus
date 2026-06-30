package nn0;

/* loaded from: classes10.dex */
public final class n extends nn0.i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, boolean z17, int i17) {
        super(context, z17, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // nn0.i
    public nn0.o a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return ((pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class))).wh() ? new nn0.s(context) : new nn0.h(context);
    }

    @Override // nn0.i, com.p314xaae8f345.p2926x359365.C25485x5a0a6891
    /* renamed from: startLivePlay */
    public int mo94535x5c1200c2(java.lang.String str, int i17) {
        nn0.o oVar;
        if (this.f420116a && (oVar = this.f420117b) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(oVar, "null cannot be cast to non-null type com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener");
            super.m94531x2fcefe03((com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXLivePlayVideoRenderListener) oVar, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(oVar, "null cannot be cast to non-null type com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener");
            super.m94518x7d94ff92((com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioRawDataListener) oVar);
            oVar.mo149801x8113c2b6();
        }
        return super.mo94535x5c1200c2(str, i17);
    }
}
