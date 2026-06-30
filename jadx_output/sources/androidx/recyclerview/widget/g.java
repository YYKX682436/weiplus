package androidx.recyclerview.widget;

/* loaded from: classes12.dex */
public class g extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.i f12023a;

    public g(androidx.recyclerview.widget.i iVar) {
        this.f12023a = iVar;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        androidx.recyclerview.widget.i iVar = this.f12023a;
        java.lang.Object obj = iVar.f12073d.get(i17);
        java.lang.Object obj2 = iVar.f12074e.get(i18);
        if (obj == null || obj2 == null) {
            if (obj == null && obj2 == null) {
                return true;
            }
            throw new java.lang.AssertionError();
        }
        ((com.tencent.mm.plugin.finder.live.widget.dy) iVar.f12076g.f12102b.f12018b).getClass();
        r45.nu0 nu0Var = (r45.nu0) obj;
        r45.nu0 nu0Var2 = (r45.nu0) obj2;
        return kotlin.jvm.internal.o.b(nu0Var.getString(1), nu0Var2.getString(1)) && kotlin.jvm.internal.o.b(nu0Var.getString(2), nu0Var2.getString(2));
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        androidx.recyclerview.widget.i iVar = this.f12023a;
        java.lang.Object obj = iVar.f12073d.get(i17);
        java.lang.Object obj2 = iVar.f12074e.get(i18);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        ((com.tencent.mm.plugin.finder.live.widget.dy) iVar.f12076g.f12102b.f12018b).getClass();
        return kotlin.jvm.internal.o.b(((r45.nu0) obj).getString(0), ((r45.nu0) obj2).getString(0));
    }

    @Override // androidx.recyclerview.widget.b0
    public java.lang.Object c(int i17, int i18) {
        androidx.recyclerview.widget.i iVar = this.f12023a;
        java.lang.Object obj = iVar.f12073d.get(i17);
        java.lang.Object obj2 = iVar.f12074e.get(i18);
        if (obj == null || obj2 == null) {
            throw new java.lang.AssertionError();
        }
        iVar.f12076g.f12102b.f12018b.getClass();
        return null;
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f12023a.f12074e.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f12023a.f12073d.size();
    }
}
