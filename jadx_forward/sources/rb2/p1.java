package rb2;

/* loaded from: classes2.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f475249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f475250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475252g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475253h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f475254i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475255m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f475256n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f475257o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r45.j60 f475258p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(boolean z17, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, rb2.z2 z2Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var) {
        super(0);
        this.f475249d = z17;
        this.f475250e = viewGroup;
        this.f475251f = view;
        this.f475252g = view2;
        this.f475253h = view3;
        this.f475254i = z2Var;
        this.f475255m = s0Var;
        this.f475256n = j17;
        this.f475257o = j18;
        this.f475258p = j60Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f475249d;
        android.view.ViewGroup viewGroup = this.f475250e;
        if (z17) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            android.view.View view = this.f475251f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f475252g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f475253h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.setOnClickListener(new rb2.o1(this.f475254i, this.f475255m, this.f475256n, this.f475257o, this.f475258p));
        }
        return jz5.f0.f384359a;
    }
}
