package bg2;

/* loaded from: classes3.dex */
public final class y implements we2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.d0 f20658a;

    public y(bg2.d0 d0Var) {
        this.f20658a = d0Var;
    }

    @Override // we2.a
    public boolean r() {
        bg2.k0 k0Var = (bg2.k0) this.f20658a.N6(bg2.k0.class);
        if (k0Var == null) {
            return false;
        }
        return k0Var.f20238g || k0Var.f20239h;
    }

    @Override // we2.a
    public boolean t() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f20658a.f417141d.f417148h;
        return kotlin.jvm.internal.o.b((baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? null : feedObject.field_username, g92.b.f269769e.T0());
    }

    @Override // we2.a
    public boolean v(java.util.LinkedList linkedList) {
        java.lang.Object obj = null;
        if (linkedList == null) {
            bg2.k0 k0Var = (bg2.k0) this.f20658a.N6(bg2.k0.class);
            linkedList = k0Var != null ? k0Var.f20241m : null;
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.yl1) next).getInteger(0) == 10) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.yl1) obj;
        }
        return obj != null;
    }

    @Override // we2.a
    public java.lang.String w() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f20658a.f417141d.f417148h;
        java.lang.String str = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? null : feedObject.field_username;
        return str == null ? "" : str;
    }
}
