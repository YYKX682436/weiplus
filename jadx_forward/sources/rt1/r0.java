package rt1;

/* loaded from: classes7.dex */
public final class r0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f481012d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13030x3e5b0a3b f481013e;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13030x3e5b0a3b activityC13030x3e5b0a3b) {
        this.f481013e = activityC13030x3e5b0a3b;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f481012d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        if (((java.lang.String) kz5.n0.a0(this.f481012d, i17)) != null) {
            return r3.hashCode();
        }
        return -1L;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        rt1.u0 u0Var = (rt1.u0) holder;
        java.lang.Object obj = this.f481012d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        if (str.length() < 7) {
            return;
        }
        java.lang.String str2 = u46.l.t(str, 0, 2) + " · " + u46.l.t(str, 2, str.length());
        android.widget.TextView textView = u0Var.f481022d;
        textView.setText(str2);
        textView.setContentDescription(str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.app.Activity d17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String plateNo = (java.lang.String) kz5.n0.a0(this.f481012d, x(view));
        if (!(plateNo == null || plateNo.length() == 0)) {
            rt1.z0 z0Var = this.f481013e.f176150f;
            if (z0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            rt1.p1 p1Var = (rt1.p1) z0Var;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plateNo, "plateNo");
            rt1.b1 b1Var = p1Var.f481006b;
            if (b1Var == null || (d17 = b1Var.d()) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CarLicensePlateListViewPresenter", "startEditUIForUpdate(plate:" + plateNo + ") get NULL activity");
            } else {
                p3325xe03a0797.p3326xc267989b.l.d(p1Var.a(), null, null, new rt1.k1(d17, plateNo, p1Var, null), 3, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569801om, parent, false);
        inflate.setOnClickListener(this);
        inflate.setOnLongClickListener(this);
        return new rt1.u0(inflate);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        java.lang.String str = (java.lang.String) kz5.n0.a0(this.f481012d, x(view));
        if (str == null || str.length() == 0) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        rt1.n0 n0Var = new rt1.n0(view, view.getContext());
        rt1.o0 o0Var = rt1.o0.f480995d;
        rt1.q0 q0Var = new rt1.q0(this.f481013e, str);
        int i17 = com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d;
        n0Var.h(view, o0Var, q0Var, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
        yj0.a.i(true, this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }

    public final int x(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13030x3e5b0a3b activityC13030x3e5b0a3b = this.f481013e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 c12809xaf47a071 = activityC13030x3e5b0a3b.f176151g;
        if (c12809xaf47a071 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = c12809xaf47a071.w0(view);
        if (w07 == null) {
            return -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 c12809xaf47a0712 = activityC13030x3e5b0a3b.f176151g;
        if (c12809xaf47a0712 != null) {
            return c12809xaf47a0712.g1(w07);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
        throw null;
    }
}
