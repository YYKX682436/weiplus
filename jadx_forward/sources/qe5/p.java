package qe5;

/* loaded from: classes12.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.z f443698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f443699e;

    public p(qe5.z zVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f443698d = zVar;
        this.f443699e = activityC0065xcd7aa112;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC$firstTimeOpenListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        qe5.z zVar = this.f443698d;
        kd5.e V6 = zVar.V6();
        boolean z17 = false;
        if (V6 != null && V6.f388417o) {
            kd5.e V62 = zVar.V6();
            if (V62 == null || (str = V62.f388426x) == null) {
                str = "";
            }
            kd5.e V63 = zVar.V6();
            java.lang.String str2 = V63 != null ? V63.F : null;
            kd5.e V64 = zVar.V6();
            java.lang.String str3 = V64 != null ? V64.f388425w : null;
            ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.l(str)) {
                zVar.d7(true);
            } else {
                kd5.e V65 = zVar.V6();
                if (V65 != null) {
                    V65.f388409J = true;
                }
                kd5.e V66 = zVar.V6();
                int i17 = V66 != null ? V66.f388411f : 1;
                j75.f Q6 = zVar.Q6();
                if (Q6 != null) {
                    Q6.B3(new kd5.l(str2 != null ? str2 : "", str, i17, str3));
                }
                z17 = true;
            }
            j75.f Q62 = zVar.Q6();
            if (Q62 != null) {
                kd5.n nVar = new kd5.n(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291260o);
                nVar.f388439e = z17;
                nVar.f388440f = true;
                Q62.B3(nVar);
            }
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f443699e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21859x7e56223) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21859x7e56223.class)).W6()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = zVar.P6();
                if (P6 != null) {
                    P6.finish();
                }
                yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC$firstTimeOpenListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            kd5.e V67 = zVar.V6();
            if (V67 != null && (f9Var = V67.f388410e) != null) {
                sc5.g gVar = sc5.g.f488105a;
                android.app.Activity m80379x76847179 = zVar.m80379x76847179();
                kd5.e V68 = zVar.V6();
                sc5.g.g(gVar, m80379x76847179, f9Var, false, false, V68 != null ? V68.f388419q : null, 12, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = zVar.P6();
                if (P62 != null) {
                    P62.finish();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC$firstTimeOpenListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
