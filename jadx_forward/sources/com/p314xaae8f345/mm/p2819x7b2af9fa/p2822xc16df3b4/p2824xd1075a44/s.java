package com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44;

/* loaded from: classes15.dex */
public class s extends com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.l {

    /* renamed from: a, reason: collision with root package name */
    public final o3.a0 f296313a;

    /* renamed from: b, reason: collision with root package name */
    public final o3.a0 f296314b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.w0 f296315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 f296316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4) {
        super(c22956x1a4bbf4, null);
        this.f296316d = c22956x1a4bbf4;
        this.f296313a = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.p(this);
        this.f296314b = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.q(this);
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.l
    public void a(com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.c cVar, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4) {
        c22949xf1deaba4.setImportantForAccessibility(2);
        this.f296315c = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.r(this);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f296316d;
        if (c22956x1a4bbf4.getImportantForAccessibility() == 0) {
            c22956x1a4bbf4.setImportantForAccessibility(1);
        }
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.l
    public void b() {
        c();
    }

    public void c() {
        int a17;
        int i17 = android.R.id.accessibilityActionPageLeft;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f296316d;
        n3.l1.j(android.R.id.accessibilityActionPageLeft, c22956x1a4bbf4);
        n3.l1.h(c22956x1a4bbf4, 0);
        n3.l1.j(android.R.id.accessibilityActionPageRight, c22956x1a4bbf4);
        n3.l1.h(c22956x1a4bbf4, 0);
        n3.l1.j(android.R.id.accessibilityActionPageUp, c22956x1a4bbf4);
        n3.l1.h(c22956x1a4bbf4, 0);
        n3.l1.j(android.R.id.accessibilityActionPageDown, c22956x1a4bbf4);
        n3.l1.h(c22956x1a4bbf4, 0);
        if (c22956x1a4bbf4.m83648xf939df19() == null || (a17 = c22956x1a4bbf4.m83648xf939df19().a()) == 0 || !c22956x1a4bbf4.f296282x) {
            return;
        }
        int m83652x84093c9a = c22956x1a4bbf4.m83652x84093c9a();
        o3.a0 a0Var = this.f296314b;
        o3.a0 a0Var2 = this.f296313a;
        if (m83652x84093c9a != 0) {
            if (c22956x1a4bbf4.f296268g < a17 - 1) {
                n3.l1.k(c22956x1a4bbf4, new o3.f(android.R.id.accessibilityActionPageDown, null), null, a0Var2);
            }
            if (c22956x1a4bbf4.f296268g > 0) {
                n3.l1.k(c22956x1a4bbf4, new o3.f(android.R.id.accessibilityActionPageUp, null), null, a0Var);
                return;
            }
            return;
        }
        boolean z17 = n3.v0.d(c22956x1a4bbf4.f296271m.f296055b) == 1;
        int i18 = z17 ? 16908360 : 16908361;
        if (z17) {
            i17 = 16908361;
        }
        if (c22956x1a4bbf4.f296268g < a17 - 1) {
            n3.l1.k(c22956x1a4bbf4, new o3.f(i18, null), null, a0Var2);
        }
        if (c22956x1a4bbf4.f296268g > 0) {
            n3.l1.k(c22956x1a4bbf4, new o3.f(i17, null), null, a0Var);
        }
    }
}
