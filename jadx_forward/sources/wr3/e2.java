package wr3;

/* loaded from: classes11.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr3.f2 f530304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f530305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f530306f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f530307g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f530308h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(wr3.f2 f2Var, r45.s5 s5Var, wr3.n0 n0Var, boolean z17, int i17) {
        super(1);
        this.f530304d = f2Var;
        this.f530305e = s5Var;
        this.f530306f = n0Var;
        this.f530307g = z17;
        this.f530308h = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            wr3.n0 n0Var = this.f530306f;
            boolean z17 = this.f530307g;
            int i17 = this.f530308h;
            wr3.f2 f2Var = this.f530304d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f2Var.f530324e, "filling FeaturedMsgSingleVideoViewHolder");
            android.view.View view = f2Var.f530329m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/FeaturedMsgSingleVideoViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/list/FeaturedMsgSingleVideoViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = f2Var.f530333q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/FeaturedMsgSingleVideoViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/list/FeaturedMsgSingleVideoViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wr3.n0 n0Var2 = wr3.n0.f530376g;
            android.view.View view3 = f2Var.f530338v;
            if (n0Var == n0Var2) {
                a84.y0.p(view3, true);
            } else {
                a84.y0.p(view3, false);
            }
            r45.s5 s5Var = this.f530305e;
            r45.o5 o5Var = (r45.o5) s5Var.f467047i.f464287e.get(0);
            r45.l5 l5Var = s5Var.f467047i.f464286d;
            yr3.w wVar = yr3.w.f546592a;
            android.content.Context context = f2Var.f530325f;
            android.widget.TextView textView = f2Var.f530326g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            android.widget.ImageView imageView = f2Var.f530327h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            android.view.View view4 = f2Var.f530332p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
            wVar.i(context, textView, imageView, s5Var, n0Var, view4);
            f2Var.f530334r.setText(o5Var.A);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = o5Var.f463446d;
            ((ke0.e) xVar).getClass();
            f2Var.f530336t.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(f2Var.f530325f, str));
            f2Var.f530335s.setText(ot0.g0.d(o5Var.f463472z));
            android.widget.ImageView imageView2 = f2Var.f530337u;
            imageView2.getLayoutParams().height = (int) ((fq1.e.f347040a.e(r2) - i65.a.b(r2, 16)) * 0.5625d);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o5Var.L) ? o5Var.f463453m : o5Var.L;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f2Var.f530339w, str2)) {
                f2Var.f530339w = str2;
                n11.a.b().h(str2, imageView2, wVar.d());
                android.content.Context context2 = f2Var.f530325f;
                wr3.t0 t0Var = f2Var.f530323d;
                android.view.View itemView = f2Var.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l5Var);
                wVar.j(context2, t0Var, itemView, s5Var, o5Var, l5Var, (r29 & 64) != 0 ? 0 : f2Var.m8188xa86cd69f(), n0Var, z17, i17, (r29 & 1024) != 0 ? sr3.a.f493362e : null, (r29 & 2048) != 0 ? false : false);
            }
        }
        return jz5.f0.f384359a;
    }
}
