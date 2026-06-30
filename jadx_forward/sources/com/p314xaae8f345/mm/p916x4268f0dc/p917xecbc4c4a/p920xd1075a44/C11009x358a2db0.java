package com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p920xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0003¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/mj_template/album_template/widget/MusicV2State;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "startObserve", "stopObserve", "Landroidx/lifecycle/y;", "owner", "Lkotlin/Function0;", "refreshMusicPickerListUI", "Landroidx/lifecycle/g0;", "", "Lcom/tencent/maas/model/MJMusicInfo;", "musicListLiveData", "<init>", "(Landroidx/lifecycle/y;Lyz5/a;Landroidx/lifecycle/g0;)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_template.album_template.widget.MusicV2State */
/* loaded from: classes5.dex */
public final class C11009x358a2db0 implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f151293d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f151294e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f151295f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f151296g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f151297h;

    public C11009x358a2db0(p012xc85e97e9.p093xedfae76a.y owner, yz5.a refreshMusicPickerListUI, p012xc85e97e9.p093xedfae76a.g0 musicListLiveData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshMusicPickerListUI, "refreshMusicPickerListUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicListLiveData, "musicListLiveData");
        this.f151293d = owner;
        this.f151294e = refreshMusicPickerListUI;
        this.f151295f = musicListLiveData;
        owner.mo273xed6858b4().a(this);
        this.f151296g = ty0.c1.f504344d;
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_START)
    /* renamed from: startObserve */
    private final void m47461x958f525a() {
        this.f151295f.mo7806x9d92d11c(this.f151293d, new ty0.d1(this));
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: stopObserve */
    private final void m47462x50febaba() {
        p012xc85e97e9.p093xedfae76a.g0 g0Var = this.f151295f;
        p012xc85e97e9.p093xedfae76a.y yVar = this.f151293d;
        g0Var.m7809x1ff8439(yVar);
        yVar.mo273xed6858b4().c(this);
    }
}
