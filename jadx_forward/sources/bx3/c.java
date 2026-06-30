package bx3;

/* loaded from: classes5.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f117853d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f117854e;

    public c(java.util.List datas, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(datas, "datas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f117853d = datas;
        this.f117854e = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f117853d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bx3.b holder = (bx3.b) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.CharSequence charSequence = (java.lang.CharSequence) this.f117853d.get(i17);
        android.widget.TextView textView = holder.f117852d;
        textView.setText(charSequence);
        int i18 = i17 % 2;
        android.content.Context context = this.f117854e;
        if (i18 == 0) {
            textView.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aar));
        } else {
            textView.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f117854e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cfi, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new bx3.b(this, inflate);
    }
}
