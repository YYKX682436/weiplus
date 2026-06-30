package bj5;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.y f21211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f21212e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(bj5.y yVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f21211d = yVar;
        this.f21212e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bj5.y yVar = this.f21211d;
        java.lang.String stringExtra = yVar.getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str = (java.lang.String) ((jz5.n) yVar.f21249h).getValue();
        kotlin.jvm.internal.o.f(str, "access$getAtSomeoneRecentDisplay(...)");
        return new pi5.f(this.f21212e, stringExtra, str);
    }
}
