package oh5;

/* loaded from: classes12.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oh5.d f427020d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(oh5.d dVar) {
        super(0);
        this.f427020d = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        while (true) {
            oh5.d dVar = this.f427020d;
            if (!(!dVar.f427024b.isEmpty()) || !com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d()) {
                break;
            }
            android.content.Intent intent = (android.content.Intent) dVar.f427024b.poll();
            if (intent != null) {
                dVar.a(intent);
            }
        }
        return jz5.f0.f384359a;
    }
}
