package oc2;

/* loaded from: classes8.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f425758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.widget.TextView textView) {
        super(0);
        this.f425758d = textView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float[] fArr = new float[1];
        this.f425758d.getPaint().getTextWidths("$", 0, 1, fArr);
        return java.lang.Float.valueOf(fArr[0]);
    }
}
