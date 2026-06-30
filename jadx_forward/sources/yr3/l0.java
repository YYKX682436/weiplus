package yr3;

/* loaded from: classes11.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.m0 f546453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f546454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f546455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f546456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f546457h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(yr3.m0 m0Var, r45.s5 s5Var, wr3.n0 n0Var, boolean z17, int i17) {
        super(1);
        this.f546453d = m0Var;
        this.f546454e = s5Var;
        this.f546455f = n0Var;
        this.f546456g = z17;
        this.f546457h = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        int i18;
        if (((java.lang.Boolean) obj).booleanValue()) {
            wr3.n0 n0Var = this.f546455f;
            boolean z17 = this.f546456g;
            int i19 = this.f546457h;
            yr3.m0 m0Var = this.f546453d;
            java.lang.String str = m0Var.f546466e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "filling FeaturedMsgThreePicViewHolder");
            android.view.View view = m0Var.f546469h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgThreePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgThreePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = m0Var.f546473o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgThreePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgThreePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wr3.n0 n0Var2 = wr3.n0.f530376g;
            android.view.View view3 = m0Var.f546483y;
            if (n0Var == n0Var2) {
                a84.y0.p(view3, true);
            } else {
                a84.y0.p(view3, false);
            }
            r45.s5 s5Var = this.f546454e;
            r45.o5 o5Var = (r45.o5) s5Var.f467047i.f464287e.get(0);
            r45.l5 l5Var = s5Var.f467047i.f464286d;
            yr3.w wVar = yr3.w.f546592a;
            android.content.Context context = m0Var.f546467f;
            android.widget.TextView textView = m0Var.f546474p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            android.widget.ImageView imageView = m0Var.f546475q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            android.view.View view4 = m0Var.f546472n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
            wVar.i(context, textView, imageView, s5Var, n0Var, view4);
            android.content.Context context2 = m0Var.f546467f;
            wr3.t0 t0Var = m0Var.f546465d;
            android.view.View itemView = m0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o5Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l5Var);
            wVar.j(context2, t0Var, itemView, s5Var, o5Var, l5Var, (r29 & 64) != 0 ? 0 : m0Var.m8188xa86cd69f(), n0Var, z17, i19, (r29 & 1024) != 0 ? sr3.a.f493362e : null, (r29 & 2048) != 0 ? false : false);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = o5Var.f463446d;
            ((ke0.e) xVar).getClass();
            m0Var.f546477s.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m0Var.f546467f, str2));
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o5Var.A);
            android.widget.TextView textView2 = m0Var.f546476r;
            if (K0) {
                i17 = 8;
                textView2.setVisibility(8);
                i18 = 0;
            } else {
                i17 = 8;
                i18 = 0;
                textView2.setVisibility(0);
                textView2.setText(o5Var.A);
            }
            int i27 = o5Var.H;
            android.widget.TextView textView3 = m0Var.f546482x;
            if (i27 > 0) {
                textView3.setVisibility(i18);
                textView3.setText(java.lang.String.valueOf(o5Var.H));
            } else {
                textView3.setVisibility(i17);
                textView3.setText("");
            }
            m0Var.f546478t.getLayoutParams().height = (int) (((((fq1.e.f347040a.e(r2) - i65.a.b(r2, 16)) - i65.a.b(r2, i17)) / 3.0f) / 3.0f) * 4.0f);
            if (o5Var.K.f456442d.size() >= 3) {
                java.lang.String str3 = ((r45.t5) o5Var.K.f456442d.get(i18)).f467681g;
                java.lang.String str4 = ((r45.t5) o5Var.K.f456442d.get(1)).f467681g;
                java.lang.String str5 = ((r45.t5) o5Var.K.f456442d.get(2)).f467681g;
                o11.f fVar = new o11.f();
                fVar.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.f562534hk;
                fVar.f423612c = true;
                n11.a.b().h(str3, m0Var.f546479u, fVar.a());
                o11.f fVar2 = new o11.f();
                fVar2.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.f562534hk;
                fVar2.f423612c = true;
                n11.a.b().h(str4, m0Var.f546480v, fVar2.a());
                o11.f fVar3 = new o11.f();
                fVar3.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.f562534hk;
                fVar3.f423612c = true;
                n11.a.b().h(str5, m0Var.f546481w, fVar3.a());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "PicInfoList size less 3");
            }
        }
        return jz5.f0.f384359a;
    }
}
