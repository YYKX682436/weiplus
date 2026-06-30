package qb2;

/* loaded from: classes8.dex */
public final class s1 extends i13.g {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f442823o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f442824p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Intent f442825q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(java.lang.String id6, java.lang.String title, java.lang.String desc, android.graphics.Bitmap bitmap, int i17, long j17, boolean z17, boolean z18, android.content.Intent intent) {
        super(id6, title, desc, bitmap, i17, j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.f442823o = z17;
        this.f442824p = z18;
        this.f442825q = intent;
    }

    @Override // i13.c
    public int a() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560961yz);
    }

    @Override // i13.c
    public android.graphics.drawable.Drawable b() {
        return m95.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, com.p314xaae8f345.mm.R.raw.f80150xebd70644, 0.0f);
    }

    @Override // i13.c
    public java.lang.String c() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // i13.c
    public boolean e() {
        return this.f442823o;
    }

    @Override // i13.c
    public boolean f() {
        return this.f442824p;
    }

    @Override // i13.c
    public void j() {
        long longExtra = this.f442825q.getLongExtra("KEY_OBJECT_ID", 0L);
        r45.jn0 jn0Var = new r45.jn0();
        jn0Var.set(0, java.lang.Long.valueOf(longExtra));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedActionType", 38);
        jSONObject.put("feedActionSubType", 1);
        jn0Var.set(3, jSONObject.toString());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).al(null, 18054, jn0Var);
    }

    @Override // i13.c
    public void n(in5.s0 holder, android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).bl("temp_34");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f442825q);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/conv/FinderLiveMsgItem", "onItemClick", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/conv/FinderLiveMsgItem", "onItemClick", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // i13.g
    public void r(in5.s0 holder, int i17, int i18, boolean z17, java.util.List list) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z18 = ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).f384746g;
        android.content.Context context = holder.f374654e;
        if (z18) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.odf);
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560680rb));
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.po8);
            if (textView2 != null) {
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.r_));
            }
        } else {
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.odf);
            if (textView3 != null) {
                textView3.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560679r9));
            }
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.po8);
            if (textView4 != null) {
                textView4.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560677r7));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a86);
        android.widget.TextView textView5 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.odf);
        android.widget.TextView textView6 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.po8);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = textView5.getContext();
        float textSize = textView5.getTextSize();
        ((ke0.e) xVar).getClass();
        textView5.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, this.f368814h, textSize));
        textView6.setText(this.f368815i);
        textView6.requestLayout();
        android.graphics.Bitmap bitmap = this.f368816m;
        if (bitmap != null) {
            imageView.setVisibility(0);
            imageView.setImageBitmap(bitmap);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            imageView.setVisibility(8);
        }
        int i19 = this.f368817n;
        if (i19 != 1 && i19 != 2) {
            imageView2.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc();
        c19780xceb4c4dc.m76038x5304029d(i19);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f542044a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
        zy2.tb.a(m1Var, imageView2, c19780xceb4c4dc, 0, 4, null);
    }
}
