package fq4;

/* loaded from: classes15.dex */
public class w implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f347180d = null;

    /* renamed from: e, reason: collision with root package name */
    public fq4.v f347181e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f347182f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f347183g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f347184h = null;

    public w() {
        c01.d9.e().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ia.f34362x366c91de, this);
        c01.d9.e().a(616, this);
        c01.d9.e().a(617, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 && i18 != 0) {
            if (i18 == -34 && m1Var.mo808xfb85f7b0() == 617) {
                fq4.v vVar = this.f347181e;
                if (vVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18843x20e4724b activityC18843x20e4724b = (com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18843x20e4724b) vVar;
                    android.content.Intent intent = new android.content.Intent(activityC18843x20e4724b, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e.class);
                    intent.putExtra("kscene_type", 76);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activityC18843x20e4724b, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "onBlockedByLimit", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC18843x20e4724b.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activityC18843x20e4724b, "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "onBlockedByLimit", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC18843x20e4724b.finish();
                    return;
                }
                return;
            }
            fq4.v vVar2 = this.f347181e;
            if (vVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18843x20e4724b activityC18843x20e4724b2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18843x20e4724b) vVar2;
                android.content.Intent intent2 = new android.content.Intent(activityC18843x20e4724b2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e.class);
                intent2.putExtra("kscene_type", 77);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activityC18843x20e4724b2, arrayList2.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "onNetworkError", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC18843x20e4724b2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activityC18843x20e4724b2, "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "onNetworkError", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC18843x20e4724b2.finish();
                return;
            }
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 618) {
            java.lang.String str2 = ((fq4.h) m1Var).f347133f;
            this.f347180d = str2;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                c01.d9.e().g(new fq4.l(73, this.f347180d));
            }
        }
        if (m1Var.mo808xfb85f7b0() == 616) {
            fq4.l lVar = (fq4.l) m1Var;
            this.f347182f = lVar.f347150g;
            java.lang.String str3 = lVar.f347149f;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            fq4.v vVar3 = this.f347181e;
            if (vVar3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18843x20e4724b activityC18843x20e4724b3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18843x20e4724b) vVar3;
                activityC18843x20e4724b3.f257705o = str3;
                activityC18843x20e4724b3.f257701h.d();
                activityC18843x20e4724b3.f257701h.m72728x63103da6(str3);
                activityC18843x20e4724b3.T6();
                activityC18843x20e4724b3.f257698e.setEnabled(true);
            }
        }
        if (m1Var.mo808xfb85f7b0() == 617) {
            fq4.o oVar = (fq4.o) m1Var;
            if (oVar.f347161n != 0) {
                fq4.v vVar4 = this.f347181e;
                if (vVar4 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18843x20e4724b) vVar4).Z6(false);
                    return;
                }
                return;
            }
            this.f347183g = oVar.f347162o;
            fq4.v vVar5 = this.f347181e;
            if (vVar5 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18843x20e4724b) vVar5).Z6(true);
            }
        }
    }
}
