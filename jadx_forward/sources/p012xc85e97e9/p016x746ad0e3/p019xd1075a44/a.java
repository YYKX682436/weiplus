package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class a implements n3.c2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f91038a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f91039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b f91040c;

    public a(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b bVar) {
        this.f91040c = bVar;
    }

    @Override // n3.c2
    public void a(android.view.View view) {
        this.f91038a = true;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        if (this.f91038a) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b bVar = this.f91040c;
        bVar.f91049i = null;
        super/*android.view.View*/.setVisibility(this.f91039b);
    }

    @Override // n3.c2
    public void c(android.view.View view) {
        super/*android.view.View*/.setVisibility(0);
        this.f91038a = false;
    }
}
