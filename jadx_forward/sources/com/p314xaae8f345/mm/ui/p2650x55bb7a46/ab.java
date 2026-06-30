package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class ab extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.db f279905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(com.p314xaae8f345.mm.ui.p2650x55bb7a46.db dbVar) {
        super(0);
        this.f279905d = dbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent m158359x1e885992 = this.f279905d.m158359x1e885992();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m158359x1e885992, "<this>");
        android.os.Parcelable parcelableExtra = m158359x1e885992.getParcelableExtra("key_HalfScreenActionReceiver");
        android.os.ResultReceiver resultReceiver = parcelableExtra instanceof android.os.ResultReceiver ? (android.os.ResultReceiver) parcelableExtra : null;
        if (resultReceiver != null) {
            return new ah5.b(resultReceiver);
        }
        return null;
    }
}
