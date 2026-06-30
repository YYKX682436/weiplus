package df2;

/* loaded from: classes10.dex */
public final class kn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ln f312122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f312123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f312124f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(df2.ln lnVar, android.view.View view, android.view.View view2) {
        super(0);
        this.f312122d = lnVar;
        this.f312123e = view;
        this.f312124f = view2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        df2.ln lnVar = this.f312122d;
        java.lang.String str = lnVar.f312209m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showVoteDescPage on beforePageAnimEnd!winnerContainner:");
        rf2.q qVar = lnVar.f312211o;
        java.lang.Integer num = null;
        sb6.append((qVar == null || (viewGroup2 = qVar.f476390h) == null) ? null : java.lang.Integer.valueOf(viewGroup2.getVisibility()));
        sb6.append(",participantContainner:");
        rf2.a aVar = lnVar.f312212p;
        sb6.append((aVar == null || (viewGroup = aVar.f476172g) == null) ? null : java.lang.Integer.valueOf(viewGroup.getVisibility()));
        sb6.append(",voteDescContainer:");
        rf2.f fVar = lnVar.f312213q;
        if (fVar != null && (view = fVar.f476250h) != null) {
            num = java.lang.Integer.valueOf(view.getVisibility());
        }
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        rf2.q qVar2 = lnVar.f312211o;
        if (qVar2 != null) {
            qVar2.f(8);
        }
        rf2.a aVar2 = lnVar.f312212p;
        if (aVar2 != null) {
            aVar2.c(8);
        }
        this.f312123e.setTranslationX(0.0f);
        this.f312124f.setTranslationX(0.0f);
        return jz5.f0.f384359a;
    }
}
