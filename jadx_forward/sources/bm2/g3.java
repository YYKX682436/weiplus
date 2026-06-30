package bm2;

/* loaded from: classes3.dex */
public final class g3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f103441d;

    /* renamed from: e, reason: collision with root package name */
    public final int f103442e;

    /* renamed from: f, reason: collision with root package name */
    public final int f103443f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f103444g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f103445h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f103446i;

    public g3(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f103441d = new java.util.ArrayList();
        this.f103442e = 2;
        this.f103443f = 20;
        this.f103444g = true;
        for (int i17 = 0; i17 < 2; i17++) {
            this.f103441d.add("");
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103441d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bm2.z2 holder = (bm2.z2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        holder.f104013f.f103294e = i17;
        java.util.ArrayList arrayList = this.f103441d;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) arrayList.get(i17);
        android.widget.EditText editText = holder.f104011d;
        editText.setText(charSequence);
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        boolean z17 = ((java.lang.CharSequence) obj).length() == 0;
        android.widget.ImageView imageView = holder.f104012e;
        if (z17) {
            imageView.setVisibility(8);
        } else {
            this.f103444g = false;
            imageView.setVisibility(0);
        }
        imageView.setOnClickListener(new bm2.b3(holder));
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.setCursorVisible(true);
        editText.setFilters(new android.text.InputFilter[]{new bm2.e3(this), new bm2.f3(this.f103443f, com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2)});
        editText.setOnEditorActionListener(new bm2.c3(holder, editText));
        if (i17 == 0) {
            if (editText.getText().toString().length() == 0) {
                this.f103444g = true;
                editText.postDelayed(new bm2.d3(holder, editText), 300L);
            }
        }
        if (i17 == arrayList.size() - 1) {
            x();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqr, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new bm2.z2(this, inflate);
    }

    public final void x() {
        java.util.Iterator it = this.f103441d.iterator();
        while (it.hasNext()) {
            if (!(((java.lang.String) it.next()).length() == 0) || !this.f103444g) {
                yz5.l lVar = this.f103445h;
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                    return;
                }
                return;
            }
        }
        yz5.l lVar2 = this.f103445h;
        if (lVar2 != null) {
            lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }
}
