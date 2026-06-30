package ic2;

/* loaded from: classes7.dex */
public final class r implements com.p314xaae8f345.mm.ui.cd {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f371892d = kz5.c0.i(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13989x42348fbd.class).d(), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13982xef4a60c3.class).d());

    @Override // com.p314xaae8f345.mm.ui.ad, j45.i
    public boolean b(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.p314xaae8f345.mm.ui.x7 x7Var) {
        java.lang.String str2;
        android.content.ComponentName componentName;
        try {
            java.util.List list = this.f371892d;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || (componentName = activity.getComponentName()) == null || (str2 = componentName.getClassName()) == null) {
                str2 = "";
            }
            if (list.contains(str2)) {
                ae2.in inVar = ae2.in.f85221a;
                boolean z17 = true;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.L6).mo141623x754a37bb()).r()).intValue() != 1) {
                    z17 = false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorStartActivityInterceptor", "start activity from anchor live, canPostMiniWindow:" + z17);
                if (z17) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5496x20db9ceb c5496x20db9ceb = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5496x20db9ceb();
                    c5496x20db9ceb.f135828g.getClass();
                    c5496x20db9ceb.e();
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorStartActivityInterceptor", "t :" + th6.getMessage());
        }
        return false;
    }
}
