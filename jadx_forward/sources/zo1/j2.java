package zo1;

/* loaded from: classes5.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f556188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3 f556189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f556190f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3 activityC12869xafc66e3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        super(1);
        this.f556188d = i17;
        this.f556189e = activityC12869xafc66e3;
        this.f556190f = y1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3 activityC12869xafc66e3 = this.f556189e;
        int i17 = activityC12869xafc66e3.f174369n;
        int i18 = this.f556188d;
        if (i18 != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("PackageDeleteConfirmUI", "Task has cancelled, currentTaskId=" + i18 + ", globalTaskId=" + activityC12869xafc66e3.f174369n);
        } else {
            this.f556190f.q();
            if (booleanValue) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3.T6(activityC12869xafc66e3);
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activityC12869xafc66e3);
                android.view.View inflate = android.view.LayoutInflater.from(activityC12869xafc66e3.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570246e45, (android.view.ViewGroup) null);
                po1.d dVar = activityC12869xafc66e3.f174364f;
                if (dVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceInfo");
                    throw null;
                }
                if (dVar.f438829b == po1.g.f438843h) {
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.t3x)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.of7);
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.t3w);
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    po1.d dVar2 = activityC12869xafc66e3.f174364f;
                    if (dVar2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceInfo");
                        throw null;
                    }
                    objArr[0] = dVar2.b();
                    po1.d dVar3 = activityC12869xafc66e3.f174364f;
                    if (dVar3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceInfo");
                        throw null;
                    }
                    objArr[1] = dVar3.b();
                    textView.setText(activityC12869xafc66e3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574395of5, objArr));
                    textView.setTextColor(activityC12869xafc66e3.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
                } else {
                    android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.t3x);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    po1.d dVar4 = activityC12869xafc66e3.f174364f;
                    if (dVar4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceInfo");
                        throw null;
                    }
                    objArr2[0] = dVar4.b();
                    textView2.setText(activityC12869xafc66e3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.of6, objArr2));
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.t3w)).setText(activityC12869xafc66e3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574394of4));
                }
                ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.t3u)).setOnClickListener(new zo1.k2(activityC12869xafc66e3, y1Var));
                ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.t3v)).setOnClickListener(new zo1.l2(activityC12869xafc66e3, y1Var));
                y1Var.k(inflate);
                y1Var.s();
            }
        }
        return jz5.f0.f384359a;
    }
}
