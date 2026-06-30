package wt1;

/* loaded from: classes4.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f530816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f530817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f530818f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wt1.j0 f530819g;

    public h0(wt1.j0 j0Var, java.lang.String str, boolean z17, java.util.ArrayList arrayList) {
        this.f530819g = j0Var;
        this.f530816d = str;
        this.f530817e = z17;
        this.f530818f = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set;
        synchronized (this.f530819g.f530830d) {
            set = (java.util.Set) ((java.util.HashMap) this.f530819g.f530830d).get(this.f530816d);
        }
        if (set == null || set.size() <= 0) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(set);
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            wt1.i0 i0Var = (wt1.i0) it.next();
            if (i0Var != null) {
                boolean z17 = this.f530817e;
                java.util.ArrayList arrayList = this.f530818f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a activityC13058x9cebb75a = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a) i0Var;
                android.app.ProgressDialog progressDialog = activityC13058x9cebb75a.f176436e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    activityC13058x9cebb75a.f176436e = null;
                }
                if (arrayList != null) {
                    arrayList.size();
                }
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardShopUI", "onGotCardShop fail");
                } else if (arrayList == null || arrayList.size() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardShopUI", "list == null || list.size() == 0");
                } else {
                    java.util.ArrayList arrayList2 = activityC13058x9cebb75a.f176437f;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        android.view.View view = activityC13058x9cebb75a.f176443o;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/CardShopUI", "onGotCardShop", "(ZLjava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardShopUI", "onGotCardShop", "(ZLjava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        android.view.View view2 = activityC13058x9cebb75a.f176443o;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/CardShopUI", "onGotCardShop", "(ZLjava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardShopUI", "onGotCardShop", "(ZLjava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    activityC13058x9cebb75a.f176441m.notifyDataSetChanged();
                }
            }
        }
    }
}
