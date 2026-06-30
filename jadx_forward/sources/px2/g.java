package px2;

/* loaded from: classes2.dex */
public final class g implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f440415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 f440416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd f440417f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f440418g;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 c15179x385a9ce5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f440415d = c15188xd8bd4bd;
        this.f440416e = c15179x385a9ce5;
        this.f440417f = abstractGestureDetectorOnGestureListenerC15410x706991fd;
        this.f440418g = c15196x85976f5f;
    }

    @Override // m34.e
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f440415d;
        int mo56686xe906e26b = c15188xd8bd4bd.mo56686xe906e26b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 c15179x385a9ce5 = this.f440416e;
        cw2.e4 e4Var = c15179x385a9ce5.playStatusListener;
        if (e4Var != null) {
            e4Var.a(i17);
        }
        c15188xd8bd4bd.mo56716x4121a19(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd = this.f440417f;
        cw2.ca fullSeekBar = abstractGestureDetectorOnGestureListenerC15410x706991fd.getFullSeekBar();
        if (fullSeekBar != null) {
            fullSeekBar.t("HorizontalSeek");
        }
        c15188xd8bd4bd.r(i17, true, 3);
        c15188xd8bd4bd.mo58789x348b34();
        abstractGestureDetectorOnGestureListenerC15410x706991fd.p(true, 1);
        yz5.a onSeekEnd = c15179x385a9ce5.getOnSeekEnd();
        if (onSeekEnd != null) {
            onSeekEnd.mo152xb9724478();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f440418g;
        cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
        if (playInfo != null) {
            if (!playInfo.f305284g) {
                playInfo = null;
            }
            cw2.h8 h8Var = playInfo;
            if (h8Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd2 = this.f440417f;
                ec2.g m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = h8Var.f305278a;
                if (m61491xe16f3d0b != null) {
                    long m59124x87980ca = c14989xf862ae88.m59124x87980ca();
                    java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
                    mn2.g4 g4Var = h8Var.f305280c;
                    ((ec2.h) m61491xe16f3d0b).d(m59124x87980ca, dupFlag, g4Var.f411535e, mo56686xe906e26b, i17, g4Var);
                }
                c15196x85976f5f.R(c14989xf862ae88.m59124x87980ca(), c15188xd8bd4bd.mo56696x9040359a(), mo56686xe906e26b, i17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd.e(abstractGestureDetectorOnGestureListenerC15410x706991fd2, h8Var, mo56686xe906e26b, i17, c15188xd8bd4bd.mo56695x7723e6ff(), false);
            }
        }
    }

    @Override // m34.e
    public void b() {
        cw2.h8 playInfo = this.f440418g.getPlayInfo();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f440415d;
        if (playInfo != null) {
            playInfo.f305288k = !c15188xd8bd4bd.mo58787xc00617a4();
        }
        c15188xd8bd4bd.mo58788x65825f6();
        this.f440417f.p(false, 2);
        yz5.a onSeekStart = this.f440416e.getOnSeekStart();
        if (onSeekStart != null) {
            onSeekStart.mo152xb9724478();
        }
    }

    @Override // m34.e
    public void d(int i17) {
        this.f440417f.o(this.f440415d, i17, false);
    }
}
