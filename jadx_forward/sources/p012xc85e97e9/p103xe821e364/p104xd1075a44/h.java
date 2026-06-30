package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 f93589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.i f93590e;

    public h(p012xc85e97e9.p103xe821e364.p104xd1075a44.i iVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 c0Var) {
        this.f93590e = iVar;
        this.f93589d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i iVar = this.f93590e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k kVar = iVar.f93609g;
        if (kVar.f93639f == iVar.f93608f) {
            java.util.List list = iVar.f93607e;
            kVar.f93637d = list;
            kVar.f93638e = java.util.Collections.unmodifiableList(list);
            this.f93589d.a(kVar.f93634a);
        }
    }
}
