package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class zd implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.bd {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f171906d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f171907e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f171908f;

    public zd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 rt6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        this.f171906d = rt6;
        jz5.i iVar = jz5.i.f384364f;
        this.f171907e = jz5.h.a(iVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.xd(this));
        this.f171908f = jz5.h.a(iVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.yd(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.bd
    public int E6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 service) {
        xi1.f mo51615x8408480b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        xi1.g mo50261xee5260a9 = service.mo50261xee5260a9();
        if (mo50261xee5260a9 == null || (mo51615x8408480b = mo50261xee5260a9.mo51615x8408480b()) == null || 8 == mo51615x8408480b.f536236b) {
            return 0;
        }
        return mo51615x8408480b.f536235a;
    }

    public final int a(android.content.Context context, int i17) {
        if (context == null) {
            context = this.f171906d.f156328d;
        }
        return context.getResources().getDimensionPixelSize(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.bd
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ad a7() {
        xi1.o a17 = this.f171906d.mo48803xee5260a9().mo51612x60543150().a();
        xi1.o oVar = xi1.o.PORTRAIT;
        jz5.g gVar = this.f171908f;
        return a17 == oVar ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ad(0, (a(b(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay) - a((android.content.Context) gVar.mo141623x754a37bb(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561569m8)) / 2, a(b(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561553lt), 0) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ad(0, (a(b(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay) - a((android.content.Context) gVar.mo141623x754a37bb(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561569m8)) / 2, a(b(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561554lu), 0);
    }

    public final android.content.Context b() {
        return (android.content.Context) this.f171907e.mo141623x754a37bb();
    }
}
