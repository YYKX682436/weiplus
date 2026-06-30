package rt2;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt2.g f481037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rt2.g gVar) {
        super(1);
        this.f481037d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.f481037d.getClass();
        float floatExtra = intent.getFloatExtra("sysPercent", 0.0f);
        float floatExtra2 = intent.getFloatExtra("playerGainPercent", 0.0f);
        float floatExtra3 = intent.getFloatExtra("targetGainPercent", 0.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15168x82e675a6.f212024x = floatExtra;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15168x82e675a6.f212025y = floatExtra2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15168x82e675a6.f212026z = floatExtra3;
        return jz5.f0.f384359a;
    }
}
