package rf2;

/* loaded from: classes10.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f476235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476237f;

    public e0(r45.f02 f02Var, rf2.v0 v0Var, android.view.View view) {
        this.f476235d = f02Var;
        this.f476236e = v0Var;
        this.f476237f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.t tVar = rf2.t.f476423a;
        r45.f02 f02Var = this.f476235d;
        java.lang.String str2 = f02Var.f455411d;
        java.lang.String str3 = "";
        tVar.e(str2 == null ? "" : str2, 2, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        rf2.v0 v0Var = this.f476236e;
        v0Var.f476448b.Z6();
        if (((mm2.c1) v0Var.f476448b.m56788xbba4bfc0(mm2.c1.class)).f410435w && ((mm2.c1) v0Var.f476448b.m56788xbba4bfc0(mm2.c1.class)).f410429v) {
            r45.sl4 sl4Var = f02Var.f455415h;
            if (sl4Var != null && (str = sl4Var.f467364d) != null) {
                str3 = str;
            }
            df2.un unVar = v0Var.f476448b;
            qo0.b bVar = qo0.b.W2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG", str3);
            unVar.X6(bVar, bundle);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v0Var.f476449c, "[input-auto-wording] text = ".concat(str3));
        } else {
            db5.t7.m(this.f476237f.getContext(), v0Var.f476447a.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_h));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
