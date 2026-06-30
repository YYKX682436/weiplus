package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public class m2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.n2 f283474d;

    public m2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.n2 n2Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.k2 k2Var) {
        this.f283474d = n2Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f283474d.f283541u;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r01.g0) this.f283474d.f283540t.f449612g.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        int i18;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.n2 n2Var = this.f283474d;
        android.view.ViewGroup viewGroup2 = view == null ? (android.view.ViewGroup) n2Var.f283534n.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dlj, viewGroup, false) : (android.view.ViewGroup) view;
        android.widget.TextView textView = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.rfj);
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.rfi);
        imageView.setVisibility(8);
        r01.g0 g0Var = (r01.g0) n2Var.f283540t.f449612g.get(i17);
        viewGroup2.setTag(g0Var);
        boolean z17 = n2Var.f283528e.booleanValue() && n2Var.f283529f.equals(g0Var.f449609d) && n2Var.f283530g;
        android.content.Context context = n2Var.f283533m;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooterCustomSubmenu", "showRedDotTextView：%s", g0Var.f449609d);
            textView.setEllipsize(null);
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b8i);
            drawable.setBounds(0, 0, com.p314xaae8f345.mm.ui.zk.a(context, 8), com.p314xaae8f345.mm.ui.zk.a(context, 8));
            al5.w wVar = new al5.w(drawable, 1);
            android.text.SpannableString spannableString = new android.text.SpannableString("@");
            spannableString.setSpan(wVar, 0, 1, 33);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = g0Var.f449608c;
            ((ke0.e) xVar).getClass();
            sb6.append((java.lang.Object) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
            sb6.append(" ");
            textView.setText(android.text.TextUtils.concat(sb6.toString(), spannableString));
        } else if (g0Var.f449616k != 0) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = g0Var.f449608c;
            ((ke0.e) xVar2).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2));
            int i19 = g0Var.f449616k;
            switch (i19) {
                case 1:
                    i18 = com.p314xaae8f345.mm.R.raw.f78635x6960e003;
                    break;
                case 2:
                    i18 = com.p314xaae8f345.mm.R.raw.f78638xdc982204;
                    break;
                case 3:
                    i18 = com.p314xaae8f345.mm.R.raw.f78650x47839927;
                    break;
                case 4:
                    i18 = com.p314xaae8f345.mm.R.raw.f78622xd0faa114;
                    break;
                case 5:
                    i18 = com.p314xaae8f345.mm.R.raw.f78649x76f2c386;
                    break;
                case 6:
                case 7:
                    i18 = com.p314xaae8f345.mm.R.raw.f79015x9eb0e8f2;
                    break;
                case 8:
                default:
                    i18 = 0;
                    break;
                case 9:
                    i18 = com.p314xaae8f345.mm.R.raw.f78366xb6e79581;
                    break;
            }
            if (i18 != 0) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, i18, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834)));
                imageView.setVisibility(0);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatFooterCustomSubmenu", "get empty res id, username: %s, icon show type: %d", g0Var.f449608c, java.lang.Integer.valueOf(i19));
            }
        } else {
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = g0Var.f449608c;
            ((ke0.e) xVar3).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str3));
        }
        return viewGroup2;
    }
}
