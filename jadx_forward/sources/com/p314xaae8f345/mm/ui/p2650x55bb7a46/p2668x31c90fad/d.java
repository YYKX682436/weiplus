package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f283497d;

    public d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.e eVar, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        this.f283497d = componentCallbacksC1101xa17d4670;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f283497d;
        if (componentCallbacksC1101xa17d4670.mo273xed6858b4().b() == p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.e.f283498b.remove(componentCallbacksC1101xa17d4670);
        } else {
            componentCallbacksC1101xa17d4670.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.ui.chatting.manager.ChattingOnResultExecutor$1$1
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public void m79764xac79a11b() {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.e.f283498b.remove(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.d.this.f283497d);
                }
            });
        }
    }
}
