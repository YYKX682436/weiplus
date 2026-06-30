package hy0;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy0.i f367337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(hy0.i iVar) {
        super(0);
        this.f367337d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Rect rect = new android.graphics.Rect();
        hy0.i iVar = this.f367337d;
        android.text.TextPaint textPaint = (android.text.TextPaint) ((jz5.n) iVar.f367384n).mo141623x754a37bb();
        jz5.g gVar = iVar.f367380j;
        textPaint.getTextBounds((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb(), 0, ((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb()).length(), rect);
        return rect;
    }
}
