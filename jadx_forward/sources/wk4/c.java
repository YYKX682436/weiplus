package wk4;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wk4.f f528494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f528495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f528496f;

    public c(wk4.f fVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87, yz5.l lVar) {
        this.f528494d = fVar;
        this.f528495e = c19781xd1c47b87;
        this.f528496f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07;
        java.lang.String c17;
        android.text.Editable text;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/comment/TingCommentController$setCommentFooterReplyBtnListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wk4.f fVar = this.f528494d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c = fVar.f528507d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 m72066xdb574fcd = c18713x3be2dc6c != null ? c18713x3be2dc6c.m72066xdb574fcd() : null;
        if (m72066xdb574fcd == null || (text = m72066xdb574fcd.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        if (str.length() == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/ting/comment/TingCommentController$setCommentFooterReplyBtnListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        java.lang.String username = hc2.t.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, fVar.f528510g);
        java.lang.String b17 = hc2.t.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, fVar.f528510g);
        long c18 = c01.id.c();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = this.f528495e;
        java.lang.Long valueOf = java.lang.Long.valueOf(c19781xd1c47b87 != null ? c19781xd1c47b87.m76058xa6514d24() : 0L);
        java.lang.String m76102x6c03c64c = c19781xd1c47b87 != null ? c19781xd1c47b87.m76102x6c03c64c() : null;
        java.lang.String m76084x8010e5e4 = c19781xd1c47b87 != null ? c19781xd1c47b87.m76084x8010e5e4() : null;
        int i17 = fVar.f528510g;
        boolean a17 = hc2.c0.a(c19781xd1c47b87 != null ? c19781xd1c47b87.m76068x3ffea218() : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b872 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87();
        c19781xd1c47b872.m76109x2a50d98(0L);
        c19781xd1c47b872.m76120x6a832f1b(0L);
        if (i17 == 1) {
            c19781xd1c47b872.m76153x66bc2758(username);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.b2 b18 = ya2.h.f542017a.b(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            c19781xd1c47b872.m76125xe0a5bcad(b18 != null ? b18.m176700xe5e0d2a0() : "");
        } else {
            c19781xd1c47b872.m76153x66bc2758(c01.z1.r());
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.s0 Ni = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni();
            if (Ni != null && (n07 = Ni.n0(c19781xd1c47b872.m76102x6c03c64c())) != null) {
                java.lang.String c19 = n07.c();
                if (!(c19 == null || c19.length() == 0) ? (c17 = n07.c()) == null : (c17 = n07.d()) == null) {
                    c17 = "";
                }
                c19781xd1c47b872.m76125xe0a5bcad(c17);
            }
        }
        c19781xd1c47b872.m76111xe9f5bdb7(str);
        c19781xd1c47b872.m76135x7ac946f0(b17);
        c19781xd1c47b872.m76115x6e101bcb(c01.id.a() / 1000);
        c19781xd1c47b872.m76119xd664158c(i17 == 1 ? 8 : 0);
        if (valueOf != null) {
            valueOf.longValue();
            c19781xd1c47b872.m76143x2843c512(valueOf.longValue());
            c19781xd1c47b872.m76147xff7c838d(m76102x6c03c64c == null ? "" : m76102x6c03c64c);
            c19781xd1c47b872.m76144xdf18b836(m76084x8010e5e4 == null ? "" : m76084x8010e5e4);
            if (a17) {
                c19781xd1c47b872.m76119xd664158c(c19781xd1c47b872.m76068x3ffea218() | 16);
            }
        }
        c19781xd1c47b872.m76108xea4317cd(java.lang.String.valueOf(c18));
        c19781xd1c47b872.m76123x635d8e6b(1);
        long j17 = fVar.f528510g == 2 ? 2L : 3L;
        byte[] mo14344x5f01b1f6 = c19781xd1c47b872.mo14344x5f01b1f6();
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        this.f528496f.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24952x1d4ea0c8(str, valueOf2, mo14344x5f01b1f6))));
        wk4.f.b(fVar);
        yj0.a.h(this, "com/tencent/mm/plugin/ting/comment/TingCommentController$setCommentFooterReplyBtnListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
