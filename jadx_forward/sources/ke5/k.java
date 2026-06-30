package ke5;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f388631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f388632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f388633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 f388634g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ke5.l f388635h;

    public k(ke5.l lVar, android.os.Bundle bundle, int i17, java.util.List list, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689) {
        this.f388635h = lVar;
        this.f388631d = bundle;
        this.f388632e = i17;
        this.f388633f = list;
        this.f388634g = c21897x17252689;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        ke5.l lVar = this.f388635h;
        sb5.z zVar = (sb5.z) lVar.f388574b.f542241c.a(sb5.z.class);
        int i18 = this.f388632e;
        android.os.Bundle bundle = this.f388631d;
        if (bundle == null || bundle.getInt("SCENE", 0) != 1) {
            if (bundle == null || bundle.getInt("SCENE", 0) != 2) {
                return;
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).V0(i18);
            yb5.d dVar = lVar.f388574b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/source/presenter/ChattingBrandEcsNoticeMsgDataPresenter$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            dVar.O(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(dVar, "com/tencent/mm/ui/chatting/source/presenter/ChattingBrandEcsNoticeMsgDataPresenter$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            return;
        }
        boolean z17 = bundle.getBoolean("IS_HIGHLIGHT_ITEM", false);
        boolean z18 = bundle.getBoolean("IS_IDLE_VISBLE", false);
        int i19 = bundle.getInt("SELECTION_TOP_OFFSET", 0);
        boolean z19 = bundle.getBoolean("IS_SMOOTH_SCROLL", false);
        lVar.f388574b.f542253o = i18;
        java.util.List list = this.f388633f;
        if (list.size() > i18 && i18 != -1) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(i18)).getClass();
        }
        lVar.g(i18, z18, i19, z19);
        if (!z17 || (i17 = this.f388632e) < 0) {
            return;
        }
        this.f388635h.f(this.f388634g, i17, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5.f231012g, z18, i19, z19, this.f388631d);
    }
}
