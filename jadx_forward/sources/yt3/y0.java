package yt3;

/* loaded from: classes10.dex */
public final class y0 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea f547255d;

    /* renamed from: e, reason: collision with root package name */
    public ct0.b f547256e;

    /* renamed from: f, reason: collision with root package name */
    public final yt3.x0 f547257f;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea videoPlayView, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPlayView, "videoPlayView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547255d = videoPlayView;
        this.f547257f = new yt3.x0(this, status);
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        this.f547255d.a();
        return false;
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoToVideoPlugin", "onPause");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea c17052x24b53ea = this.f547255d;
        c17052x24b53ea.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "pause");
        c17052x24b53ea.f237622f = wu3.z1.f531370f;
    }

    @Override // yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoToVideoPlugin", "onResume");
        ct0.b bVar = this.f547256e;
        boolean z17 = false;
        if (bVar != null && (arrayList = bVar.f303747k) != null && !arrayList.isEmpty()) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea c17052x24b53ea = this.f547255d;
            c17052x24b53ea.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "resume");
            c17052x24b53ea.f237622f = wu3.z1.f531369e;
        }
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoToVideoPlugin", "release");
        this.f547255d.a();
        this.f547256e = null;
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f547255d.a();
        this.f547256e = null;
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f547255d.setVisibility(i17);
    }
}
