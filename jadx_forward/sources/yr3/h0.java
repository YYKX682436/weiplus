package yr3;

/* loaded from: classes11.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.i0 f546366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f546367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f546368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f546369g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f546370h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(yr3.i0 i0Var, r45.s5 s5Var, wr3.n0 n0Var, boolean z17, int i17) {
        super(1);
        this.f546366d = i0Var;
        this.f546367e = s5Var;
        this.f546368f = n0Var;
        this.f546369g = z17;
        this.f546370h = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        if (((java.lang.Boolean) obj).booleanValue()) {
            wr3.n0 n0Var = this.f546368f;
            boolean z17 = this.f546369g;
            int i18 = this.f546370h;
            yr3.i0 i0Var = this.f546366d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.f546388e, "filling FeaturedMsgSinglePicViewHolder");
            android.view.View view = i0Var.f546391h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = i0Var.f546395o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.s5 s5Var = this.f546367e;
            r45.o5 o5Var = (r45.o5) s5Var.f467047i.f464287e.get(0);
            r45.l5 l5Var = s5Var.f467047i.f464286d;
            yr3.w wVar = yr3.w.f546592a;
            android.content.Context context = i0Var.f546389f;
            android.widget.TextView textView = i0Var.f546396p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            android.widget.ImageView imageView = i0Var.f546397q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            android.view.View view3 = i0Var.f546394n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
            wVar.i(context, textView, imageView, s5Var, n0Var, view3);
            android.content.Context context2 = i0Var.f546389f;
            wr3.t0 t0Var = i0Var.f546387d;
            android.view.View itemView = i0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o5Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l5Var);
            wVar.j(context2, t0Var, itemView, s5Var, o5Var, l5Var, (r29 & 64) != 0 ? 0 : i0Var.m8188xa86cd69f(), n0Var, z17, i18, (r29 & 1024) != 0 ? sr3.a.f493362e : null, (r29 & 2048) != 0 ? false : false);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = o5Var.f463446d;
            ((ke0.e) xVar).getClass();
            i0Var.f546399s.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(i0Var.f546389f, str));
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o5Var.A);
            android.widget.TextView textView2 = i0Var.f546398r;
            if (K0) {
                textView2.setVisibility(8);
                i17 = 0;
            } else {
                i17 = 0;
                textView2.setVisibility(0);
                textView2.setText(o5Var.A);
            }
            int i19 = o5Var.H;
            android.widget.TextView textView3 = i0Var.f546401u;
            if (i19 > 0) {
                textView3.setVisibility(i17);
                textView3.setText(java.lang.String.valueOf(o5Var.H));
            } else {
                textView3.setVisibility(8);
                textView3.setText("");
            }
            android.widget.ImageView imageView2 = i0Var.f546400t;
            imageView2.getLayoutParams().height = (int) ((fq1.e.f347040a.e(r2) - i65.a.b(r2, 16)) * 0.5625d);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o5Var.L) ? o5Var.f463453m : o5Var.L;
            o11.f fVar = new o11.f();
            fVar.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.f562534hk;
            fVar.f423612c = true;
            n11.a.b().h(str2, imageView2, fVar.a());
        }
        return jz5.f0.f384359a;
    }
}
