package ut2;

/* loaded from: classes3.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f512379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.view.View view) {
        super(0);
        this.f512379d = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f512379d.findViewById(com.p314xaae8f345.mm.R.id.ust);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        findViewById.post(new d92.b(new d92.c(findViewById, true)));
        return findViewById;
    }
}
