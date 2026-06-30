package qa1;

/* loaded from: classes10.dex */
public class r extends ms0.e {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f442550t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f442551u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(qa1.s sVar, int i17, int i18, int i19, int i27) {
        super(i17, i18);
        this.f442550t = i19;
        this.f442551u = i27;
    }

    @Override // ms0.c
    public os0.a f() {
        int i17 = this.f442550t;
        int i18 = this.f442551u;
        return new os0.c(i17, i18, i17, i18, 1, 1);
    }
}
