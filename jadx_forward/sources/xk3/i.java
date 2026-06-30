package xk3;

/* loaded from: classes8.dex */
public abstract class i extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f536572e;

    /* renamed from: f, reason: collision with root package name */
    public final vk3.a f536573f;

    /* renamed from: g, reason: collision with root package name */
    public final yo0.i f536574g;

    /* renamed from: h, reason: collision with root package name */
    public final int f536575h;

    public i(int i17, vk3.a aVar) {
        this.f536572e = i17;
        this.f536573f = aVar;
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        this.f536574g = fVar.a();
        this.f536575h = 5;
    }

    @Override // in5.r
    public int e() {
        return this.f536572e;
    }

    @Override // in5.r
    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        android.view.View findViewById;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
        int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MinusScreenRoundCornerConvert", "onCreateViewHolder itemCount:" + mo1894x7e414b06 + ", layoutPosition:" + holder.m8186xceeefb69());
        if (mo1894x7e414b06 < 2 || (findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.hhd)) == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        zk3.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.C;
        layoutParams.height = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.L;
        findViewById.getLayoutParams().width = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.K;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvd);
        if (c22646x1e9ca55 != null) {
            c22646x1e9ca55.getLayoutParams().height = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.Q;
        }
        findViewById.requestLayout();
    }

    public java.lang.String n(android.content.Context context, uk3.a item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        return item.f510057d.v0().m75945x2fec8307(0);
    }

    public final java.lang.String o(int i17) {
        if (i17 < 10) {
            return "0" + i17;
        }
        return i17 + "";
    }

    public void p(in5.s0 holder, uk3.a item, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvm);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvj);
        android.widget.TextView textView2 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvl);
        com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvo);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5.C16612x87a7d185 c16612x87a7d185 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5.C16612x87a7d185) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jva);
        android.widget.TextView textView3 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvk);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvd);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvg);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ui8);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.jvf);
        if (imageView != null) {
            imageView.setOnClickListener(new xk3.h(this, item, holder));
        }
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        textView.setText(n(context, item));
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = item.f510057d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16601x7ed0e40c.v0().m75945x2fec8307(1))) {
            textView2.setVisibility(8);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = com.p314xaae8f345.mm.ui.zk.a(context, 16);
            findViewById.setLayoutParams(marginLayoutParams);
        } else {
            textView2.setVisibility(0);
            textView2.setText(c16601x7ed0e40c.v0().m75945x2fec8307(1));
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = com.p314xaae8f345.mm.ui.zk.a(context, 6);
            findViewById.setLayoutParams(marginLayoutParams2);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16601x7ed0e40c.v0().m75945x2fec8307(8))) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(c16601x7ed0e40c.v0().m75945x2fec8307(8));
            textView3.setVisibility(0);
        }
        c16612x87a7d185.m67202x84d007a0(this instanceof xk3.v);
        if (!(this instanceof xk3.o)) {
            if (c16601x7ed0e40c.v0().m75933x41a8a7f2(7)) {
                c22699x3dcdb352.setVisibility(0);
                c21405x85fc1ce0.setVisibility(8);
                c22646x1e9ca55.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560976zf));
                c22699x3dcdb352.setImageResource(wk3.a.f528490a.b(c16601x7ed0e40c.f66793x2262335f));
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0 u0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a;
                java.lang.String str2 = c16601x7ed0e40c.f66791xc8a07680;
                str = str2 != null ? str2 : "";
                java.lang.String b17 = u0Var.b(str);
                if (!com.p314xaae8f345.mm.vfs.w6.j(b17)) {
                    b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.v0.f232145a + str;
                }
                n11.a.b().a(b17, c21405x85fc1ce0);
            } else {
                c22699x3dcdb352.setVisibility(8);
                c21405x85fc1ce0.setVisibility(0);
                c22646x1e9ca55.setBackground(null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = item.f510057d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0 u0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a;
                java.lang.String str3 = c16601x7ed0e40c2 != null ? c16601x7ed0e40c2.f66791xc8a07680 : null;
                str = str3 != null ? str3 : "";
                java.lang.String b18 = u0Var2.b(str);
                if (!com.p314xaae8f345.mm.vfs.w6.j(b18)) {
                    b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.v0.f232145a + str;
                }
                java.lang.String str4 = b18;
                n11.a.b().j(str4, c21405x85fc1ce0, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232040b, new xk3.g(this, holder, str4, c21405x85fc1ce0, c16601x7ed0e40c2, c22699x3dcdb352, c22646x1e9ca55));
            }
        }
        c22699x3dcdb3522.setImageResource(wk3.a.f528490a.a(c16601x7ed0e40c.f66793x2262335f));
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.jvf);
        if (imageView2 != null) {
            imageView2.setTag(com.p314xaae8f345.mm.R.id.jxk, java.lang.Integer.valueOf(c16601x7ed0e40c.f66793x2262335f));
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.hhd);
        if (p17 != null) {
            p17.setTag(com.p314xaae8f345.mm.R.id.jxl, java.lang.Integer.valueOf(c16601x7ed0e40c.f66793x2262335f));
        }
    }

    public void q(android.graphics.Bitmap bitmap, android.widget.ImageView imgView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgView, "imgView");
    }
}
