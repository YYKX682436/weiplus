package t85;

/* loaded from: classes10.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f497987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f497988b;

    public c(java.util.List list, java.util.List list2) {
        this.f497987a = list;
        this.f497988b = list2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        r45.p64 oldItem = ((t85.d) this.f497987a.get(i17)).f497989a;
        r45.p64 newItem = ((t85.d) this.f497988b.get(i18)).f497989a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldItem, "oldItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newItem, "newItem");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oldItem.f464325d)) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oldItem, newItem);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(oldItem.f464325d, newItem.f464325d)) {
            r45.o64 o64Var = oldItem.f464326e;
            java.lang.String str = o64Var != null ? o64Var.f463516d : null;
            r45.o64 o64Var2 = newItem.f464326e;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, o64Var2 != null ? o64Var2.f463516d : null)) {
                r45.r64 r64Var = oldItem.f464329h;
                java.lang.String str2 = r64Var != null ? r64Var.f466103d : null;
                r45.r64 r64Var2 = newItem.f464329h;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, r64Var2 != null ? r64Var2.f466103d : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((t85.d) this.f497987a.get(i17)).f497989a.f464325d, ((t85.d) this.f497988b.get(i18)).f497989a.f464325d);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f497988b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f497987a.size();
    }
}
