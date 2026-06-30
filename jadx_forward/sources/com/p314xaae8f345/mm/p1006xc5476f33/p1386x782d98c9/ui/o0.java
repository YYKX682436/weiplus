package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public final class o0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f181128d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final o11.g f181129e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f181130f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0 f181131g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f181132h;

    public o0(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0 s0Var, java.lang.String str2) {
        this.f181130f = str;
        this.f181131g = s0Var;
        this.f181132h = str2;
        o11.f fVar = new o11.f();
        fVar.f423626q = com.p314xaae8f345.mm.R.C30859x5a72f63.a48;
        this.f181129e = fVar.a();
    }

    public final int a(java.lang.String str) {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f181128d;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return -1;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0) ((java.util.ArrayList) list).get(i17)).b().compareTo(str) == 0) {
                return i17;
            }
            i17++;
        }
    }

    public final boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0 t0Var) {
        java.lang.String str;
        r45.ov3 ov3Var = t0Var.f181202f;
        if (ov3Var == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0.SCAN_CATALOG;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0 s0Var2 = this.f181131g;
        if (s0Var2 == s0Var) {
            java.lang.String str2 = ov3Var.f464071d;
            return str2 != null && str2.compareTo(this.f181130f) == 0 && (str = t0Var.f181202f.f464085u) != null && str.compareTo(this.f181132h) == 0;
        }
        if (s0Var2 == com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0.SCAN_MY_DEVICE) {
            return ov3Var.f464087w != 0;
        }
        iz5.a.g(null, false);
        return false;
    }

    public boolean d(java.lang.String str) {
        return str == null || str.length() == 0;
    }

    @Override // android.widget.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0 getItem(int i17) {
        int i18 = -1;
        int i19 = 0;
        while (true) {
            java.util.List list = this.f181128d;
            if (i19 >= ((java.util.ArrayList) list).size()) {
                return null;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0) ((java.util.ArrayList) list).get(i19)).f181197a) {
                i18++;
            }
            if (i18 == i17) {
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0) ((java.util.ArrayList) list).get(i19);
            }
            i19++;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int i17 = 0;
        int i18 = 0;
        while (true) {
            java.util.List list = this.f181128d;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return i18;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0) ((java.util.ArrayList) list).get(i17)).f181197a) {
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n0 n0Var;
        r45.ov3 ov3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0 item = getItem(i17);
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n0 n0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n0(null);
            android.view.View inflate = android.view.View.inflate(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a9j, null);
            n0Var2.f181110a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.k3h);
            n0Var2.f181111b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h5u);
            inflate.setTag(n0Var2);
            n0Var = n0Var2;
            view = inflate;
        } else {
            n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n0) view.getTag();
        }
        if (item == null || (ov3Var = item.f181202f) == null) {
            iz5.a.g(null, false);
            return view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p0 p0Var = item.f181198b;
        java.lang.String str = "";
        if (p0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p0.CONNECT_PROTO_TYPE_BLUE) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q0 q0Var = item.f181199c;
            java.lang.String str2 = q0Var.f181158a;
            java.lang.String str3 = q0Var.f181159b;
            r45.ov3 ov3Var2 = item.f181202f;
            java.lang.String str4 = ov3Var2.f464083s;
            java.lang.String str5 = ov3Var2.A;
            if (str5 == null || str5.length() < 4) {
                java.lang.String str6 = item.f181199c.f181159b;
                if (str6 != null && str6.length() >= 4) {
                    java.lang.String str7 = item.f181199c.f181159b;
                    str = str7.substring(str7.length() - 4, str7.length());
                }
            } else {
                str = str5.substring(str5.length() - 4, str5.length());
            }
            java.lang.String str8 = item.f181202f.f464083s + " " + str;
            android.text.SpannableString spannableString = new android.text.SpannableString(str8);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk)), item.f181202f.f464083s.length() + 1, str8.length(), 17);
            n0Var.f181110a.setText(spannableString);
        } else if (p0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p0.CONNECT_PROTO_TYPE_WIFI) {
            java.lang.String str9 = ov3Var.A;
            if (str9 == null || str9.length() < 4) {
                java.lang.String str10 = item.f181202f.f464073f;
                if (str10 != null && str10.length() >= 4) {
                    java.lang.String str11 = item.f181202f.f464073f;
                    str = str11.substring(str11.length() - 4, str11.length());
                }
            } else {
                str = str9.substring(str9.length() - 4, str9.length());
            }
            java.lang.String str12 = item.f181202f.f464083s + " " + str;
            android.text.SpannableString spannableString2 = new android.text.SpannableString(str12);
            spannableString2.setSpan(new android.text.style.ForegroundColorSpan(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk)), item.f181202f.f464083s.length() + 1, str12.length(), 17);
            n0Var.f181110a.setText(spannableString2);
        } else {
            iz5.a.g(null, false);
        }
        java.lang.String str13 = item.f181202f.f464081q;
        if (!d(str13)) {
            n11.a.b().h(str13, n0Var.f181111b, this.f181129e);
        }
        return view;
    }
}
