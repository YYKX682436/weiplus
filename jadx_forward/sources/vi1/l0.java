package vi1;

/* loaded from: classes7.dex */
public final class l0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f518930d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f518931e;

    public l0(java.lang.String appId, android.content.Context context, java.util.ArrayList phoneItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneItems, "phoneItems");
        this.f518930d = context;
        this.f518931e = phoneItems;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f518931e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        boolean z17;
        vi1.j0 holder = (vi1.j0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f518931e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) obj;
        android.widget.TextView textView = holder.f518874e;
        textView.setText(c12542x3a17e581.f168933e);
        java.lang.String str = c12542x3a17e581.f168932d;
        int length = str.length();
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                z17 = true;
                break;
            } else {
                if (!java.lang.Character.isDigit(str.charAt(i18))) {
                    z17 = false;
                    break;
                }
                i18++;
            }
        }
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int length2 = str.length() - 1;
            for (int i19 = 0; i19 < length2; i19++) {
                sb6.append(str.charAt(i19));
                sb6.append(' ');
            }
            sb6.append(str.charAt(length2));
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
            textView.setContentDescription(sb7);
        }
        boolean z18 = c12542x3a17e581.f168939n;
        vi1.l0 l0Var = holder.f518873d;
        android.widget.TextView textView2 = holder.f518875f;
        if (z18) {
            textView2.setText(l0Var.f518930d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3x));
        } else {
            textView2.setText("");
        }
        int i27 = c12542x3a17e581.f168940o ? 0 : 8;
        android.widget.ImageView imageView = holder.f518876g;
        imageView.setVisibility(i27);
        if (c12542x3a17e581.f168940o) {
            imageView.setContentDescription(l0Var.f518930d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6m));
        }
        if (c12542x3a17e581.f168940o) {
            return;
        }
        holder.f3639x46306858.setOnClickListener(new vi1.k0(this, c12542x3a17e581));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569595ft, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new vi1.j0(this, inflate);
    }
}
