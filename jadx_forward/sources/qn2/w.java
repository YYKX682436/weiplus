package qn2;

/* loaded from: classes3.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.z f446735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f446736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f446737f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(qn2.z zVar, r45.cz1 cz1Var, int i17) {
        super(0);
        this.f446735d = zVar;
        this.f446736e = cz1Var;
        this.f446737f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f446735d.f446756s = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playLotteringAnim done, id:");
        sb6.append(this.f446736e.m75945x2fec8307(0));
        sb6.append(",status:");
        sb6.append(this.f446737f);
        sb6.append(",callback:");
        yz5.l lVar = this.f446735d.f446761x;
        sb6.append(lVar != null ? java.lang.Integer.valueOf(lVar.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCardPlugin", sb6.toString());
        qn2.z zVar = this.f446735d;
        yz5.l lVar2 = zVar.f446761x;
        if (lVar2 != null) {
            lVar2.mo146xb9724478(zVar.f446762y);
        }
        android.view.View view = this.f446735d.f446758u;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$playLotteringAnim$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$playLotteringAnim$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
