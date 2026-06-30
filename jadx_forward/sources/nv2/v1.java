package nv2;

/* loaded from: classes2.dex */
public final class v1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.w1 f422139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv2.o1 f422140b;

    public v1(nv2.w1 w1Var, nv2.o1 o1Var) {
        this.f422139a = w1Var;
        this.f422140b = o1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LikeActionTask", "LikeActionTask callback " + fVar.f152148a + ' ' + fVar.f152149b + ' ' + fVar.f152150c);
        nv2.w1 w1Var = this.f422139a;
        int a17 = nv2.r1.a(w1Var.f422149h);
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        nv2.i1 i1Var = w1Var.f422106a;
        nv2.o1 o1Var = this.f422140b;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = w1Var.f422148g;
            int m60787xf4204902 = yj0Var.m60787xf4204902();
            boolean z17 = yj0Var.m60788xbd8ebd19() == 1;
            nv2.x1 x1Var = w1Var.f422149h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x1Var, "<this>");
            nv2.x1 x1Var2 = nv2.x1.f422159d;
            if (!(x1Var == x1Var2 || x1Var == nv2.x1.f422164i) || z17) {
                if ((x1Var == nv2.x1.f422160e || x1Var == nv2.x1.f422165m) && z17) {
                    yj0Var.u0().m76131x50740976(yj0Var.m60787xf4204902() - 1);
                }
            } else {
                yj0Var.u0().m76131x50740976(yj0Var.m60787xf4204902() + 1);
            }
            if (x1Var == nv2.x1.f422162g) {
                pm0.v.X(new nv2.s1(w1Var));
            } else if (x1Var == nv2.x1.f422163h) {
                pm0.v.X(new nv2.t1(w1Var));
            } else {
                if (x1Var == x1Var2 || x1Var == nv2.x1.f422164i) {
                    yj0Var.u0().m76132xb8471e25(1);
                } else {
                    if ((x1Var == nv2.x1.f422160e || x1Var == nv2.x1.f422165m) || x1Var == nv2.x1.f422161f || x1Var == nv2.x1.f422166n) {
                        yj0Var.u0().m76132xb8471e25(0);
                    }
                }
            }
            if (w1Var.f422152k && w1Var.f422150i == 1) {
                if (x1Var == x1Var2) {
                    yj0Var.l1(1 | yj0Var.z0());
                } else {
                    yj0Var.l1(yj0Var.z0() & (-2));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LikeCommentAction", "CgiFinderLikeFeed end likeFlag: " + yj0Var.m60788xbd8ebd19() + " likeCount " + yj0Var.m60787xf4204902() + ' ' + z17 + ' ' + m60787xf4204902);
            nv2.n1.f422084h.n(w1Var, a17);
            o1Var.a(fp0.u.f346823f, false);
            if (i1Var != null) {
                i1Var.a(yj0Var);
                return f0Var;
            }
        } else {
            if (i17 == 4) {
                pm0.v.X(new nv2.u1(w1Var, a17));
                o1Var.a(fp0.u.f346824g, false);
            } else {
                o1Var.a(fp0.u.f346824g, true);
            }
            if (i1Var != null) {
                int i18 = fVar.f152148a;
                int i19 = fVar.f152149b;
                java.lang.String str = fVar.f152150c;
                if (str == null) {
                    str = "";
                }
                i1Var.b(i18, i19, str);
                return f0Var;
            }
        }
        return null;
    }
}
