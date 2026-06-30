package te2;

/* loaded from: classes3.dex */
public final class ib extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f499654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.hc f499655e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, te2.hc hcVar) {
        super(0);
        this.f499654d = activityC0065xcd7aa112;
        this.f499655e = hcVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f499654d.findViewById(com.p314xaae8f345.mm.R.id.tmt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        textView.setOnClickListener(new te2.hb(this.f499655e));
        return textView;
    }
}
