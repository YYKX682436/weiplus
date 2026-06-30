package k50;

/* loaded from: classes.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k50.y0 f385796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(k50.y0 y0Var) {
        super(2);
        this.f385796d = y0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jz5.f0 f0Var;
        k50.h0 appItem = (k50.h0) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appItem, "appItem");
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        yz5.a aVar = appItem.f385756f;
        if (aVar != null) {
            aVar.mo152xb9724478();
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            k50.g0 g0Var = k50.g0.f385747a;
            k50.o0 o0Var = appItem.f385753c;
            g0Var.b(o0Var);
            android.content.Intent putExtra = new android.content.Intent().putExtra("selected_app", o0Var.name()).putExtra("selected_app_index", intValue + 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
            k50.y0 y0Var = this.f385796d;
            y0Var.m158354x19263085().setResult(-1, putExtra);
            y0Var.m158354x19263085().finish();
        }
        return f0Var2;
    }
}
