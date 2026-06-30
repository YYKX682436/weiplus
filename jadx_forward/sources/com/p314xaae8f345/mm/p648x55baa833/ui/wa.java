package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public class wa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 f146156d;

    public wa(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 activityC10362xd5e3feb2) {
        this.f146156d = activityC10362xd5e3feb2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 activityC10362xd5e3feb2 = this.f146156d;
        activityC10362xd5e3feb2.E = db5.e1.Q(activityC10362xd5e3feb2.mo55332x76847179(), activityC10362xd5e3feb2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC10362xd5e3feb2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571339c8), true, false, null);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(activityC10362xd5e3feb2.f145455u)) {
            ab0.y yVar = (ab0.y) i95.n0.c(ab0.y.class);
            java.lang.String str = activityC10362xd5e3feb2.f145449o;
            java.lang.String str2 = activityC10362xd5e3feb2.f145455u;
            java.lang.String str3 = activityC10362xd5e3feb2.f145457w;
            java.util.LinkedList linkedList = new java.util.LinkedList(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(activityC10362xd5e3feb2.f145444g, ","));
            ((za0.i) yVar).getClass();
            o41.a aVar = new o41.a(str, str2, str3, linkedList);
            aVar.f152182i = true;
            aVar.l().f(activityC10362xd5e3feb2).h(new com.p314xaae8f345.mm.p648x55baa833.ui.ua(this));
        } else {
            kn.d dVar = new kn.d(activityC10362xd5e3feb2.f145454t, activityC10362xd5e3feb2.f145449o, activityC10362xd5e3feb2.f145455u, activityC10362xd5e3feb2.f145457w, new java.util.LinkedList(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(activityC10362xd5e3feb2.f145444g.split(","))));
            dVar.f152182i = true;
            dVar.l().f(activityC10362xd5e3feb2).h(new com.p314xaae8f345.mm.p648x55baa833.ui.va(this));
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
