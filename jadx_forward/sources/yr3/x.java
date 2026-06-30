package yr3;

/* loaded from: classes11.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.y f546598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f546599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f546600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f546601g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f546602h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f546603i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(yr3.y yVar, r45.s5 s5Var, wr3.n0 n0Var, int i17, boolean z17, int i18) {
        super(1);
        this.f546598d = yVar;
        this.f546599e = s5Var;
        this.f546600f = n0Var;
        this.f546601g = i17;
        this.f546602h = z17;
        this.f546603i = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yr3.j1 j1Var;
        java.util.LinkedList linkedList;
        if (((java.lang.Boolean) obj).booleanValue()) {
            r45.s5 s5Var = this.f546599e;
            wr3.n0 n0Var = this.f546600f;
            int i17 = this.f546601g;
            boolean z17 = this.f546602h;
            int i18 = this.f546603i;
            yr3.y yVar = this.f546598d;
            android.view.View view = yVar.f546617o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgCompoundViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;IZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgCompoundViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;IZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = yVar.f546620r;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgCompoundViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;IZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgCompoundViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;IZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yr3.w wVar = yr3.w.f546592a;
            android.content.Context context = yVar.f546610e;
            android.widget.TextView textView = yVar.f546612g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            android.widget.ImageView imageView = yVar.f546614i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            android.view.View view3 = yVar.f546613h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
            wVar.i(context, textView, imageView, s5Var, n0Var, view3);
            if (s5Var.f467047i.f464287e.size() > 0) {
                int i19 = ((r45.o5) s5Var.f467047i.f464287e.get(0)).f463456p;
                android.view.View view4 = yVar.f546611f;
                if (i19 == 0) {
                    view4.setPadding(i65.a.b(view4.getContext(), 12), i65.a.b(view4.getContext(), 16), 0, i65.a.b(view4.getContext(), 12));
                } else {
                    view4.setPadding(i65.a.b(view4.getContext(), 12), i65.a.b(view4.getContext(), 12), 0, i65.a.b(view4.getContext(), 12));
                }
            }
            r45.l5 l5Var = s5Var.f467047i.f464286d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.LinkedList DetailInfo = s5Var.f467047i.f464287e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(DetailInfo, "DetailInfo");
            int i27 = 0;
            for (java.lang.Object obj2 : DetailInfo) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.o5 o5Var = (r45.o5) obj2;
                int i29 = o5Var.f463456p;
                yr3.j1 j1Var2 = yr3.j1.f546412e;
                if (i27 == 0 && i29 == 5) {
                    j1Var = yr3.j1.f546412e;
                } else {
                    if (i27 == 0 && i29 == 8) {
                        r45.l5 l5Var2 = s5Var.f467047i.f464286d;
                        if ((l5Var2 != null ? l5Var2.f460675h : 0) == 1) {
                            r45.g6 g6Var = o5Var.K;
                            if (((g6Var == null || (linkedList = g6Var.f456442d) == null) ? 0 : linkedList.size()) >= 3 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.t5) o5Var.K.f456442d.get(0)).f467681g)) {
                                j1Var = yr3.j1.f546421q;
                            }
                        }
                    }
                    j1Var = (i27 == 0 && i29 == 8) ? yr3.j1.f546413f : (i27 == 0 && i29 == 19) ? yr3.j1.f546418n : i29 == 5 ? yr3.j1.f546415h : i29 == 8 ? yr3.j1.f546416i : i29 == 7 ? yr3.j1.f546417m : i29 == 19 ? yr3.j1.f546419o : (i27 == 0 && i29 == 0 && s5Var.f467047i.f464286d.f460675h == 1) ? yr3.j1.f546420p : yr3.j1.f546414g;
                }
                yr3.c cVar = new yr3.c(j1Var, o5Var);
                cVar.f546268c = s5Var;
                arrayList3.add(cVar);
                i27 = i28;
            }
            if (arrayList3.size() > 3 && !s5Var.f467047i.f464286d.f460676i) {
                int i37 = s5Var.f467049n;
                yr3.o0[] o0VarArr = yr3.o0.f546498d;
                if (i37 == 0) {
                    arrayList4.addAll(arrayList3.subList(0, 3));
                    yr3.c cVar2 = new yr3.c(yr3.j1.f546422r, new r45.o5());
                    cVar2.f546268c = s5Var;
                    arrayList4.add(cVar2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.msg.p1965xb7c6cdac.C16906x21f473f c16906x21f473f = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.msg.p1965xb7c6cdac.C16906x21f473f(yVar.f546610e);
                    c16906x21f473f.Q(1);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = yVar.f546615m;
                    c1163xf1deaba4.mo7967x900dcbe1(c16906x21f473f);
                    c1163xf1deaba4.setNestedScrollingEnabled(false);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l5Var);
                    c1163xf1deaba4.mo7960x6cab2c8d(new yr3.b(l5Var, arrayList4, yVar.f546609d, i17, n0Var, z17, i18));
                }
            }
            arrayList4.addAll(arrayList3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.msg.p1965xb7c6cdac.C16906x21f473f c16906x21f473f2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.msg.p1965xb7c6cdac.C16906x21f473f(yVar.f546610e);
            c16906x21f473f2.Q(1);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = yVar.f546615m;
            c1163xf1deaba42.mo7967x900dcbe1(c16906x21f473f2);
            c1163xf1deaba42.setNestedScrollingEnabled(false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l5Var);
            c1163xf1deaba42.mo7960x6cab2c8d(new yr3.b(l5Var, arrayList4, yVar.f546609d, i17, n0Var, z17, i18));
        }
        return jz5.f0.f384359a;
    }
}
