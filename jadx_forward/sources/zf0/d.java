package zf0;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f553926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.lang.String str) {
        super(1);
        this.f553926d = f0Var;
        this.f553927e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        t21.v2 update = (t21.v2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(update, "$this$update");
        update.f496548m = this.f553926d.f391649d;
        update.U |= 4096;
        update.f496543h = (int) com.p314xaae8f345.mm.vfs.w6.k(this.f553927e);
        update.U |= 128;
        return jz5.f0.f384359a;
    }
}
