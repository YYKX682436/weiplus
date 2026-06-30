package yh4;

/* loaded from: classes8.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f543944d;

    public b(java.util.ArrayList list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f543944d = list;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f543944d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 _holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_holder, "_holder");
        yh4.c cVar = (yh4.c) _holder;
        java.lang.Object obj = this.f543944d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        yh4.a aVar = (yh4.a) obj;
        cVar.f543947f.setText(aVar.f543940a);
        android.widget.ImageView imageView = cVar.f543946e;
        java.lang.Integer num = aVar.f543941b;
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        android.graphics.drawable.Drawable drawable = aVar.f543942c;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        cVar.f543945d.setOnClickListener(aVar.f543943d);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.clk, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new yh4.c(inflate);
    }
}
