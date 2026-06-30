package fi2;

/* loaded from: classes10.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f344443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f344444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fi2.w f344445f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i17, android.widget.TextView textView, fi2.w wVar) {
        super(0);
        this.f344443d = i17;
        this.f344444e = textView;
        this.f344445f = wVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.TextView textView = this.f344444e;
        int i17 = this.f344443d;
        if (i17 <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(this.f344445f.f344448a.f446856d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.orn, java.lang.Integer.valueOf(i17)));
        }
        return jz5.f0.f384359a;
    }
}
