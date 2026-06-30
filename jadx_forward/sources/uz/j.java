package uz;

/* loaded from: classes8.dex */
public class j implements m43.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uz.m f513593a;

    public j(uz.m mVar) {
        this.f513593a = mVar;
    }

    @Override // m43.b
    public void a() {
        if (nv1.a.f421962a == null) {
            synchronized (nv1.a.f421963b) {
                if (nv1.a.f421962a == null) {
                    nv1.a.f421962a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("CDNDownloader#WorkThread");
                }
            }
        }
        nv1.a.f421962a.mo50297x7c4d7ca2(new uz.i(this), 0L);
    }
}
