package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes4.dex */
public class f0 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 f220638d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 c15850x99d4a1f6) {
        this.f220638d = c15850x99d4a1f6;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15770xb2a9200d c15770xb2a9200d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomListView", "showFirstGuidance, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 c15850x99d4a1f6 = this.f220638d;
        if (!((android.app.Activity) c15850x99d4a1f6.f220434f2).isFinishing() && !((android.app.Activity) c15850x99d4a1f6.f220434f2).isDestroyed() && i17 == 0 && i18 == 0 && (c15770xb2a9200d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15770xb2a9200d) oVar.f152244b.f152233a) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = c15770xb2a9200d.f36713xbb3ce978;
            if (c15780xf49d6a1c != null) {
                s33.y.h(c15850x99d4a1f6.f220434f2, c15780xf49d6a1c);
                c15850x99d4a1f6.o1(2);
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c15770xb2a9200d.f36712x319118a4)) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15749x39c3d7b4> it = c15770xb2a9200d.f36712x319118a4.iterator();
                int i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15749x39c3d7b4 next = it.next();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(next.f36651x38b73479)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = next.f36650x5a72f63;
                        java.lang.String str2 = c15748x3e43f43 != null ? com.p314xaae8f345.mm.ui.bk.C() ? c15748x3e43f43.f36646xa0e2915a : c15748x3e43f43.f36649x7db41efa : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        java.lang.Integer l17 = s33.y.l(str2);
                        if (l17 == null) {
                            l17 = java.lang.Integer.valueOf(c15850x99d4a1f6.f220434f2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                        }
                        spannableStringBuilder.append((java.lang.CharSequence) next.f36651x38b73479);
                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(l17.intValue()), i19, next.f36651x38b73479.length() + i19, 33);
                        i19 = spannableStringBuilder.length();
                    }
                }
                if (spannableStringBuilder.length() == 0) {
                    return 0;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(c15850x99d4a1f6.getContext(), 2, 0, true);
                z2Var.y(c15850x99d4a1f6.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fkz));
                z2Var.x(1);
                z2Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.g0(c15850x99d4a1f6, z2Var);
                android.view.View inflate = android.view.LayoutInflater.from(c15850x99d4a1f6.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570675bf3, (android.view.ViewGroup) null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bfy);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bfz);
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.big);
                } else {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bii);
                }
                textView.setText(spannableStringBuilder);
                z2Var.j(inflate);
                z2Var.C();
                c15850x99d4a1f6.o1(1);
            }
        }
        return 0;
    }
}
