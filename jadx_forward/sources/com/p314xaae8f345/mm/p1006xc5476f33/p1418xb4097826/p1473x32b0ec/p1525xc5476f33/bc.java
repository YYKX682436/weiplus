package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class bc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f193535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gc f193536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f193537f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.i0 f193538g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gc gcVar, android.widget.TextView textView, cm2.i0 i0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f193536e = gcVar;
        this.f193537f = textView;
        this.f193538g = i0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bc bcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bc(this.f193536e, this.f193537f, this.f193538g, interfaceC29045xdcb5ca57);
        bcVar.f193535d = obj;
        return bcVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bc bcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bc) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        bcVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f193535d;
        st2.g3 g3Var = st2.g3.f493859a;
        java.lang.String valueOf = java.lang.String.valueOf(this.f193536e.f194213g);
        android.widget.TextView textView = this.f193537f;
        cm2.i0 i0Var = this.f193538g;
        java.util.LinkedList m75941xfb821914 = i0Var.f124887v.m75941xfb821914(2);
        java.lang.String m75945x2fec8307 = i0Var.f124887v.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        g3Var.t(valueOf, y0Var, textView, m75941xfb821914, m75945x2fec8307, true, false, true, (r30 & 256) != 0 ? true : true, (r30 & 512) != 0 ? i65.a.b(textView.getContext(), 16) : 0, (r30 & 1024) != 0 ? gm2.c1.f354853a.k() : 0, (r30 & 2048) != 0 ? java.lang.Float.valueOf(1.0f) : null, (r30 & 4096) != 0 ? null : null);
        return jz5.f0.f384359a;
    }
}
