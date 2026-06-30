package un1;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un1.l f510979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f510980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 f510981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qo1.i0 f510982g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(un1.l lVar, qo1.j0 j0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var, qo1.i0 i0Var) {
        super(0);
        this.f510979d = lVar;
        this.f510980e = j0Var;
        this.f510981f = n0Var;
        this.f510982g = i0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qo1.j0 j0Var = this.f510980e;
        long a17 = j0Var.a();
        un1.l lVar = this.f510979d;
        lVar.f510986p = a17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onRefreshWholeUi] pkgId=");
        sb6.append(j0Var.a());
        sb6.append(", state=");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = this.f510981f;
        sb6.append(n0Var);
        sb6.append(", error=");
        qo1.i0 i0Var = this.f510982g;
        sb6.append(i0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f510983m, sb6.toString());
        if (n0Var != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_INITED && n0Var != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_QUIT && n0Var != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_DELETING && n0Var != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PAUSED) {
            lVar.f();
            lVar.k(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = lVar.f510985o;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("iconIv");
                throw null;
            }
            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f80017x40a4d51a, com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5);
        }
        switch (n0Var) {
            case AFFROAM_TASK_STATE_INITED:
            case AFFROAM_TASK_STATE_PAUSED:
            case AFFROAM_TASK_STATE_QUIT:
            case AFFROAM_TASK_STATE_DELETING:
                lVar.d();
                break;
            case AFFROAM_TASK_STATE_PREPARING:
                android.widget.TextView textView = lVar.f510984n;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                    throw null;
                }
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.n0h);
                break;
            case AFFROAM_TASK_STATE_RUNNING:
                lVar.P5((qo1.f0) j0Var, -1.0f);
                break;
            case AFFROAM_TASK_STATE_COMPLETED:
                if (j0Var instanceof qo1.c1) {
                    android.widget.TextView textView2 = lVar.f510984n;
                    if (textView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                        throw null;
                    }
                    textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.aas);
                    break;
                } else {
                    android.widget.TextView textView3 = lVar.f510984n;
                    if (textView3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                        throw null;
                    }
                    textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a_w);
                    break;
                }
            case AFFROAM_TASK_STATE_STOPPED:
                java.lang.String str = j0Var instanceof qo1.c1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b : com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
                android.widget.TextView textView4 = lVar.f510984n;
                if (textView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                    throw null;
                }
                textView4.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.h(com.p314xaae8f345.mm.R.C30867xcad56011.n0l, str));
                break;
            case AFFROAM_TASK_STATE_ERROR:
                switch (i0Var.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        java.lang.String str2 = j0Var instanceof qo1.c1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b : com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
                        android.widget.TextView textView5 = lVar.f510984n;
                        if (textView5 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                            throw null;
                        }
                        textView5.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.h(com.p314xaae8f345.mm.R.C30867xcad56011.n08, str2));
                        break;
                    case 4:
                        if (j0Var instanceof qo1.c1) {
                            android.widget.TextView textView6 = lVar.f510984n;
                            if (textView6 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                                throw null;
                            }
                            textView6.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574412n06);
                            break;
                        } else {
                            po1.c cVar = po1.d.f438827i;
                            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = ((qo1.f0) j0Var).f447008a.f297365g;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uVar, "getTargetDevice(...)");
                            po1.d a18 = cVar.a(uVar);
                            android.widget.TextView textView7 = lVar.f510984n;
                            if (textView7 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                                throw null;
                            }
                            textView7.setText(textView7.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574410n04, a18.b()));
                            break;
                        }
                    case 5:
                    case 7:
                        android.widget.TextView textView8 = lVar.f510984n;
                        if (textView8 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                            throw null;
                        }
                        textView8.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574409n03);
                        break;
                    case 8:
                        android.widget.TextView textView9 = lVar.f510984n;
                        if (textView9 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                            throw null;
                        }
                        textView9.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mzl);
                        break;
                }
            case AFFROAM_TASK_STATE_IMPORTING:
                android.widget.TextView textView10 = lVar.f510984n;
                if (textView10 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                    throw null;
                }
                textView10.setText(com.p314xaae8f345.mm.R.C30867xcad56011.n0b);
                break;
            case AFFROAM_TASK_STATE_CONNECTING:
                android.widget.TextView textView11 = lVar.f510984n;
                if (textView11 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                    throw null;
                }
                textView11.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mzx);
                break;
        }
        return jz5.f0.f384359a;
    }
}
