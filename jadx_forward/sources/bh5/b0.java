package bh5;

/* loaded from: classes14.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 f102454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7) {
        super(0);
        this.f102454d = c22415x6ef905d7;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = this.f102454d.f290337e.f314151d;
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        intent.putExtras(bundle);
        return intent;
    }
}
