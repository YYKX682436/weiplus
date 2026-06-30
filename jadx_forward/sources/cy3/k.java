package cy3;

/* loaded from: classes10.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f306318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y1 f306319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f306320f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f306321g;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y1 y1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.p pVar) {
        this.f306318d = c16077xb54fe366;
        this.f306319e = y1Var;
        this.f306320f = h0Var;
        this.f306321g = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = this.f306318d;
        c16077xb54fe366.y();
        c16077xb54fe366.t();
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y1 y1Var = this.f306319e;
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
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2) this.f306320f.f391656d).B();
        yz5.p pVar = this.f306321g;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
