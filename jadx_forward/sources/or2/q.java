package or2;

/* loaded from: classes10.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f429201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ or2.s f429202e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i17, or2.s sVar) {
        super(2);
        this.f429201d = i17;
        this.f429202e = sVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.h3) obj2;
        if (longValue >= this.f429201d) {
            if (((h3Var == null || h3Var.f93598g) ? false : true) && android.os.Looper.getMainLooper().isCurrentThread()) {
                or2.s sVar = this.f429202e;
                sVar.f429210m += longValue;
                sVar.f429211n++;
            }
        }
        return jz5.f0.f384359a;
    }
}
