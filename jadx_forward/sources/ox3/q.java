package ox3;

/* loaded from: classes.dex */
public final class q implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ox3.g f431299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ox3.s f431300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f431301c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f431302d;

    public q(ox3.g gVar, ox3.s sVar, in5.s0 s0Var, int i17) {
        this.f431299a = gVar;
        this.f431300b = sVar;
        this.f431301c = s0Var;
        this.f431302d = i17;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compoundButton, "<anonymous parameter 0>");
        ox3.g gVar = this.f431299a;
        gVar.f431286h = z17;
        ox3.s sVar = this.f431300b;
        sVar.n(this.f431301c);
        sVar.f431307e.mo149xb9724478(java.lang.Integer.valueOf(this.f431302d), gVar);
    }
}
