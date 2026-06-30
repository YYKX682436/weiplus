package yr3;

/* loaded from: classes11.dex */
public final class m implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final int f546461d;

    /* renamed from: e, reason: collision with root package name */
    public yr3.f f546462e;

    /* renamed from: f, reason: collision with root package name */
    public final int f546463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yr3.o f546464g;

    public m(yr3.o oVar, int i17, sr3.g config) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f546464g = oVar;
        this.f546461d = i17;
        int ordinal = config.g().ordinal();
        if (ordinal == 0) {
            i18 = 0;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            i18 = 5;
        }
        this.f546463f = i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem item, int i17) {
        r45.s5 s5Var;
        r45.p5 p5Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        r45.o5 o5Var;
        r45.o5 o5Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7;
        r45.s5 s5Var2;
        r45.p5 p5Var2;
        r45.l5 l5Var;
        r45.o5 o5Var3;
        r45.o5 o5Var4;
        r45.o5 o5Var5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (this.f546462e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeatureMsgUtil", "context item select failed, null dataTag");
            return;
        }
        int itemId = item.getItemId();
        gr3.b bVar = gr3.b.f356380a;
        java.lang.String str = null;
        r5 = null;
        java.lang.String str2 = null;
        r5 = null;
        java.lang.String str3 = null;
        str = null;
        str = null;
        str = null;
        str = null;
        yr3.o oVar = this.f546464g;
        if (itemId != 100) {
            if (itemId == 122) {
                yr3.f fVar = this.f546462e;
                if (fVar != null && (o5Var3 = fVar.f546336b) != null) {
                    str3 = o5Var3.Z;
                }
                ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).Bi(oVar.f546494d, str3 != null ? str3 : "", 2);
                gr3.b.d(bVar, this.f546462e, 104L, this.f546461d, this.f546463f, 0, 16, null);
            } else if (itemId == 172) {
                yr3.f fVar2 = this.f546462e;
                if ((fVar2 != null ? fVar2.f546336b : null) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeatureMsgUtil", "dataTag is null, return");
                    return;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar2);
                int i18 = fVar2.f546336b.f463467x0;
                wr3.p0[] p0VarArr = wr3.p0.f530399d;
                if (i18 == 2) {
                    android.content.Context context = oVar.f546494d;
                    int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                    e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nam);
                    e4Var.c();
                    return;
                }
                yr3.f fVar3 = this.f546462e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar3);
                int i27 = fVar3.f546336b.f463467x0;
                wr3.p0[] p0VarArr2 = wr3.p0.f530399d;
                if (i27 == 1) {
                    android.content.Context context2 = oVar.f546494d;
                    int i28 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
                    e4Var2.f293309c = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nan);
                    e4Var2.c();
                    return;
                }
                yr3.f fVar4 = this.f546462e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar4);
                int i29 = fVar4.f546336b.f463470y0;
                wr3.q0[] q0VarArr = wr3.q0.f530402d;
                if (i29 == 1) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modify showApp, path is:");
                    yr3.f fVar5 = this.f546462e;
                    sb6.append((fVar5 == null || (o5Var5 = fVar5.f546336b) == null) ? null : o5Var5.f463458p1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeatureMsgUtil", sb6.toString());
                    yr3.f fVar6 = this.f546462e;
                    if (fVar6 != null && (o5Var4 = fVar6.f546336b) != null) {
                        str2 = o5Var4.f463458p1;
                    }
                    ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).Bi(oVar.f546494d, str2 != null ? str2 : "", 3);
                } else {
                    yr3.f fVar7 = this.f546462e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar7);
                    int i37 = fVar7.f546336b.f463470y0;
                    wr3.q0[] q0VarArr2 = wr3.q0.f530402d;
                    if (i37 == 2) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("modify jumpWxa, path is:");
                        yr3.f fVar8 = this.f546462e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar8);
                        sb7.append(fVar8.f546336b.f463452l1);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeatureMsgUtil", sb7.toString());
                        yr3.f fVar9 = this.f546462e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar9);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s.class)).Ni(new yr3.l(oVar, this, fVar9.f546338d == sr3.a.f493362e ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s.class)).Bi() : ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s.class)).Di()));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeatureMsgUtil", "invalid modify type");
                    }
                }
            }
        } else {
            yr3.f fVar10 = this.f546462e;
            int i38 = 0;
            if ((fVar10 != null ? fVar10.f546337c : null) != wr3.n0.f530375f) {
                if ((fVar10 != null ? fVar10.f546337c : null) != wr3.n0.f530378i) {
                    if ((fVar10 != null ? fVar10.f546337c : null) != wr3.n0.f530379m) {
                        if ((fVar10 != null ? fVar10.f546337c : null) == wr3.n0.f530377h) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeatureMsgUtil", "sending item delete");
                            android.content.Context context3 = oVar.f546494d;
                            oVar.getClass();
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context3);
                            u1Var.u(context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nau));
                            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.azi);
                            u1Var.k(context3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560365g7));
                            u1Var.l(yr3.n.f546486a);
                            u1Var.q(false);
                        } else {
                            if ((fVar10 != null ? fVar10.f546337c : null) == wr3.n0.f530376g) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeatureMsgUtil", "failed item delete");
                                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s.class);
                                yr3.f fVar11 = this.f546462e;
                                if (fVar11 != null && (s5Var2 = fVar11.f546335a) != null && (p5Var2 = s5Var2.f467047i) != null && (l5Var = p5Var2.f464286d) != null) {
                                    i38 = l5Var.f460671d;
                                }
                                sVar.wi(i38);
                                java.lang.ref.WeakReference weakReference = yr3.w.f546593b;
                                if (weakReference != null && (c16893x570516c7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7) weakReference.get()) != null) {
                                    c16893x570516c7.j();
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeatureMsgUtil", "unknown item delete");
                            }
                        }
                        gr3.b.d(bVar, this.f546462e, 103L, this.f546461d, this.f546463f, 0, 16, null);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeatureMsgUtil", "success item delete");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(oVar.f546494d, 1, true);
            k0Var.f293405n = new yr3.h(oVar);
            k0Var.f293414s = new yr3.k(oVar, this);
            yr3.f fVar12 = this.f546462e;
            int i39 = (fVar12 == null || (o5Var2 = fVar12.f546336b) == null) ? -1 : o5Var2.f463449g;
            java.lang.String str4 = (fVar12 == null || (o5Var = fVar12.f546336b) == null) ? null : o5Var.f463446d;
            if (str4 == null) {
                if (i39 != -1) {
                    if (fVar12 != null && (s5Var = fVar12.f546335a) != null && (p5Var = s5Var.f467047i) != null && (linkedList = p5Var.f464287e) != null) {
                        java.util.Iterator it = linkedList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                if ((((r45.o5) obj).f463449g == i39) != false) {
                                    break;
                                }
                            }
                        }
                        r45.o5 o5Var6 = (r45.o5) obj;
                        if (o5Var6 != null) {
                            str = o5Var6.f463446d;
                        }
                    }
                    if (str == null) {
                        str4 = oVar.f546494d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572478na3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getString(...)");
                    } else {
                        str4 = str;
                    }
                } else {
                    str4 = oVar.f546494d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572478na3);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                }
            }
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[\r\n]+");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
            java.lang.String replaceAll = compile.matcher(str4).replaceAll(" ");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
            if (replaceAll.length() > 12) {
                java.lang.String substring = replaceAll.substring(0, 12);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                replaceAll = substring.concat("...");
            }
            java.lang.String string = oVar.f546494d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572477na2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{replaceAll}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            k0Var.q(format, 17);
            k0Var.v();
            gr3.b.d(bVar, this.f546462e, 103L, this.f546461d, this.f546463f, 0, 16, null);
        }
        item.getItemId();
        oVar.getClass();
        oVar.getClass();
    }
}
