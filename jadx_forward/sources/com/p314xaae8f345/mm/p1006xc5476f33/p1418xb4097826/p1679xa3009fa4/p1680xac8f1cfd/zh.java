package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class zh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai f218217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai aiVar) {
        super(1);
        this.f218217d = aiVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        gx2.q it = (gx2.q) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai aiVar = this.f218217d;
        java.util.Iterator it6 = aiVar.f215312f.iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it6.next()).b();
        }
        aiVar.f215312f.clear();
        gx2.q qVar = aiVar.f215310d;
        if (qVar != null) {
            android.view.ViewParent parent = qVar.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(qVar);
            }
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = aiVar.f215311e;
        if (componentCallbacksC1101xa17d4670 != null) {
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = aiVar.m158354x19263085().mo7595x9cdc264().m7630xb2c12e75();
            m7630xb2c12e75.j(componentCallbacksC1101xa17d4670);
            m7630xb2c12e75.f();
        }
        aiVar.f215310d = null;
        aiVar.f215311e = null;
        return jz5.f0.f384359a;
    }
}
