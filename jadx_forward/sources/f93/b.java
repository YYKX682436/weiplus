package f93;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f341824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455 f341825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f341826f;

    public b(android.view.View view, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455 dialogC16164x43fb9455, int i17) {
        this.f341824d = view;
        this.f341825e = dialogC16164x43fb9455;
        this.f341826f = i17;
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
        android.view.View view2 = this.f341824d;
        view2.setClickable(false);
        view2.postDelayed(new f93.a(view2), 1000L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455 dialogC16164x43fb9455 = this.f341825e;
        f93.r5 r5Var = ((f93.c5) dialogC16164x43fb9455.f224720w.get(this.f341826f)).f341840c;
        java.lang.String str2 = r5Var != null ? r5Var.f341983a : null;
        if (str2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsLabelUserDialog", "showLabelDetailDialog: ".concat(str2));
            m80.j jVar = (m80.j) i95.n0.c(m80.j.class);
            android.content.Context context = dialogC16164x43fb9455.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ((l80.k) jVar).getClass();
            new f93.p5(context, str2).show();
            n80.c cVar = dialogC16164x43fb9455.f224717t;
            if (cVar != null) {
                bk4.n0 n0Var = (bk4.n0) cVar;
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("tag", str2);
                    str = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
                    try {
                        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th));
                        qj4.s.m(qj4.s.f445491a, n0Var.f103047a, 98L, str, n0Var.f103048b, 0L, 0L, 0L, 0L, null, null, 0L, 2032, null);
                        yj0.a.h(this, "com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    str = "";
                }
                qj4.s.m(qj4.s.f445491a, n0Var.f103047a, 98L, str, n0Var.f103048b, 0L, 0L, 0L, 0L, null, null, 0L, 2032, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
    }
}
