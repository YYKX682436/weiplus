package um2;

/* loaded from: classes3.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(um2.x5 x5Var) {
        super(0);
        this.f510373d = x5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fm2.c cVar = this.f510373d.f101139c;
        android.view.View findViewById = cVar != null ? cVar.findViewById(com.p314xaae8f345.mm.R.id.f7s) : null;
        if (findViewById != null) {
            com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.f7u)).getPaint(), 0.8f);
        }
        return findViewById;
    }
}
