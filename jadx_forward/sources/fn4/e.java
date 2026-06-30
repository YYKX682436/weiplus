package fn4;

/* loaded from: classes15.dex */
public abstract class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final x.o f346022d = new x.o();

    /* renamed from: e, reason: collision with root package name */
    public final x.o f346023e = new x.o();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f346024f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final fn4.b f346025g;

    public e(fn4.b bVar) {
        this.f346025g = bVar;
    }

    public abstract int B(int i17);

    public fn4.m E(r45.xn6 xn6Var) {
        r45.xn6 xn6Var2;
        if (xn6Var == null) {
            return null;
        }
        java.util.Map map = this.f346024f;
        if (!((java.util.HashMap) map).containsKey(xn6Var.f471792h)) {
            return null;
        }
        if (((java.util.HashMap) map).get(xn6Var.f471792h) == null) {
            return null;
        }
        fn4.m mVar = (fn4.m) ((java.lang.ref.WeakReference) ((java.util.HashMap) map).get(xn6Var.f471792h)).get();
        if (mVar != null && (xn6Var2 = mVar.f346117e) != null && xn6Var2 == xn6Var) {
            return mVar;
        }
        ((java.util.HashMap) map).remove(xn6Var.f471792h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoAdapter", "getViewHolderByVideoInfo not match");
        return null;
    }

    public boolean I(int i17) {
        return i17 >= z() + this.f346025g.s4().e();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f346025g.s4().e() + z() + y();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (i17 < z()) {
            return this.f346022d.f(i17);
        }
        if (I(i17)) {
            return this.f346023e.f((i17 - z()) - this.f346025g.s4().e());
        }
        return B(i17);
    }

    public void x(java.util.List list, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoAdapter", "callbackToSuccess %d %b", java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z17));
    }

    public int y() {
        return this.f346023e.h();
    }

    public int z() {
        return this.f346022d.h();
    }
}
