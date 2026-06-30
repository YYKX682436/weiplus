package ft4;

/* loaded from: classes14.dex */
public final class i extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f348155d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f348156e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348157f;

    /* renamed from: g, reason: collision with root package name */
    public int f348158g;

    /* renamed from: h, reason: collision with root package name */
    public int f348159h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f348160i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f348161m;

    /* renamed from: n, reason: collision with root package name */
    public ft4.a f348162n;

    public i(android.content.Context context, java.util.List data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f348155d = context;
        this.f348156e = data;
        this.f348157f = "";
        this.f348160i = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f348156e.size() + this.f348158g + this.f348159h;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (i17 == 0) {
            if (this.f348158g == 1) {
                return 3;
            }
            return ((ft4.j) this.f348156e.get(0)).f348164a;
        }
        if (i17 == mo1894x7e414b06() - 1 && this.f348159h == 1) {
            return 3;
        }
        return ((ft4.j) this.f348156e.get(i17 - this.f348158g)).f348164a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        ft4.j jVar;
        dt4.q qVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (mo1894x7e414b06() <= i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLedgerDayAdapter", "itemCount:" + mo1894x7e414b06() + " is small than " + i17);
            return;
        }
        if (holder instanceof ft4.b) {
            ft4.j jVar2 = (ft4.j) this.f348156e.get(i17 - this.f348158g);
            ft4.b bVar = (ft4.b) holder;
            bVar.f348116f.a(new ft4.e(this, jVar2));
            ft4.k kVar = jVar2.f348165b;
            int i18 = kVar.f348169a;
            ft4.u uVar = bVar.f348116f;
            uVar.f348232c = i18;
            uVar.b(kVar.f348170b, kVar.f348171c, kVar.f348172d, kVar.f348173e);
            return;
        }
        if (holder instanceof ft4.d) {
            if (i17 == 0) {
                if (this.f348158g == 0) {
                    ((ft4.d) holder).f348134e.setVisibility(8);
                } else {
                    ((ft4.d) holder).f348134e.setVisibility(0);
                }
            }
            if (i17 == mo1894x7e414b06() - 1) {
                if (this.f348159h == 0) {
                    ((ft4.d) holder).f348134e.setVisibility(8);
                    return;
                } else {
                    ((ft4.d) holder).f348134e.setVisibility(0);
                    return;
                }
            }
            return;
        }
        if (!(holder instanceof ft4.c) || (qVar = (jVar = (ft4.j) this.f348156e.get(i17 - this.f348158g)).f348166c) == null) {
            return;
        }
        if (qVar.f324808c == 0 && qVar.f324807b == 0) {
            ((ft4.c) holder).f348119e.setVisibility(8);
        } else {
            ((ft4.c) holder).f348119e.setVisibility(0);
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int t17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.t(calendar.getTimeInMillis());
        calendar.add(6, -1);
        int t18 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.t(calendar.getTimeInMillis());
        int i19 = qVar.f324806a;
        android.content.Context context = this.f348155d;
        if (i19 > 0) {
            ft4.c cVar = (ft4.c) holder;
            android.widget.TextView textView = cVar.f348120f;
            textView.setVisibility(0);
            if (this.f348161m) {
                textView.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f(qVar.f324806a)));
            } else {
                textView.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f(qVar.f324806a)));
            }
            android.widget.TextView textView2 = cVar.f348121g;
            textView2.setVisibility(8);
            int i27 = qVar.f324806a;
            if (i27 == t17) {
                textView2.setVisibility(0);
                textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fd_));
            } else if (i27 == t18) {
                textView2.setVisibility(0);
                textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi));
            }
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        } else {
            ft4.c cVar2 = (ft4.c) holder;
            cVar2.f348120f.setVisibility(8);
            cVar2.f348121g.setVisibility(8);
        }
        ft4.c cVar3 = (ft4.c) holder;
        com.p314xaae8f345.mm.ui.bk.r0(cVar3.f348124m.getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(cVar3.f348128q.getPaint(), 0.8f);
        android.widget.LinearLayout linearLayout = cVar3.f348122h;
        linearLayout.setVisibility(8);
        android.widget.LinearLayout linearLayout2 = cVar3.f348126o;
        linearLayout2.setVisibility(8);
        if (qVar.f324807b != 0) {
            java.util.LinkedHashMap linkedHashMap = qVar.f324809d;
            if (linkedHashMap.size() > 0) {
                linearLayout.setVisibility(0);
                cVar3.f348123i.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.C(qVar.f324807b));
                java.util.Collection values = linkedHashMap.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                ft4.o oVar = new ft4.o(context, kz5.n0.S0(values));
                java.lang.String str = this.f348157f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                oVar.f348197e = str;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = cVar3.f348125n;
                c1163xf1deaba4.mo7960x6cab2c8d(oVar);
                c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
                oVar.f348198f = new ft4.f(this);
            }
        }
        if (qVar.f324808c != 0) {
            java.util.LinkedHashMap linkedHashMap2 = qVar.f324810e;
            if (linkedHashMap2.size() > 0) {
                linearLayout2.setVisibility(0);
                cVar3.f348127p.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.C(qVar.f324808c));
                java.util.Collection values2 = linkedHashMap2.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
                ft4.o oVar2 = new ft4.o(context, kz5.n0.S0(values2));
                java.lang.String str2 = this.f348157f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
                oVar2.f348197e = str2;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = cVar3.f348129r;
                c1163xf1deaba42.mo7960x6cab2c8d(oVar2);
                c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
                oVar2.f348198f = new ft4.g(this);
            }
        }
        boolean z17 = this.f348160i;
        android.widget.LinearLayout linearLayout3 = cVar3.f348130s;
        if (!z17) {
            linearLayout3.setVisibility(8);
        } else {
            linearLayout3.setVisibility(0);
            linearLayout3.setOnClickListener(new ft4.h(this, jVar));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571153de1, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new ft4.b(inflate);
        }
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ddx, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new ft4.c(inflate2);
        }
        if (i17 != 3) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ddx, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
            return new ft4.c(inflate3);
        }
        android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571154de2, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate4, "inflate(...)");
        return new ft4.d(inflate4);
    }
}
