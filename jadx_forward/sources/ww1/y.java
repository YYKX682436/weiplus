package ww1;

/* loaded from: classes5.dex */
public class y extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements android.view.View.OnClickListener, android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f531887d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f531888e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f531889f;

    /* renamed from: g, reason: collision with root package name */
    public ww1.w f531890g;

    /* renamed from: h, reason: collision with root package name */
    public android.text.TextWatcher f531891h;

    public y(android.content.Context context, java.util.List list) {
        this.f531889f = context;
        this.f531887d = list;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        this.f531891h.afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f531891h.beforeTextChanged(charSequence, i17, i18, i19);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        boolean z17 = this.f531888e;
        java.util.List list = this.f531887d;
        return z17 ? list.size() + 1 : list.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ww1.x xVar = (ww1.x) k3Var;
        xVar.f3639x46306858.setTag(java.lang.Integer.valueOf(i17));
        java.util.List list = this.f531887d;
        int size = list.size();
        android.widget.LinearLayout linearLayout = xVar.f531861f;
        android.widget.TextView textView = xVar.f531862g;
        if (i17 == size) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b_j);
            linearLayout.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdy, this.f531889f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_j)));
        } else {
            textView.setText(((r45.hg5) list.get(i17)).f457672d);
            linearLayout.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdy, ((r45.hg5) list.get(i17)).f457672d));
        }
        if (i17 == 0) {
            android.view.View view = xVar.f531863h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        xVar.f531860e.setVisibility(4);
        xVar.f531859d.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ww1.w wVar = this.f531890g;
        if (wVar != null) {
            wVar.a(view, ((java.lang.Integer) view.getTag()).intValue());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/collect/model/CollectQrCodeUsageAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f531889f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570176zd, viewGroup, false);
        inflate.setOnClickListener(this);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6) inflate.findViewById(com.p314xaae8f345.mm.R.id.c3k)).addTextChangedListener(this);
        return new ww1.x(this, inflate);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f531891h.onTextChanged(charSequence, i17, i18, i19);
    }
}
