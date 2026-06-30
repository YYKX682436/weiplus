package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bq.z1 f205079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 f205080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(bq.z1 z1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 o0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f205079d = z1Var;
        this.f205080e = o0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.b0(this.f205079d, this.f205080e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bq.z1 z1Var = this.f205079d;
        java.lang.String str = z1Var.f105075t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 o0Var = this.f205080e;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, o0Var.m58736x6c03c64c());
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (b17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username=");
            sb6.append(o0Var.m58736x6c03c64c());
            sb6.append(", scene username=");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa J2 = z1Var.J();
            sb6.append(J2 != null ? J2.m76197x6c03c64c() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SelfProfileActionBarUIC", sb6.toString());
            ya2.b2 b18 = ya2.h.f542017a.b(o0Var.m58736x6c03c64c());
            if (b18 == null) {
                return f0Var;
            }
            android.widget.TextView textView = (android.widget.TextView) ((jz5.n) o0Var.f205568w).mo141623x754a37bb();
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = o0Var.m158354x19263085();
            java.lang.String z07 = b18.z0();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m158354x19263085, z07));
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(b18.y0(), null, 2, null);
            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) o0Var.f205567v).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "access$getActionBarAvatarIv(...)");
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
        }
        return f0Var;
    }
}
