package yh5;

/* loaded from: classes12.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yh5.p f543973d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yh5.p pVar) {
        super(1);
        this.f543973d = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pf3.b visibility = (pf3.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibility, "$this$visibility");
        fq.a aVar = this.f543973d.f543974v;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.TextView jumpChatBtn = aVar.f346922b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpChatBtn, "jumpChatBtn");
        visibility.c(jumpChatBtn);
        return jz5.f0.f384359a;
    }
}
