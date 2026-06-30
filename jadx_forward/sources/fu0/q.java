package fu0;

/* loaded from: classes5.dex */
public final class q extends cu0.x {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f348343p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        super(c16993xacc19624, context, ignoreBackgroundTouchEvent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        this.f348343p = "MicroMsg.CreationComposingMusicPicker";
    }

    @Override // cu0.x
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        if (c16997xb0aa383a != null) {
            return c16997xb0aa383a.f237242J;
        }
        return false;
    }

    @Override // cu0.x
    public cu0.y d(yz5.l ignoreBackgroundTouchEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        return new fu0.u(this.f303884a, ignoreBackgroundTouchEvent);
    }

    @Override // cu0.x
    public java.lang.String j() {
        return this.f348343p;
    }

    @Override // cu0.x
    public void k() {
        if (l()) {
            return;
        }
        if (this.f303888e != null) {
            super.k();
        } else {
            this.f303886c.d();
        }
    }

    @Override // cu0.x
    public boolean l() {
        return ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p881x636ee25.C10925xc183e4a4) g().e()).r();
    }

    @Override // cu0.x
    public boolean m() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = this.f303888e;
        if (c16997xb0aa383a == null) {
            return false;
        }
        if (c16997xb0aa383a.f237249m) {
            java.lang.String str = c16997xb0aa383a.f237248i;
            if (!(str == null || str.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(c16997xb0aa383a.f237248i)) {
                return false;
            }
        }
        return super.m();
    }

    @Override // cu0.x
    public void n(boolean z17, java.util.List lyricsInfos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricsInfos, "lyricsInfos");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = this.f303888e;
        if (z17 && this.f303888e == null) {
            g().mo68204x3720c068(false);
        }
    }
}
