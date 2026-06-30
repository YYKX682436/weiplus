package bj5;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.y f21236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f21237e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(bj5.y yVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f21236d = yVar;
        this.f21237e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bj5.y yVar = this.f21236d;
        java.lang.String stringExtra = yVar.getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str = yVar.f21245d;
        java.lang.String str2 = (java.lang.String) ((jz5.n) yVar.f21248g).getValue();
        kotlin.jvm.internal.o.f(str2, "access$getQuoteShowHeadDisplay(...)");
        return new pi5.u(this.f21237e, stringExtra, str, str2);
    }
}
