package c23;

/* loaded from: classes12.dex */
public final class f0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f38029d;

    /* renamed from: e, reason: collision with root package name */
    public long f38030e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f38031f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38032g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.i f38033h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f38029d = "MicroMsg.FTS.FTSRelevantSearchUIC";
        this.f38031f = "";
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.m3(getActivity(), new c23.d0(this));
        }
    }
}
