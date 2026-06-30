package qv4;

/* loaded from: classes.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qv4.z f448558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(qv4.z zVar) {
        super(0);
        this.f448558d = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View j17 = this.f448558d.j();
        android.view.View findViewById = j17 != null ? j17.findViewById(com.p314xaae8f345.mm.R.id.f566755rr1) : null;
        if (findViewById != null) {
            pv4.b.c(findViewById, 8.0f);
            pv4.b.d(findViewById, 16.0f);
        }
        return findViewById;
    }
}
