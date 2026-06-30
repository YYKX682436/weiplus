package ht2;

/* loaded from: classes5.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.BitmapDrawable f366456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f366457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.graphics.drawable.BitmapDrawable bitmapDrawable, yz5.a aVar) {
        super(0);
        this.f366456d = bitmapDrawable;
        this.f366457e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f366456d.invalidateSelf();
        yz5.a aVar = this.f366457e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
