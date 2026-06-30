package vc1;

/* loaded from: classes13.dex */
public class c3 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a f516475d;

    /* renamed from: e, reason: collision with root package name */
    public double f516476e;

    /* renamed from: f, reason: collision with root package name */
    public double f516477f;

    /* renamed from: g, reason: collision with root package name */
    public double f516478g;

    /* renamed from: h, reason: collision with root package name */
    public double f516479h;

    /* renamed from: i, reason: collision with root package name */
    public float f516480i;

    /* renamed from: m, reason: collision with root package name */
    public float f516481m;

    /* renamed from: n, reason: collision with root package name */
    public float f516482n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f516483o;

    public c3(android.content.Context context) {
        super(context);
        this.f516476e = -1.0d;
        this.f516477f = -1.0d;
        this.f516478g = -1.0d;
        this.f516479h = -1.0d;
        this.f516480i = 900.0f;
        this.f516481m = 900.0f;
        this.f516482n = 0.0f;
        ((android.widget.ImageView) android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a3n, this).findViewById(com.p314xaae8f345.mm.R.id.f568920oi0)).requestFocus();
    }

    /* renamed from: getHeading */
    private float m171455x6d34b9cc() {
        return this.f516483o ? this.f516480i : this.f516482n;
    }

    public void a(float f17, float f18) {
        this.f516482n = f18;
        float m171455x6d34b9cc = m171455x6d34b9cc();
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a = this.f516475d;
        if (interfaceC4409x88f1805a != null) {
            interfaceC4409x88f1805a.mo37261x742bae00(m171455x6d34b9cc);
        }
    }

    /* renamed from: getLatitude */
    public double m171456x2605e9e2() {
        return this.f516476e;
    }

    /* renamed from: getLongitude */
    public double m171457x79d7af9() {
        return this.f516477f;
    }

    /* renamed from: getRealMarker */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a m171458x6c59636e() {
        return this.f516475d;
    }
}
