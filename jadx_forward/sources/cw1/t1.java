package cw1;

/* loaded from: classes7.dex */
public final class t1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public int f304861d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.CheckBox f304862e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f304863f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f304864g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13110x50e4df39 f304865h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13110x50e4df39 activityC13110x50e4df39, android.view.View root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f304865h = activityC13110x50e4df39;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.bxf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        this.f304862e = (android.widget.CheckBox) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.odf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
        this.f304863f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.mzv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById3);
        this.f304864g = (android.widget.TextView) findViewById3;
        root.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheSubListUI$ItemViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        android.widget.CheckBox checkBox = this.f304862e;
        boolean z17 = !checkBox.isChecked();
        checkBox.setChecked(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13110x50e4df39 activityC13110x50e4df39 = this.f304865h;
        cw1.s1 s1Var = activityC13110x50e4df39.f177218e;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        s1Var.f304836e[this.f304861d] = z17;
        activityC13110x50e4df39.f177220g = true;
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheSubListUI$ItemViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
