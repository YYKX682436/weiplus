package nv2;

/* loaded from: classes2.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f422132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f422133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f422134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f422135g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f422136h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f422137i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ nv2.d1 f422138m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, int i17, int i18, boolean z17, r45.qt2 qt2Var, boolean z18, nv2.d1 d1Var) {
        super(1);
        this.f422132d = c14994x9b99c079;
        this.f422133e = i17;
        this.f422134f = i18;
        this.f422135g = z17;
        this.f422136h = qt2Var;
        this.f422137i = z18;
        this.f422138m = d1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.yz3 yz3Var;
        r45.yz3 yz3Var2;
        r45.yz3 yz3Var3;
        r45.zu0 zu0Var;
        com.p314xaae8f345.mm.p944x882e457a.f cgiBack = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiBack, "cgiBack");
        int i17 = cgiBack.f152148a;
        boolean z17 = this.f422137i;
        boolean z18 = this.f422135g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f422132d;
        if (i17 == 0 && cgiBack.f152149b == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modLikeStatus success with id ");
            sb6.append((java.lang.Object) jz5.x.a(c14994x9b99c079.m59251x5db1b11()));
            sb6.append(" likeFlag:");
            sb6.append(c14994x9b99c079.m59255xbd8ebd19());
            sb6.append(" likeCount ");
            sb6.append(c14994x9b99c079.m59254xf4204902());
            sb6.append(' ');
            sb6.append(this.f422133e);
            sb6.append(' ');
            int i18 = this.f422134f;
            sb6.append(i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.InteractActionMgr", sb6.toString());
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = cgiBack.f152151d;
            r45.x21 x21Var = fVar instanceof r45.x21 ? (r45.x21) fVar : null;
            if (x21Var != null && (yz3Var3 = (r45.yz3) x21Var.m75936x14adae67(1)) != null && (zu0Var = (r45.zu0) yz3Var3.m75936x14adae67(2)) != null) {
                i95.m c17 = i95.n0.c(cq.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((cq.k) c17).Vi(c14994x9b99c079.m59299x6bf53a6c(), zu0Var);
            }
            r45.rd1 rd1Var = (r45.rd1) cgiBack.f152151d;
            if (rd1Var != null && (yz3Var2 = (r45.yz3) rd1Var.m75936x14adae67(2)) != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
                long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
                am.ia iaVar = c5445x963cab3.f135785g;
                iaVar.f88451a = m59251x5db1b11;
                iaVar.f88454d = 0;
                iaVar.f88452b = 3;
                iaVar.f88461k = yz3Var2.m75939xb282bd08(0);
                java.lang.String m75945x2fec8307 = yz3Var2.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                iaVar.f88462l = m75945x2fec8307;
                c5445x963cab3.e();
            }
            r45.rd1 rd1Var2 = (r45.rd1) cgiBack.f152151d;
            if (rd1Var2 != null && (yz3Var = (r45.yz3) rd1Var2.m75936x14adae67(2)) != null) {
                nv2.e1.a(yz3Var, z18, c14994x9b99c079.m59251x5db1b11(), false);
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Map b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.U.b(c14994x9b99c079);
            if (b17 != null) {
                linkedHashMap.putAll(b17);
            }
            java.util.Map b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a.b(this.f422136h, null);
            if (b18 != null) {
                linkedHashMap.putAll(b18);
            }
            linkedHashMap.put("is_action_like", java.lang.Integer.valueOf(z18 ? 1 : 0));
            linkedHashMap.put("is_private", java.lang.Integer.valueOf(z17 ? 1 : 0));
            linkedHashMap.put("is_long_video", 0);
            linkedHashMap.put("old_like_count", java.lang.Integer.valueOf(i18));
            linkedHashMap.put("cur_like_count", java.lang.Integer.valueOf(c14994x9b99c079.m59247xf67fd084()));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_like_real_click", null, linkedHashMap, 24617);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.InteractActionMgr", "modLikeStatus cgi fail " + ((java.lang.Object) jz5.x.a(c14994x9b99c079.m59251x5db1b11())) + ' ' + cgiBack.f152148a + ' ' + cgiBack.f152149b + ' ' + cgiBack.f152150c);
            this.f422138m.e(c14994x9b99c079, !z18, z17);
        }
        return jz5.f0.f384359a;
    }
}
