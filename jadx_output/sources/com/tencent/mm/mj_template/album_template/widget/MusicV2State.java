package com.tencent.mm.mj_template.album_template.widget;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0003¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/mj_template/album_template/widget/MusicV2State;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "startObserve", "stopObserve", "Landroidx/lifecycle/y;", "owner", "Lkotlin/Function0;", "refreshMusicPickerListUI", "Landroidx/lifecycle/g0;", "", "Lcom/tencent/maas/model/MJMusicInfo;", "musicListLiveData", "<init>", "(Landroidx/lifecycle/y;Lyz5/a;Landroidx/lifecycle/g0;)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MusicV2State implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.y f69760d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f69761e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.g0 f69762f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f69763g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f69764h;

    public MusicV2State(androidx.lifecycle.y owner, yz5.a refreshMusicPickerListUI, androidx.lifecycle.g0 musicListLiveData) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(refreshMusicPickerListUI, "refreshMusicPickerListUI");
        kotlin.jvm.internal.o.g(musicListLiveData, "musicListLiveData");
        this.f69760d = owner;
        this.f69761e = refreshMusicPickerListUI;
        this.f69762f = musicListLiveData;
        owner.mo133getLifecycle().a(this);
        this.f69763g = ty0.c1.f422811d;
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_START)
    private final void startObserve() {
        this.f69762f.observe(this.f69760d, new ty0.d1(this));
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    private final void stopObserve() {
        androidx.lifecycle.g0 g0Var = this.f69762f;
        androidx.lifecycle.y yVar = this.f69760d;
        g0Var.removeObservers(yVar);
        yVar.mo133getLifecycle().c(this);
    }
}
