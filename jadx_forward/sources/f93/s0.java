package f93;

/* loaded from: classes3.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f341991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f93.u0 f341992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f341993f;

    public s0(android.view.View view, long j17, f93.u0 u0Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f341991d = view;
        this.f341992e = u0Var;
        this.f341993f = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f341991d;
        view2.setClickable(false);
        view2.postDelayed(new f93.r0(view2), 1000L);
        f93.u0 u0Var = this.f341992e;
        n80.c cVar = u0Var.f342008e;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f341993f;
        if (cVar != null) {
            java.lang.String d17 = z3Var.d1();
            bk4.n0 n0Var = (bk4.n0) cVar;
            java.lang.String str2 = "";
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                if (d17 == null) {
                    d17 = "";
                }
                jSONObject.put("touser", d17);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                try {
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                    str = jSONObject2;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    str2 = jSONObject2;
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th));
                    str = str2;
                    qj4.s.m(qj4.s.f445491a, n0Var.f103047a, 99L, str, n0Var.f103048b, 0L, 0L, 0L, 0L, null, null, 0L, 2032, null);
                    java.lang.String d18 = z3Var.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getUsername(...)");
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("Contact_User", d18);
                    intent.putExtra("Contact_Scene", 0);
                    intent.putExtra("CONTACT_INFO_UI_SOURCE", 0);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, u0Var.f342007d);
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
            qj4.s.m(qj4.s.f445491a, n0Var.f103047a, 99L, str, n0Var.f103048b, 0L, 0L, 0L, 0L, null, null, 0L, 2032, null);
        }
        java.lang.String d182 = z3Var.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d182, "getUsername(...)");
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Contact_User", d182);
        intent2.putExtra("Contact_Scene", 0);
        intent2.putExtra("CONTACT_INFO_UI_SOURCE", 0);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent2, u0Var.f342007d);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
    }
}
