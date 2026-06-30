package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public final class o0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f99595d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final o11.g f99596e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f99597f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.exdevice.ui.s0 f99598g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f99599h;

    public o0(java.lang.String str, com.tencent.mm.plugin.exdevice.ui.s0 s0Var, java.lang.String str2) {
        this.f99597f = str;
        this.f99598g = s0Var;
        this.f99599h = str2;
        o11.f fVar = new o11.f();
        fVar.f342093q = com.tencent.mm.R.color.a48;
        this.f99596e = fVar.a();
    }

    public final int a(java.lang.String str) {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f99595d;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return -1;
            }
            if (((com.tencent.mm.plugin.exdevice.ui.t0) ((java.util.ArrayList) list).get(i17)).b().compareTo(str) == 0) {
                return i17;
            }
            i17++;
        }
    }

    public final boolean c(com.tencent.mm.plugin.exdevice.ui.t0 t0Var) {
        java.lang.String str;
        r45.ov3 ov3Var = t0Var.f99669f;
        if (ov3Var == null) {
            return false;
        }
        com.tencent.mm.plugin.exdevice.ui.s0 s0Var = com.tencent.mm.plugin.exdevice.ui.s0.SCAN_CATALOG;
        com.tencent.mm.plugin.exdevice.ui.s0 s0Var2 = this.f99598g;
        if (s0Var2 == s0Var) {
            java.lang.String str2 = ov3Var.f382538d;
            return str2 != null && str2.compareTo(this.f99597f) == 0 && (str = t0Var.f99669f.f382552u) != null && str.compareTo(this.f99599h) == 0;
        }
        if (s0Var2 == com.tencent.mm.plugin.exdevice.ui.s0.SCAN_MY_DEVICE) {
            return ov3Var.f382554w != 0;
        }
        iz5.a.g(null, false);
        return false;
    }

    public boolean d(java.lang.String str) {
        return str == null || str.length() == 0;
    }

    @Override // android.widget.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.exdevice.ui.t0 getItem(int i17) {
        int i18 = -1;
        int i19 = 0;
        while (true) {
            java.util.List list = this.f99595d;
            if (i19 >= ((java.util.ArrayList) list).size()) {
                return null;
            }
            if (((com.tencent.mm.plugin.exdevice.ui.t0) ((java.util.ArrayList) list).get(i19)).f99664a) {
                i18++;
            }
            if (i18 == i17) {
                return (com.tencent.mm.plugin.exdevice.ui.t0) ((java.util.ArrayList) list).get(i19);
            }
            i19++;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int i17 = 0;
        int i18 = 0;
        while (true) {
            java.util.List list = this.f99595d;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return i18;
            }
            if (((com.tencent.mm.plugin.exdevice.ui.t0) ((java.util.ArrayList) list).get(i17)).f99664a) {
                i18++;
            }
            i17++;
        }
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.exdevice.ui.n0 n0Var;
        r45.ov3 ov3Var;
        com.tencent.mm.plugin.exdevice.ui.t0 item = getItem(i17);
        if (view == null) {
            com.tencent.mm.plugin.exdevice.ui.n0 n0Var2 = new com.tencent.mm.plugin.exdevice.ui.n0(null);
            android.view.View inflate = android.view.View.inflate(viewGroup.getContext(), com.tencent.mm.R.layout.a9j, null);
            n0Var2.f99577a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.k3h);
            n0Var2.f99578b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h5u);
            inflate.setTag(n0Var2);
            n0Var = n0Var2;
            view = inflate;
        } else {
            n0Var = (com.tencent.mm.plugin.exdevice.ui.n0) view.getTag();
        }
        if (item == null || (ov3Var = item.f99669f) == null) {
            iz5.a.g(null, false);
            return view;
        }
        com.tencent.mm.plugin.exdevice.ui.p0 p0Var = item.f99665b;
        java.lang.String str = "";
        if (p0Var == com.tencent.mm.plugin.exdevice.ui.p0.CONNECT_PROTO_TYPE_BLUE) {
            com.tencent.mm.plugin.exdevice.ui.q0 q0Var = item.f99666c;
            java.lang.String str2 = q0Var.f99625a;
            java.lang.String str3 = q0Var.f99626b;
            r45.ov3 ov3Var2 = item.f99669f;
            java.lang.String str4 = ov3Var2.f382550s;
            java.lang.String str5 = ov3Var2.A;
            if (str5 == null || str5.length() < 4) {
                java.lang.String str6 = item.f99666c.f99626b;
                if (str6 != null && str6.length() >= 4) {
                    java.lang.String str7 = item.f99666c.f99626b;
                    str = str7.substring(str7.length() - 4, str7.length());
                }
            } else {
                str = str5.substring(str5.length() - 4, str5.length());
            }
            java.lang.String str8 = item.f99669f.f382550s + " " + str;
            android.text.SpannableString spannableString = new android.text.SpannableString(str8);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.f479232tk)), item.f99669f.f382550s.length() + 1, str8.length(), 17);
            n0Var.f99577a.setText(spannableString);
        } else if (p0Var == com.tencent.mm.plugin.exdevice.ui.p0.CONNECT_PROTO_TYPE_WIFI) {
            java.lang.String str9 = ov3Var.A;
            if (str9 == null || str9.length() < 4) {
                java.lang.String str10 = item.f99669f.f382540f;
                if (str10 != null && str10.length() >= 4) {
                    java.lang.String str11 = item.f99669f.f382540f;
                    str = str11.substring(str11.length() - 4, str11.length());
                }
            } else {
                str = str9.substring(str9.length() - 4, str9.length());
            }
            java.lang.String str12 = item.f99669f.f382550s + " " + str;
            android.text.SpannableString spannableString2 = new android.text.SpannableString(str12);
            spannableString2.setSpan(new android.text.style.ForegroundColorSpan(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.f479232tk)), item.f99669f.f382550s.length() + 1, str12.length(), 17);
            n0Var.f99577a.setText(spannableString2);
        } else {
            iz5.a.g(null, false);
        }
        java.lang.String str13 = item.f99669f.f382548q;
        if (!d(str13)) {
            n11.a.b().h(str13, n0Var.f99578b, this.f99596e);
        }
        return view;
    }
}
