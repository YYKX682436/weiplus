package ur2;

/* loaded from: classes3.dex */
public final /* synthetic */ class s extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.a {
    public s(java.lang.Object obj) {
        super(0, obj, ur2.v.class, "onClickPreView", "onClickPreView()V", 0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ur2.v vVar = (ur2.v) this.f72685xcfcbe9ef;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = vVar.m158354x19263085();
        ry2.e eVar = vVar.f511964n;
        android.widget.TextView textView = vVar.f511960g;
        if (textView != null) {
            new ur2.c(m158354x19263085, eVar, textView.getText().toString(), null).b();
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvTitle");
        throw null;
    }
}
