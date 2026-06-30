package cw1;

/* loaded from: classes12.dex */
public final class w3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public int f304989d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f304990e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.CheckBox f304991f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cw1.q4 f304992g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(cw1.q4 q4Var, android.view.View root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f304992g = q4Var;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.gzf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f304990e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f566766gz5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f304991f = (android.widget.CheckBox) findViewById2;
        this.f3639x46306858.setTag(this);
        this.f3639x46306858.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$HeaderViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.Object tag = v17.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailNewAdapter.HeaderViewHolder");
        cw1.w3 w3Var = (cw1.w3) tag;
        boolean z17 = !w3Var.f304991f.isChecked();
        cw1.q4 q4Var = this.f304992g;
        q4Var.getClass();
        int i17 = w3Var.f304989d;
        jz5.l B = q4Var.B(i17);
        int intValue = ((java.lang.Number) B.f384366d).intValue();
        int intValue2 = ((java.lang.Number) B.f384367e).intValue();
        if (!z17) {
            int i18 = intValue - 1;
            while (true) {
                i18 = q4Var.f304802h.nextSetBit(i18 + 1);
                if (i18 < 0 || i18 >= intValue2) {
                    break;
                }
                q4Var.f304803i -= ((bw1.l) q4Var.f304799e.get(i18)).f106342a;
                q4Var.f304804m--;
            }
        } else {
            int i19 = intValue - 1;
            while (true) {
                i19 = q4Var.f304802h.nextClearBit(i19 + 1);
                if (i19 >= intValue2) {
                    break;
                }
                q4Var.f304803i += ((bw1.l) q4Var.f304799e.get(i19)).f106342a;
                q4Var.f304804m++;
            }
        }
        q4Var.f304802h.set(intValue, intValue2, z17);
        w3Var.f304991f.setChecked(z17);
        q4Var.m8152xc67946d3(i17 + intValue + 1, intValue2 - intValue, "");
        q4Var.f304798d.h7(q4Var.f304803i, q4Var.f304799e.size(), q4Var.f304804m);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$HeaderViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
