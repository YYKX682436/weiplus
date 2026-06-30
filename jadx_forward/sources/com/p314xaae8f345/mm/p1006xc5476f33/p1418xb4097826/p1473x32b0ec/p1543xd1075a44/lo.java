package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class lo {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f200490a;

    /* renamed from: b, reason: collision with root package name */
    public final int f200491b;

    /* renamed from: c, reason: collision with root package name */
    public final int f200492c;

    /* renamed from: d, reason: collision with root package name */
    public final int f200493d;

    /* renamed from: e, reason: collision with root package name */
    public final int f200494e;

    /* renamed from: f, reason: collision with root package name */
    public final int f200495f;

    /* renamed from: g, reason: collision with root package name */
    public final int f200496g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f200497h;

    /* renamed from: i, reason: collision with root package name */
    public final vm2.c0 f200498i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f200499j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.l f200500k;

    public lo(android.view.View root, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f200490a = root;
        this.f200491b = i65.a.b(root.getContext(), 21);
        int i17 = com.p314xaae8f345.mm.ui.bl.b(root.getContext()).x;
        this.f200492c = i17;
        this.f200493d = i65.a.b(root.getContext(), 80);
        this.f200494e = i65.a.b(root.getContext(), 56);
        this.f200495f = (i17 - i65.a.b(root.getContext(), 192)) / 2;
        this.f200496g = i65.a.b(root.getContext(), 20) / 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f200499j = arrayList;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) root.findViewById(com.p314xaae8f345.mm.R.id.l_e);
        this.f200497h = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(root.getContext());
            c1162x665295de.Q(0);
            c22849x81a93d25.mo7967x900dcbe1(c1162x665295de);
        }
        vm2.c0 c0Var = new vm2.c0(arrayList);
        this.f200498i = c0Var;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d(c0Var);
        }
        c0Var.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jo(this);
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ko(this));
        }
    }

    public final void a(int i17) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f200497h;
        if (c22849x81a93d25 == null) {
            return;
        }
        c22849x81a93d25.setVisibility(i17);
    }
}
