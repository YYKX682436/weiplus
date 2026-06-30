package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class ch extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca f205130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dh f205131e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca c14905x694027ca, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dh dhVar) {
        super(0);
        this.f205130d = c14905x694027ca;
        this.f205131e = dhVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        db2.e6 e6Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateState] state=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca c14905x694027ca = this.f205130d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13908xe0c1a676 c13908xe0c1a676 = c14905x694027ca.f205016o;
        if (c13908xe0c1a676 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        sb6.append(c13908xe0c1a676.f189143i);
        sb6.append(" cachedState=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13908xe0c1a676 c13908xe0c1a6762 = c14905x694027ca.f205016o;
        if (c13908xe0c1a6762 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        sb6.append(c13908xe0c1a6762.f189144m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTingAudioUIC", sb6.toString());
        android.widget.FrameLayout frameLayout = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca.R6(c14905x694027ca).f516215c;
        frameLayout.setOnClickListener(null);
        frameLayout.setVisibility(8);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = c14905x694027ca.m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14904xe030efb5 c14904xe030efb5 = m158358x197d1fc6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14904xe030efb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14904xe030efb5) m158358x197d1fc6 : null;
        if ((c14904xe030efb5 == null || (e6Var = c14904xe030efb5.f205011t) == null || !e6Var.P()) ? false : true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderProfileTingAudioUIC", "updateState empty audio list");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13908xe0c1a676 c13908xe0c1a6763 = c14905x694027ca.f205016o;
            if (c13908xe0c1a6763 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                throw null;
            }
            if (c13908xe0c1a6763.f189144m == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y6.f190013e) {
                int ordinal = c13908xe0c1a6763.f189143i.ordinal();
                if (ordinal == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca.R6(c14905x694027ca).f516215c.setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca.R6(c14905x694027ca).f516214b.setVisibility(8);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca.R6(c14905x694027ca).f516218f.setVisibility(8);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca.R6(c14905x694027ca).f516216d.setVisibility(0);
                } else if (ordinal == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca.R6(c14905x694027ca).f516215c.setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca.R6(c14905x694027ca).f516214b.setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca.R6(c14905x694027ca).f516218f.setVisibility(8);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca.R6(c14905x694027ca).f516216d.setVisibility(8);
                } else if (ordinal == 3) {
                    android.widget.FrameLayout frameLayout2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca.R6(c14905x694027ca).f516215c;
                    frameLayout2.setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca.R6(c14905x694027ca).f516214b.setVisibility(8);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca.R6(c14905x694027ca).f516218f.setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca.R6(c14905x694027ca).f516216d.setVisibility(8);
                    frameLayout2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.bh(c14905x694027ca, this.f205131e));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
