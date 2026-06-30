package fk2;

/* loaded from: classes3.dex */
public final class c0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.g0 f344859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344861f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f344862g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344863h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344864i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344865m;

    public c0(fk2.g0 g0Var, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, android.content.Context context) {
        this.f344859d = g0Var;
        this.f344860e = str;
        this.f344861f = str2;
        this.f344862g = i17;
        this.f344863h = str3;
        this.f344864i = str4;
        this.f344865m = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$configContentPrefixSongStyleSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        fk2.x xVar = fk2.g0.f344923m;
        fk2.g0 g0Var = this.f344859d;
        xVar.a(g0Var.f526773a.t(), this.f344860e, this.f344861f, this.f344862g, g0Var.f526773a.q());
        g0Var.f526773a.g(this.f344863h, this.f344864i);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$configContentPrefixSongStyleSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f344865m.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560582ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
