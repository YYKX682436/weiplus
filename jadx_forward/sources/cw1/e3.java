package cw1;

/* loaded from: classes8.dex */
public final class e3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f304433d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f304434e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f304435f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f304436g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f304437h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13113x92bcd2ee activityC13113x92bcd2ee, android.view.View root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f304433d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.odf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        textView.setTextSize(0, i65.a.h(activityC13113x92bcd2ee, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        this.f304434e = textView;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.cut);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById3);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        textView2.setTextSize(0, i65.a.h(activityC13113x92bcd2ee, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
        this.f304435f = textView2;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.otg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById4);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        textView3.setTextSize(0, i65.a.h(activityC13113x92bcd2ee, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja));
        this.f304436g = textView3;
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.ofy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f304437h = findViewById5;
        root.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.Object tag = v17.getTag();
        jz5.l lVar = tag instanceof jz5.l ? (jz5.l) tag : null;
        if (lVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Object obj = lVar.f384366d;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Object obj2 = lVar.f384367e;
        java.lang.Long l17 = obj2 instanceof java.lang.Long ? (java.lang.Long) obj2 : null;
        if (l17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        long longValue = l17.longValue();
        cw1.d3 d3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13113x92bcd2ee.f177252f;
        android.content.Context context = v17.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        d3Var.a(context, str, longValue);
        ((v02.f0) ((a00.j) i95.n0.c(a00.j.class))).uj(str);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
