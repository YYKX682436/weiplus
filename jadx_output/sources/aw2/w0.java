package aw2;

/* loaded from: classes10.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.x0 f14804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(aw2.x0 x0Var) {
        super(0);
        this.f14804d = x0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f14804d.f14807d.getIntent().getStringExtra("KEY_FINDER_POST_TOPIC_WORD");
        return stringExtra == null ? "" : stringExtra;
    }
}
