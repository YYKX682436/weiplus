package rf2;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f476286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f476287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.q f476288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.dn f476289g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f476290h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r45.f02 f02Var, rf2.q qVar, df2.dn dnVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476287e = f02Var;
        this.f476288f = qVar;
        this.f476289g = dnVar;
        this.f476290h = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.h(this.f476287e, this.f476288f, this.f476289g, this.f476290h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [mm2.v4] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.mm4 mm4Var;
        java.lang.String str;
        r45.jm4 jm4Var;
        java.lang.Object obj2;
        java.lang.String str2;
        r45.vl4 vl4Var;
        java.lang.String str3;
        r45.vl4 vl4Var2;
        r45.vl4 vl4Var3;
        java.lang.String str4;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f476286d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.f02 f02Var = this.f476287e;
            r45.fm4 fm4Var = f02Var.f455413f;
            boolean z17 = false;
            java.lang.Object obj3 = null;
            r8 = null;
            r45.jm4 jm4Var2 = null;
            if ((fm4Var != null && fm4Var.f455981g == 1) == true) {
                mm2.v4 v4Var = (mm2.v4) this.f476288f.f476387e.m56788xbba4bfc0(mm2.v4.class);
                java.lang.String str5 = this.f476287e.f455411d;
                if (str5 == null) {
                    str5 = "";
                }
                java.lang.Object O6 = v4Var.O6(str5);
                r45.i02 i02Var = O6 instanceof r45.i02 ? (r45.i02) O6 : null;
                if (i02Var != null && i02Var.f458145d == 2) {
                    z17 = true;
                }
                if (z17) {
                    android.widget.TextView textView = this.f476288f.f476394o;
                    if (textView != null) {
                        r45.zd4 zd4Var = i02Var.f458146e;
                        if (zd4Var == null || (str4 = zd4Var.f473469h) == null) {
                            str4 = "";
                        }
                        textView.setText(str4);
                    }
                    rf2.q qVar = this.f476288f;
                    rf2.g gVar = rf2.g.f476272h;
                    java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwe);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    qVar.e(gVar, string, com.p314xaae8f345.mm.R.C30859x5a72f63.aew, 17.0f, 0, true, true);
                    java.lang.String str6 = this.f476288f.f476388f;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lotteryInfo coupon_info:");
                    r45.km4 km4Var = this.f476287e.f455416i;
                    java.lang.Object obj4 = km4Var != null ? km4Var.f460361n : null;
                    if (obj4 == null) {
                        obj4 = "";
                    }
                    sb6.append(pm0.b0.g(obj4));
                    sb6.append(";cache coupon_info:");
                    sb6.append(pm0.b0.g(i02Var));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str6, sb6.toString());
                } else {
                    android.widget.TextView textView2 = this.f476288f.f476394o;
                    if (textView2 != null) {
                        r45.km4 km4Var2 = this.f476287e.f455416i;
                        if (km4Var2 == null || (vl4Var2 = km4Var2.f460361n) == null || (str3 = vl4Var2.f469881g) == null) {
                            str3 = "";
                        }
                        textView2.setText(str3);
                    }
                    rf2.q qVar2 = this.f476288f;
                    rf2.g gVar2 = rf2.g.f476271g;
                    r45.km4 km4Var3 = this.f476287e.f455416i;
                    if (km4Var3 == null || (vl4Var = km4Var3.f460361n) == null || (str2 = vl4Var.f469880f) == null) {
                        str2 = "";
                    }
                    qVar2.e(gVar2, str2, com.p314xaae8f345.mm.R.C30859x5a72f63.f77918x9e227f16, 17.0f, com.p314xaae8f345.mm.R.C30861xcebc809e.f563268a50, false, true);
                }
                if (this.f476289g == df2.dn.f311524e) {
                    rf2.q qVar3 = this.f476288f;
                    r45.f02 f02Var2 = this.f476287e;
                    this.f476286d = 1;
                    if (rf2.q.a(qVar3, f02Var2, this) == aVar) {
                        return aVar;
                    }
                } else if (i02Var == null) {
                    ?? r07 = (mm2.v4) this.f476288f.f476387e.m56788xbba4bfc0(mm2.v4.class);
                    java.lang.String str7 = this.f476287e.f455411d;
                    if (str7 == null) {
                        str7 = "";
                    }
                    r45.i02 i02Var2 = new r45.i02();
                    r45.f02 f02Var3 = this.f476287e;
                    i02Var2.f458145d = 1;
                    r45.km4 km4Var4 = f02Var3.f455416i;
                    if (km4Var4 != null && (vl4Var3 = km4Var4.f460361n) != null) {
                        r45.zd4 zd4Var2 = new r45.zd4();
                        zd4Var2.f473465d = vl4Var3.f469878d;
                        zd4Var2.f473466e = vl4Var3.f469879e;
                        zd4Var2.f473467f = vl4Var3.f469880f;
                        zd4Var2.f473468g = vl4Var3.f469882h;
                        zd4Var2.f473469h = vl4Var3.f469881g;
                        i02Var2.f458146e = zd4Var2;
                    }
                    r07.W6(str7, i02Var2);
                }
            } else if (this.f476290h) {
                r45.km4 km4Var5 = f02Var.f455416i;
                if (km4Var5 != null && (jm4Var = km4Var5.f460363p) != null) {
                    rf2.q qVar4 = this.f476288f;
                    android.widget.ImageView imageView = qVar4.A;
                    if (imageView != null) {
                        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
                        vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
                        r45.kv1 kv1Var = jm4Var.f459466f;
                        d1Var.a(((c61.i8) i5Var).Ai(kv1Var != null ? kv1Var.m75945x2fec8307(2) : null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f)).c(imageView);
                    }
                    android.widget.ImageView imageView2 = qVar4.B;
                    if (imageView2 != null) {
                        mn2.d1 d1Var2 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
                        vd2.i5 i5Var2 = (vd2.i5) i95.n0.c(vd2.i5.class);
                        r45.kv1 kv1Var2 = jm4Var.f459466f;
                        d1Var2.a(((c61.i8) i5Var2).Ai(kv1Var2 != null ? kv1Var2.m75945x2fec8307(2) : null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f)).c(imageView2);
                    }
                    if (jm4Var.f459465e == 0) {
                        je2.t tVar = (je2.t) qVar4.f476387e.m56788xbba4bfc0(je2.t.class);
                        tVar.getClass();
                        synchronized (tVar) {
                            java.util.Iterator it = ((java.util.ArrayList) tVar.f380808u).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.oq1) obj2).f463974d, jm4Var.f459464d)) {
                                    break;
                                }
                            }
                            if (obj2 == null) {
                                r4 = false;
                            }
                            if (r4) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.f380796f, "tryAddLocalFreeGift failed gift " + jm4Var.f459464d + " is already cached");
                            } else {
                                r45.oq1 oq1Var = new r45.oq1();
                                oq1Var.f463974d = jm4Var.f459464d;
                                r45.kv1 kv1Var3 = jm4Var.f459466f;
                                oq1Var.f463975e = kv1Var3 != null ? kv1Var3.m75945x2fec8307(0) : null;
                                ((java.util.ArrayList) tVar.f380809v).add(oq1Var);
                                ((java.util.ArrayList) tVar.f380808u).add(0, oq1Var);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.f380796f, "add local free gift " + je2.u.a(oq1Var));
                                java.lang.String str8 = tVar.f380796f;
                                ?? sb7 = new java.lang.StringBuilder();
                                sb7.append("after addLocal free gift: ");
                                java.util.List list = tVar.f380808u;
                                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                                java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
                                while (it6.hasNext()) {
                                    arrayList.add(je2.u.a((r45.oq1) it6.next()));
                                }
                                sb7.append(arrayList);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, sb7.toString());
                                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new je2.s(jm4Var, tVar, null), 2, null);
                            }
                        }
                        java.util.Iterator it7 = ((je2.t) qVar4.f476387e.m56788xbba4bfc0(je2.t.class)).P6().iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it7.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.oq1) next).f463974d, jm4Var.f459464d)) {
                                obj3 = next;
                                break;
                            }
                        }
                        if (obj3 != null) {
                            rf2.g gVar3 = rf2.g.f476273i;
                            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m3k);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                            qVar4.e(gVar3, string2, com.p314xaae8f345.mm.R.C30859x5a72f63.f77918x9e227f16, 17.0f, com.p314xaae8f345.mm.R.C30861xcebc809e.a09, false, true);
                        } else {
                            rf2.g gVar4 = rf2.g.f476274m;
                            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m3l);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                            qVar4.e(gVar4, string3, com.p314xaae8f345.mm.R.C30859x5a72f63.f560613af2, 17.0f, 0, false, false);
                        }
                    } else {
                        rf2.g gVar5 = rf2.g.f476274m;
                        java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m3l);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                        qVar4.e(gVar5, string4, com.p314xaae8f345.mm.R.C30859x5a72f63.f560613af2, 17.0f, 0, false, false);
                    }
                    jm4Var2 = jm4Var;
                }
                if (jm4Var2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f476288f.f476388f, "prize type is free gift but gift info is null!!");
                }
            } else {
                if ((fm4Var != null && fm4Var.f455981g == 3) == true) {
                    android.widget.TextView textView3 = this.f476288f.f476396q;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f476288f.f476397r;
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.setVisibility(8);
                    }
                    r45.fm4 fm4Var2 = this.f476287e.f455413f;
                    if (fm4Var2 != null && (mm4Var = fm4Var2.f455984m) != null && (str = mm4Var.f462196d) != null) {
                        rf2.q qVar5 = this.f476288f;
                        android.widget.TextView textView4 = qVar5.C;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                        }
                        android.widget.TextView textView5 = qVar5.C;
                        if (textView5 != null) {
                            textView5.setText(str);
                        }
                    }
                } else {
                    if ((fm4Var != null && fm4Var.f455981g == 4) == true) {
                        rf2.q.b(this.f476288f, f02Var.f455418n);
                    } else {
                        android.widget.TextView textView6 = this.f476288f.f476394o;
                        if (textView6 != null) {
                            textView6.setText("");
                        }
                        mm2.v4 v4Var2 = (mm2.v4) this.f476288f.f476387e.m56788xbba4bfc0(mm2.v4.class);
                        java.lang.String str9 = this.f476287e.f455411d;
                        if (str9 == null) {
                            str9 = "";
                        }
                        java.lang.Object O62 = v4Var2.O6(str9);
                        r45.i52 i52Var = O62 instanceof r45.i52 ? (r45.i52) O62 : null;
                        if ((i52Var != null && i52Var.m75933x41a8a7f2(0)) == true) {
                            rf2.q qVar6 = this.f476288f;
                            rf2.g gVar6 = rf2.g.f476270f;
                            java.lang.String string5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwd);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
                            qVar6.e(gVar6, string5, com.p314xaae8f345.mm.R.C30859x5a72f63.aew, 17.0f, 0, false, false);
                        } else {
                            rf2.q qVar7 = this.f476288f;
                            rf2.g gVar7 = rf2.g.f476269e;
                            java.lang.String string6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwc);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
                            qVar7.e(gVar7, string6, com.p314xaae8f345.mm.R.C30859x5a72f63.f77918x9e227f16, 17.0f, com.p314xaae8f345.mm.R.C30861xcebc809e.f563268a50, false, true);
                        }
                        if (this.f476289g == df2.dn.f311524e) {
                            if (!(i52Var != null && i52Var.m75933x41a8a7f2(0))) {
                                rf2.q qVar8 = this.f476288f;
                                r45.f02 f02Var4 = this.f476287e;
                                this.f476286d = 2;
                                if (rf2.q.c(qVar8, f02Var4, this) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
