package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class e4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f206061d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f206062e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f206063f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f206064g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 f206065h;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var, java.lang.String username, boolean z17, android.content.Context context, boolean z18, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z19 = (i17 & 16) != 0 ? false : z19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f206065h = s4Var;
        this.f206061d = username;
        this.f206062e = z17;
        this.f206063f = context;
        this.f206064g = z19;
    }

    public static final void x(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.e4 e4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.n3 n3Var, int i17) {
        int i18 = !c0Var.f391645d ? 1 : 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMoreLiveNoticeListWidget", "CgiFinderAudienceReserveLiveNotification do op=" + i18);
        az2.j Ni = ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ni(e4Var.f206061d, 2, i18, null, 0, 0L);
        android.content.Context context = e4Var.f206063f;
        Ni.t(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
        Ni.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.b4(s4Var, i18, e4Var, n3Var, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f206065h.f206293n).size() + (y() ? 1 : 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return (y() && i17 == 0) ? 0 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0362  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r56, int r57) {
        /*
            Method dump skipped, instructions count: 1621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.e4.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f206063f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b6v, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.n3(this, inflate);
    }

    public final boolean y() {
        r45.fw4 fw4Var;
        if (this.f206064g) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.f206065h;
        boolean z17 = this.f206062e;
        if (z17) {
            r45.c32 c32Var = s4Var.f206298s;
            if ((c32Var != null ? c32Var.m75939xb282bd08(0) : 0) > 0) {
                return true;
            }
        }
        if (!z17) {
            r45.c32 c32Var2 = s4Var.f206298s;
            if ((c32Var2 == null || (fw4Var = (r45.fw4) c32Var2.m75936x14adae67(1)) == null) ? false : fw4Var.m75933x41a8a7f2(0)) {
                return true;
            }
        }
        return false;
    }

    public final void z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.n3 n3Var, int i17) {
        r45.fw4 fw4Var;
        r45.fw4 fw4Var2;
        java.lang.String str = null;
        str = null;
        boolean z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.f206065h;
        boolean z18 = this.f206062e;
        if (z18) {
            r45.c32 c32Var = s4Var.f206298s;
            n3Var.f206176u.setText(this.f206063f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o0i, c32Var != null ? java.lang.Integer.valueOf(c32Var.m75939xb282bd08(0)) : null));
        } else {
            android.widget.TextView textView = n3Var.f206176u;
            r45.c32 c32Var2 = s4Var.f206298s;
            if (c32Var2 != null && (fw4Var = (r45.fw4) c32Var2.m75936x14adae67(1)) != null) {
                str = fw4Var.m75945x2fec8307(1);
            }
            textView.setText(str);
        }
        android.widget.TextView textView2 = n3Var.f206177v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView2, "<this>");
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        int i18 = (y() && i17 == 0 && !z18) ? 0 : 8;
        android.widget.TextView textView3 = n3Var.f206177v;
        textView3.setVisibility(i18);
        r45.c32 c32Var3 = s4Var.f206298s;
        if (c32Var3 != null && (fw4Var2 = (r45.fw4) c32Var3.m75936x14adae67(1)) != null) {
            z17 = fw4Var2.m75933x41a8a7f2(2);
        }
        if (z17) {
            textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.nkl);
        } else {
            textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.nkj);
        }
    }
}
