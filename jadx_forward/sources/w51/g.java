package w51;

/* loaded from: classes15.dex */
public class g extends w51.d implements android.view.View.OnClickListener {

    /* renamed from: p, reason: collision with root package name */
    public final w51.n f524508p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f524509q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f524510r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f524511s;

    public g(android.content.Context context) {
        super(context);
        this.f524510r = "TimePickerView";
        this.f524511s = false;
        this.f524508p = new w51.n(context);
        this.f524509q = context;
    }

    @Override // w51.d
    public boolean c() {
        this.f524499g.getClass();
        return false;
    }

    public android.view.View d() {
        w51.n nVar = this.f524508p;
        if (nVar.f524522a == null) {
            android.view.View inflate = android.view.LayoutInflater.from(this.f524509q).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.byu, (android.view.ViewGroup) null);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.o8w);
            ((android.view.ViewGroup) inflate).removeView(linearLayout);
            linearLayout.setBackgroundColor(-1);
            nVar.f524522a = linearLayout;
        }
        return nVar.f524522a;
    }

    public java.util.List e() {
        return this.f524508p.e();
    }

    public void f() {
        if (this.f524499g.f506314b != null) {
            try {
                this.f524499g.f506314b.a(w51.n.C.parse(this.f524508p.d()));
            } catch (java.text.ParseException e17) {
                com.p314xaae8f345.mm.ui.yk.d(this.f524510r, e17, "", new java.lang.Object[0]);
            }
        }
    }

    public void g(float f17) {
        w51.n nVar = this.f524508p;
        if (nVar != null) {
            nVar.f524525d.m48599x6c813c5e(f17);
            nVar.f524526e.m48599x6c813c5e(f17);
            nVar.f524527f.m48599x6c813c5e(f17);
            nVar.f524523b.m48599x6c813c5e(f17);
            nVar.f524524c.m48599x6c813c5e(f17);
            nVar.f524528g.m48599x6c813c5e(f17);
        }
    }

    public void h(int i17, int i18, int i19, int i27) {
        w51.n nVar = this.f524508p;
        nVar.f524525d.setPadding(i17, i18, i19, i27);
        nVar.f524526e.setPadding(i17, i18, i19, i27);
        nVar.f524527f.setPadding(i17, i18, i19, i27);
        nVar.f524523b.setPadding(i17, i18, i19, i27);
        nVar.f524524c.setPadding(i17, i18, i19, i27);
        nVar.f524528g.setPadding(i17, i18, i19, i27);
    }

    public void i() {
        w51.n nVar = this.f524508p;
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480[] c11323x28056480Arr = {nVar.f524523b, nVar.f524524c, nVar.f524525d, nVar.f524526e, nVar.f524527f, nVar.f524528g};
        for (int i17 = 0; i17 < 6; i17++) {
            c11323x28056480Arr[i17].a();
        }
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = nVar.f524523b;
        java.lang.Runnable runnable = c11323x28056480.f153918m;
        c11323x28056480.removeCallbacks(runnable);
        c11323x28056480.postDelayed(runnable, 200L);
        java.lang.Runnable runnable2 = c11323x28056480.f153918m;
        c11323x28056480.removeCallbacks(runnable2);
        ((s51.RunnableC30179x2ca3e0) runnable2).run();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/picker/view/TimePickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((java.lang.String) view.getTag()).equals("submit")) {
            i();
            f();
        }
        a();
        yj0.a.h(this, "com/tencent/mm/picker/view/TimePickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public g(android.content.Context context, boolean z17) {
        super(context);
        this.f524510r = "TimePickerView";
        this.f524511s = false;
        this.f524508p = new w51.n(context, z17);
        this.f524509q = context;
    }
}
