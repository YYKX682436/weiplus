package yx;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed f548575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f548576e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed activityC10499xbd0fa9ed, int i17) {
        super(0);
        this.f548575d = activityC10499xbd0fa9ed;
        this.f548576e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed activityC10499xbd0fa9ed = this.f548575d;
        com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) activityC10499xbd0fa9ed.findViewById(com.p314xaae8f345.mm.R.id.a9m);
        int a17 = ly.g.a(140, activityC10499xbd0fa9ed);
        int i17 = this.f548576e;
        if (i17 != 0) {
            a17 = (int) (a17 * 0.75f);
        }
        android.view.ViewGroup.LayoutParams layoutParams = c21405x85fc1ce0.getLayoutParams();
        layoutParams.height = a17;
        layoutParams.width = a17;
        c21405x85fc1ce0.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10502x33f3d43f c10502x33f3d43f = (com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10502x33f3d43f) activityC10499xbd0fa9ed.findViewById(com.p314xaae8f345.mm.R.id.uzk);
        android.view.ViewGroup.LayoutParams layoutParams2 = c10502x33f3d43f.getLayoutParams();
        layoutParams2.height = a17;
        layoutParams2.width = a17;
        c10502x33f3d43f.setLayoutParams(layoutParams2);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) activityC10499xbd0fa9ed.findViewById(com.p314xaae8f345.mm.R.id.f566571ty0);
        android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams4 = layoutParams3 instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams3 : null;
        if (i17 != 0) {
            if (layoutParams4 != null) {
                layoutParams4.setMarginStart(ly.g.a(12, activityC10499xbd0fa9ed));
            }
            if (layoutParams4 != null) {
                layoutParams4.setMarginEnd(ly.g.a(12, activityC10499xbd0fa9ed));
            }
            if (layoutParams4 != null) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = i17 + ly.g.a(10, activityC10499xbd0fa9ed);
            }
        } else {
            if (layoutParams4 != null) {
                layoutParams4.setMarginStart(ly.g.a(50, activityC10499xbd0fa9ed));
            }
            if (layoutParams4 != null) {
                layoutParams4.setMarginEnd(ly.g.a(50, activityC10499xbd0fa9ed));
            }
            if (layoutParams4 != null) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = ly.g.a(50, activityC10499xbd0fa9ed);
            }
        }
        linearLayout.setLayoutParams(layoutParams4);
        return jz5.f0.f384359a;
    }
}
