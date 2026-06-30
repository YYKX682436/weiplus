package gv3;

/* loaded from: classes5.dex */
public final class b extends cv3.h {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f357642p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, int i17) {
        super(context, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f357642p = "MicroMsg.Finder.MusicPickerDrawer";
    }

    @Override // cv3.c
    public vu3.c a() {
        return new vu3.b(this.f304102d, 0, 2, null);
    }

    @Override // cv3.c
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17066xb644f671 e17 = e();
        if (e17 != null) {
            e17.r();
        }
    }

    @Override // cv3.h
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 c() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17066xb644f671(this.f304102d, null);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17066xb644f671 e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 d17 = d();
        if (d17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17066xb644f671) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17066xb644f671) d17;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c
    /* renamed from: setLocalAudioList */
    public void mo68195x60eb836b(java.util.List audioList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioList, "audioList");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17066xb644f671 e17 = e();
        if (e17 != null) {
            e17.m68366x60eb836b(audioList);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c
    /* renamed from: setPlayMusicWhenSearchFinish */
    public void mo68200x8bd3c3e4(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17066xb644f671 e17 = e();
        if (e17 != null) {
            e17.mo68332xe66d9e81(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c
    /* renamed from: setup */
    public void mo68203x6843a7d(java.lang.String videoPath, java.util.ArrayList imageList, long j17, long j18, boolean z17, st3.k config, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageList, "imageList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f357642p, "setup: ");
        yu3.b bVar = new yu3.b(new yu3.a(config.f494084f.ordinal(), false, videoPath, imageList, j17, j18, config.f494079a, 0, null, null, ce1.i.f4370x366c91de, null), z17, config, z18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17066xb644f671 e17 = e();
        if (e17 != null) {
            e17.m68367x8a00181f(bVar);
        }
    }
}
