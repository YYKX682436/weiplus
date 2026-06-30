package pf4;

/* loaded from: classes4.dex */
public final class g extends pf4.h {
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f435402d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        long j17;
        pf4.f holder = (pf4.f) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f435402d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            return;
        }
        df4.a aVar = df4.b.f313571a;
        try {
            java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"-"}, false, 0, 6, null);
            j17 = new java.util.GregorianCalendar(java.lang.Integer.parseInt((java.lang.String) f07.get(0)), java.lang.Integer.parseInt((java.lang.String) f07.get(1)) - 1, java.lang.Integer.parseInt((java.lang.String) f07.get(2))).getTimeInMillis();
        } catch (java.lang.Exception e17) {
            df4.a aVar2 = df4.b.f313571a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.StoryTimeUtil", e17, e17.getMessage(), new java.lang.Object[0]);
            j17 = 0;
        }
        java.lang.CharSequence format = android.text.format.DateFormat.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jms), j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        java.util.List f08 = r26.n0.f0(format, new java.lang.String[]{":"}, false, 0, 6, null);
        int size = f08.size();
        android.widget.TextView textView = holder.f435397e;
        if (size == 3) {
            textView.setText(((java.lang.String) f08.get(1)) + ((java.lang.String) f08.get(2)));
        }
        pm0.v.c(textView);
        holder.f435396d.setBackground(null);
        holder.f435398f.setVisibility(8);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cwl, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new pf4.f(this, inflate);
    }
}
