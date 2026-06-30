package zd5;

/* loaded from: classes.dex */
public final class j extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f553222d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f553223e;

    public j(java.util.ArrayList titles, yz5.l clickCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titles, "titles");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickCallback, "clickCallback");
        this.f553222d = titles;
        this.f553223e = clickCallback;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f553222d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        zd5.c holder = (zd5.c) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        android.widget.TextView textView = holder.f553203d;
        textView.setTag(valueOf);
        textView.setText((java.lang.CharSequence) this.f553222d.get(i17));
        final yz5.l lVar = this.f553223e;
        textView.setOnClickListener(new android.view.View.OnClickListener(lVar) { // from class: zd5.i

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.l f553221d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "function");
                this.f553221d = lVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiEduGirdAdapter$sam$android_view_View_OnClickListener$0", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f553221d.mo146xb9724478(view);
                yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiEduGirdAdapter$sam$android_view_View_OnClickListener$0", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bc9, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new zd5.c(inflate);
    }
}
