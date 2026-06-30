package aw2;

/* loaded from: classes10.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.x0 f96333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(aw2.x0 x0Var) {
        super(0);
        this.f96333d = x0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long longExtra = this.f96333d.f96340d.getIntent().getLongExtra("key_ref_feed_id", 0L);
        if (longExtra != 0) {
            return bu2.j.f106067a.h(longExtra);
        }
        return null;
    }
}
