package um2;

/* loaded from: classes3.dex */
public final class e4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fm2.c f510311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f510312c;

    public e4(um2.x5 x5Var, fm2.c cVar, r45.qt2 qt2Var) {
        this.f510310a = x5Var;
        this.f510311b = cVar;
        this.f510312c = qt2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.g
    public void a(qo0.b status, android.os.Bundle bundle) {
        int i17;
        java.lang.String str;
        fm2.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        jz5.f0 f0Var = null;
        if (ordinal != 41) {
            if (ordinal == 48) {
                um2.x5 x5Var = this.f510310a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var = x5Var.R0;
                if (w00Var == null) {
                    w00Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00((android.view.ViewGroup) x5Var.e(com.p314xaae8f345.mm.R.id.f9c, this.f510311b), this.f510311b, this.f510312c);
                }
                x5Var.R0 = w00Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var2 = this.f510310a.R0;
                if (w00Var2 != null) {
                    w00Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var3 = this.f510310a.R0;
                if (w00Var3 != null) {
                    w00Var3.z0();
                    return;
                }
                return;
            }
            if (ordinal == 82) {
                um2.x5 x5Var2 = this.f510310a;
                fm2.c cVar2 = x5Var2.f101139c;
                if (cVar2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar = x5Var2.f510620x0;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = x5Var2.f101138b;
                    if (tyVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type android.app.Activity");
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) activityC0065xcd7aa112.findViewById(com.p314xaae8f345.mm.R.id.f566387fq1)).getIsPresentedInTimeLineUI() ? activityC0065xcd7aa112.findViewById(com.p314xaae8f345.mm.R.id.fs6) : activityC0065xcd7aa112.findViewById(com.p314xaae8f345.mm.R.id.evz));
                        zl2.u4 u4Var = !com.p314xaae8f345.mm.ui.bk.C() ? zl2.u4.f555522e : zl2.u4.f555521d;
                        zl2.w4 w4Var = zl2.w4.f555550a;
                        android.view.LayoutInflater layoutInflater = activityC0065xcd7aa112.getLayoutInflater();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(layoutInflater, "getLayoutInflater(...)");
                        i17 = com.p314xaae8f345.mm.R.id.f566387fq1;
                        str = "getLayoutInflater(...)";
                        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) w4Var.b(com.p314xaae8f345.mm.R.C30864xbddafb2a.dam, viewGroup, false, u4Var, activityC0065xcd7aa112, layoutInflater);
                        if (viewGroup != null) {
                            viewGroup.addView(viewGroup2);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty(viewGroup2, u4Var, cVar2);
                        x5Var2.f510620x0 = tyVar2;
                        tyVar2.K0(8);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar3 = x5Var2.f510620x0;
                        if (tyVar3 != null) {
                            tyVar3.z0();
                        }
                    } else {
                        i17 = com.p314xaae8f345.mm.R.id.f566387fq1;
                        str = "getLayoutInflater(...)";
                    }
                    if (x5Var2.f510622y0 == null && ((mm2.e1) x5Var2.c(mm2.e1.class)).b7()) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type android.app.Activity");
                        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) activityC0065xcd7aa112.findViewById(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) activityC0065xcd7aa112.findViewById(i17)).getIsPresentedInTimeLineUI() ? com.p314xaae8f345.mm.R.id.fs6 : com.p314xaae8f345.mm.R.id.evz);
                        zl2.u4 u4Var2 = !com.p314xaae8f345.mm.ui.bk.C() ? zl2.u4.f555522e : zl2.u4.f555521d;
                        zl2.w4 w4Var2 = zl2.w4.f555550a;
                        android.view.LayoutInflater layoutInflater2 = activityC0065xcd7aa112.getLayoutInflater();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(layoutInflater2, str);
                        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) w4Var2.b(com.p314xaae8f345.mm.R.C30864xbddafb2a.dxu, viewGroup3, false, u4Var2, activityC0065xcd7aa112, layoutInflater2);
                        if (viewGroup3 != null) {
                            viewGroup3.addView(viewGroup4);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv(viewGroup4, u4Var2, cVar2);
                        x5Var2.f510622y0 = ivVar;
                        ivVar.K0(8);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar2 = x5Var2.f510622y0;
                        if (ivVar2 != null) {
                            ivVar2.z0();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (ordinal == 84 || ordinal == 88) {
                um2.x5 x5Var3 = this.f510310a;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1122 = x5Var3.f101138b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa1122, "null cannot be cast to non-null type android.app.Activity");
                fm2.c cVar3 = this.f510311b;
                if (!(cVar3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0)) {
                    cVar3 = null;
                }
                um2.h6.b(x5Var3, activityC0065xcd7aa1122, cVar3 != null ? (android.view.ViewGroup) cVar3.findViewById(com.p314xaae8f345.mm.R.id.f566386fq0) : null);
                return;
            }
            if (ordinal != 127) {
                if (ordinal == 145) {
                    um2.x5 x5Var4 = this.f510310a;
                    if (x5Var4.f510563e0 == null) {
                        boolean z17 = ((mm2.c1) x5Var4.c(mm2.c1.class)).T;
                        boolean z18 = ((mm2.n0) this.f510310a.c(mm2.n0.class)).f410806r;
                        um2.x5 x5Var5 = this.f510310a;
                        x5Var5.f510563e0 = (z17 || z18) ? new qn2.n((android.view.ViewGroup) x5Var5.e(com.p314xaae8f345.mm.R.id.enm, this.f510311b), this.f510311b) : new qn2.i0((android.view.ViewGroup) x5Var5.e(com.p314xaae8f345.mm.R.id.fpn, this.f510311b), this.f510311b);
                        qn2.z zVar = this.f510310a.f510563e0;
                        if (zVar != null) {
                            zVar.K0(8);
                        }
                        qn2.z zVar2 = this.f510310a.f510563e0;
                        if (zVar2 != null) {
                            zVar2.z0();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (ordinal == 188) {
                    um2.x5 x5Var6 = this.f510310a;
                    if (x5Var6.J0 != null || (cVar = this.f510311b) == null) {
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oc ocVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oc) x5Var6.X(new um2.d4(cVar));
                    x5Var6.J0 = ocVar;
                    if (ocVar != null) {
                        ocVar.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oc ocVar2 = x5Var6.J0;
                    if (ocVar2 != null) {
                        ocVar2.z0();
                        return;
                    }
                    return;
                }
                if (ordinal == 212) {
                    um2.x5 x5Var7 = this.f510310a;
                    if (x5Var7.Q0 == null) {
                        x5Var7.Q0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oi((android.view.ViewGroup) x5Var7.e(com.p314xaae8f345.mm.R.id.ey7, this.f510311b), this.f510311b, null, 4, null);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oi oiVar = this.f510310a.Q0;
                        if (oiVar != null) {
                            oiVar.K0(8);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oi oiVar2 = this.f510310a.Q0;
                        if (oiVar2 != null) {
                            oiVar2.z0();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (ordinal == 70) {
                    um2.x5 x5Var8 = this.f510310a;
                    if (x5Var8.S == null) {
                        x5Var8.S = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm((android.view.ViewGroup) this.f510310a.e(com.p314xaae8f345.mm.R.id.f1i, this.f510311b), this.f510311b, null, 4, null);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f510310a.S;
                        if (hmVar != null) {
                            hmVar.K0(8);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar2 = this.f510310a.S;
                        if (hmVar2 != null) {
                            hmVar2.z0();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (ordinal != 71) {
                    return;
                }
                um2.x5 x5Var9 = this.f510310a;
                if (x5Var9.S == null) {
                    x5Var9.S = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm((android.view.ViewGroup) this.f510310a.e(com.p314xaae8f345.mm.R.id.f1i, this.f510311b), this.f510311b, null, 4, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar3 = this.f510310a.S;
                    if (hmVar3 != null) {
                        hmVar3.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar4 = this.f510310a.S;
                    if (hmVar4 != null) {
                        hmVar4.z0();
                    }
                }
                java.lang.String string = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_SING_SONG_MID") : null;
                java.lang.Boolean valueOf = bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean("PARAM_FINDER_LIVE_SING_SONG_ONLY_SEGMENT")) : null;
                java.lang.String string2 = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_SING_SONG_UNIQUE_ADD_ID") : null;
                if ((string == null || string.length() == 0) != false && valueOf == null) {
                    if (string2 == null || string2.length() == 0) {
                        return;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar5 = this.f510310a.S;
                if (hmVar5 != null) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    if (string != null) {
                        bundle2.putString("PARAM_FINDER_LIVE_SING_SONG_MID", string);
                    }
                    if (valueOf != null) {
                        bundle2.putBoolean("PARAM_FINDER_LIVE_SING_SONG_ONLY_SEGMENT", valueOf.booleanValue());
                    }
                    if (string2 != null) {
                        bundle2.putString("PARAM_FINDER_LIVE_SING_SONG_UNIQUE_ADD_ID", string2);
                    }
                    hmVar5.E1 = bundle2;
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f510310a.f510619x;
        if (etVar != null) {
            etVar.U1();
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f510310a.f510565f, "cannot get inputPlugin");
        }
    }
}
