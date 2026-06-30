package io;

/* loaded from: classes3.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.n f374948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(io.n nVar) {
        super(0);
        this.f374948d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        android.content.Context context = this.f374948d.f374950d;
        paint.setColor(context != null ? context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560071kj) : android.graphics.Color.parseColor("#1a000000"));
        return paint;
    }
}
