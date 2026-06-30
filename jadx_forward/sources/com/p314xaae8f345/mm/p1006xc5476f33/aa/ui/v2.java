package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class v2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f154383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 f154384e;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 activityC11348xdd034dc7, java.util.List list, java.util.Map map, java.util.List list2) {
        this.f154384e = activityC11348xdd034dc7;
        this.f154383d = null;
        this.f154383d = new java.util.ArrayList();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7.C;
        if (!activityC11348xdd034dc7.i7() || list2 == null || list2.size() <= 0 || list.size() != list2.size()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2 w2Var = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2(activityC11348xdd034dc7, null);
                w2Var.f154403a = str;
                if (map == null || !map.containsKey(str)) {
                    w2Var.f154404b = "";
                } else {
                    w2Var.f154404b = activityC11348xdd034dc7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571249p, map.get(str));
                }
                this.f154383d.add(w2Var);
            }
            return;
        }
        for (int i18 = 0; i18 <= list.size() - 1; i18++) {
            java.lang.String str2 = (java.lang.String) list.get(i18);
            java.lang.String str3 = (java.lang.String) list2.get(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2 w2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2(activityC11348xdd034dc7, null);
            w2Var2.f154403a = str2;
            w2Var2.f154405c = str3;
            if (map == null || !map.containsKey(str2)) {
                w2Var2.f154404b = "";
            } else {
                w2Var2.f154404b = activityC11348xdd034dc7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571249p, map.get(str2));
            }
            this.f154383d.add(w2Var2);
        }
    }

    public void a(java.util.Map map) {
        java.util.List list = this.f154383d;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2) it.next()).f154404b = "";
        }
        if (map == null || map.size() <= 0) {
            return;
        }
        java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2) it6.next();
            if (map.containsKey(w2Var.f154403a)) {
                w2Var.f154404b = (java.lang.String) map.get(w2Var.f154403a);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f154383d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2) ((java.util.ArrayList) this.f154383d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        java.util.List list = this.f154383d;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2) ((java.util.ArrayList) list).get(i17);
        if (w2Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w2Var.f154403a)) {
            return view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 activityC11348xdd034dc7 = this.f154384e;
        if (view == null) {
            view2 = com.p314xaae8f345.mm.ui.id.b(activityC11348xdd034dc7).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bnh, viewGroup, false);
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u2 u2Var = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u2(this, null);
            u2Var.f154356a = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.m7g);
            u2Var.f154357b = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.cgc);
            u2Var.f154359d = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.a9m);
            u2Var.f154360e = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ove);
            u2Var.f154361f = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f568696nr2);
            u2Var.f154362g = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ovd);
            u2Var.f154358c = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.f567503jq2);
            u2Var.f154364i = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) view2.findViewById(com.p314xaae8f345.mm.R.id.f567502jq1);
            u2Var.f154363h = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.hti);
            java.lang.String str = w2Var.f154403a;
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = u2Var.f154364i;
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.x2 x2Var = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.x2(activityC11348xdd034dc7, str, viewOnFocusChangeListenerC22907xe18534c2);
            u2Var.f154365j = x2Var;
            viewOnFocusChangeListenerC22907xe18534c2.b(x2Var);
            u2Var.f154364i.setAccessibilityDelegate(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.r2(this, u2Var));
            u2Var.f154364i.m83169xe7297452().setImportantForAccessibility(2);
            view2.setTag(u2Var);
            activityC11348xdd034dc7.mo48633x8f91b80(u2Var.f154364i, 2, false, true);
        } else {
            view2 = view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u2 u2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u2) view2.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.s2 s2Var = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.s2(this, w2Var, u2Var2);
        u2Var2.f154356a.setOnTouchListener(s2Var);
        u2Var2.f154359d.setOnTouchListener(s2Var);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w2Var.f154403a)) {
            u2Var2.f154365j.f154415d = w2Var.f154403a;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(u2Var2.f154359d, w2Var.f154403a, null);
            android.widget.TextView textView = u2Var2.f154360e;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC11348xdd034dc7.mo55332x76847179();
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = w2Var.f154403a;
            java.lang.String str3 = activityC11348xdd034dc7.f154030z;
            ((sg3.a) v0Var).getClass();
            java.lang.String f17 = c01.a2.f(str2, str3);
            float textSize = u2Var2.f154360e.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x76847179, f17, textSize));
            if (c01.z1.r().equals(w2Var.f154403a)) {
                u2Var2.f154360e.setText(((java.lang.Object) u2Var2.f154360e.getText()) + activityC11348xdd034dc7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571284ao));
            }
        }
        if (w2Var.f154404b != null && u2Var2.f154364i.m83183xfb85ada3() != null && !w2Var.f154404b.equals(u2Var2.f154364i.m83183xfb85ada3().toLowerCase())) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c22 = u2Var2.f154364i;
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.x2 x2Var2 = u2Var2.f154365j;
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = viewOnFocusChangeListenerC22907xe18534c22.f295694h;
            if (c28001xdd2bb359 != null) {
                c28001xdd2bb359.removeTextChangedListener(x2Var2);
            }
            u2Var2.f154364i.m83213x765074af(w2Var.f154404b);
            u2Var2.f154364i.b(u2Var2.f154365j);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w2Var.f154405c)) {
            u2Var2.f154362g.setVisibility(8);
            u2Var2.f154357b.setGravity(16);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) u2Var2.f154358c.getLayoutParams();
            layoutParams.gravity = 21;
            u2Var2.f154358c.setLayoutParams(layoutParams);
        } else {
            u2Var2.f154362g.setText(h61.o.j(60, w2Var.f154405c));
            u2Var2.f154362g.setVisibility(0);
            u2Var2.f154362g.post(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.t2(this, u2Var2));
            u2Var2.f154357b.setGravity(48);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) u2Var2.f154358c.getLayoutParams();
            layoutParams2.gravity = 53;
            u2Var2.f154358c.setLayoutParams(layoutParams2);
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c23 = u2Var2.f154364i;
        if (viewOnFocusChangeListenerC22907xe18534c23 == null || viewOnFocusChangeListenerC22907xe18534c23.m83183xfb85ada3() == null || com.p314xaae8f345.mm.p2802xd031a825.ui.r1.h0(u2Var2.f154364i.m83183xfb85ada3(), "100", 2, java.math.RoundingMode.HALF_UP).doubleValue() <= activityC11348xdd034dc7.f154025u) {
            u2Var2.f154364i.m83194xb23f15e1(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        } else {
            u2Var2.f154364i.m83194xb23f15e1(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac);
        }
        if (i17 == 0) {
            u2Var2.f154356a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aip);
        } else if (i17 == ((java.util.ArrayList) list).size() - 1) {
            u2Var2.f154356a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aiq);
        } else {
            u2Var2.f154356a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aio);
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7.f7(activityC11348xdd034dc7, w2Var)) {
            u2Var2.f154359d.setAlpha(1.0f);
            u2Var2.f154360e.setAlpha(1.0f);
            u2Var2.f154363h.setAlpha(1.0f);
            u2Var2.f154363h.setVisibility(0);
            u2Var2.f154364i.setAlpha(1.0f);
            u2Var2.f154364i.setVisibility(0);
            u2Var2.f154362g.setAlpha(1.0f);
            u2Var2.f154359d.setAlpha(1.0f);
            u2Var2.f154360e.setAlpha(1.0f);
            u2Var2.f154363h.setAlpha(1.0f);
            u2Var2.f154364i.setAlpha(1.0f);
            u2Var2.f154364i.findViewById(com.p314xaae8f345.mm.R.id.pbn).setFocusable(true);
            u2Var2.f154364i.findViewById(com.p314xaae8f345.mm.R.id.pbn).setFocusableInTouchMode(true);
            u2Var2.f154364i.findViewById(com.p314xaae8f345.mm.R.id.pbn).setClickable(true);
            u2Var2.f154361f.setVisibility(4);
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC11348xdd034dc7.mo55332x76847179();
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str4 = w2Var.f154403a;
            java.lang.String str5 = activityC11348xdd034dc7.f154030z;
            ((sg3.a) v0Var2).getClass();
            java.lang.String f18 = c01.a2.f(str4, str5);
            float textSize2 = u2Var2.f154360e.getTextSize();
            ((ke0.e) xVar2).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAAByPersonAmountSelectUI", "username：%s，data.username：%s", com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471792, f18, textSize2).toString(), w2Var.f154403a);
            return view2;
        }
        u2Var2.f154359d.setAlpha(0.3f);
        u2Var2.f154360e.setAlpha(0.3f);
        u2Var2.f154363h.setAlpha(0.3f);
        u2Var2.f154364i.setAlpha(0.15f);
        u2Var2.f154359d.setAlpha(0.3f);
        u2Var2.f154360e.setAlpha(0.3f);
        u2Var2.f154362g.setAlpha(0.3f);
        u2Var2.f154363h.setAlpha(0.3f);
        u2Var2.f154363h.setVisibility(8);
        u2Var2.f154364i.setAlpha(0.15f);
        u2Var2.f154364i.setVisibility(8);
        u2Var2.f154364i.findViewById(com.p314xaae8f345.mm.R.id.pbn).setFocusable(false);
        u2Var2.f154364i.findViewById(com.p314xaae8f345.mm.R.id.pbn).setFocusableInTouchMode(false);
        u2Var2.f154364i.findViewById(com.p314xaae8f345.mm.R.id.pbn).setClickable(false);
        java.lang.String a17 = t41.g.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(w2Var.f154403a, true));
        u2Var2.f154361f.setVisibility(0);
        u2Var2.f154361f.setText(a17);
        u2Var2.f154361f.setAlpha(0.3f);
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = activityC11348xdd034dc7.mo55332x76847179();
        tg3.v0 v0Var3 = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str6 = w2Var.f154403a;
        java.lang.String str7 = activityC11348xdd034dc7.f154030z;
        ((sg3.a) v0Var3).getClass();
        java.lang.String f19 = c01.a2.f(str6, str7);
        float textSize3 = u2Var2.f154360e.getTextSize();
        ((ke0.e) xVar3).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAAByPersonAmountSelectUI", "username：%s，data.username：%s,subName:%s", com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471793, f19, textSize3).toString(), w2Var.f154403a, a17);
        return view2;
    }
}
