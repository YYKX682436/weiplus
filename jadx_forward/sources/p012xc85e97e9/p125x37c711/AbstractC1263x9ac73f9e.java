package p012xc85e97e9.p125x37c711;

/* renamed from: androidx.work.Worker */
/* loaded from: classes13.dex */
public abstract class AbstractC1263x9ac73f9e extends p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f {

    /* renamed from: i, reason: collision with root package name */
    public l5.m f93997i;

    public AbstractC1263x9ac73f9e(android.content.Context context, p012xc85e97e9.p125x37c711.C1264xcd547028 c1264xcd547028) {
        super(context, c1264xcd547028);
    }

    @Override // p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f
    public final wa.a e() {
        this.f93997i = new l5.m();
        this.f93992e.f94001d.execute(new a5.u0(this));
        return this.f93997i;
    }

    public abstract a5.y h();
}
