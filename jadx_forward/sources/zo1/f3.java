package zo1;

/* loaded from: classes5.dex */
public final class f3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.v f556138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 f556139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f556141g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(wo1.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, java.lang.String str) {
        super(0);
        this.f556138d = vVar;
        this.f556139e = activityC12872x8baa24f8;
        this.f556140f = u3Var;
        this.f556141g = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f556140f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8 = this.f556139e;
        wo1.v vVar = this.f556138d;
        if (vVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectContactUI", "Fail to create adapter by class=" + this.f556141g);
            u3Var.dismiss();
            int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.f174379x;
            activityC12872x8baa24f8.U6();
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC12872x8baa24f8.f174384h;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contactRv");
                throw null;
            }
            c1163xf1deaba4.mo7960x6cab2c8d(vVar);
            android.widget.TextView textView = activityC12872x8baa24f8.f174382f;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortTypeTv");
                throw null;
            }
            textView.setText(vVar.m174238xb593a3ae());
            vVar.m174246xbb45fab8(new zo1.l3(activityC12872x8baa24f8));
            wo1.l m174234xb45db000 = vVar.m174234xb45db000();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = activityC12872x8baa24f8.f174385i;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarRv");
                throw null;
            }
            c1163xf1deaba42.mo7960x6cab2c8d(m174234xb45db000);
            m174234xb45db000.f529513d = new zo1.m3(activityC12872x8baa24f8);
            m174234xb45db000.f529514e = new zo1.n3(activityC12872x8baa24f8, vVar);
            android.widget.TextView textView2 = activityC12872x8baa24f8.f174389p;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectAllTv");
                throw null;
            }
            textView2.setOnClickListener(new zo1.o3(vVar));
            android.widget.Button button = activityC12872x8baa24f8.f174387n;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finishBtn");
                throw null;
            }
            button.setOnClickListener(new zo1.p3(activityC12872x8baa24f8, vVar));
            java.util.ArrayList arrayList = activityC12872x8baa24f8.f174395v;
            vVar.m174245xd6f2232a(arrayList);
            arrayList.clear();
            if (vVar.m174233xf85be44f().isEmpty()) {
                android.widget.LinearLayout linearLayout = activityC12872x8baa24f8.f174386m;
                if (linearLayout == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarLl");
                    throw null;
                }
                linearLayout.setVisibility(8);
            }
            activityC12872x8baa24f8.f174394u = vVar;
            u3Var.dismiss();
        }
        return jz5.f0.f384359a;
    }
}
