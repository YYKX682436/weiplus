package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class e6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l6 f187028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l6 l6Var) {
        super(0);
        this.f187028d = l6Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l6 l6Var = this.f187028d;
        return new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotFreqCtrlWindow$lifecycleObserver$2$1
            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public final void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
                java.lang.ref.WeakReference weakReference;
                p012xc85e97e9.p093xedfae76a.y yVar;
                p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                p012xc85e97e9.p093xedfae76a.m mVar = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l6 l6Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l6.this;
                if (event == mVar) {
                    l6Var2.d();
                } else {
                    if (event != p012xc85e97e9.p093xedfae76a.m.ON_DESTROY || (weakReference = l6Var2.f187219l) == null || (yVar = (p012xc85e97e9.p093xedfae76a.y) weakReference.get()) == null || (mo273xed6858b4 = yVar.mo273xed6858b4()) == null) {
                        return;
                    }
                    mo273xed6858b4.c((p012xc85e97e9.p093xedfae76a.v) ((jz5.n) l6Var2.f187220m).mo141623x754a37bb());
                }
            }
        };
    }
}
