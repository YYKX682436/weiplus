package cw1;

/* loaded from: classes12.dex */
public class u2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f304881d;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f304883f;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f304882e = java.util.Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View.OnClickListener f304884g = new cw1.ViewOnClickListenerC28142x6880464();

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f304885h = new android.view.View.OnClickListener() { // from class: cw1.u2$$b
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            cw1.u2 u2Var = cw1.u2.this;
            u2Var.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(view);
            java.lang.Object[] array = arrayList.toArray();
            arrayList.clear();
            yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", u2Var, array);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(view);
            java.lang.Object[] array2 = arrayList2.toArray();
            arrayList2.clear();
            yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", u2Var, array2);
            java.lang.Integer num = (java.lang.Integer) view.getTag();
            android.widget.AdapterView.OnItemClickListener onItemClickListener = u2Var.f304883f;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(null, view, num.intValue(), -1L);
            }
            yj0.a.h(u2Var, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            yj0.a.h(u2Var, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    };

    public u2(android.app.Activity activity) {
        this.f304881d = activity;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cw1.c getItem(int i17) {
        if (i17 < 0 || i17 >= this.f304882e.size()) {
            return null;
        }
        return (cw1.c) this.f304882e.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f304882e.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return -1L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        cw1.v2 v2Var;
        android.app.Activity activity = this.f304881d;
        if (view == null) {
            v2Var = new cw1.v2();
            view2 = android.view.LayoutInflater.from(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570155yt, viewGroup, false);
            v2Var.f304900e = view2.findViewById(com.p314xaae8f345.mm.R.id.bxc);
            v2Var.f304896a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.a_4);
            v2Var.f304897b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.odf);
            v2Var.f304898c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.cut);
            v2Var.f304899d = (android.widget.CheckBox) view2.findViewById(com.p314xaae8f345.mm.R.id.mie);
            v2Var.f304901f = view2.findViewById(com.p314xaae8f345.mm.R.id.ofy);
            v2Var.f304900e.setOnClickListener(this.f304885h);
            v2Var.f304896a.setOnClickListener(this.f304884g);
            view2.setTag(v2Var);
        } else {
            view2 = view;
            v2Var = (cw1.v2) view.getTag();
        }
        cw1.c item = getItem(i17);
        if (item == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CleanChattingAdapter", "get item is null. [%d]", java.lang.Integer.valueOf(i17));
            item = new cw1.c("", false);
        }
        v2Var.f304900e.setTag(java.lang.Integer.valueOf(i17));
        v2Var.f304896a.setTag(item);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(v2Var.f304896a, item.f304365a, null);
        java.util.Set set = item.f304369e;
        boolean z17 = set == null || (item.f304370f != null && ((java.util.HashSet) set).size() <= item.f304370f.size());
        long j17 = item.f304366b;
        long j18 = item.f304368d;
        v2Var.f304898c.setText((j18 <= 0 || z17) ? fp.n0.a(j17) : activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8k, fp.n0.a(j18)));
        java.lang.String str = item.f304365a;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            android.widget.TextView textView = v2Var.f304897b;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String f17 = c01.a2.f(str, str);
            float textSize = v2Var.f304897b.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activity, f17, textSize));
        } else {
            android.widget.TextView textView2 = v2Var.f304897b;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            float textSize2 = v2Var.f304897b.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activity, e17, textSize2));
        }
        v2Var.f304899d.setChecked(j18 > 0);
        return view2;
    }
}
