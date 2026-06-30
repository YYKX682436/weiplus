package z83;

/* loaded from: classes14.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 f552275d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 activityC16160x425523e6) {
        this.f552275d = activityC16160x425523e6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "click reg button");
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 activityC16160x425523e6 = this.f552275d;
        java.lang.String string = activityC16160x425523e6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 activityC16160x425523e62 = this.f552275d;
        activityC16160x425523e6.f224683q = db5.e1.Q(activityC16160x425523e6, string, activityC16160x425523e62.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, null);
        ck5.f b17 = ck5.f.b(activityC16160x425523e62.T6().f525535n);
        b17.f124094f = 1;
        b17.f124093e = 32;
        b17.f124089a = true;
        b17.d(new z83.i(activityC16160x425523e62));
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
