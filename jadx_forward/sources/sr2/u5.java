package sr2;

/* loaded from: classes10.dex */
public final class u5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.v5 f493268a;

    public u5(sr2.v5 v5Var) {
        this.f493268a = v5Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            if (!((r45.gq2) fVar.f152151d).m75941xfb821914(1).isEmpty()) {
                sr2.v5 v5Var = this.f493268a;
                v5Var.f493277e = true;
                v5Var.f493278f = ((r45.gq2) fVar.f152151d).m75941xfb821914(1).size();
                java.util.LinkedList m75941xfb821914 = ((r45.gq2) fVar.f152151d).m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getUsual_topics(...)");
                v5Var.f493280h = m75941xfb821914;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) v5Var.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.gca);
                v5Var.f493276d = linearLayout;
                if (linearLayout != null) {
                    linearLayout.setOnClickListener(sr2.r5.f493239d);
                }
                android.widget.LinearLayout linearLayout2 = v5Var.f493276d;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = linearLayout2 != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.gcb) : null;
                if (c1163xf1deaba4 != null) {
                    c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(v5Var.m158354x19263085(), 0, false));
                    c1163xf1deaba4.N(new sr2.s5(v5Var));
                    sr2.p5 p5Var = new sr2.p5(m75941xfb821914, new sr2.t5(v5Var));
                    v5Var.f493281i = p5Var;
                    c1163xf1deaba4.mo7960x6cab2c8d(p5Var);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostTopicUIC", "[requestPostPreData] usual_topics.size=" + ((r45.gq2) fVar.f152151d).m75941xfb821914(1).size());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostTopicUIC", "[requestPostPreData] errType=" + fVar.f152148a + " errCode=" + fVar.f152149b + " errMsg=" + fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
