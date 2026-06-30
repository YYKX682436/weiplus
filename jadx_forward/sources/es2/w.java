package es2;

/* loaded from: classes2.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f337947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(es2.h0 h0Var, java.lang.String str) {
        super(0);
        this.f337947d = h0Var;
        this.f337948e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        pm0.v.d0(this.f337947d.f337905e, new es2.v(this.f337948e, linkedList));
        return linkedList;
    }
}
