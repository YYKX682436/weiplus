package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ql implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public long f286912d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.q f286913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ue4.z f286914f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f286915g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286916h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wl f286917i;

    public ql(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wl wlVar, ot0.q qVar, ue4.z zVar, boolean z17, yb5.d dVar) {
        this.f286917i = wlVar;
        this.f286913e = qVar;
        this.f286914f = zVar;
        this.f286915g = z17;
        this.f286916h = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (java.lang.System.currentTimeMillis() - this.f286912d <= 2000) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f286912d = java.lang.System.currentTimeMillis();
        ot0.q qVar = this.f286913e;
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemHardDeviceMsg", "onClick: content is null");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ue4.z zVar = this.f286914f;
        if (zVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemHardDeviceMsg", "onClick: finalSportsAppMsgContent == null");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z17 = this.f286915g;
        yb5.d dVar = this.f286916h;
        if (z17) {
            a42.g.f82739a.b(dVar.g(), zVar.f508476l, zVar.f508477m, zVar.f508478n, zVar.f508479o);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemHardDeviceMsg", "onClick: setTextStatusLl");
            int i17 = qVar.D0;
            java.lang.String str = zVar.f508468d;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wl wlVar = this.f286917i;
            if (wlVar.d0(i17, str)) {
                db5.t7.i(dVar.g(), dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c4z), com.p314xaae8f345.mm.R.raw.f80141xebd5ba06);
            } else {
                int parseInt = java.lang.Integer.parseInt(qVar.f430236r0);
                jx3.f.INSTANCE.d(13168, 44, 0, java.lang.Integer.valueOf(parseInt), zVar.f508466b);
                java.lang.String str2 = zVar.f508466b;
                java.lang.String str3 = zVar.f508467c;
                int parseInt2 = java.lang.Integer.parseInt(qVar.f430236r0);
                if (!android.text.TextUtils.isEmpty(str2)) {
                    xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
                    android.app.Activity context = wlVar.f287483s.g();
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ul ulVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ul(wlVar, str2, parseInt2, str3);
                    ((we0.j1) l0Var).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    if (str2 != null) {
                        ej4.c cVar = new ej4.c(str2, 1);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 P = db5.e1.P(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), 3, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), false, true, new we0.h1(cVar));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(P, "showProgressDlg(...)");
                        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getNetSceneQueue(...)");
                        ii4.a.a(d17, cVar, null, new we0.g1(cVar, ulVar, P));
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
