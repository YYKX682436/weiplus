package ir2;

/* loaded from: classes2.dex */
public final class f implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 f375665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f375666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ir2.o f375667c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f375668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f375669e;

    public f(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3, so2.h1 h1Var, ir2.o oVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f375665a = c5445x963cab3;
        this.f375666b = h1Var;
        this.f375667c = oVar;
        this.f375668d = i17;
        this.f375669e = c0Var;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        r45.o52 o52Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = this.f375665a;
        if (j17 == c5445x963cab3.f135785g.f88451a && (obj instanceof r45.l71)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TYPE_LIVE_REFRESH id:");
            sb6.append(c5445x963cab3.f135785g.f88451a);
            sb6.append(",username:");
            sb6.append(c5445x963cab3.f135785g.f88457g);
            sb6.append(",liveStaus:");
            sb6.append(c5445x963cab3.f135785g.f88458h);
            sb6.append(',');
            r45.l71 l71Var = (r45.l71) obj;
            r45.nw1 nw1Var = (r45.nw1) l71Var.m75936x14adae67(1);
            sb6.append((nw1Var == null || (o52Var = (r45.o52) nw1Var.m75936x14adae67(28)) == null) ? null : cm2.a.f124861a.l(o52Var));
            sb6.append(", ori streamUrl:");
            so2.h1 h1Var = this.f375666b;
            r45.nw1 m59258xd0557130 = h1Var.getFeedObject().m59258xd0557130();
            sb6.append(m59258xd0557130 != null ? m59258xd0557130.m75945x2fec8307(3) : null);
            sb6.append(" ,new streamUrl:");
            r45.nw1 nw1Var2 = (r45.nw1) l71Var.m75936x14adae67(1);
            sb6.append(nw1Var2 != null ? nw1Var2.m75945x2fec8307(3) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultLoaderActions", sb6.toString());
            h1Var.getFeedObject().m59389xcb0dd23c((r45.nw1) l71Var.m75936x14adae67(1));
            r45.mb4 liveFinderMedia = h1Var.getFeedObject().getLiveFinderMedia();
            if (liveFinderMedia != null) {
                r45.nw1 m59258xd05571302 = h1Var.getFeedObject().m59258xd0557130();
                liveFinderMedia.set(0, m59258xd05571302 != null ? m59258xd05571302.m75945x2fec8307(3) : null);
            }
            ir2.o.g(this.f375667c, this.f375668d, 1, null, null, 12, null);
            ir2.o.c(this.f375667c, h1Var);
            this.f375669e.f391645d = true;
        }
    }
}
