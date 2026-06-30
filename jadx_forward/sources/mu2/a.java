package mu2;

/* loaded from: classes2.dex */
public final class a extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f412924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f412925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f412926c;

    public a(android.text.SpannableString spannableString, android.view.View view, long j17) {
        this.f412924a = spannableString;
        this.f412925b = view;
        this.f412926c = j17;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            android.text.SpannableString spannableString = this.f412924a;
            java.lang.Object[] spans = spannableString.getSpans(0, spannableString.length(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(spans, "getSpans(...)");
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl ylVar : (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl[]) spans) {
                if (ylVar.f214937f) {
                    mu2.b bVar = mu2.b.f412927a;
                    android.content.Context context = this.f412925b.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    bVar.a(context, "link_topic_tag", 0, this.f412926c, 0L, ylVar.f214935d);
                }
            }
        }
    }
}
