package hf2;

/* loaded from: classes10.dex */
public final class o2 implements mo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf2.q2 f362665a;

    public o2(hf2.q2 q2Var) {
        this.f362665a = q2Var;
    }

    @Override // mo0.b
    public void a() {
    }

    @Override // mo0.b
    public void b() {
    }

    @Override // mo0.b
    public boolean c(float f17, float f18, int i17, int i18, long j17) {
        android.view.ViewGroup mo57735xf60eeea7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var;
        hf2.q2 q2Var = this.f362665a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = q2Var.f362681a.f372632e;
        android.view.TextureView textureView = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var2 = ubVar != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9) ubVar.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar2 = q2Var.f362681a.f372632e;
        if (ubVar2 != null && (o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9) ubVar2.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.class)) != null) {
            textureView = o9Var.z1();
        }
        hf2.x xVar = q2Var.f362681a;
        if (xVar.f362721t) {
            db5.t7.m(xVar.O6(), xVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lju));
            return false;
        }
        if (xVar.F || !((je2.g) xVar.m56788xbba4bfc0(je2.g.class)).T6()) {
            return false;
        }
        if (!(o9Var2 != null && o9Var2.w0() == 0) || !o9Var2.f446856d.isShown()) {
            return false;
        }
        if (!(textureView != null && textureView.isShown())) {
            return false;
        }
        java.util.LinkedList<hf2.m2> b17 = q2Var.b(textureView);
        android.graphics.Point point = xVar.f362722u.f362693a;
        float f19 = point.x + f17;
        float f27 = point.y + f18;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        for (hf2.m2 m2Var : b17) {
            if (q2Var.e(f19, f27, m2Var)) {
                java.lang.String str2 = "preview onTouchEvent touchX:" + f17 + ",touchY:" + f18 + ",match stickerType:" + m2Var.f362649a;
                java.lang.String str3 = q2Var.f362682b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
                hf2.n2 n2Var = new hf2.n2(str3, new java.lang.ref.WeakReference(xVar), new java.lang.ref.WeakReference(m2Var));
                q2Var.f362684d = n2Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar3 = xVar.f372632e;
                if (ubVar3 != null && (mo57735xf60eeea7 = ubVar3.mo57735xf60eeea7()) != null) {
                    mo57735xf60eeea7.postDelayed(n2Var, android.view.ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
        }
        return false;
    }

    @Override // mo0.b
    public boolean e(float f17, float f18) {
        android.view.ViewGroup mo57735xf60eeea7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var;
        hf2.q2 q2Var = this.f362665a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = q2Var.f362681a.f372632e;
        android.view.TextureView textureView = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var2 = ubVar != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9) ubVar.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar2 = q2Var.f362681a.f372632e;
        if (ubVar2 != null && (o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9) ubVar2.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.class)) != null) {
            textureView = o9Var.z1();
        }
        hf2.x xVar = q2Var.f362681a;
        if (xVar.f362721t) {
            db5.t7.m(xVar.O6(), xVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lju));
            return false;
        }
        if (xVar.F || !((je2.g) xVar.m56788xbba4bfc0(je2.g.class)).T6()) {
            return false;
        }
        if (!(o9Var2 != null && o9Var2.w0() == 0) || !o9Var2.f446856d.isShown()) {
            return false;
        }
        if (!(textureView != null && textureView.isShown())) {
            return false;
        }
        java.util.LinkedList<hf2.m2> b17 = q2Var.b(textureView);
        android.graphics.Point point = xVar.f362722u.f362693a;
        float f19 = point.x + f17;
        float f27 = point.y + f18;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        for (hf2.m2 m2Var : b17) {
            if (q2Var.e(f19, f27, m2Var)) {
                hf2.n2 n2Var = q2Var.f362684d;
                java.lang.String str2 = q2Var.f362682b;
                if (n2Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "single click task remove,controller:" + xVar.hashCode() + '!');
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar3 = xVar.f372632e;
                    if (ubVar3 != null && (mo57735xf60eeea7 = ubVar3.mo57735xf60eeea7()) != null) {
                        mo57735xf60eeea7.removeCallbacks(n2Var);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDoubleClickEvent touchX:");
                sb6.append(f17);
                sb6.append(",touchY:");
                sb6.append(f18);
                sb6.append(",match stickerType:");
                int i17 = m2Var.f362649a;
                sb6.append(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                xVar.w7(i17, "");
                return true;
            }
        }
        return false;
    }
}
