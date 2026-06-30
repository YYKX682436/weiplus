package w73;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f525034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f525035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb f525036f;

    public b(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb) {
        this.f525034d = context;
        this.f525035e = str;
        this.f525036f = c16114x800e8cdb;
    }

    @Override // java.lang.Runnable
    public void run() {
        w73.a.c(this.f525034d, this.f525035e, this.f525036f);
    }
}
