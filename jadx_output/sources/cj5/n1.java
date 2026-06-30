package cj5;

/* loaded from: classes.dex */
public class n1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f42199d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42199d = jz5.h.b(new cj5.m1(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList arrayList;
        int i19;
        j75.f Q6;
        java.util.ArrayList arrayList2;
        int i27;
        java.util.ArrayList arrayList3;
        super.onActivityResult(i17, i18, intent);
        if (intent == null || i17 != 7) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        jz5.g gVar = this.f42199d;
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) gVar).getValue()).k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 == null || (arrayList3 = a17.f152065o) == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add(((ri5.j) it.next()).f396111f);
            }
            arrayList = arrayList4;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView k18 = ((em.l2) ((jz5.n) gVar).getValue()).k();
        kotlin.jvm.internal.o.f(k18, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a18 = xm3.u0.a(k18);
        if (a18 == null || (arrayList2 = a18.f152065o) == null) {
            i19 = 0;
        } else {
            if (arrayList2.isEmpty()) {
                i27 = 0;
            } else {
                java.util.Iterator it6 = arrayList2.iterator();
                i27 = 0;
                while (it6.hasNext()) {
                    if (((ri5.j) it6.next()).f396126w && (i27 = i27 + 1) < 0) {
                        kz5.c0.o();
                        throw null;
                    }
                }
            }
            i19 = i27;
        }
        java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.B3(new wi5.z0(i19 - f07.size()));
        }
        if (arrayList != null) {
            for (java.lang.String str : kz5.n0.G0(arrayList, kz5.n0.X0(r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null)))) {
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView c17 = ((em.l2) ((jz5.n) gVar).getValue()).c();
                if (str != null) {
                    c17.g(str, false, false);
                } else {
                    c17.getClass();
                }
            }
        }
        com.tencent.mars.xlog.Log.i("SelectContactHalfScreenListUIC", "onActivityResult:usernames:" + stringExtra + ' ');
        j75.f Q63 = Q6();
        if (Q63 != null) {
            Q63.B3(new wi5.m0(r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null), -1));
        }
        if (intent.getIntExtra("INTENT_KEY_ACTION", 0) != 1 || (Q6 = Q6()) == null) {
            return;
        }
        Q6.B3(new wi5.c());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new cj5.l1(this));
    }
}
