package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class r90 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f217314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f217315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 f217316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f217317g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r90(java.lang.Class cls, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34, boolean z17) {
        super(1);
        this.f217314d = cls;
        this.f217315e = context;
        this.f217316f = c15482x9b531b34;
        this.f217317g = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        cw2.da it = (cw2.da) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (this.f217314d.isAssignableFrom(it.getClass()) && it.getR() == this.f217315e.hashCode()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34 = this.f217316f;
            c15482x9b531b34.getClass();
            if (!cq.k.f302754n.a() || c15482x9b531b34.W6(it) == this.f217317g) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
