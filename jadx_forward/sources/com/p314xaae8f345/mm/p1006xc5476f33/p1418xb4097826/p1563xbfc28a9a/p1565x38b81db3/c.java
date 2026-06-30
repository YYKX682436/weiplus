package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3;

/* loaded from: classes2.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.c f202662a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f202663b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f202664c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f202665d;

    /* renamed from: e, reason: collision with root package name */
    public final int f202666e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f202667f;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.c cVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.lang.String authorFinderUsername, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        this.f202662a = cVar;
        this.f202663b = activityC0065xcd7aa112;
        this.f202664c = authorFinderUsername;
        this.f202665d = z17;
        this.f202666e = i17;
        this.f202667f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.b(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0
    public in5.s b(yz5.l lVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.member.convert.MemberCommonConfig$DynamicConvertFactory
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == -19) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.c.this.f202664c);
                }
                if (type == -17) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.a();
                }
                if (type == 4) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.c.this;
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.r(cVar.f202662a, cVar.f202663b, cVar.f202664c, cVar.f202665d, cVar.f202666e);
                }
                if (type == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.c cVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.c.this;
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.n(cVar2.f202662a, cVar2.f202663b, cVar2.f202664c, cVar2.f202665d, cVar2.f202666e);
                }
                if (type == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.c cVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.c.this;
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.i(cVar3.f202662a, cVar3.f202663b, cVar3.f202664c, cVar3.f202665d, cVar3.f202666e);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.c.this.getClass();
                hc2.l.a("Finder.FinderMemberQAConfig", type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 c() {
        int a17 = ym5.x.a(this.f202663b, 20.0f);
        jz5.g gVar = this.f202667f;
        return this.f202665d ? new mo2.r(new android.graphics.drawable.ColorDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77702x3cb0748)), new int[]{a17, 0, a17, 0}, ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue()) : new mo2.r(new android.graphics.drawable.ColorDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77702x3cb0748)), new int[]{0, 0, 0, 0}, ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager d(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.C14458xf97c3197 c14458xf97c3197 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.C14458xf97c3197(context);
        if (this.f202665d) {
            c14458xf97c3197.C = false;
        }
        return c14458xf97c3197;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 e(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return ((ey2.o1) pf5.z.f435481a.a(context).a(ey2.o1.class)).f338994m;
    }
}
