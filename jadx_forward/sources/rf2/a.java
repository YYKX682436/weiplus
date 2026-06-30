package rf2;

/* loaded from: classes10.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f476169d;

    /* renamed from: e, reason: collision with root package name */
    public final df2.ln f476170e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f476171f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f476172g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f476173h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f476174i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f476175m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f476176n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f476177o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f476178p;

    public a(android.view.View root, df2.ln controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f476169d = root;
        this.f476170e = controller;
        this.f476171f = controller.f312209m;
    }

    public final void a() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        android.view.ViewGroup viewGroup4;
        android.view.ViewGroup viewGroup5;
        android.widget.TextView textView;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522;
        android.view.ViewGroup viewGroup6 = this.f476172g;
        android.widget.TextView textView4 = null;
        if (viewGroup6 == null) {
            viewGroup6 = (android.view.ViewGroup) this.f476169d.findViewById(com.p314xaae8f345.mm.R.id.is8);
            if (viewGroup6 != null) {
                viewGroup6.setOnClickListener(this);
            } else {
                viewGroup6 = null;
            }
        }
        this.f476172g = viewGroup6;
        android.view.View view = this.f476173h;
        if (view == null) {
            if (viewGroup6 == null || (view = viewGroup6.findViewById(com.p314xaae8f345.mm.R.id.kpj)) == null) {
                view = null;
            } else {
                view.setOnClickListener(this);
            }
        }
        this.f476173h = view;
        android.widget.TextView textView5 = this.f476174i;
        d92.f fVar = d92.f.f309003a;
        if (textView5 == null) {
            android.view.ViewGroup viewGroup7 = this.f476172g;
            if (viewGroup7 == null || (textView5 = (android.widget.TextView) viewGroup7.findViewById(com.p314xaae8f345.mm.R.id.kcw)) == null) {
                textView5 = null;
            } else {
                android.content.Context context = textView5.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                d92.f.a(fVar, context, textView5, 17.0f, 0.0f, 8, null);
            }
        }
        this.f476174i = textView5;
        android.widget.ImageView imageView = this.f476175m;
        if (imageView == null) {
            android.view.ViewGroup viewGroup8 = this.f476172g;
            imageView = viewGroup8 != null ? (android.widget.ImageView) viewGroup8.findViewById(com.p314xaae8f345.mm.R.id.f567914l22) : null;
        }
        this.f476175m = imageView;
        android.widget.TextView textView6 = this.f476176n;
        if (textView6 == null) {
            android.view.ViewGroup viewGroup9 = this.f476172g;
            if (viewGroup9 == null || (textView6 = (android.widget.TextView) viewGroup9.findViewById(com.p314xaae8f345.mm.R.id.kpn)) == null) {
                textView6 = null;
            } else {
                textView6.setOnClickListener(this);
            }
        }
        this.f476176n = textView6;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f476177o;
        if (c22699x3dcdb3523 == null) {
            android.view.ViewGroup viewGroup10 = this.f476172g;
            if (viewGroup10 == null || (c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup10.findViewById(com.p314xaae8f345.mm.R.id.kpo)) == null) {
                c22699x3dcdb3523 = null;
            } else {
                c22699x3dcdb3523.setOnClickListener(this);
            }
        }
        this.f476177o = c22699x3dcdb3523;
        android.widget.TextView textView7 = this.f476178p;
        if (textView7 == null) {
            android.view.ViewGroup viewGroup11 = this.f476172g;
            if (viewGroup11 != null && (textView7 = (android.widget.TextView) viewGroup11.findViewById(com.p314xaae8f345.mm.R.id.nfl)) != null) {
                android.content.Context context2 = textView7.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                d92.f.a(fVar, context2, textView7, 14.0f, 0.0f, 8, null);
            }
            this.f476178p = textView4;
            viewGroup = this.f476172g;
            if (viewGroup != null && (c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f567799r43)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.c(c22699x3dcdb3522, 3);
            }
            viewGroup2 = this.f476172g;
            if (viewGroup2 != null && (textView3 = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.kcw)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView3, 3);
            }
            viewGroup3 = this.f476172g;
            if (viewGroup3 != null && (textView2 = (android.widget.TextView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.kpn)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView2, 3);
            }
            viewGroup4 = this.f476172g;
            if (viewGroup4 != null && (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup4.findViewById(com.p314xaae8f345.mm.R.id.kpo)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.c(c22699x3dcdb352, 3);
            }
            viewGroup5 = this.f476172g;
            if (viewGroup5 != null || (textView = (android.widget.TextView) viewGroup5.findViewById(com.p314xaae8f345.mm.R.id.nfl)) == null) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView, 5);
            return;
        }
        textView4 = textView7;
        this.f476178p = textView4;
        viewGroup = this.f476172g;
        if (viewGroup != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.c(c22699x3dcdb3522, 3);
        }
        viewGroup2 = this.f476172g;
        if (viewGroup2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView3, 3);
        }
        viewGroup3 = this.f476172g;
        if (viewGroup3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView2, 3);
        }
        viewGroup4 = this.f476172g;
        if (viewGroup4 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.c(c22699x3dcdb352, 3);
        }
        viewGroup5 = this.f476172g;
        if (viewGroup5 != null) {
        }
    }

    public final void b(boolean z17, boolean z18, java.lang.Integer num) {
        java.lang.String str;
        if (!z17) {
            android.widget.TextView textView = this.f476176n;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f476177o;
            if (c22699x3dcdb352 == null) {
                return;
            }
            c22699x3dcdb352.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = this.f476176n;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f476177o;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(0);
        }
        rf2.t tVar = rf2.t.f476423a;
        r45.f02 f02Var = this.f476170e.f312218v;
        if (f02Var == null || (str = f02Var.f455411d) == null) {
            str = "";
        }
        tVar.e(str, 20, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : num);
    }

    public final void c(int i17) {
        boolean E = zl2.q4.f555466a.E();
        java.lang.String str = this.f476171f;
        if (E) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVisible:");
            sb6.append(i17);
            sb6.append(",participantContainner visibility:");
            android.view.ViewGroup viewGroup = this.f476172g;
            sb6.append(viewGroup != null ? java.lang.Integer.valueOf(viewGroup.getVisibility()) : null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str, sb6.toString(), new java.lang.Object[0]);
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setVisible:");
            sb7.append(i17);
            sb7.append(",participantContainner visibility:");
            android.view.ViewGroup viewGroup2 = this.f476172g;
            sb7.append(viewGroup2 != null ? java.lang.Integer.valueOf(viewGroup2.getVisibility()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
        }
        if (this.f476172g == null) {
            a();
        }
        android.view.ViewGroup viewGroup3 = this.f476172g;
        if (viewGroup3 == null) {
            return;
        }
        viewGroup3.setVisibility(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(r45.f02 r22) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.a.d(r45.f02):void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultParticipantPage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        boolean z17 = true;
        if ((valueOf == null || valueOf.intValue() != com.p314xaae8f345.mm.R.id.kpn) && (valueOf == null || valueOf.intValue() != com.p314xaae8f345.mm.R.id.kpo)) {
            z17 = false;
        }
        df2.ln lnVar = this.f476170e;
        if (z17) {
            rf2.t tVar = rf2.t.f476423a;
            r45.f02 f02Var = lnVar.f312218v;
            if (f02Var == null || (str = f02Var.f455411d) == null) {
                str = "";
            }
            tVar.e(str, 21, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : 3);
            lnVar.c7(this.f476172g);
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.kpj) {
            yz5.l lVar = lnVar.f312220x;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            }
            lnVar.Z6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultParticipantPage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
