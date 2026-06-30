package oh5;

/* loaded from: classes12.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oh5.l f427036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(oh5.l lVar) {
        super(0);
        this.f427036d = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = new android.content.Intent();
        oh5.l lVar = this.f427036d;
        int i17 = oh5.l.f427037f;
        int i18 = oh5.l.f427037f;
        oh5.l.f427037f = i18 + 1;
        intent.putExtra("KEY_COUNTER", i18);
        lVar.b(intent);
        return jz5.f0.f384359a;
    }
}
