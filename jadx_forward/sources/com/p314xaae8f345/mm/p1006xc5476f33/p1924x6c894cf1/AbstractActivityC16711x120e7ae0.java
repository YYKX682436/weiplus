package com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0005*\u00020\u0004J\u001e\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ$\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\fJ\u001e\u0010\u000f\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ$\u0010\u000f\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "Lcom/tencent/mm/ui/vas/VASActivity;", "Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "getUICScope", "Lj75/a;", "State", "Lj75/f;", "getStateCenter", "Lj75/c;", "processor", "Ljz5/f0;", "process", "Lkotlin/Function1;", "Le75/a;", "observer", "observe", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity */
/* loaded from: classes10.dex */
public abstract class AbstractActivityC16711x120e7ae0 extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {
    /* renamed from: getStateCenter */
    public final <State extends j75.a> j75.f m67437x4bd5310() {
        for (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 : mo80395x5316d740()) {
            if (abstractC22275x3ce1d8c9 instanceof wm3.n) {
                j75.f fVar = ((wm3.n) abstractC22275x3ce1d8c9).f528815d;
                if (fVar instanceof j75.f) {
                    return fVar;
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: getUICScope */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a m67438x827fa4bb() {
        return ((um3.b) pf5.z.f435481a.a(this).a(um3.b.class)).O6();
    }

    /* renamed from: observe */
    public final <State extends j75.a> void m67439x9d92d11c(e75.a observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        j75.f m67437x4bd5310 = m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            m67437x4bd5310.m3(this, observer);
        }
    }

    /* renamed from: process */
    public final <State extends j75.a> void m67441xed8d1e6f(j75.c processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        j75.f m67437x4bd5310 = m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            m67437x4bd5310.x(this, processor);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(um3.b.class);
        set.add(xn5.h1.class);
        set.add(wa5.j.class);
    }

    /* renamed from: observe */
    public final <State extends j75.a> void m67440x9d92d11c(yz5.l observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        j75.f m67437x4bd5310 = m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            m67437x4bd5310.L2(this, observer);
        }
    }

    /* renamed from: process */
    public final <State extends j75.a> void m67442xed8d1e6f(yz5.l processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        j75.f m67437x4bd5310 = m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            m67437x4bd5310.z3(this, processor);
        }
    }
}
