package cw1;

/* loaded from: classes12.dex */
public final class n5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f304714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 f304715e;

    public n5(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9, java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        this.f304715e = c13121x39a05fa9;
        this.f304714d = items;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f304714d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((cw1.o5) this.f304714d.get(i17)).f304735b ? 1 : 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder instanceof cw1.l5) {
            cw1.l5 l5Var = (cw1.l5) holder;
            cw1.o5 o5Var = (cw1.o5) l5Var.f304638e.f304714d.get(l5Var.m8183xf806b362());
            cw1.n5 n5Var = l5Var.f304638e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9 = n5Var.f304715e;
            long[] jArr = c13121x39a05fa9.f177302p;
            boolean z17 = o5Var.f304738e;
            android.widget.TextView textView = l5Var.f304637d;
            if (z17) {
                if (o5Var.f304736c == c13121x39a05fa9.f177303q) {
                    if (o5Var.f304737d == c13121x39a05fa9.f177304r && jArr != null) {
                        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy.MM.dd");
                        textView.setText(simpleDateFormat.format(new java.util.Date(jArr[0])) + '~' + simpleDateFormat.format(new java.util.Date(jArr[1])));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9.a(n5Var.f304715e, textView, ((cw1.o5) n5Var.f304714d.get(l5Var.m8183xf806b362())).f304738e);
                        return;
                    }
                }
            }
            textView.setText(o5Var.f304734a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9.a(n5Var.f304715e, textView, ((cw1.o5) n5Var.f304714d.get(l5Var.m8183xf806b362())).f304738e);
            return;
        }
        if (holder instanceof cw1.m5) {
            cw1.m5 m5Var = (cw1.m5) holder;
            m5Var.f304675d.setText(((cw1.o5) m5Var.f304676e.f304714d.get(m5Var.m8183xf806b362())).f304734a);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 1) {
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e2t, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new cw1.m5(this, inflate);
        }
        android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e2u, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return new cw1.l5(this, inflate2);
    }

    public final void x(int i17) {
        cw1.o5 o5Var;
        int i18;
        java.util.List list = this.f304714d;
        cw1.o5 o5Var2 = (cw1.o5) list.get(i17);
        int i19 = o5Var2.f304736c;
        boolean z17 = o5Var2.f304738e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9 = this.f304715e;
        if (z17) {
            if (i19 == 0) {
                android.view.View view = c13121x39a05fa9.f177295f;
                if (view != null) {
                    view.callOnClick();
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("background");
                    throw null;
                }
            }
            return;
        }
        int i27 = o5Var2.f304737d;
        int i28 = i17 - i27;
        int i29 = i28;
        while (true) {
            if (i29 >= list.size() || (i18 = (o5Var = (cw1.o5) list.get(i29)).f304736c) != i19) {
                break;
            }
            o5Var.f304738e = i29 == i17;
            if (i18 == c13121x39a05fa9.f177303q) {
                if (o5Var.f304737d == c13121x39a05fa9.f177304r) {
                    m8147xed6e4d18(i17);
                }
            }
            i29++;
        }
        m8152xc67946d3(i28, i29 - i28, "");
        c13121x39a05fa9.f177301o[i19] = i27;
        if (i19 != 0) {
            c13121x39a05fa9.d();
            c13121x39a05fa9.f177300n = true;
            return;
        }
        android.widget.TextView textView = c13121x39a05fa9.f177296g;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortText");
            throw null;
        }
        textView.setText(c13121x39a05fa9.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n9r, o5Var2.f304734a));
        android.view.View view2 = c13121x39a05fa9.f177295f;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("background");
            throw null;
        }
        view2.callOnClick();
        cw1.r5 onFilterChangeListener = c13121x39a05fa9.getOnFilterChangeListener();
        if (onFilterChangeListener != null) {
            ((cw1.C28166x6a4337a) onFilterChangeListener).a(c13121x39a05fa9.f177301o, c13121x39a05fa9.f177302p);
        }
        c13121x39a05fa9.f177300n = false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            mo864xe5e2e48d(holder, i17);
            return;
        }
        if (holder instanceof cw1.l5) {
            cw1.l5 l5Var = (cw1.l5) holder;
            cw1.n5 n5Var = l5Var.f304638e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9.a(n5Var.f304715e, l5Var.f304637d, ((cw1.o5) n5Var.f304714d.get(l5Var.m8183xf806b362())).f304738e);
        }
    }
}
