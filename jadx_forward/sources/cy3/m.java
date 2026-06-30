package cy3;

/* loaded from: classes10.dex */
public final class m implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f306339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f306340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y1 f306341c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f306342d;

    public m(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y1 y1Var, yz5.p pVar) {
        this.f306339a = view;
        this.f306340b = c16077xb54fe366;
        this.f306341c = y1Var;
        this.f306342d = pVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3
    /* renamed from: dismiss */
    public final void mo2069x63a3b28a() {
        android.view.View view = this.f306339a;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$8", "dismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$8", "dismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = this.f306340b;
        c16077xb54fe366.y();
        c16077xb54fe366.t();
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y1 y1Var = this.f306341c;
        if (y1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayUIC", "release");
            qx3.o oVar = y1Var.f240082b;
            oVar.Q6();
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) oVar.f448910g).k(new qx3.f(0L, null, 3));
            oVar.N6();
            p3325xe03a0797.p3326xc267989b.r2 r2Var = oVar.f448916p;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.z0.e(y1Var.f240081a, null, 1, null);
        }
        yz5.p pVar = this.f306342d;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, 0);
        }
    }
}
