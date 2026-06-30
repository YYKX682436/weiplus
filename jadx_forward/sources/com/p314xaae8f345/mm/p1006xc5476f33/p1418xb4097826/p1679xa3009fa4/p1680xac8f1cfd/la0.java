package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class la0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f216566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f216567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 f216568f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la0(android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34) {
        super(1);
        this.f216566d = context;
        this.f216567e = f0Var;
        this.f216568f = c15482x9b531b34;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        cw2.da it = (cw2.da) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.getI() == this.f216566d.hashCode()) {
            z17 = true;
            this.f216567e.f391649d++;
            it.d();
            it.b();
            this.f216568f.e7(it.mo56698x4ee17f0a());
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
