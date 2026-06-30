package cw1;

/* loaded from: classes12.dex */
public final class b4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public int f304346d;

    /* renamed from: e, reason: collision with root package name */
    public int f304347e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.C21405x85fc1ce0 f304348f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f304349g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f304350h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f304351i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f304352m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.CheckBox f304353n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ cw1.q4 f304354o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(cw1.q4 q4Var, android.view.View root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f304354o = q4Var;
        this.f304347e = -1;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.chd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f304348f = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.mzv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f304349g = textView;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.cut);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f304350h = textView2;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.oru);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        this.f304351i = textView3;
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.mkj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f304352m = findViewById5;
        android.view.View findViewById6 = root.findViewById(com.p314xaae8f345.mm.R.id.mie);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f304353n = (android.widget.CheckBox) findViewById6;
        float dimension = q4Var.f304798d.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        textView.setTextSize(0, dimension);
        textView2.setTextSize(0, dimension);
        textView3.setTextSize(0, dimension);
        android.view.View findViewById7 = root.findViewById(com.p314xaae8f345.mm.R.id.saf);
        findViewById7.setTag(this);
        findViewById7.setOnClickListener(this);
        if (q4Var.f304806o) {
            findViewById7.setOnLongClickListener(new cw1.x3(q4Var));
        }
        android.view.View findViewById8 = root.findViewById(com.p314xaae8f345.mm.R.id.l3o);
        findViewById8.setTag(this);
        findViewById8.setOnClickListener(new cw1.y3(q4Var));
        if (q4Var.f304806o) {
            findViewById8.setOnLongClickListener(new cw1.z3(q4Var));
        }
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.p2787xe21cab30.C22850x1e5c7402) root).m82910x43981dc8(new cw1.a4(q4Var, this));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$ItemViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.Object tag = v17.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailNewAdapter.ItemViewHolder");
        cw1.b4 b4Var = (cw1.b4) tag;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSelectClick dataPos=");
        sb6.append(b4Var.f304346d);
        sb6.append(" nextChecked=");
        android.widget.CheckBox checkBox = b4Var.f304353n;
        sb6.append(!checkBox.isChecked());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingDetailNewAdapter", sb6.toString());
        boolean z17 = !checkBox.isChecked();
        cw1.q4 q4Var = this.f304354o;
        if (q4Var.f304802h.get(b4Var.f304346d) != z17) {
            q4Var.f304802h.set(b4Var.f304346d, z17);
            checkBox.setChecked(z17);
            bw1.l lVar = (bw1.l) q4Var.f304799e.get(b4Var.f304346d);
            if (z17) {
                android.view.View view = b4Var.f304352m;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "checkItem", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$ItemViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "checkItem", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$ItemViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                q4Var.f304804m++;
                q4Var.f304803i += lVar.f106342a;
            } else {
                android.view.View view2 = b4Var.f304352m;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "checkItem", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$ItemViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "checkItem", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$ItemViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                q4Var.f304804m--;
                q4Var.f304803i -= lVar.f106342a;
            }
            int i17 = b4Var.f304347e;
            if (i17 >= 0) {
                q4Var.m8148xed6e4d18(((java.lang.Number) ((jz5.l) q4Var.f304800f.get(i17)).f384366d).intValue(), "");
            }
            q4Var.f304798d.h7(q4Var.f304803i, q4Var.f304799e.size(), q4Var.f304804m);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$ItemViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
