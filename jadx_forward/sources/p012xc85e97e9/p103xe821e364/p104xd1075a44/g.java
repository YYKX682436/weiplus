package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes12.dex */
public class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.i f93556a;

    public g(p012xc85e97e9.p103xe821e364.p104xd1075a44.i iVar) {
        this.f93556a = iVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i iVar = this.f93556a;
        java.lang.Object obj = iVar.f93606d.get(i17);
        java.lang.Object obj2 = iVar.f93607e.get(i18);
        if (obj == null || obj2 == null) {
            if (obj == null && obj2 == null) {
                return true;
            }
            throw new java.lang.AssertionError();
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dy) iVar.f93609g.f93635b.f93551b).getClass();
        r45.nu0 nu0Var = (r45.nu0) obj;
        r45.nu0 nu0Var2 = (r45.nu0) obj2;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(nu0Var.m75945x2fec8307(1), nu0Var2.m75945x2fec8307(1)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(nu0Var.m75945x2fec8307(2), nu0Var2.m75945x2fec8307(2));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i iVar = this.f93556a;
        java.lang.Object obj = iVar.f93606d.get(i17);
        java.lang.Object obj2 = iVar.f93607e.get(i18);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dy) iVar.f93609g.f93635b.f93551b).getClass();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.nu0) obj).m75945x2fec8307(0), ((r45.nu0) obj2).m75945x2fec8307(0));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public java.lang.Object c(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i iVar = this.f93556a;
        java.lang.Object obj = iVar.f93606d.get(i17);
        java.lang.Object obj2 = iVar.f93607e.get(i18);
        if (obj == null || obj2 == null) {
            throw new java.lang.AssertionError();
        }
        iVar.f93609g.f93635b.f93551b.getClass();
        return null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f93556a.f93607e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f93556a.f93606d.size();
    }
}
