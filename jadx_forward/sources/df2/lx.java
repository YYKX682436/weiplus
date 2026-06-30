package df2;

/* loaded from: classes3.dex */
public final class lx extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ox f312257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(df2.ox oxVar) {
        super(0);
        this.f312257d = oxVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAutoShow moreActionBtn:");
        df2.ox oxVar = this.f312257d;
        android.view.View view = oxVar.f312546n;
        sb6.append(view != null ? view.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MoreActionController", sb6.toString());
        android.view.View view2 = oxVar.f312546n;
        if (view2 != null) {
            view2.performClick();
        }
        return jz5.f0.f384359a;
    }
}
