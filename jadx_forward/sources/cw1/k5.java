package cw1;

/* loaded from: classes12.dex */
public final class k5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.l5 f304619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 f304620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cw1.n5 f304621f;

    public k5(cw1.l5 l5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9, cw1.n5 n5Var) {
        this.f304619d = l5Var;
        this.f304620e = c13121x39a05fa9;
        this.f304621f = n5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        long[] jArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$Adapter$ItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cw1.l5 l5Var = this.f304619d;
        cw1.o5 o5Var = (cw1.o5) l5Var.f304638e.f304714d.get(l5Var.m8183xf806b362());
        int m8183xf806b362 = l5Var.m8183xf806b362();
        int i17 = o5Var.f304736c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9 = this.f304620e;
        if (i17 == c13121x39a05fa9.f177303q && o5Var.f304737d == c13121x39a05fa9.f177304r) {
            boolean z17 = o5Var.f304738e;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(c13121x39a05fa9.getContext());
            android.view.View inflate = android.view.LayoutInflater.from(c13121x39a05fa9.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569705jc, (android.view.ViewGroup) null);
            android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.abp);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.abk);
            android.widget.TextView[] textViewArr = {inflate.findViewById(com.p314xaae8f345.mm.R.id.abm), inflate.findViewById(com.p314xaae8f345.mm.R.id.ab8)};
            long[] jArr2 = c13121x39a05fa9.f177302p;
            if (jArr2 != null) {
                jArr = java.util.Arrays.copyOf(jArr2, jArr2.length);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jArr, "copyOf(...)");
            } else {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.set(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26, 0, 21, 0, 0, 0);
                calendar.clear(14);
                jArr = new long[]{calendar.getTimeInMillis(), java.lang.System.currentTimeMillis()};
            }
            y1Var.f293570s = new cw1.y5(y1Var);
            inflate.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2).setOnClickListener(new cw1.z5(y1Var));
            cw1.c6 c6Var = new cw1.c6(textViewArr, c13121x39a05fa9, jArr, button, textView);
            textViewArr[0].setOnClickListener(c6Var);
            textViewArr[1].setOnClickListener(c6Var);
            button.setOnClickListener(new cw1.a6(y1Var, c13121x39a05fa9, z17, jArr, m8183xf806b362));
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9.c(jArr, textViewArr, c13121x39a05fa9, button, textView);
            y1Var.k(inflate);
            y1Var.s();
        } else {
            this.f304621f.x(m8183xf806b362);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$Adapter$ItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
