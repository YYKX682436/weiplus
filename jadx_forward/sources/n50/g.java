package n50;

/* loaded from: classes9.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n50.i f416634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n50.i iVar) {
        super(0);
        this.f416634d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra;
        n50.i iVar = this.f416634d;
        boolean hasExtra = iVar.f416636a.hasExtra("Retr_Msg_content_bytes");
        android.content.Intent intent = iVar.f416636a;
        if (hasExtra) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("Retr_Msg_content_bytes");
            stringExtra = byteArrayExtra != null ? new java.lang.String(byteArrayExtra, r26.c.f450398a) : null;
        } else {
            stringExtra = intent.getStringExtra("Retr_Msg_content");
        }
        return stringExtra == null ? "" : stringExtra;
    }
}
