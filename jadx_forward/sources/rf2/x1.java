package rf2;

/* loaded from: classes10.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f476489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f476491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476493h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(rf2.c2 c2Var, java.lang.String str, android.widget.TextView textView, android.view.View view, java.lang.String str2) {
        super(4);
        this.f476489d = c2Var;
        this.f476490e = str;
        this.f476491f = textView;
        this.f476492g = view;
        this.f476493h = str2;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter = (p012xc85e97e9.p103xe821e364.p104xd1075a44.f2) obj;
        android.view.View view = (android.view.View) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        in5.s0 holder = (in5.s0) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        rf2.c2 c2Var = this.f476489d;
        boolean z17 = c2Var.f476218g;
        java.lang.String str = c2Var.f476214c;
        if (z17) {
            java.util.ArrayList arrayList = c2Var.f476216e;
            rf2.d2 d2Var = (rf2.d2) kz5.n0.a0(arrayList, intValue);
            if (d2Var != null) {
                boolean z18 = d2Var.f476229e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "click pos:" + intValue + ", preSelected:" + z18);
                if (z18) {
                    d2Var.f476229e = false;
                    this.f476489d.d(this.f476490e, this.f476491f, this.f476492g, this.f476493h, false);
                    this.f476491f.setOnClickListener(rf2.u1.f476443d);
                } else {
                    java.util.Iterator it = arrayList.iterator();
                    int i17 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i17 = -1;
                            break;
                        }
                        if (((rf2.d2) it.next()).f476229e) {
                            break;
                        }
                        i17++;
                    }
                    if (i17 >= 0 && i17 < arrayList.size()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "reset last:" + i17);
                        rf2.d2 d2Var2 = (rf2.d2) kz5.n0.a0(arrayList, i17);
                        if (d2Var2 != null) {
                            d2Var2.f476229e = false;
                        }
                        adapter.m8147xed6e4d18(i17);
                    }
                    d2Var.f476229e = true;
                    this.f476489d.d(this.f476490e, this.f476491f, this.f476492g, this.f476493h, false);
                    android.widget.TextView textView = this.f476491f;
                    textView.setOnClickListener(new rf2.w1(this.f476490e, this.f476489d, d2Var, this.f476493h, textView, this.f476492g));
                }
                adapter.m8147xed6e4d18(intValue);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "enableChoiceClick false, ignore click");
        }
        return jz5.f0.f384359a;
    }
}
