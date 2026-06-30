package i33;

/* loaded from: classes.dex */
public final class u extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f369801d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f369802e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f369803f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f369804g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f369805h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369801d = jz5.h.b(new i33.t(this));
        this.f369802e = jz5.h.b(i33.k.f369739d);
        this.f369803f = jz5.h.b(new i33.n(this, activity));
        this.f369804g = jz5.h.b(new i33.j(this));
        this.f369805h = jz5.h.b(new i33.s(this));
        new java.util.LinkedHashMap();
    }

    public final em.c T6() {
        return (em.c) ((jz5.n) this.f369801d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dyn;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        int i17;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 abstractActivityC16711x120e7ae0 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) m158354x19263085 : null;
        if (abstractActivityC16711x120e7ae0 != null) {
            abstractActivityC16711x120e7ae0.mo54450xbf7c1df6("");
            abstractActivityC16711x120e7ae0.mo78530x8b45058f();
            abstractActivityC16711x120e7ae0.mo78529xe76c1b79();
            p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = abstractActivityC16711x120e7ae0.mo2533x106ab264();
            if (mo2533x106ab264 != null) {
                mo2533x106ab264.o();
            }
        }
        em.c T6 = T6();
        if (T6.f335679e == null) {
            T6.f335679e = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) T6.f335675a.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = T6.f335679e;
        jz5.g gVar = this.f369804g;
        c22849x81a93d25.mo7960x6cab2c8d((xm3.t0) ((jz5.n) gVar).mo141623x754a37bb());
        em.c T62 = T6();
        if (T62.f335679e == null) {
            T62.f335679e = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) T62.f335675a.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        }
        T62.f335679e.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m80379x76847179()));
        java.lang.Object b17 = c01.n2.d().c("data_center_album_file_preview_data_list", true).b("album_file_preview_data_list");
        java.util.ArrayList arrayList = b17 instanceof java.util.ArrayList ? (java.util.ArrayList) b17 : null;
        int size = arrayList != null ? arrayList.size() : 0;
        em.c T63 = T6();
        if (T63.f335680f == null) {
            T63.f335680f = (android.widget.TextView) T63.f335675a.findViewById(com.p314xaae8f345.mm.R.id.qxd);
        }
        android.widget.TextView textView = T63.f335680f;
        int intExtra = m158359x1e885992().getIntExtra("total_count", 0);
        int intExtra2 = m158359x1e885992().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        j33.c.f378937e.getClass();
        j33.c cVar = (j33.c) ((java.util.LinkedHashMap) j33.c.f378938f).get(java.lang.Integer.valueOf(intExtra2));
        if (cVar == null) {
            cVar = j33.c.f378939g;
        }
        switch (cVar.ordinal()) {
            case 0:
            case 10:
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.mjv;
                break;
            case 1:
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.mxq;
                break;
            case 2:
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.n3z;
                break;
            case 3:
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.n3p;
                break;
            case 4:
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.n3y;
                break;
            case 5:
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.meu;
                break;
            case 6:
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.mk9;
                break;
            case 7:
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.mjs;
                break;
            case 8:
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.mk8;
                break;
            case 9:
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f571849ml1;
                break;
            default:
                throw new jz5.j();
        }
        android.content.res.Resources resources = m80379x76847179().getResources();
        java.lang.String string = resources != null ? resources.getString(i17, java.lang.String.valueOf(intExtra)) : null;
        textView.setText(string != null ? string : "");
        com.p314xaae8f345.mm.ui.dl.i(textView.getPaint());
        textView.setGravity(17);
        em.c T64 = T6();
        if (T64.f335678d == null) {
            T64.f335678d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) T64.f335675a.findViewById(com.p314xaae8f345.mm.R.id.sci);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = T64.f335678d;
        android.content.res.Resources resources2 = m80379x76847179().getResources();
        c22661xa3a2b3c0.setText(resources2 != null ? resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.njv, java.lang.String.valueOf(size)) : null);
        c22661xa3a2b3c0.setVisibility(0);
        c22661xa3a2b3c0.setOnClickListener(new i33.o(this));
        em.c T65 = T6();
        if (T65.f335676b == null) {
            T65.f335676b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) T65.f335675a.findViewById(com.p314xaae8f345.mm.R.id.sch);
        }
        T65.f335676b.setOnClickListener(new i33.p(this));
        em.c T66 = T6();
        if (T66.f335677c == null) {
            T66.f335677c = (android.widget.LinearLayout) T66.f335675a.findViewById(com.p314xaae8f345.mm.R.id.hhc);
        }
        T66.f335677c.setOnClickListener(new i33.q(this));
        ((xm3.t0) ((jz5.n) gVar).mo141623x754a37bb()).B = (i33.r) ((jz5.n) this.f369805h).mo141623x754a37bb();
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = O6();
        if (O6 != null) {
            v65.i.b(O6, null, new i33.m(this, null), 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        c01.n2.d().e("data_center_album_file_preview_data_list");
    }
}
