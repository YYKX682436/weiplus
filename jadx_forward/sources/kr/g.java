package kr;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10440xb448ef38 f392828d;

    public g(com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10440xb448ef38 c10440xb448ef38) {
        this.f392828d = c10440xb448ef38;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10440xb448ef38 c10440xb448ef38 = this.f392828d;
        c10440xb448ef38.f146456z.setEmpty();
        c10440xb448ef38.f146456z.union(c10440xb448ef38.f146453w.getLeft(), c10440xb448ef38.f146453w.getTop(), c10440xb448ef38.f146453w.getRight(), c10440xb448ef38.f146453w.getBottom());
        c10440xb448ef38.f146456z.union(c10440xb448ef38.f146455y.getLeft(), c10440xb448ef38.f146455y.getTop(), c10440xb448ef38.f146455y.getRight(), c10440xb448ef38.f146455y.getBottom());
        c10440xb448ef38.f146456z.offset(-c10440xb448ef38.f146452v.getLeft(), -c10440xb448ef38.f146452v.getTop());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c10440xb448ef38.f146452v.getLayoutManager();
        com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.p682xbddafb2a.C10443x446cb212 c10443x446cb212 = layoutManager instanceof com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.p682xbddafb2a.C10443x446cb212 ? (com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.p682xbddafb2a.C10443x446cb212) layoutManager : null;
        if (c10443x446cb212 != null) {
            android.graphics.Rect rect = c10440xb448ef38.f146456z;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
            c10443x446cb212.D.set(rect);
            c10443x446cb212.e0();
        }
    }
}
