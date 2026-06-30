package ry2;

/* loaded from: classes10.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f482929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f482930e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ry2.q0 q0Var, java.util.ArrayList arrayList) {
        super(0);
        this.f482929d = q0Var;
        this.f482930e = arrayList;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String i17;
        android.graphics.Bitmap J2;
        android.graphics.Bitmap J3;
        ry2.q0 q0Var = this.f482929d;
        q0Var.f482991z.clear();
        java.util.ArrayList arrayList = q0Var.f482990y;
        if (arrayList != null) {
            int i18 = 0;
            for (java.lang.Object obj : arrayList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str = (java.lang.String) obj;
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b o17 = ry2.q0.o(q0Var, str);
                boolean z17 = i18 == 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "initNormalVideoLogic showThumb:" + z17 + " index:" + i18);
                java.util.ArrayList arrayList2 = this.f482930e;
                if (arrayList2 == null || arrayList2.size() <= i18 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) arrayList2.get(i18))) {
                    java.util.ArrayList arrayList3 = q0Var.A;
                    if (arrayList3.size() > i18 && arrayList3.get(i18) != null) {
                        java.lang.Object obj2 = arrayList3.get(i18);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                        if (((r45.c07) ((r45.dd4) obj2).m75936x14adae67(6)) != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "initNormalVideoLogic get thumb from cropInfoList");
                            mv2.q qVar = mv2.q.f413151a;
                            java.lang.Object obj3 = arrayList3.get(i18);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
                            r45.c07 c07Var = (r45.c07) ((r45.dd4) obj3).m75936x14adae67(6);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c07Var);
                            i17 = qVar.j(str, c07Var);
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.PostVideoWidget", "initNormalVideoLogic no thumb & no thumbRect");
                    i17 = mv2.q.f413151a.i(str);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "initNormalVideoLogic get thumb from mediaThumbList");
                    i17 = (java.lang.String) arrayList2.get(i18);
                }
                pm0.v.X(new ry2.g0(q0Var));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q0Var.D) && o17 != null) {
                    try {
                        r45.fp5 a17 = q0Var.P.a(str, o17.f243915a);
                        if (!android.text.TextUtils.isEmpty(a17.f456061d)) {
                            java.lang.String coverUrl = a17.f456061d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(coverUrl, "coverUrl");
                            q0Var.D = coverUrl;
                            java.lang.String fullCoverUrl = a17.f456062e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fullCoverUrl, "fullCoverUrl");
                            q0Var.E = fullCoverUrl;
                            q0Var.G = q0Var.G;
                            java.lang.String shareCoverUrl = a17.f456069o;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shareCoverUrl, "shareCoverUrl");
                            q0Var.F = shareCoverUrl;
                            q0Var.L = a17;
                            pm0.v.X(new ry2.h0(q0Var));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "initNormalVideoLogic replace cover quality:" + q0Var.G + " path:" + q0Var.D);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.PostVideoWidget", "initNormalVideoLogic replace cover e:" + th6);
                    }
                }
                if (z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q0Var.D) && com.p314xaae8f345.mm.vfs.w6.j(q0Var.D) && (J3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(q0Var.D, null)) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "initNormalVideoLogic use coverUrl");
                    q0Var.C = q0Var.D;
                    pm0.v.X(new ry2.l0(q0Var, J3));
                    z17 = false;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17) && (J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(i17, null)) != null) {
                    q0Var.f482991z.add(i17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "initNormalVideoLogic add thumb file, index:" + i18);
                    if (z17) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
                        q0Var.C = i17;
                        pm0.v.X(new ry2.l0(q0Var, J2));
                    }
                }
                i18 = i19;
            }
        }
        return jz5.f0.f384359a;
    }
}
