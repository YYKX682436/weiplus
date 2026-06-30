package nv2;

/* loaded from: classes2.dex */
public final class y1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.z1 f422170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv2.o1 f422171b;

    public y1(nv2.z1 z1Var, nv2.o1 o1Var) {
        this.f422170a = z1Var;
        this.f422171b = o1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        r45.pm2 pm2Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            nv2.z1 z1Var = this.f422170a;
            int m59254xf4204902 = z1Var.f422024d.m59254xf4204902();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = z1Var.f422024d;
            int m59255xbd8ebd19 = c14994x9b99c079.m59255xbd8ebd19();
            int m59247xf67fd084 = c14994x9b99c079.m59247xf67fd084();
            r45.dm2 m76806xdef68064 = c14994x9b99c079.getFeedObject().m76806xdef68064();
            r45.wm2 wm2Var = (m76806xdef68064 == null || (pm2Var = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) == null) ? null : (r45.wm2) pm2Var.m75936x14adae67(10);
            boolean z17 = z1Var.f422027g;
            int i17 = 0;
            if (z17) {
                int i18 = c14994x9b99c079.m59255xbd8ebd19() != 0 ? 0 : 1;
                c14994x9b99c079.m59385x50740976(c14994x9b99c079.m59254xf4204902() + i18);
                if (wm2Var != null) {
                    wm2Var.set(1, java.lang.Integer.valueOf(wm2Var.m75939xb282bd08(1) + i18));
                }
            } else {
                int i19 = c14994x9b99c079.m59255xbd8ebd19() != 0 ? -1 : 0;
                c14994x9b99c079.m59385x50740976(c14994x9b99c079.m59254xf4204902() + i19);
                if (wm2Var != null) {
                    wm2Var.set(1, java.lang.Integer.valueOf(wm2Var.m75939xb282bd08(1) + i19));
                }
            }
            boolean z18 = z1Var.f422028h;
            if (m59255xbd8ebd19 == 1 && (!z17 || z18)) {
                c14994x9b99c079.m59382x2d5669f8(c14994x9b99c079.m59247xf67fd084() - 1);
                if (wm2Var != null) {
                    wm2Var.set(2, java.lang.Integer.valueOf(wm2Var.m75939xb282bd08(2) - 1));
                }
            } else if (m59255xbd8ebd19 != 1 && z17 && !z18) {
                c14994x9b99c079.m59382x2d5669f8(c14994x9b99c079.m59247xf67fd084() + 1);
                if (wm2Var != null) {
                    wm2Var.set(2, java.lang.Integer.valueOf(wm2Var.m75939xb282bd08(2) + 1));
                }
            }
            if (!z17 || z18) {
                nv2.n1 n1Var = nv2.n1.f422084h;
                n1Var.o(c14994x9b99c079.m59256xbd916e4b());
                if (wm2Var != null && (m75941xfb821914 = wm2Var.m75941xfb821914(3)) != null) {
                    n1Var.o(m75941xfb821914);
                }
            } else {
                nv2.n1 n1Var2 = nv2.n1.f422084h;
                n1Var2.a(c14994x9b99c079.m59256xbd916e4b());
                if (wm2Var != null && (m75941xfb8219142 = wm2Var.m75941xfb821914(3)) != null) {
                    n1Var2.a(m75941xfb8219142);
                }
            }
            c14994x9b99c079.m59386xb8471e25((z17 && z18) ? 2 : z17 ? 1 : 0);
            if (wm2Var != null) {
                wm2Var.set(0, java.lang.Integer.valueOf((z17 && z18) ? 2 : z17 ? 1 : 0));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LikeLiveAction", "CgiFinderLiveLike end likeFlag:" + c14994x9b99c079.m59255xbd8ebd19() + " likeCount " + c14994x9b99c079.m59254xf4204902() + " friendLikeCount:" + c14994x9b99c079.m59247xf67fd084() + ",  " + m59255xbd8ebd19 + ' ' + m59254xf4204902 + ", oldFriendLikeCount:" + m59247xf67fd084);
            nv2.n1.f422084h.m(z1Var);
            this.f422171b.a(fp0.u.f346823f, false);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
            am.ia iaVar = c5445x963cab3.f135785g;
            iaVar.f88451a = z1Var.f422025e;
            if (z17 && z18) {
                i17 = 2;
            } else if (z17) {
                i17 = 1;
            }
            iaVar.f88455e = i17;
            iaVar.f88456f = c14994x9b99c079.m59254xf4204902();
            iaVar.f88454d = 1;
            iaVar.f88452b = 4;
            c5445x963cab3.e();
        }
        return jz5.f0.f384359a;
    }
}
