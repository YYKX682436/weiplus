package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public class za extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f146257d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f146258e;

    /* renamed from: f, reason: collision with root package name */
    public final o11.g f146259f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 f146260g;

    public za(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 activityC10362xd5e3feb2, android.content.Context context) {
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        this.f146260g = activityC10362xd5e3feb2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f146257d = arrayList;
        java.lang.String[] strArr3 = null;
        this.f146259f = null;
        this.f146258e = context;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC10362xd5e3feb2.f145444g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesUsernames null");
        } else {
            java.lang.String[] split = activityC10362xd5e3feb2.f145444g.split(",");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC10362xd5e3feb2.f145443f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesNicknames null");
            } else {
                java.lang.String[] split2 = activityC10362xd5e3feb2.f145443f.split(",");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC10362xd5e3feb2.f145446i)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesAppids null");
                    strArr = null;
                } else {
                    strArr = activityC10362xd5e3feb2.f145446i.split(",");
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC10362xd5e3feb2.f145445h)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesDescids null");
                    strArr2 = null;
                } else {
                    strArr2 = activityC10362xd5e3feb2.f145445h.split(",");
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC10362xd5e3feb2.f145447m)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesHeadimgurls null");
                } else {
                    strArr3 = activityC10362xd5e3feb2.f145447m.split(",");
                }
                arrayList.clear();
                int i17 = 0;
                while (i17 < split.length) {
                    com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 activityC10362xd5e3feb22 = this.f146260g;
                    java.lang.String str = split[i17];
                    java.lang.String str2 = (split2.length <= i17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split2[i17])) ? split[i17] : split2[i17];
                    java.lang.String str3 = "";
                    java.lang.String str4 = (strArr == null || strArr.length <= i17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr[i17])) ? "" : strArr[i17];
                    java.lang.String str5 = (strArr2 == null || strArr2.length <= i17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr2[i17])) ? "" : strArr2[i17];
                    if (strArr3 != null && strArr3.length > i17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr3[i17])) {
                        str3 = strArr3[i17];
                    }
                    arrayList.add(new com.p314xaae8f345.mm.p648x55baa833.ui.xa(activityC10362xd5e3feb22, str, str2, str4, str5, str3));
                    i17++;
                }
            }
        }
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        fVar.f423628s = true;
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78922x61de8d17;
        this.f146259f = fVar.a();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f146257d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((java.util.ArrayList) this.f146257d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ab abVar;
        android.content.Context context = this.f146258e;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 activityC10362xd5e3feb2 = this.f146260g;
        if (view == null) {
            view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.chc, null);
            abVar = activityC10362xd5e3feb2.U6(view);
        } else {
            abVar = (com.p314xaae8f345.mm.p648x55baa833.ui.ab) view.getTag();
            if (abVar == null) {
                abVar = activityC10362xd5e3feb2.U6(view);
            }
        }
        abVar.f145571a.setVisibility(0);
        abVar.f145572b.setVisibility(0);
        n11.a b17 = n11.a.b();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f146257d;
        b17.h(((com.p314xaae8f345.mm.p648x55baa833.ui.xa) arrayList.get(i17)).f146201e, abVar.f145571a, this.f146259f);
        android.widget.TextView textView = abVar.f145572b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = ((com.p314xaae8f345.mm.p648x55baa833.ui.xa) arrayList.get(i17)).f146198b;
        if (str == null) {
            str = "";
        }
        float textSize = abVar.f145572b.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(((com.p314xaae8f345.mm.p648x55baa833.ui.xa) arrayList.get(i17)).f146197a)) {
            activityC10362xd5e3feb2.F = true;
            dm.w8 w8Var = new dm.w8();
            java.lang.String str2 = ((com.p314xaae8f345.mm.p648x55baa833.ui.xa) arrayList.get(i17)).f146200d;
            if (str2 == null) {
                str2 = "";
            }
            w8Var.f69018x28d46377 = str2;
            java.lang.String str3 = ((com.p314xaae8f345.mm.p648x55baa833.ui.xa) arrayList.get(i17)).f146199c;
            w8Var.f69024xd0366ace = str3 != null ? str3 : "";
            w8Var.f69019xbd959cfd = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            ((u41.l) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Ai()).y0(w8Var, new java.lang.String[]{"appid", "wordingId", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68});
            if (android.text.TextUtils.isEmpty(w8Var.f69023xcf77aa53)) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w8Var.f69018x28d46377) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w8Var.f69024xd0366ace)) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.add(w8Var.f69024xd0366ace);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(abVar.f145573c.getTag(), "first")) {
                        activityC10362xd5e3feb2.G = true;
                        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
                        ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
                        java.lang.String str4 = w8Var.f69018x28d46377;
                        java.lang.String str5 = w8Var.f69019xbd959cfd;
                        ((za0.k) b0Var).getClass();
                        r1Var.g(new l41.z(str4, str5, linkedList, 0));
                    }
                }
                abVar.f145573c.setVisibility(4);
                abVar.f145573c.setTag("first");
            } else {
                abVar.f145573c.setVisibility(0);
                abVar.f145573c.setText("＠" + w8Var.f69023xcf77aa53);
            }
        } else {
            abVar.f145573c.setVisibility(8);
        }
        view.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.ya(this, i17));
        return view;
    }
}
