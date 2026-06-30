package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class u90 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f217648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f217649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f217650f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(java.lang.Class cls, java.lang.Class cls2, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        super(1);
        this.f217648d = cls;
        this.f217649e = cls2;
        this.f217650f = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Class cls;
        mk4.b m61394x356ded51;
        cw2.da it = (cw2.da) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Class cls2 = this.f217648d;
        if ((cls2 == null || cls2.isAssignableFrom(it.getClass())) && (cls = this.f217649e) != null) {
            java.lang.Class<?> cls3 = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = it instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) it : null;
            if (c15188xd8bd4bd != null && (m61394x356ded51 = c15188xd8bd4bd.m61394x356ded51()) != null) {
                cls3 = m61394x356ded51.getClass();
            }
            if (cls.isAssignableFrom(cls3)) {
                this.f217650f.f391649d++;
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
