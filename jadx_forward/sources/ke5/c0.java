package ke5;

/* loaded from: classes9.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f388596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f388597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 f388598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ke5.d0 f388599g;

    public c0(ke5.d0 d0Var, android.os.Bundle bundle, int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689) {
        this.f388599g = d0Var;
        this.f388596d = bundle;
        this.f388597e = i17;
        this.f388598f = c21897x17252689;
    }

    @Override // java.lang.Runnable
    public void run() {
        ke5.d0 d0Var = this.f388599g;
        sb5.z zVar = (sb5.z) d0Var.f388574b.f542241c.a(sb5.z.class);
        int i17 = this.f388597e;
        android.os.Bundle bundle = this.f388596d;
        if (bundle != null && bundle.getInt("SCENE", 0) == 1) {
            boolean z17 = bundle.getBoolean("IS_IDLE_VISBLE", false);
            int i18 = bundle.getInt("SELECTION_TOP_OFFSET", 0);
            boolean z18 = bundle.getBoolean("IS_SMOOTH_SCROLL", false);
            d0Var.f388574b.f542253o = i17;
            d0Var.g(i17, z17, i18, z18);
            if (i17 < 0 || !d0Var.f388574b.f542250l.m78383x21a1233e("need_hight_item", false).booleanValue()) {
                return;
            }
            d0Var.f388574b.f542250l.m78388x5a3fc3e("msg_local_id", -1L);
            this.f388599g.f(this.f388598f, this.f388597e, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5.f231012g, false, i18, false, this.f388596d);
            return;
        }
        if (bundle == null || bundle.getInt("SCENE", 0) != 2) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).V0(i17);
        yb5.d dVar = d0Var.f388574b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/source/presenter/ChattingWCPayDataPresenter$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        dVar.O(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/source/presenter/ChattingWCPayDataPresenter$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
