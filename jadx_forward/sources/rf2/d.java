package rf2;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.f f476221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476223f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rf2.f fVar, android.view.View view, android.view.View view2) {
        super(0);
        this.f476221d = fVar;
        this.f476222e = view;
        this.f476223f = view2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        rf2.f fVar = this.f476221d;
        java.lang.String str = fVar.f476248f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on vote_desc back on beforePageAnimEnd!winnerContainner:");
        df2.ln lnVar = fVar.f476247e;
        rf2.q qVar = lnVar.f312211o;
        java.lang.Integer num = null;
        sb6.append((qVar == null || (viewGroup2 = qVar.f476390h) == null) ? null : java.lang.Integer.valueOf(viewGroup2.getVisibility()));
        sb6.append(",participantContainner:");
        rf2.a aVar = lnVar.f312212p;
        sb6.append((aVar == null || (viewGroup = aVar.f476172g) == null) ? null : java.lang.Integer.valueOf(viewGroup.getVisibility()));
        sb6.append(",voteDescContainer:");
        rf2.f fVar2 = lnVar.f312213q;
        if (fVar2 != null && (view = fVar2.f476250h) != null) {
            num = java.lang.Integer.valueOf(view.getVisibility());
        }
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        android.view.View view2 = this.f476222e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage$onClick$1$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage$onClick$1$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f476222e.setTranslationX(0.0f);
        this.f476223f.setTranslationX(0.0f);
        return jz5.f0.f384359a;
    }
}
