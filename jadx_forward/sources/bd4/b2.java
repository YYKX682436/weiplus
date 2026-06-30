package bd4;

/* loaded from: classes4.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f100831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f100832e;

    public b2(bd4.f2 f2Var, android.view.MotionEvent motionEvent) {
        this.f100831d = f2Var;
        this.f100832e = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.MotionEvent copied = this.f100832e;
        bd4.f2 f2Var = this.f100831d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$showMagnifierOnNextDraw$1");
        try {
            if (bd4.f2.c(f2Var)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                int i17 = f2Var.A;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                int i18 = f2Var.f100878z;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                if (i17 > i18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    int i19 = f2Var.f100878z;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    int i27 = f2Var.A;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMagnifierHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMagnifierHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    xl5.c cVar = (xl5.c) ((jz5.n) f2Var.D).mo141623x754a37bb();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMagnifierHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMagnifierHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copied, "$copied");
                    cVar.b(copied, (i19 + i27) / 2);
                }
            }
        } finally {
            copied.recycle();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$showMagnifierOnNextDraw$1");
        }
    }
}
