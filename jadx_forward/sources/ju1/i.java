package ju1;

/* loaded from: classes9.dex */
public final class i extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public int f383262d;

    /* renamed from: e, reason: collision with root package name */
    public int f383263e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f383264f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f383265g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.LinearLayout f383266h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.LinearLayout f383267i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f383268m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 f383269n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f383270o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.View itemView, int i17) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        if (i17 == 0) {
            android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.bag);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            this.f383264f = (android.widget.TextView) findViewById;
            return;
        }
        if (i17 != 1) {
            if (i17 == 2 || i17 == 3 || i17 == 4) {
                android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.bvx);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                this.f383264f = (android.widget.TextView) findViewById2;
                android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.bvr);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
                this.f383265g = (android.widget.TextView) findViewById3;
                android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.bvv);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
                this.f383266h = (android.widget.LinearLayout) findViewById4;
                android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.buy);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
                this.f383267i = (android.widget.LinearLayout) findViewById5;
                android.view.View findViewById6 = itemView.findViewById(com.p314xaae8f345.mm.R.id.bvq);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
                this.f383269n = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5) findViewById6;
                android.view.View findViewById7 = itemView.findViewById(com.p314xaae8f345.mm.R.id.bvp);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
                this.f383270o = (android.widget.ImageView) findViewById7;
                android.view.View findViewById8 = itemView.findViewById(com.p314xaae8f345.mm.R.id.bvs);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
                this.f383268m = (android.widget.ImageView) findViewById8;
                return;
            }
            if (i17 != 5) {
                return;
            }
        }
        android.view.View findViewById9 = itemView.findViewById(com.p314xaae8f345.mm.R.id.bvx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f383264f = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = itemView.findViewById(com.p314xaae8f345.mm.R.id.bvr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f383265g = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = itemView.findViewById(com.p314xaae8f345.mm.R.id.bvv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.f383266h = (android.widget.LinearLayout) findViewById11;
        android.view.View findViewById12 = itemView.findViewById(com.p314xaae8f345.mm.R.id.buy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.f383267i = (android.widget.LinearLayout) findViewById12;
        android.view.View findViewById13 = itemView.findViewById(com.p314xaae8f345.mm.R.id.bvs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        this.f383268m = (android.widget.ImageView) findViewById13;
    }

    public final void i(java.util.List list, android.widget.LinearLayout linearLayout) {
        if (list == null || list.isEmpty()) {
            return;
        }
        linearLayout.setVisibility(0);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.st stVar = (r45.st) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc c13079x2ba3d9dc = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc(context);
            c13079x2ba3d9dc.setMinHeight(i65.a.b(context, 18));
            c13079x2ba3d9dc.setMinWidth(i65.a.b(context, 56));
            int b17 = i65.a.b(context, 8);
            int b18 = i65.a.b(context, 4);
            c13079x2ba3d9dc.setPadding(b17, b18, b17, b18);
            c13079x2ba3d9dc.setText(stVar.f467500d);
            c13079x2ba3d9dc.setTextSize(1, 10.0f);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stVar.f467501e)) {
                c13079x2ba3d9dc.setTextColor(-1);
            } else {
                c13079x2ba3d9dc.setTextColor(android.graphics.Color.parseColor(stVar.f467501e));
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stVar.f467502f)) {
                c13079x2ba3d9dc.m54468x17b1755e(lu1.a0.a(-16777216, 26));
            } else {
                c13079x2ba3d9dc.m54468x17b1755e(lu1.a0.b(stVar.f467502f, stVar.f467505i));
            }
            linearLayout.addView(c13079x2ba3d9dc);
        }
    }

    public final void j(java.lang.String str, java.util.List list, android.widget.LinearLayout linearLayout, int i17) {
        if (str == null || str.length() == 0) {
            if (list == null || list.isEmpty()) {
                return;
            }
        }
        linearLayout.setVisibility(0);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context != null) {
            ju1.h hVar = new ju1.h(context, i17);
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = ((r45.st) it.next()).f467500d;
                    if (str2 != null) {
                        android.widget.TextView textView = (android.widget.TextView) hVar.mo152xb9724478();
                        textView.setText(str2);
                        textView.setTextSize(1, 12.0f);
                        linearLayout.addView(textView);
                    }
                }
            }
            if (str != null) {
                android.widget.TextView textView2 = (android.widget.TextView) hVar.mo152xb9724478();
                textView2.setText(str);
                textView2.setTextSize(1, 10.0f);
                linearLayout.addView(textView2);
            }
        }
    }
}
