package mh2;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.n f407934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ia4 f407935e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(mh2.n nVar, r45.ia4 ia4Var) {
        super(0);
        this.f407934d = nVar;
        this.f407935e = ia4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mh2.n nVar = this.f407934d;
        android.widget.TextView textView = nVar.f407946h;
        r45.ia4 ia4Var = this.f407935e;
        textView.setText(java.lang.String.valueOf(ia4Var.f458408m));
        nVar.f407948j.setText(ia4Var.f458409n);
        return jz5.f0.f384359a;
    }
}
