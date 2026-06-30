package ju1;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f383254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f383255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, int i17) {
        super(0);
        this.f383254d = context;
        this.f383255e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f383254d;
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setGravity(17);
        int i17 = this.f383255e;
        if (i17 == 1 || i17 == 5) {
            textView.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        } else {
            textView.setTextColor(-1);
        }
        return textView;
    }
}
