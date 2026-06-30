package fa1;

/* loaded from: classes7.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.zip.ZipInputStream f342211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.util.zip.ZipInputStream zipInputStream) {
        super(0);
        this.f342211d = zipInputStream;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return this.f342211d.getNextEntry();
    }
}
