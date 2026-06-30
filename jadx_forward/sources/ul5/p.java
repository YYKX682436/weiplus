package ul5;

/* loaded from: classes9.dex */
public final class p implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f510171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f510172b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ul5.x f510173c;

    public p(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var, android.widget.TextView textView, ul5.x xVar) {
        this.f510171a = c0Var;
        this.f510172b = textView;
        this.f510173c = xVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
    /* renamed from: onResult */
    public void mo26363x57429edc(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = this.f510171a;
        c0Var.d();
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            this.f510172b.setText((java.lang.CharSequence) obj);
        }
        ul5.y.f510195f = c0Var.b();
        this.f510173c.f510189t = c0Var.b();
    }
}
