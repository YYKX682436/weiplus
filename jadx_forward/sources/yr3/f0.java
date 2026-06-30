package yr3;

/* loaded from: classes11.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.g0 f546340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f546341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f546342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f546343g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f546344h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(yr3.g0 g0Var, r45.s5 s5Var, wr3.n0 n0Var, boolean z17, int i17) {
        super(1);
        this.f546340d = g0Var;
        this.f546341e = s5Var;
        this.f546342f = n0Var;
        this.f546343g = z17;
        this.f546344h = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            wr3.n0 n0Var = this.f546342f;
            boolean z17 = this.f546343g;
            int i17 = this.f546344h;
            yr3.g0 g0Var = this.f546340d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g0Var.f546349e, "filling FeaturedMsgSinglePicArticleViewHolder");
            android.view.View view = g0Var.f546352h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicArticleViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicArticleViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = g0Var.f546356o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicArticleViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicArticleViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wr3.n0 n0Var2 = wr3.n0.f530376g;
            android.view.View view3 = g0Var.f546362u;
            if (n0Var == n0Var2) {
                a84.y0.p(view3, true);
            } else {
                a84.y0.p(view3, false);
            }
            r45.s5 s5Var = this.f546341e;
            r45.o5 o5Var = (r45.o5) s5Var.f467047i.f464287e.get(0);
            r45.l5 l5Var = s5Var.f467047i.f464286d;
            yr3.w wVar = yr3.w.f546592a;
            android.content.Context context = g0Var.f546350f;
            android.widget.TextView textView = g0Var.f546357p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            android.widget.ImageView imageView = g0Var.f546358q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            android.view.View view4 = g0Var.f546355n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
            wVar.i(context, textView, imageView, s5Var, n0Var, view4);
            android.content.Context context2 = g0Var.f546350f;
            wr3.i iVar = g0Var.f546348d;
            android.view.View itemView = g0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o5Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l5Var);
            wVar.j(context2, iVar, itemView, s5Var, o5Var, l5Var, (r29 & 64) != 0 ? 0 : g0Var.m8188xa86cd69f(), n0Var, z17, i17, (r29 & 1024) != 0 ? sr3.a.f493362e : null, (r29 & 2048) != 0 ? false : false);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = o5Var.f463446d;
            ((ke0.e) xVar).getClass();
            g0Var.f546360s.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g0Var.f546350f, str));
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o5Var.A);
            android.widget.TextView textView2 = g0Var.f546359r;
            if (K0) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(o5Var.A);
            }
            android.widget.ImageView imageView2 = g0Var.f546361t;
            imageView2.getLayoutParams().height = (int) ((fq1.e.f347040a.e(r2) - i65.a.b(r2, 16)) * 0.428f);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o5Var.f463455o) ? o5Var.f463453m : o5Var.f463455o;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g0Var.f546363v, str2)) {
                g0Var.f546363v = str2;
                n11.a.b().h(str2, imageView2, wVar.d());
            }
        }
        return jz5.f0.f384359a;
    }
}
