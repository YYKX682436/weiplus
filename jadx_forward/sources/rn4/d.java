package rn4;

/* loaded from: classes8.dex */
public class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f479501d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f479502e = -1;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f479503f = null;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f479501d).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        rn4.c cVar = (rn4.c) k3Var;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f479501d;
        java.lang.String str = ((rn4.b) arrayList.get(i17)).f479497a;
        int i18 = ((rn4.b) arrayList.get(i17)).f479498b;
        cVar.f479499d.setText(str);
        int i19 = this.f479502e;
        android.widget.ImageView imageView = cVar.f479500e;
        if (i19 == i18) {
            imageView.setVisibility(0);
            this.f479503f = imageView;
        } else {
            imageView.setVisibility(8);
        }
        cVar.f3639x46306858.setOnClickListener(new rn4.a(this, cVar, i18));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new rn4.c(this, android.view.View.inflate(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c7v, null));
    }
}
