package xj1;

/* loaded from: classes.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f536359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f536360e;

    public z(android.content.Context context, boolean z17) {
        this.f536359d = context;
        this.f536360e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f536360e;
        android.content.Context context = this.f536359d;
        dp.a.m125854x26a183b(context, z17 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571617kg) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571615ke), 0).show();
    }
}
