package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class e80 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 f215749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f215750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f215751f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 abstractC15479x2de36860, int i17, boolean z17) {
        super(0);
        this.f215749d = abstractC15479x2de36860;
        this.f215750e = i17;
        this.f215751f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 abstractC15479x2de36860 = this.f215749d;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = abstractC15479x2de36860.f215192h;
        int i17 = this.f215750e;
        if (!(c1190x18d3c3fe != null && c1190x18d3c3fe.m8300xfda78ef6() == i17) && abstractC15479x2de36860.f7().size() > i17) {
            abstractC15479x2de36860.f215189e = this.f215751f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15290x1a2d74fc abstractC15290x1a2d74fc = abstractC15479x2de36860.f215201t;
            if (abstractC15290x1a2d74fc == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fragmentChangeObserver");
                throw null;
            }
            abstractC15290x1a2d74fc.mo8333x510f45c9(i17);
            abstractC15479x2de36860.f215189e = true;
        }
        return jz5.f0.f384359a;
    }
}
