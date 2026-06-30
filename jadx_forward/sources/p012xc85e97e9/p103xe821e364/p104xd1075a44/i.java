package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f93606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f93607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f93608f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k f93609g;

    public i(p012xc85e97e9.p103xe821e364.p104xd1075a44.k kVar, java.util.List list, java.util.List list2, int i17) {
        this.f93609g = kVar;
        this.f93606d = list;
        this.f93607e = list2;
        this.f93608f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 a17 = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new p012xc85e97e9.p103xe821e364.p104xd1075a44.g(this), true);
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.j) this.f93609g.f93636c).execute(new p012xc85e97e9.p103xe821e364.p104xd1075a44.h(this, a17));
    }
}
