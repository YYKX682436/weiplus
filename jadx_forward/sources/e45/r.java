package e45;

/* loaded from: classes8.dex */
public final class r extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f330950d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f330951e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f330952f;

    /* renamed from: g, reason: collision with root package name */
    public int f330953g;

    /* renamed from: h, reason: collision with root package name */
    public int f330954h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f330955i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f330956m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f330957n;

    /* renamed from: o, reason: collision with root package name */
    public e45.i f330958o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f330953g = 1;
        this.f330955i = new java.util.ArrayList();
        this.f330956m = new java.util.LinkedHashMap();
    }

    public static final void O6(e45.r rVar, int i17) {
        rVar.P6(rVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.jdr), i17);
        rVar.P6(rVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f565908e24), i17);
    }

    public final void P6(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null || marginLayoutParams.bottomMargin == i17) {
            return;
        }
        marginLayoutParams.bottomMargin = i17;
        view.setLayoutParams(marginLayoutParams);
    }

    public final int Q6(android.view.View view, android.view.View view2) {
        if (view.getHeight() > 0) {
            return view.getHeight();
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view2.getWidth() > 0 ? view2.getWidth() : m158354x19263085().getResources().getDisplayMetrics().widthPixels, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public final void R6(boolean z17, boolean z18) {
        c01.l2 c17 = c01.n2.d().c("KEY_DARA_CENTER_FILE_SELECTOR_SELECTED_FILE_LIST", true);
        java.util.ArrayList arrayList = this.f330955i;
        c17.i("INTENT_KEY_DATA_LIST", arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorBottomBarUIC", "startSelectedFileListHalfScreen() called previewDataList:" + arrayList.size());
        android.content.Intent intent = new android.content.Intent(m80379x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19638x462df501.class);
        pf5.j0.a(intent, e45.t.class);
        intent.putExtra("INTENT_KEY_LAST_SELECTED_TAB", this.f330953g);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f330951e;
        java.lang.CharSequence text = c22661xa3a2b3c0 != null ? c22661xa3a2b3c0.getText() : null;
        if (text == null) {
            text = "";
        }
        intent.putExtra("INTENT_KEY_ACTION_BUTTON_TEXT", text);
        intent.putExtra("INTENT_KEY_SCROLL_TO_LAST", z17);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.vfh);
        intent.putExtra("INTENT_KEY_IS_NEED_CLEAN", checkBox != null ? checkBox.isChecked() : true);
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        android.app.Activity m80379x76847179 = m80379x76847179();
        bh5.d dVar = cVar.f102455a;
        dVar.f102457a = m80379x76847179;
        cVar.b(com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7.class);
        cVar.e(true);
        cVar.a("com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI");
        if (z18) {
            dVar.f102460d.w(4);
        }
        cVar.h(8);
    }

    public final void S6() {
        int i17;
        android.widget.TextView textView = this.f330950d;
        if (textView == null) {
            return;
        }
        if (this.f330954h > 0) {
            if (textView != null) {
                textView.setText(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcy, java.lang.Integer.valueOf(this.f330954h)));
            }
            i17 = 0;
        } else {
            i17 = 4;
        }
        textView.setVisibility(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.widget.TextView textView = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.qxn);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
            textView.setOnClickListener(new e45.n(this));
        } else {
            textView = null;
        }
        this.f330950d = textView;
        S6();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.hrg);
        this.f330951e = c22661xa3a2b3c0;
        if (c22661xa3a2b3c0 != null) {
            c22661xa3a2b3c0.setEnabled(this.f330954h > 0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = this.f330951e;
        if (c22661xa3a2b3c02 != null) {
            c22661xa3a2b3c02.setOnClickListener(new e45.o(this));
        }
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.lrc);
        this.f330952f = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new e45.p(this));
        }
        android.view.View findViewById2 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.taj);
        this.f330957n = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new e45.q(this));
        }
    }
}
