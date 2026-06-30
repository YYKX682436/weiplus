package uw2;

/* loaded from: classes2.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f513233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f513234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z17, android.view.View view) {
        super(0);
        this.f513233d = z17;
        this.f513234e = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f513233d) {
            android.view.View view = this.f513234e;
            view.post(new uw2.n(view));
        }
        return jz5.f0.f384359a;
    }
}
