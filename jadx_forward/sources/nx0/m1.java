package nx0;

/* loaded from: classes3.dex */
public final class m1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f422696d;

    /* renamed from: e, reason: collision with root package name */
    public final int f422697e;

    /* renamed from: f, reason: collision with root package name */
    public final int f422698f;

    /* renamed from: g, reason: collision with root package name */
    public final int f422699g;

    /* renamed from: h, reason: collision with root package name */
    public final int f422700h;

    /* renamed from: i, reason: collision with root package name */
    public final int f422701i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f422702m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f422703n;

    public m1(java.util.List dividerPositionList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dividerPositionList, "dividerPositionList");
        this.f422696d = dividerPositionList;
        this.f422697e = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 21);
        this.f422698f = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);
        this.f422699g = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
        this.f422700h = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 22);
        this.f422701i = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 2);
        this.f422702m = jz5.h.b(nx0.l1.f422690d);
        this.f422703n = new android.graphics.Paint();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        int u07 = parent.u0(view);
        int i17 = this.f422701i;
        if (u07 == 0) {
            outRect.left = this.f422699g;
            outRect.right = i17;
        } else if (this.f422696d.contains(java.lang.Integer.valueOf(u07))) {
            outRect.left = this.f422700h;
            outRect.right = i17;
        } else {
            outRect.left = i17;
            outRect.right = i17;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(c17, parent, state);
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            if (this.f422696d.contains(java.lang.Integer.valueOf(parent.u0(parent.getChildAt(i17))))) {
                c17.drawBitmap((android.graphics.Bitmap) ((jz5.n) this.f422702m).mo141623x754a37bb(), r1.getLeft() - this.f422698f, r1.getTop() + this.f422697e, this.f422703n);
            }
        }
    }

    public /* synthetic */ m1(java.util.List list, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f395529d : list);
    }
}
