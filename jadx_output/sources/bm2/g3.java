package bm2;

/* loaded from: classes3.dex */
public final class g3 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f21908d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21909e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21910f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21911g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f21912h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21913i;

    public g3(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f21908d = new java.util.ArrayList();
        this.f21909e = 2;
        this.f21910f = 20;
        this.f21911g = true;
        for (int i17 = 0; i17 < 2; i17++) {
            this.f21908d.add("");
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f21908d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bm2.z2 holder = (bm2.z2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.f22480f.f21761e = i17;
        java.util.ArrayList arrayList = this.f21908d;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) arrayList.get(i17);
        android.widget.EditText editText = holder.f22478d;
        editText.setText(charSequence);
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        boolean z17 = ((java.lang.CharSequence) obj).length() == 0;
        android.widget.ImageView imageView = holder.f22479e;
        if (z17) {
            imageView.setVisibility(8);
        } else {
            this.f21911g = false;
            imageView.setVisibility(0);
        }
        imageView.setOnClickListener(new bm2.b3(holder));
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.setCursorVisible(true);
        editText.setFilters(new android.text.InputFilter[]{new bm2.e3(this), new bm2.f3(this.f21910f, com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2)});
        editText.setOnEditorActionListener(new bm2.c3(holder, editText));
        if (i17 == 0) {
            if (editText.getText().toString().length() == 0) {
                this.f21911g = true;
                editText.postDelayed(new bm2.d3(holder, editText), 300L);
            }
        }
        if (i17 == arrayList.size() - 1) {
            x();
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.aqr, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new bm2.z2(this, inflate);
    }

    public final void x() {
        java.util.Iterator it = this.f21908d.iterator();
        while (it.hasNext()) {
            if (!(((java.lang.String) it.next()).length() == 0) || !this.f21911g) {
                yz5.l lVar = this.f21912h;
                if (lVar != null) {
                    lVar.invoke(java.lang.Boolean.TRUE);
                    return;
                }
                return;
            }
        }
        yz5.l lVar2 = this.f21912h;
        if (lVar2 != null) {
            lVar2.invoke(java.lang.Boolean.FALSE);
        }
    }
}
