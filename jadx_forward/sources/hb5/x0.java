package hb5;

/* loaded from: classes11.dex */
public class x0 implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 f361799a;

    public x0(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 activityC21589xad4109a8) {
        this.f361799a = activityC21589xad4109a8;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        s01.a0 a0Var;
        int i18 = com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8.H;
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 activityC21589xad4109a8 = this.f361799a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = activityC21589xad4109a8.f279472g;
        lz.f fVar = c19662x4f7a67f3.M;
        if (((fVar == null || !((r35.u1) fVar).f450807f.g(i17)) ? null : ((r35.u1) c19662x4f7a67f3.M).f450807f.getItem(i17)) instanceof s01.a0) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = activityC21589xad4109a8.f279472g;
            lz.f fVar2 = c19662x4f7a67f32.M;
            a0Var = (s01.a0) ((fVar2 == null || !((r35.u1) fVar2).f450807f.g(i17)) ? null : ((r35.u1) c19662x4f7a67f32.M).f450807f.getItem(i17));
        } else {
            a0Var = null;
        }
        if (a0Var == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(a0Var == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatroomInfoUI", "onItemNormalClick userInfo == null:%s", objArr);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatroomInfoUI", "onItemNormalClick field_userId:%s", a0Var.f65840x13fe5d2b);
        java.lang.String str = a0Var.f65840x13fe5d2b;
        r45.tj tjVar = new r45.tj();
        r45.sj sjVar = new r45.sj();
        sjVar.f467301d = str;
        tjVar.f468027d.add(sjVar);
        activityC21589xad4109a8.X6(null, tjVar);
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        int i18 = com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8.H;
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 activityC21589xad4109a8 = this.f361799a;
        activityC21589xad4109a8.getClass();
        android.content.Intent intent = new android.content.Intent();
        if (!activityC21589xad4109a8.f279482t) {
            s01.a0 a0Var = activityC21589xad4109a8.f279488z;
            if (a0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a0Var.f65834x53f3fff9)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatroomInfoUI", "dealAddMemberBtn: addMemberUrl is null");
                dp.a.m125854x26a183b(activityC21589xad4109a8, activityC21589xad4109a8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572290ao1), 0).show();
                return;
            }
            intent.putExtra("rawUrl", activityC21589xad4109a8.f279488z.f65834x53f3fff9);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC21589xad4109a8.f279487y.f69166x53f3fff9)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatroomInfoUI", "dealAddMemberBtn: addMemberUrl is null");
                dp.a.m125854x26a183b(activityC21589xad4109a8, activityC21589xad4109a8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572290ao1), 0).show();
                return;
            }
            intent.putExtra("rawUrl", activityC21589xad4109a8.f279487y.f69166x53f3fff9);
        }
        intent.putExtra("useJs", true);
        j45.l.n(activityC21589xad4109a8.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, 1);
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f361799a.f279472g;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.N();
        }
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        s01.a0 a0Var;
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 activityC21589xad4109a8 = this.f361799a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = activityC21589xad4109a8.f279472g;
        lz.f fVar = c19662x4f7a67f3.M;
        if (((fVar == null || !((r35.u1) fVar).f450807f.g(i17)) ? null : ((r35.u1) c19662x4f7a67f3.M).f450807f.getItem(i17)) instanceof s01.a0) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = activityC21589xad4109a8.f279472g;
            lz.f fVar2 = c19662x4f7a67f32.M;
            a0Var = (s01.a0) ((fVar2 == null || !((r35.u1) fVar2).f450807f.g(i17)) ? null : ((r35.u1) c19662x4f7a67f32.M).f450807f.getItem(i17));
        } else {
            a0Var = null;
        }
        if (a0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a0Var.f65839x776e2b6b)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(a0Var == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatroomInfoUI", "onItemNormalClick userInfo == null:%s", objArr);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatroomInfoUI", "onItemNormalClick Url:%s", a0Var.f65839x776e2b6b);
            r01.q3.Ni().i(a0Var.f65840x13fe5d2b, a0Var.f65836x75756b18, activityC21589xad4109a8);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", a0Var.f65839x776e2b6b);
            intent.putExtra("useJs", true);
            j45.l.j(activityC21589xad4109a8.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
