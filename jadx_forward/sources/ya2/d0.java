package ya2;

/* loaded from: classes2.dex */
public final class d0 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f541997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f541998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f541999c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f542000d;

    public d0(int i17, android.content.Context context, android.content.Intent intent, boolean z17) {
        this.f541997a = i17;
        this.f541998b = context;
        this.f541999c = intent;
        this.f542000d = z17;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    /* renamed from: onSuccess */
    public void mo977xe05b4124() {
        boolean z17 = this.f542000d;
        android.content.Intent intent = this.f541999c;
        android.content.Context context = this.f541998b;
        int i17 = this.f541997a;
        if (i17 < 0 || !(context instanceof android.app.Activity)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).uk(context, intent, z17);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).tk((android.app.Activity) context, intent, i17, z17);
        }
        w04.l.INSTANCE.b(540999685);
    }
}
