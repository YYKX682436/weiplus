package df2;

/* loaded from: classes10.dex */
public final class at implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f311283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311284e;

    public at(df2.lt ltVar, java.lang.String str) {
        this.f311283d = ltVar;
        this.f311284e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.bm1 bm1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$showFestivalStatusHalf$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.lt ltVar = this.f311283d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = ltVar.S;
        if (e3Var != null) {
            e3Var.h();
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) ltVar.m56788xbba4bfc0(mm2.c1.class)).f410379n;
        java.lang.String str = null;
        if (c19792x256d2725 != null) {
            p52.c cVar = p52.h.f433549a;
            java.lang.String str2 = ((mm2.c1) ltVar.m56788xbba4bfc0(mm2.c1.class)).f410385o;
            if (str2 == null && (str2 = c19792x256d2725.m76836x6c03c64c()) == null) {
                str2 = "";
            }
            p52.h.f433552d = str2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 16384);
            a17.m59367x7b6790db(((mm2.c1) ltVar.m56788xbba4bfc0(mm2.c1.class)).f410319c3);
            mm2.c1 c1Var = (mm2.c1) ltVar.m56788xbba4bfc0(mm2.c1.class);
            if (c1Var != null) {
                c1Var.O1 = false;
            }
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            android.view.ViewGroup viewGroup = ltVar.f312237J;
            android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
            so2.h1 h1Var = new so2.h1(a17);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("FINDER_LIVE_SHARE_KEY_STATUS_VERIFY", ((mm2.c1) ltVar.m56788xbba4bfc0(mm2.c1.class)).f410310a4);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).getClass();
            if (hc2.o0.d(h1Var.getFeedObject().getFeedObject()) && hc2.o0.f(h1Var.getFeedObject().getFeedObject())) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share finderObject ");
                sb6.append(h1Var.getFeedObject().m59251x5db1b11());
                sb6.append(' ');
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = h1Var.getFeedObject().getFeedObject();
                sb6.append(feedObject != null ? java.lang.Integer.valueOf(feedObject.m76777xba60e801()) : null);
                sb6.append(" to status,liveId:");
                r45.nw1 m59258xd0557130 = h1Var.getFeedObject().m59258xd0557130();
                sb6.append(m59258xd0557130 != null ? java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)) : null);
                sb6.append(",desc:");
                sb6.append(h1Var.getFeedObject().m59226x730bcac6());
                sb6.append(",liveStatus:");
                r45.nw1 m59258xd05571302 = h1Var.getFeedObject().m59258xd0557130();
                sb6.append(m59258xd05571302 != null ? java.lang.Integer.valueOf(m59258xd05571302.m75939xb282bd08(2)) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", sb6.toString());
                ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsFinderShareLive", "com.tencent.mm.feature.sns.SnsShareObjectService");
                m21.h hVar = new m21.h();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsFinderShareLive", "com.tencent.mm.feature.sns.SnsShareObjectService");
                hVar.e(h1Var.getFeedObject().m59239x1309d228());
                java.lang.String string = bundle.getString("FINDER_LIVE_SHARE_KEY_STATUS_VERIFY");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                pj4.j0 j0Var = new pj4.j0();
                j0Var.f436672d = "2";
                j0Var.f436674f = hVar.a();
                arrayList2.add(j0Var);
                bi4.c1 c1Var2 = new bi4.c1();
                java.lang.String str3 = this.f311284e;
                if (str3 == null || str3.length() == 0) {
                    c1Var2.b("1020");
                } else {
                    c1Var2.b(str3);
                }
                c1Var2.g(activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dew, hVar.b().m75945x2fec8307(3)));
                c1Var2.f("live_player@inner");
                java.lang.String m75945x2fec8307 = hVar.b().m75945x2fec8307(0);
                c1Var2.d(m75945x2fec8307 != null ? m75945x2fec8307 : "");
                bi4.d1 d1Var = c1Var2.f102567a;
                d1Var.f436470d.E = 4;
                c1Var2.h(string);
                c1Var2.c(arrayList2);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ni(activityC0065xcd7aa112, 1008, d1Var);
            } else {
                java.lang.String string2 = activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.exu);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                hc2.f1.B(activityC0065xcd7aa112, string2);
            }
        }
        in5.c cVar2 = ltVar.f312243r;
        dk2.h hVar2 = cVar2 instanceof dk2.h ? (dk2.h) cVar2 : null;
        if (hVar2 != null && (bm1Var = hVar2.f315078h) != null) {
            str = bm1Var.m75945x2fec8307(0);
        }
        ltVar.t7(ltVar.k7(str, 7));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$showFestivalStatusHalf$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
