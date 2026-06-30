package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes9.dex */
public final class w2 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f186366d = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f186367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f186368f;

    public w2(final so2.o0 o0Var, final java.util.ArrayList arrayList, final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25) {
        this.f186368f = c22849x81a93d25;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f186367e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6183xe4077fbb>(a0Var) { // from class: com.tencent.mm.plugin.finder.convert.FinderEmojiSingleSummaryConvert$onBindViewHolder$2$eventListener$1
            {
                this.f39173x3fe91575 = -664387125;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6183xe4077fbb c6183xe4077fbb) {
                java.lang.Object obj;
                am.nz nzVar;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6183xe4077fbb event = c6183xe4077fbb;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.util.Iterator it = so2.o0.this.f492049d.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    obj = null;
                    nzVar = event.f136441g;
                    if (!hasNext) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    java.lang.String str = ((r45.ri0) next).f466419d;
                    nzVar.getClass();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, null)) {
                        obj = next;
                        break;
                    }
                }
                if (obj == null) {
                    return false;
                }
                nzVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderEmojiSingleSummaryConvert", "UgcEmojiChangedEvent: null");
                p3325xe03a0797.p3326xc267989b.l.d(this.f186366d, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.v2(event, arrayList, so2.o0.this, c22849x81a93d25, null), 3, null);
                return false;
            }
        };
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        this.f186367e.mo48813x58998cd();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3325xe03a0797.p3326xc267989b.z0.e(this.f186366d, null, 1, null);
        this.f186367e.mo48814x2efc64();
        this.f186368f.removeOnAttachStateChangeListener(this);
    }
}
