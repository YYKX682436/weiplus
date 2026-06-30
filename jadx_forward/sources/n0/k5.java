package n0;

/* loaded from: classes16.dex */
public final class k5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {
    public final /* synthetic */ android.view.View C;
    public final /* synthetic */ int D;
    public final /* synthetic */ android.widget.ImageView E;
    public final /* synthetic */ rx4.v0 F;
    public final /* synthetic */ rx4.u0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(android.view.View view, int i17, android.widget.ImageView imageView, rx4.v0 v0Var, rx4.u0 u0Var) {
        super(2);
        this.C = view;
        this.D = i17;
        this.E = imageView;
        this.F = v0Var;
        this.G = u0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((cp0.n) obj, "<anonymous parameter 0>");
        android.view.View view = this.C;
        if (view.getParent() != null && bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            float width = bitmap.getWidth() / bitmap.getHeight();
            int i17 = this.D;
            android.widget.ImageView imageView = this.E;
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = (int) (width * i17);
            layoutParams.height = i17;
            imageView.setLayoutParams(layoutParams);
            imageView.setVisibility(0);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.sh6);
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f564879sh4);
            rx4.v0 v0Var = this.F;
            if (v0Var.f482835c.length() > 0) {
                textView.setText(v0Var.f482835c);
            } else {
                textView.setVisibility(8);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachRecommendBoxUIC$renderBanner$2", "invoke", "(Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachRecommendBoxUIC$renderBanner$2", "invoke", "(Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            rx4.u0 u0Var = this.G;
            view.setOnClickListener(new n0.j5(u0Var, v0Var));
            android.view.View view2 = this.C;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachRecommendBoxUIC$renderBanner$2", "invoke", "(Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachRecommendBoxUIC$renderBanner$2", "invoke", "(Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            boolean z17 = u0Var.f482822p;
            if (!z17) {
                if (!z17) {
                    u0Var.f482822p = true;
                    java.lang.String str = "1|1|" + fp.s0.b("618活动入口", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + "||0|" + fp.s0.b("618活动入口", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + "|||banner|";
                    java.lang.String str2 = "2|78|" + fp.s0.b("618活动入口", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    android.app.Activity context = u0Var.m80379x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.h2.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    rx4.h2.r7((rx4.h2) a17, vu4.a.f521772f, str2, str, u0Var.f482816g, null, 16, null);
                }
                java.lang.String str3 = v0Var.f482843k;
                if (!(str3.length() == 0)) {
                    boolean z18 = str3.length() == 0;
                    java.lang.String str4 = u0Var.f482813d;
                    if (!z18) {
                        try {
                            ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).Ri(new pq.a(u0Var.m158354x19263085()), str3, null, new rx4.q0(u0Var));
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str4, "tryPreloadBannerCgi failed: " + th6.getMessage(), th6);
                        }
                    }
                    if (!(str3.length() == 0)) {
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "tryPreloadBannerWxa: dispatch silent preload via IEcsOpenService.open");
                            pq.a aVar = new pq.a(u0Var.m158354x19263085());
                            bw5.h8 h8Var = aVar.f439085b;
                            bw5.g8 g8Var = new bw5.g8();
                            g8Var.f109245e = true;
                            g8Var.f109255r[2] = true;
                            h8Var.e(g8Var);
                            ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).Ai(aVar, str3, new rx4.r0(u0Var));
                        } catch (java.lang.Throwable th7) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str4, "tryPreloadBannerWxa: failed: " + th7.getMessage(), th7);
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
