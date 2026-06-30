package ss2;

/* loaded from: classes10.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f493485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ss2.l f493486e;

    public j(boolean[] zArr, ss2.l lVar) {
        this.f493485d = zArr;
        this.f493486e = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/question/QAPostMainUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f493485d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.Z7("ce_feed_publish", "<FeedPublish>");
            sVar.H2("ce_feed_publish", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_feed_publish");
        }
        ss2.l lVar = this.f493486e;
        lVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.L(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a, lVar.m80379x76847179(), 66, null, 0L, 0, 24, null);
        ss2.d0 d0Var = lVar.f493494m;
        if (d0Var != null && d0Var.f493478o == 1) {
            m92.i X4 = g92.b.f351302e.X4(lVar.f493489e);
            if (X4 == null || X4.f406520a != 1) {
                ya2.b2 b2Var = lVar.f493490f;
                if (b2Var != null && b2Var.G0()) {
                    db5.t7.g(lVar.m80379x76847179(), lVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ev9));
                }
            } else {
                db5.t7.g(lVar.m80379x76847179(), lVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ev8));
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/question/QAPostMainUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
        ss2.d0 d0Var2 = lVar.f493494m;
        if (d0Var2 != null && d0Var2.f493478o == 2) {
            if (!((g92.b.f351302e.k2().e().m75939xb282bd08(17) & 1) == 0)) {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).bl(lVar.m158354x19263085(), null);
                lVar.m158354x19263085().finish();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/question/QAPostMainUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        lVar.S6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = lVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        dv2.e1 e1Var = (dv2.e1) pf5.z.f435481a.a(activity).a(dv2.e1.class);
        ss2.d dVar = lVar.f493493i;
        if (dVar == null || (str = dVar.b().getText().toString()) == null) {
            str = "";
        }
        e1Var.P6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9(str, null, "", false, false, 26, null), new ss2.e(lVar));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/question/QAPostMainUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
