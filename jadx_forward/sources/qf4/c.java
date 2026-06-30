package qf4;

/* loaded from: classes4.dex */
public final class c extends qf4.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f444215d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f444216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf4.f f444217f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qf4.f fVar, android.view.View view) {
        super(fVar, view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f444217f = fVar;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.im9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f444215d = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f564401qb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f444216e = (android.widget.ImageView) findViewById2;
    }

    @Override // qf4.e
    public void i(int i17) {
        qf4.f fVar = this.f444217f;
        boolean z17 = fVar.f444230m;
        android.widget.ImageView imageView = this.f444216e;
        android.view.ViewGroup viewGroup = this.f444215d;
        if (z17) {
            viewGroup.setVisibility(8);
            imageView.setVisibility(0);
            return;
        }
        int i18 = fVar.f444231n;
        ef4.w.f334001t.j();
        if (i18 > com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getInt("story_respone_count", 20)) {
            viewGroup.setVisibility(0);
            imageView.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            imageView.setVisibility(8);
        }
    }
}
