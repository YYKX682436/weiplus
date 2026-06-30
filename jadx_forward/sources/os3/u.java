package os3;

/* loaded from: classes8.dex */
public class u implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ os3.v f429748a;

    public u(os3.v vVar) {
        this.f429748a = vVar;
    }

    @Override // db5.c1
    public void e(int i17) {
        os3.v vVar = this.f429748a;
        if (i17 == 0) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = vVar.f429753d.mo55332x76847179();
            ((sb0.f) jVar).getClass();
            boolean a17 = j35.u.a(mo55332x76847179, "android.permission.CAMERA", 16, "", "");
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.ComposeUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), vVar.f429753d.mo55332x76847179());
            if (a17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = vVar.f429753d;
                java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86.f236363p1;
                activityC16931x24037f86.b7();
                return;
            }
            return;
        }
        if (i17 == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("album_support_landscape_mode", vVar.f429753d.W);
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f862 = vVar.f429753d;
            ((ub0.r) oVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.h(activityC16931x24037f862, 4, intent);
            return;
        }
        if (i17 != 2) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("INTENT_MAX_SELECT_COUNT", 1);
        intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
        intent2.putExtra("is_support_landscape_mode", vVar.f429753d.W);
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.STORAGE, new os3.t(this, intent2))) {
            return;
        }
        j45.l.v(vVar.f429753d.mo55332x76847179(), "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent2, 6);
    }
}
