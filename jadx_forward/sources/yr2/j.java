package yr2;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr2.k f546215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yr2.k kVar) {
        super(0);
        this.f546215d = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yr2.g gVar = yr2.k.X;
        ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
        yr2.k.Y = d11.s.Di(4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updatePreloadInfo]\nisSupportH265=");
        sb6.append(yr2.k.Y);
        sb6.append("\nisSupportH266=");
        yr2.k kVar = this.f546215d;
        sb6.append(kVar.f546236t);
        sb6.append("\n[prev:next]Count=");
        sb6.append(kVar.f546218b);
        sb6.append(':');
        sb6.append(kVar.f546219c);
        sb6.append("\nmaxPreloadPercent=");
        sb6.append(kVar.f546220d);
        sb6.append("\nmaxPreloadBitRate=");
        sb6.append(kVar.f546227k);
        sb6.append(", maxPreloadBytes=");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(kVar.f546221e));
        sb6.append("\nmaxPreloadTaskCount=");
        sb6.append(kVar.f546222f);
        sb6.append("\n[preload:play]ConcurrentCount=");
        sb6.append(kVar.f546223g);
        sb6.append(':');
        sb6.append(kVar.f546224h);
        sb6.append("\n[startPreloadSecs:startPreloadPercent]=");
        sb6.append(kVar.f546226j);
        sb6.append(':');
        sb6.append(kVar.f546225i);
        sb6.append("\nisOpenMultiBitRateDownload=");
        sb6.append(kVar.f546235s);
        sb6.append("\nhotFeed=");
        sb6.append(kVar.f546232p.size());
        sb6.append("\nmegaVideo[prev:next]Count=");
        sb6.append(kVar.f546230n);
        sb6.append(':');
        sb6.append(kVar.f546231o);
        sb6.append("\nmegaVideoMaxBitrate=");
        sb6.append(kVar.f546229m);
        sb6.append("\nhotMegaVideoMediaSet=");
        sb6.append(kVar.f546233q.size());
        sb6.append("\nminBufferLength=");
        sb6.append(kVar.f546241y);
        sb6.append("\nmaxBufferLength=");
        sb6.append(kVar.f546242z);
        sb6.append("\nminCurrentFeedBufferLength=");
        sb6.append(kVar.A);
        sb6.append("\ncanPreCreatedPlayer=");
        sb6.append(kVar.B);
        sb6.append("\nlsBufferSize=");
        sb6.append(kVar.F);
        sb6.append("\nlsSendSocketBufferSize=");
        sb6.append(kVar.G);
        sb6.append("\ntcpRecvBufferSize=");
        sb6.append(kVar.H);
        sb6.append("\nlast_feed_info_count=");
        sb6.append(kVar.K);
        sb6.append("\nnext_feed_info_count=");
        sb6.append(kVar.L);
        sb6.append("\nflow_view_preload=");
        sb6.append(kVar.N);
        sb6.append('\n');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaPreloadModel", sb6.toString());
        return jz5.f0.f384359a;
    }
}
