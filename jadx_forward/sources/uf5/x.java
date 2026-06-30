package uf5;

/* loaded from: classes8.dex */
public final class x extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f508854d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f508855e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f508856f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f508857g;

    /* renamed from: h, reason: collision with root package name */
    public uf5.u1 f508858h;

    /* renamed from: i, reason: collision with root package name */
    public uf5.k f508859i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public static final void T6(uf5.x xVar) {
        uf5.l lVar;
        j75.f Q6 = xVar.Q6();
        if (Q6 == null || (lVar = (uf5.l) Q6.mo140437x75286adb()) == null) {
            return;
        }
        java.util.List list = lVar.f508801g;
        if (list.isEmpty()) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(xVar.m158354x19263085(), "com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI");
        intent.putStringArrayListExtra("label_username_list", new java.util.ArrayList<>(list));
        lk5.s.e(intent, true);
        xVar.m158354x19263085().startActivityForResult(intent, 100);
    }

    public static final void U6(uf5.x xVar, uf5.l lVar) {
        xVar.getClass();
        int size = lVar.f508801g.size();
        if (size > 0) {
            android.widget.Button button = xVar.f508857g;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchSetBtn");
                throw null;
            }
            button.setText(xVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pa6, java.lang.Integer.valueOf(size)));
            android.widget.Button button2 = xVar.f508857g;
            if (button2 != null) {
                button2.setEnabled(true);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchSetBtn");
                throw null;
            }
        }
        android.widget.Button button3 = xVar.f508857g;
        if (button3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchSetBtn");
            throw null;
        }
        button3.setText(xVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575371pa4));
        android.widget.Button button4 = xVar.f508857g;
        if (button4 != null) {
            button4.setEnabled(false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchSetBtn");
            throw null;
        }
    }

    public static final void V6(uf5.x xVar, al5.q qVar) {
        if (com.p314xaae8f345.mm.ui.b4.c(xVar.m158354x19263085())) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = xVar.m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                xVar.m80380x71e92c1d().post(new uf5.w(abstractActivityC21394xb3d2c0cf, qVar));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        j75.f Q6;
        uf5.l lVar;
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 != 100 || i18 != -1 || (Q6 = Q6()) == null || (lVar = (uf5.l) Q6.mo140437x75286adb()) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(lVar.f508801g);
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.B3(new uf5.d(arrayList));
        }
    }
}
