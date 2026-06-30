package ya2;

/* loaded from: classes.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f542043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.content.Context context) {
        super(1);
        this.f542043d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        r45.mw1 mw1Var;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean z17 = fVar != null && fVar.f152148a == 0;
        android.content.Context context = this.f542043d;
        if (z17 && fVar.f152149b == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderGetLiveIncomePage success: ");
            java.lang.Object obj2 = (r45.j71) fVar.f152151d;
            if (obj2 == null) {
                obj2 = "";
            }
            sb6.append(pm0.b0.g(obj2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", sb6.toString());
            r45.j71 j71Var = (r45.j71) fVar.f152151d;
            if (j71Var == null || (m75941xfb8219142 = j71Var.m75941xfb821914(1)) == null) {
                i17 = 0;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : m75941xfb8219142) {
                    if (((r45.mw1) obj3).m75939xb282bd08(0) == 4) {
                        arrayList.add(obj3);
                    }
                }
                i17 = arrayList.size();
            }
            if (i17 <= 1) {
                r45.j71 j71Var2 = (r45.j71) fVar.f152151d;
                if (j71Var2 == null || (m75941xfb821914 = j71Var2.m75941xfb821914(1)) == null) {
                    mw1Var = null;
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj4 : m75941xfb821914) {
                        if (((r45.mw1) obj4).m75939xb282bd08(0) == 4) {
                            arrayList2.add(obj4);
                        }
                    }
                    mw1Var = (r45.mw1) kz5.n0.Z(arrayList2);
                }
                js4.i iVar = (js4.i) gm0.j1.s(js4.i.class);
                android.content.Context context2 = this.f542043d;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("INCOME_RESP_DATA", ((r45.j71) fVar.f152151d).m75962x8b6d8abc());
                int m75939xb282bd08 = mw1Var != null ? mw1Var.m75939xb282bd08(1) : 1;
                r45.j71 j71Var3 = (r45.j71) fVar.f152151d;
                boolean m75933x41a8a7f2 = j71Var3 != null ? j71Var3.m75933x41a8a7f2(3) : false;
                r45.j71 j71Var4 = (r45.j71) fVar.f152151d;
                ((ms4.z) iVar).h(context2, intent, "", m75939xb282bd08, m75933x41a8a7f2, j71Var4 != null ? j71Var4.m75945x2fec8307(2) : null);
            } else {
                android.content.Context context3 = this.f542043d;
                android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14001xab92ce6f.class);
                intent2.putExtra("PARAMS_DATA", ((r45.j71) fVar.f152151d).m75962x8b6d8abc());
                if (!(context instanceof android.app.Activity)) {
                    intent2.addFlags(268435456);
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent2);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(context3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/api/FinderRouterApi$getIncomePageInfoAndEnterIncome$1", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context3.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(context3, "com/tencent/mm/plugin/finder/api/FinderRouterApi$getIncomePageInfoAndEnterIncome$1", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderRouterApi", "CgiFinderGetLiveIncomePage failed");
            db5.t7.g(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cnc));
        }
        return jz5.f0.f384359a;
    }
}
