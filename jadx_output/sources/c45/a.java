package c45;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c45.b f38532d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c45.b bVar) {
        super(1);
        this.f38532d = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String string = this.f38532d.getContext().getString(com.tencent.mm.R.string.jzr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
