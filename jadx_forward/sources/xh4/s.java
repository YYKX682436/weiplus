package xh4;

/* loaded from: classes.dex */
public final class s implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f536162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f536163b;

    public s(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f536162a = activityC21401x6ce6f73f;
        this.f536163b = qVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        p3325xe03a0797.p3326xc267989b.q qVar = this.f536163b;
        if (i17 != -1) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(xh4.l.f536147g));
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(this.f536162a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.class);
        intent2.putExtra("intent_process", 4);
        intent2.addFlags(67108864);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f536162a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC21401x6ce6f73f, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/utils/TeenModeUtil$checkTeenPwd$2$1$2", "onActivityResult", "(ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC21401x6ce6f73f.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC21401x6ce6f73f, "com/tencent/mm/plugin/teenmode/utils/TeenModeUtil$checkTeenPwd$2$1$2", "onActivityResult", "(ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(xh4.l.f536144d));
    }
}
