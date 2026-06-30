package kq2;

/* loaded from: classes2.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final iq2.d0 f392797d;

    /* renamed from: e, reason: collision with root package name */
    public int f392798e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f392799f;

    public c(r45.dd2 parentTab, iq2.d0 viewCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentTab, "parentTab");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewCallback, "viewCallback");
        this.f392797d = viewCallback;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f392799f = linkedList;
        if (parentTab.m75941xfb821914(6).isEmpty()) {
            return;
        }
        linkedList.add(0, parentTab);
        java.util.LinkedList m75941xfb821914 = parentTab.m75941xfb821914(6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSub_tab_list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m75941xfb821914) {
            java.lang.String m75945x2fec8307 = ((r45.dd2) obj).m75945x2fec8307(1);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                arrayList.add(obj);
            }
        }
        linkedList.addAll(arrayList);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f392799f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        kq2.a holder = (kq2.a) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f392799f.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.dd2 dd2Var = (r45.dd2) obj;
        android.widget.TextView textView = holder.f392792d;
        if (i17 == 0) {
            textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzf));
        } else {
            textView.setText(dd2Var.m75945x2fec8307(1));
        }
        int i18 = this.f392798e;
        android.view.View view = holder.f392793e;
        if (i18 == i17) {
            view.setBackground(view.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.asn));
            textView.setTextColor(android.graphics.Color.parseColor("#E6000000"));
        } else {
            view.setBackground(view.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.asm));
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta));
        }
        holder.f3639x46306858.setOnClickListener(new kq2.b(this, i17, dd2Var));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f571082cx5, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new kq2.a(inflate);
    }
}
