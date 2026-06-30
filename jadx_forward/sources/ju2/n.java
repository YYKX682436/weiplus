package ju2;

/* loaded from: classes3.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f383359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context) {
        super(0);
        this.f383359d = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f383359d;
        android.content.res.Resources resources = context.getResources();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
        layoutParams.setMarginStart((int) resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
        frameLayout.setLayoutParams(layoutParams);
        return frameLayout;
    }
}
