package yr3;

/* loaded from: classes11.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr3.a f546505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f546506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.o5 f546507f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f546508g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f546509h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f546510i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(sr3.a aVar, r45.s5 s5Var, r45.o5 o5Var, wr3.n0 n0Var, int i17, android.content.Context context) {
        super(1);
        this.f546505d = aVar;
        this.f546506e = s5Var;
        this.f546507f = o5Var;
        this.f546508g = n0Var;
        this.f546509h = i17;
        this.f546510i = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        r45.y5 y5Var;
        r45.y5 y5Var2;
        r45.p5 p5Var;
        r45.l5 l5Var;
        int intValue = ((java.lang.Number) obj).intValue();
        sr3.a aVar = sr3.a.f493362e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s.class);
        sr3.a aVar2 = this.f546505d;
        java.lang.String Bi = aVar2 == aVar ? sVar.Bi() : sVar.Di();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(Bi);
        sb6.append('_');
        r45.s5 s5Var = this.f546506e;
        sb6.append((s5Var == null || (p5Var = s5Var.f467047i) == null || (l5Var = p5Var.f464286d) == null) ? 0 : l5Var.f460671d);
        sb6.append('_');
        r45.o5 o5Var = this.f546507f;
        sb6.append(o5Var.f463449g);
        java.lang.String sb7 = sb6.toString();
        int i17 = o5Var.f463456p;
        if (i17 == 10 || i17 == 8) {
            str = "pages/image_editor/image_editor.html?biz=" + android.net.Uri.encode(Bi) + "&msginfo=" + android.net.Uri.encode(sb7);
        } else {
            str = "pages/appmsg_editor/appmsg_editor.html?biz=" + android.net.Uri.encode(Bi) + "&msginfo=" + android.net.Uri.encode(sb7);
        }
        gr3.b bVar = gr3.b.f356380a;
        java.lang.Long valueOf = (s5Var == null || (y5Var2 = s5Var.f467042d) == null) ? null : java.lang.Long.valueOf(y5Var2.f472323d);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(o5Var.f463449g);
        wr3.n0 n0Var = this.f546508g;
        bVar.b(valueOf, valueOf2, 105L, bVar.a(n0Var), (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, this.f546509h, (r29 & 128) != 0 ? 0 : aVar2 == aVar ? 0 : 5, (r29 & 256) != 0 ? 0 : 0);
        l81.b1 b1Var = new l81.b1();
        b1Var.f398565k = aVar2 == aVar ? 1338 : 1414;
        b1Var.f398549c = intValue;
        b1Var.f398567l = "3";
        b1Var.f398547b = "wx0b2ec076ec39c786";
        b1Var.f398555f = str;
        b1Var.f398561i = ((r01.l1) i95.n0.c(r01.l1.class)).Bi(aVar2.f493365d, Bi);
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Bi()) {
            b1Var.f398551d = 447;
        }
        java.lang.String str2 = b1Var.f398555f;
        b1Var.f398555f = str2 + "&from=publish_bar_fail";
        i95.m c17 = i95.n0.c(tk.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (tk.r.Wf((tk.r) c17, this.f546510i, b1Var, null, 4, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeatureMsgUtil", "handleFailedClick: use new editor");
        } else {
            b1Var.f398555f = str2;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f546510i, b1Var);
            bVar.b((s5Var == null || (y5Var = s5Var.f467042d) == null) ? null : java.lang.Long.valueOf(y5Var.f472323d), java.lang.Long.valueOf(o5Var.f463449g), 102L, bVar.a(n0Var), (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, this.f546509h, (r29 & 128) != 0 ? 0 : aVar2 == aVar ? 0 : 5, (r29 & 256) != 0 ? 0 : 0);
        }
        return jz5.f0.f384359a;
    }
}
