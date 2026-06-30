package fi1;

/* loaded from: classes8.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi1.d f344305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fi1.d dVar) {
        super(0);
        this.f344305d = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f344305d.f344306d;
        if (!(context instanceof android.app.Activity)) {
            return null;
        }
        android.view.View findViewById = ((android.app.Activity) context).getWindow().getDecorView().findViewById(android.R.id.content);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.view.View");
        return findViewById;
    }
}
