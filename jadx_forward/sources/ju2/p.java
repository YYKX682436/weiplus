package ju2;

/* loaded from: classes3.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f383362d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context) {
        super(0);
        this.f383362d = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f383362d;
        android.content.res.Resources resources = context.getResources();
        android.widget.TextView textView = new android.widget.TextView(context);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
        layoutParams.setMarginStart((int) resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj));
        layoutParams.setMarginEnd((int) resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        textView.setLayoutParams(layoutParams);
        textView.setTextColor(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        textView.setTextSize(0, resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca));
        return textView;
    }
}
