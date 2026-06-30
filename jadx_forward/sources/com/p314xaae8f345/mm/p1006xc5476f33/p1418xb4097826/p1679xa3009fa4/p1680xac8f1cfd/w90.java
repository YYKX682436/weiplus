package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class w90 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f217857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 f217858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f217859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f217860g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(java.lang.Class cls, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        super(1);
        this.f217857d = cls;
        this.f217858e = c15482x9b531b34;
        this.f217859f = z17;
        this.f217860g = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Class cls = this.f217857d;
        if ((cls == null || cls.isAssignableFrom(it.getClass())) && this.f217858e.W6(it) == this.f217859f) {
            this.f217860g.f391649d++;
        }
        return java.lang.Boolean.FALSE;
    }
}
