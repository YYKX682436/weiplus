package ju2;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f383357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 f383358e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1) {
        super(0);
        this.f383357d = context;
        this.f383358e = c15003x1d0c0ec1;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.FrameLayout m60867x93b11d57;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m60869xb7b2905b;
        android.widget.FrameLayout m60867x93b11d572;
        android.widget.TextView m60872x13c392c6;
        android.content.Context context = this.f383357d;
        android.content.res.Resources resources = context.getResources();
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, (int) resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1));
        layoutParams.f92426h = 0;
        layoutParams.f92432k = 0;
        layoutParams.f92418d = 0;
        layoutParams.setMarginStart((int) resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(16);
        linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a_y);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1 = this.f383358e;
        m60867x93b11d57 = c15003x1d0c0ec1.m60867x93b11d57();
        m60869xb7b2905b = c15003x1d0c0ec1.m60869xb7b2905b();
        m60867x93b11d57.addView(m60869xb7b2905b);
        m60867x93b11d572 = c15003x1d0c0ec1.m60867x93b11d57();
        linearLayout.addView(m60867x93b11d572);
        m60872x13c392c6 = c15003x1d0c0ec1.m60872x13c392c6();
        linearLayout.addView(m60872x13c392c6);
        return linearLayout;
    }
}
