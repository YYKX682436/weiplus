package bj5;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.y f21216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f21217e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(bj5.y yVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f21216d = yVar;
        this.f21217e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bj5.y yVar = this.f21216d;
        java.lang.String stringExtra = yVar.getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new pi5.d(this.f21217e, stringExtra, yVar.f21251m);
    }
}
