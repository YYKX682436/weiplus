package r53;

/* loaded from: classes8.dex */
public class u implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f474233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f474234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r53.y f474235g;

    public u(r53.y yVar, java.lang.String str, float f17, java.lang.ref.WeakReference weakReference) {
        this.f474235g = yVar;
        this.f474232d = str;
        this.f474233e = f17;
        this.f474234f = weakReference;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.lang.String str2 = this.f474232d;
        if (str2.equals(str)) {
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(str2, 1, this.f474233e);
            if (Di != null) {
                java.lang.ref.WeakReference weakReference = this.f474234f;
                if (weakReference != null && weakReference.get() != null) {
                    ((android.widget.ImageView) weakReference.get()).setImageBitmap(Di);
                }
                ((jt0.i) this.f474235g.f474254c).put(str2, Di);
                ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                zo3.p.Ri().mo49775xc84af884(this);
            }
        }
    }
}
