package zo1;

/* loaded from: classes5.dex */
public final class n3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 f556237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo1.v f556238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8, wo1.v vVar) {
        super(3);
        this.f556237d = activityC12872x8baa24f8;
        this.f556238e = vVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.List selectList = (java.util.List) obj;
        ((java.lang.Boolean) obj3).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectList, "selectList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((java.lang.String) obj2, "<anonymous parameter 1>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8 = this.f556237d;
        java.lang.String string = activityC12872x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ig8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        if (!selectList.isEmpty()) {
            android.widget.LinearLayout linearLayout = activityC12872x8baa24f8.f174386m;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarLl");
                throw null;
            }
            linearLayout.setVisibility(0);
            android.widget.Button button = activityC12872x8baa24f8.f174387n;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finishBtn");
                throw null;
            }
            button.setText(string + '(' + selectList.size() + ')');
            android.widget.Button button2 = activityC12872x8baa24f8.f174387n;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finishBtn");
                throw null;
            }
            button2.setEnabled(true);
        } else {
            android.widget.LinearLayout linearLayout2 = activityC12872x8baa24f8.f174386m;
            if (linearLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarLl");
                throw null;
            }
            linearLayout2.setVisibility(8);
            android.widget.Button button3 = activityC12872x8baa24f8.f174387n;
            if (button3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finishBtn");
                throw null;
            }
            button3.setText(string);
            android.widget.Button button4 = activityC12872x8baa24f8.f174387n;
            if (button4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finishBtn");
                throw null;
            }
            button4.setEnabled(false);
        }
        wo1.v vVar = this.f556238e;
        if (vVar.m174240xdff51cfb()) {
            android.widget.TextView textView = activityC12872x8baa24f8.f174389p;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectAllTv");
                throw null;
            }
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a76);
        } else {
            android.widget.TextView textView2 = activityC12872x8baa24f8.f174389p;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectAllTv");
                throw null;
            }
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572214a75);
        }
        long m174231x1d6912a7 = vVar.m174231x1d6912a7();
        android.widget.TextView textView3 = activityC12872x8baa24f8.f174388o;
        if (textView3 != null) {
            textView3.setText(m174231x1d6912a7 > 0 ? activityC12872x8baa24f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwm, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S1(m174231x1d6912a7)) : "");
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("estimatedSizeTv");
        throw null;
    }
}
