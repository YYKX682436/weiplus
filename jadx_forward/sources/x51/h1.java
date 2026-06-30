package x51;

/* loaded from: classes5.dex */
public class h1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f533550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tm.a f533551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f533552f;

    public h1(android.content.Context context, tm.a aVar, int i17) {
        this.f533550d = context;
        this.f533551e = aVar;
        this.f533552f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        c71.b.c(this.f533550d, this.f533551e.f501931a, this.f533552f, false);
    }
}
