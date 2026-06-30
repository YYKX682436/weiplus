package d45;

/* loaded from: classes10.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d45.q f307986d;

    public p(d45.q qVar) {
        this.f307986d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078;
        java.util.ArrayList arrayList;
        int i17;
        java.lang.String str2;
        d45.q qVar;
        java.lang.String str3;
        java.lang.String str4;
        boolean z17;
        java.lang.Class cls;
        java.util.ArrayList arrayList2;
        java.lang.String str5;
        boolean z18;
        boolean z19;
        boolean z27;
        boolean z28;
        int i18;
        d45.q qVar2;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 z29;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(v17);
        java.lang.Object[] array = arrayList4.toArray();
        arrayList4.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.Object tag = v17.getTag(com.p314xaae8f345.mm.R.id.f566921hj1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tag, "getTag(...)");
        if (!(tag instanceof java.lang.Integer)) {
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((java.lang.Number) tag).intValue();
        d45.q qVar3 = this.f307986d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 z37 = qVar3.z(intValue);
        if (z37 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z37.f219963e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumAdapter", "[onClick] null == item!");
            qVar3.m8147xed6e4d18(intValue);
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumAdapter", "click image path:" + z37.f219963e);
        java.util.ArrayList arrayList5 = qVar3.f307991h;
        boolean contains = arrayList5.contains(z37);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activity = qVar3.f307987d;
        if (contains) {
            arrayList5.indexOf(z37);
            qVar3.I(z37);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((e45.r) pf5.z.f435481a.a(activity).a(e45.r.class)).f330955i.remove(new com.p314xaae8f345.mm.p2470x93e71c27.ui.v0(null, z37, null, 5, null));
            d45.d dVar = qVar3.f307997q;
            if (dVar != null) {
                dVar.a(intValue, false);
            }
            str4 = "(Landroid/view/View;)V";
            z27 = false;
            cls = e45.r.class;
            str5 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100;
            i17 = intValue;
            z17 = false;
            z28 = true;
            arrayList2 = arrayList5;
            qVar = qVar3;
            str3 = "onClick";
        } else {
            if (t23.p0.k().f496830f == 3 && r26.i0.p(z37.f219971p, "image/gif", true) && !((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().n(z37.f219963e)) {
                j33.d0.o(13459, com.p314xaae8f345.mm.vfs.w6.k(z37.f219963e) + ",1,,0");
                db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjh));
                qVar3.m8147xed6e4d18(intValue);
                yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, "album_business_byp") && r26.i0.p(z37.f219971p, "image/gif", true) && !((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().s(z37.f219963e)) {
                db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fin));
                qVar3.m8147xed6e4d18(intValue);
                yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(z37.f219963e);
            long Ai = ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai();
            if (k17 > Ai) {
                db5.t7.m123883x26a183b(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cf8, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(Ai)), 0).show();
                qVar3.m8147xed6e4d18(intValue);
                ((e35.e) ((e40.x) i95.n0.c(e40.x.class))).Ai(com.p314xaae8f345.mm.vfs.w6.n(z37.f219963e), k17, 1, z37.r() ? 2 : 1, activity.getIntent().getStringExtra("TO_USER"), z37 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) z37).f219979x / 1000 : 0);
                yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (z37 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) {
                if (t23.p0.k().f496830f == 25) {
                    e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
                    e42.d0 d0Var = e42.d0.clicfg_ultron_album_video_max_select_duration_android;
                    int Ni = ((h62.d) e0Var).Ni(d0Var, 300);
                    jz5.g gVar = qVar3.f307996p;
                    arrayList = arrayList5;
                    int intValue2 = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
                    if (Ni < intValue2) {
                        qVar2 = qVar3;
                        Ni = intValue2;
                        i19 = intValue;
                    } else {
                        i19 = intValue;
                        qVar2 = qVar3;
                    }
                    long j17 = Ni;
                    int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(d0Var, 300);
                    int intValue3 = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() - 1;
                    if (Ni2 < intValue3) {
                        Ni2 = intValue3;
                    }
                    long j18 = Ni2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) z37;
                    str = "MicroMsg.AlbumAdapter";
                    i18 = i19;
                    if (c15635xf0ea441b.f219979x < d11.s.fj().hj().f152729i * 1000) {
                        db5.e1.G(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573727fk5, java.lang.Integer.valueOf(d11.s.fj().hj().f152729i)), "", false, new d45.n(v17));
                        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    int i27 = c15635xf0ea441b.f219979x;
                    abstractC15633xee433078 = z37;
                    if (i27 > j17 * 1000) {
                        db5.e1.G(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fk6, java.lang.Long.valueOf(j18)), "", false, new d45.o(v17));
                        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else {
                        str2 = "(Landroid/view/View;)V";
                        str3 = "onClick";
                    }
                } else {
                    i18 = intValue;
                    qVar2 = qVar3;
                    str2 = "(Landroid/view/View;)V";
                    str3 = "onClick";
                    str = "MicroMsg.AlbumAdapter";
                    abstractC15633xee433078 = z37;
                    arrayList = arrayList5;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, "album_business_bubble_media_by_coordinate")) {
                    i17 = i18;
                    qVar = qVar2;
                } else {
                    int i28 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) abstractC15633xee433078).f219979x;
                    qVar = qVar2;
                    int i29 = qVar.f307992i;
                    if (i28 >= (i29 * 1000) + 500) {
                        db5.e1.T(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fk6, java.lang.Integer.valueOf(i29)));
                        qVar.m8147xed6e4d18(i18);
                        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", str3, str2);
                        return;
                    }
                    i17 = i18;
                }
            } else {
                str = "MicroMsg.AlbumAdapter";
                abstractC15633xee433078 = z37;
                arrayList = arrayList5;
                i17 = intValue;
                str2 = "(Landroid/view/View;)V";
                qVar = qVar3;
                str3 = "onClick";
            }
            if (!activity.g7(abstractC15633xee433078.f219963e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "choose image check is allowed extensions");
                activity.n7();
                if (v17 instanceof android.widget.CheckBox) {
                    ((android.widget.CheckBox) v17).setChecked(false);
                }
                qVar.m8147xed6e4d18(i17);
                yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", str3, str2);
                return;
            }
            if (activity.b7() + arrayList.size() < qVar.f307989f) {
                arrayList2 = arrayList;
                arrayList2.add(abstractC15633xee433078);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                java.util.ArrayList arrayList6 = ((e45.r) pf5.z.f435481a.a(activity).a(e45.r.class)).f330955i;
                str5 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100;
                str4 = str2;
                cls = e45.r.class;
                z17 = false;
                arrayList6.add(new com.p314xaae8f345.mm.p2470x93e71c27.ui.v0(null, abstractC15633xee433078, null, 5, null));
                d45.d dVar2 = qVar.f307997q;
                if (dVar2 != null) {
                    dVar2.a(i17, true);
                }
                arrayList2.size();
                z18 = false;
                z19 = false;
            } else {
                str4 = str2;
                z17 = false;
                cls = e45.r.class;
                arrayList2 = arrayList;
                str5 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100;
                z18 = true;
                z19 = true;
            }
            qVar.m8147xed6e4d18(i17);
            z27 = z19;
            z28 = z18;
        }
        if (z27) {
            int i37 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
            e4Var.f293309c = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cf9, java.lang.Integer.valueOf(qVar.f307989f));
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.c();
        } else {
            d45.c cVar = qVar.f307988e;
            if (cVar != null) {
                int size = arrayList2.size();
                e45.h hVar = ((e45.g) cVar).f330914a;
                d45.q qVar4 = hVar.f330924p;
                if (qVar4 != null && (z29 = qVar4.z(i17)) != null) {
                    int i38 = hVar.f330922n;
                    if (z28) {
                        arrayList3 = null;
                        o23.m.f423959a.c(z29.f219963e, i38, i17);
                        hVar.d(size);
                        hVar.b(i17, z17);
                    } else if (z29.mo63659xfb85f7b0() == 1) {
                        o23.m.f423959a.c(z29.f219963e, i38, i17);
                        hVar.d(size);
                        hVar.b(i17, true);
                        arrayList3 = null;
                    } else if (z29.mo63659xfb85f7b0() == 2) {
                        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(z29.f219963e);
                        java.lang.String str6 = a17.f294812f;
                        if (str6 != null) {
                            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str6, z17, z17);
                            if (!str6.equals(l17)) {
                                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                            }
                        }
                        arrayList3 = null;
                        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                        boolean F = !m17.a() ? z17 : m17.f294799a.F(m17.f294800b);
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = hVar.f330915d;
                        if (F) {
                            z17 = true;
                        } else {
                            db5.e1.W(activityC19730xa7b9756f.mo55332x76847179(), activityC19730xa7b9756f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjr));
                        }
                        if (z17) {
                            o23.m.f423959a.c(z29.f219963e, i38, i17);
                            hVar.d(size);
                            hVar.b(i17, true);
                        } else {
                            d45.q qVar5 = hVar.f330924p;
                            if (qVar5 != null) {
                                qVar5.I(z29);
                            }
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityC19730xa7b9756f, str5);
                            ((e45.r) pf5.z.f435481a.a(activityC19730xa7b9756f).a(cls)).f330955i.remove(new com.p314xaae8f345.mm.p2470x93e71c27.ui.v0(null, z29, null, 5, null));
                        }
                    } else {
                        arrayList3 = null;
                        o23.m.f423959a.c(z29.f219963e, i38, i17);
                        hVar.d(size);
                        hVar.b(i17, true);
                    }
                    d45.q qVar6 = hVar.f330924p;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(qVar6 != null ? qVar6.E() : arrayList3)) {
                        d45.q qVar7 = hVar.f330924p;
                        java.util.ArrayList E = qVar7 != null ? qVar7.E() : arrayList3;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(E);
                        java.util.Iterator it = E.iterator();
                        while (it.hasNext() && com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c((java.lang.String) it.next())) {
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", str3, str4);
    }
}
