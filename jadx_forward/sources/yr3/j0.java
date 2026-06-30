package yr3;

/* loaded from: classes11.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.k0 f546407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f546408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f546409f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f546410g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f546411h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(yr3.k0 k0Var, r45.s5 s5Var, wr3.n0 n0Var, boolean z17, int i17) {
        super(1);
        this.f546407d = k0Var;
        this.f546408e = s5Var;
        this.f546409f = n0Var;
        this.f546410g = z17;
        this.f546411h = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            r45.s5 s5Var = this.f546408e;
            wr3.n0 n0Var = this.f546409f;
            boolean z17 = this.f546410g;
            int i17 = this.f546411h;
            yr3.k0 k0Var = this.f546407d;
            java.lang.String str = k0Var.f546428e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "filling FeaturedMsgSingleTextViewHolder");
            android.view.View view = k0Var.f546434n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleTextViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleTextViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = k0Var.f546438r;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleTextViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleTextViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wr3.n0 n0Var2 = wr3.n0.f530376g;
            android.view.View view3 = k0Var.f546443w;
            if (n0Var == n0Var2) {
                a84.y0.p(view3, true);
            } else {
                a84.y0.p(view3, false);
            }
            yr3.w wVar = yr3.w.f546592a;
            android.content.Context context = k0Var.f546429f;
            android.widget.TextView textView = k0Var.f546431h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            android.widget.ImageView imageView = k0Var.f546432i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            android.view.View view4 = k0Var.f546437q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
            wVar.i(context, textView, imageView, s5Var, n0Var, view4);
            view4.setPadding(i65.a.b(view4.getContext(), 12), i65.a.b(view4.getContext(), 16), 0, i65.a.b(view4.getContext(), 12));
            if (s5Var.f467042d.f472324e == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "filling old text");
                k0Var.i(s5Var.f467043e.f469425d.toString(), s5Var, null, n0Var, z17, i17);
            } else {
                r45.o5 o5Var = (r45.o5) s5Var.f467047i.f464287e.get(0);
                r45.l5 l5Var = s5Var.f467047i.f464286d;
                android.content.Context context2 = k0Var.f546429f;
                wr3.t0 t0Var = k0Var.f546427d;
                android.view.View itemView = k0Var.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o5Var);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l5Var);
                wVar.j(context2, t0Var, itemView, s5Var, o5Var, l5Var, (r29 & 64) != 0 ? 0 : k0Var.m8188xa86cd69f(), n0Var, z17, i17, (r29 & 1024) != 0 ? sr3.a.f493362e : null, (r29 & 2048) != 0 ? false : false);
                boolean b17 = x51.t1.b(o5Var.A);
                android.widget.TextView textView2 = k0Var.f546439s;
                if (b17) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    textView2.setText(o5Var.A);
                }
                k0Var.i(o5Var.f463446d.toString(), s5Var, o5Var.Y, n0Var, z17, i17);
            }
        }
        return jz5.f0.f384359a;
    }
}
