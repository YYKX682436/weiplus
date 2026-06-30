package ur2;

/* loaded from: classes3.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur2.o f511931d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ur2.o oVar) {
        super(0);
        this.f511931d = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ur2.o oVar = this.f511931d;
        oVar.f511945i = false;
        android.widget.EditText editText = oVar.f511948o;
        editText.requestFocus();
        editText.postDelayed(new ur2.h(oVar), 200L);
        return jz5.f0.f384359a;
    }
}
