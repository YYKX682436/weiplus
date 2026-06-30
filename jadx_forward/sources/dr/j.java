package dr;

/* loaded from: classes12.dex */
public class j extends dr.s {

    /* renamed from: c, reason: collision with root package name */
    public final dr.q f323922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo, dr.q qVar) {
        super(emojiInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        this.f323922c = qVar;
    }

    @Override // dr.s
    public void c(boolean z17) {
        dr.q qVar = this.f323922c;
        if (qVar != null) {
            qVar.a(z17);
        }
    }

    @Override // dr.s
    public void f(boolean z17) {
        if (this.f323933a.E0()) {
            c(true);
        } else {
            d(z17);
        }
    }
}
