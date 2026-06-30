package bm2;

/* loaded from: classes3.dex */
public final class v1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f103904d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f103905e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f103906f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f103907g = new java.util.ArrayList();

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103907g.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bm2.p1 holder = (bm2.p1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.Object obj = this.f103907g.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        h0Var.f391656d = obj;
        int m75939xb282bd08 = ((r45.ty1) obj).m75939xb282bd08(3);
        boolean z17 = true;
        android.widget.ImageView imageView = holder.f103750d;
        android.widget.TextView textView = holder.f103751e;
        if (m75939xb282bd08 != 0) {
            if (m75939xb282bd08 == 1) {
                textView.setVisibility(4);
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562486g8);
                holder.f3639x46306858.setOnClickListener(new bm2.t1(this));
                return;
            } else {
                if (m75939xb282bd08 != 2) {
                    return;
                }
                textView.setVisibility(4);
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562487g9);
                holder.f3639x46306858.setOnClickListener(new bm2.u1(this));
                return;
            }
        }
        textView.setVisibility(0);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String m75945x2fec8307 = ((r45.ty1) h0Var.f391656d).m75945x2fec8307(1);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, m75945x2fec8307, textSize));
        java.lang.String m75945x2fec83072 = ((r45.ty1) h0Var.f391656d).m75945x2fec8307(4);
        if (m75945x2fec83072 != null && m75945x2fec83072.length() != 0) {
            z17 = false;
        }
        if (z17) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            mn2.g1 g1Var = mn2.g1.f411508a;
            wo0.c b17 = g1Var.l().b(new mn2.n(((r45.ty1) h0Var.f391656d).m75945x2fec8307(4), null, 2, null), g1Var.h(mn2.f1.f411494o));
            bm2.r1 r1Var = new bm2.r1(h0Var, holder);
            b17.getClass();
            b17.f529406d = r1Var;
            b17.f();
        }
        holder.f3639x46306858.setOnClickListener(new bm2.s1(this, h0Var));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.apd, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new bm2.p1(this, inflate);
    }

    public final java.util.List x() {
        java.util.ArrayList arrayList = this.f103907g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.ty1) next).m75939xb282bd08(2) != 0) {
                arrayList2.add(next);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            java.lang.String m75945x2fec8307 = ((r45.ty1) it6.next()).m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            arrayList3.add(m75945x2fec8307);
        }
        return arrayList3;
    }

    public final void y(java.util.LinkedList linkedList) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = this.f103907g;
        if (linkedList != null) {
            arrayList.clear();
            arrayList.addAll(linkedList);
        }
        java.lang.Object obj2 = null;
        if (arrayList.size() < 5) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.ty1) obj).m75939xb282bd08(3) == 1) {
                        break;
                    }
                }
            }
            if (obj == null) {
                r45.ty1 ty1Var = new r45.ty1();
                ty1Var.set(3, 1);
                arrayList.add(ty1Var);
            }
        }
        if (arrayList.size() > 1) {
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (((r45.ty1) next).m75939xb282bd08(3) == 2) {
                    obj2 = next;
                    break;
                }
            }
            if (obj2 == null) {
                r45.ty1 ty1Var2 = new r45.ty1();
                ty1Var2.set(3, 2);
                arrayList.add(ty1Var2);
            }
        }
        m8146xced61ae5();
    }
}
