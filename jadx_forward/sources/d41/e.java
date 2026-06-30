package d41;

/* loaded from: classes12.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final d41.e f307915d = new d41.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        java.util.Iterator it = ((kz5.h) d41.i.f307919f).iterator();
        while (it.hasNext()) {
            ((d41.i) it.next()).getClass();
            uriMatcher.addURI("com.tencent.mm.open_voice_control.info", "check_version", 1);
        }
        return uriMatcher;
    }
}
