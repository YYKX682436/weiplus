package k02;

/* loaded from: classes8.dex */
public class g implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f384609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f384610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h02.a f384611c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k02.k f384612d;

    public g(int[] iArr, android.content.Context context, h02.a aVar, k02.k kVar) {
        this.f384609a = iArr;
        this.f384610b = context;
        this.f384611c = aVar;
        this.f384612d = kVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.b1
    public void a() {
        this.f384609a[0] = 1;
        k02.l.e(this.f384610b, 6, this.f384611c);
        k02.k kVar = this.f384612d;
        if (kVar != null) {
            kVar.b();
        }
    }
}
